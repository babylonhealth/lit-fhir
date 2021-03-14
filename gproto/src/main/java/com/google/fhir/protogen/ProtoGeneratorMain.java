//    Copyright 2018 Google Inc.
//
//    Licensed under the Apache License, Version 2.0 (the "License");
//    you may not use this file except in compliance with the License.
//    You may obtain a copy of the License at
//
//        https://www.apache.org/licenses/LICENSE-2.0
//
//    Unless required by applicable law or agreed to in writing, software
//    distributed under the License is distributed on an "AS IS" BASIS,
//    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//    See the License for the specific language governing permissions and
//    limitations under the License.

package com.google.fhir.protogen;

import static com.google.common.base.Preconditions.checkNotNull;
import static java.nio.charset.StandardCharsets.UTF_8;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;
import com.google.common.base.CaseFormat;
import com.google.common.io.Files;
import com.google.fhir.common.AnnotationUtils;
import com.google.fhir.proto.Annotations;
import com.google.fhir.proto.Annotations.FhirVersion;
import com.google.fhir.proto.PackageInfo;
import com.google.fhir.r4.core.StructureDefinition;
import com.google.fhir.r4.core.StructureDefinitionKindCode;
import com.google.fhir.r4.core.TypeDerivationRuleCode;
import com.google.protobuf.DescriptorProtos.DescriptorProto;
import com.google.protobuf.DescriptorProtos.FileDescriptorProto;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * A class that runs ProtoGenerator on the specified inputs, turning FHIR StructureDefinition files
 * into proto descriptors. Depending on settings, either the descriptors, the .proto file, or both
 * will be emitted.
 */
class ProtoGeneratorMain {

  private final PrintWriter writer;

  // The convention is to name profiles as the lowercased version of the element they define,
  // but this is not guaranteed by the spec, so we don't rely on it.
  // This mapping lets us keep track of source filenames for generated types.
  private static final Map<String, String> typeToSourceFileBaseName = new HashMap<>();

  private static final String EXTENSION_STRUCTURE_DEFINITION_URL =
      "http://hl7.org/fhir/StructureDefinition/Extension";

  private static class Args {
    @Parameter(
        names = {"--emit_descriptors"},
        description = "Emit individual descriptor files")
    private Boolean emitDescriptors = false;

    @Parameter(
        names = {"--output_directory"},
        description = "Directory where generated output will be saved")
    private String outputDirectory = ".";

    @Parameter(
        names = {"--descriptor_output_directory"},
        description = "Directory where generated descriptor output will be saved")
    private String descriptorOutputDirectory = ".";

    @Parameter(
        names = {"--emit_proto"},
        description = "Emit a .proto file generated from the input")
    private Boolean emitProto = false;

    @Parameter(
        names = {"--emit_codes"},
        description = "Emit a .proto file generated from CodeSystems and ValueSets in the input")
    private Boolean emitCodesProto = false;

    @Parameter(
        names = {"--filter"},
        description =
            "Filter for types of definitions in input package to use.  If set, must be one of"
                + " resource, profile, extension, datatype.")
    private String filter = null;

    @Parameter(
        names = {"--sort"},
        description = "If true, will sort messages within a file by message name.")
    private boolean sort = false;

    @Parameter(
        names = {"--stu3_core_dep"},
        description =
            "FhirPackage for core STU3 Definitions.  See --fhir_definition_dep flag for"
                + " documentaton on format.")
    private String stu3CoreDep = null;

    @Parameter(
        names = {"--r4_core_dep"},
        description =
            "FhirPackage for core R4 Definitions.  See --fhir_definition_dep flag for documentaton"
                + " on format.")
    private String r4CoreDep = null;

    @Parameter(
        names = {"--fhir_definition_dep"},
        description =
            "List of FhirPackages that this package depends on.  These should be zips containing a"
                + " PackageInfo prototxt file, along with resources defined by the package, such"
                + " as the ones generated by the fhir_package rule in protogen.bzl")
    private List<String> fhirDefinitionDepList = new ArrayList<>();

    @Parameter(
        names = {"--additional_import"},
        description = "Non-core FHIR Packages to add.")
    private List<String> additionalImports = new ArrayList<>();

    @Parameter(
        names = {"--output_name"},
        description =
            "Name for output proto files.  If separating extensions, will "
                + "output ${output_name}.proto and ${output_name}_extensions.proto.  "
                + "Otherwise, just outputs ${output_name}.proto.")
    private String outputName = "output";

    @Parameter(
        names = {"--input_package"},
        description = "Input FHIR package",
        required = true)
    private String inputPackageLocation = null;

    @Parameter(
        names = {"--exclude"},
        description = "Ids of input StructureDefinitions to ignore.")
    private List<String> excludeIds = new ArrayList<>();

    private Set<FhirPackage> getDependencies() throws IOException {
      Set<FhirPackage> packages = new HashSet<>();
      for (String fhirDefinitionDep : fhirDefinitionDepList) {
        packages.add(FhirPackage.load(fhirDefinitionDep));
      }
      return packages;
    }
  }

  ProtoGeneratorMain(PrintWriter writer) {
    this.writer = checkNotNull(writer);
  }

  void run(Args args) throws IOException {
    Set<FhirPackage> fhirPackages = args.getDependencies();

    FhirPackage unfilteredInputPackage = FhirPackage.load(args.inputPackageLocation);
    fhirPackages.add(unfilteredInputPackage);
    FhirPackage inputPackage =
        args.filter == null
            ? unfilteredInputPackage
            : applyFilter(unfilteredInputPackage, args.filter);
    PackageInfo packageInfo = inputPackage.packageInfo;

    if (packageInfo.getProtoPackage().isEmpty()
        || packageInfo.getFhirVersion() == FhirVersion.FHIR_VERSION_UNKNOWN) {
      throw new IllegalArgumentException(
          "package_info must contain at least a proto_package and fhir_version.");
    }

    // Add in core FHIR types (e.g., datatypes and unprofiled resources)
    switch (packageInfo.getFhirVersion()) {
      case STU3:
        if (args.stu3CoreDep == null) {
          throw new IllegalArgumentException(
              "Package is for STU3, but --stu3_core_dep is not specified.");
        }
        fhirPackages.add(FhirPackage.load(args.stu3CoreDep));
        break;
      case R4:
        if (args.r4CoreDep == null) {
          throw new IllegalArgumentException(
              "Package is for R4, but --r4_core_dep is not specified.");
        }
        fhirPackages.add(FhirPackage.load(args.r4CoreDep));
        break;
      default:
        throw new IllegalArgumentException(
            "FHIR version not supported by ProfileGenerator: " + packageInfo.getFhirVersion());
    }

    for (StructureDefinition structDef : inputPackage.structureDefinitions) {
      typeToSourceFileBaseName.put(
          GeneratorUtils.getTypeName(structDef, packageInfo.getFhirVersion()),
          structDef.getId().getValue());
    }

    List<StructureDefinition> inputDefinitions =
        inputPackage.structureDefinitions.stream()
            .filter(def -> !args.excludeIds.contains(def.getId().getValue()))
            .collect(Collectors.toList());

    // Generate the proto file.
    writer.println("Generating proto descriptors...");
    writer.flush();

    ValueSetGenerator valueSetGenerator = new ValueSetGenerator(packageInfo, fhirPackages);
    ProtoGenerator generator =
        packageInfo.getFhirVersion() != FhirVersion.R4
            ? new ProtoGenerator(packageInfo, fhirPackages)
            : new ProtoGenerator(packageInfo, fhirPackages, valueSetGenerator);
    ProtoFilePrinter printer = new ProtoFilePrinter(packageInfo);

    if (args.emitCodesProto) {
      if (inputPackage == null) {
        throw new IllegalArgumentException(
            "Emitting codes proto is only valid for proto generation at the package level, using"
                + " --input_package");
      }
      File outputFile = new File(args.outputDirectory, args.outputName + "_codes.proto");
      Files.asCharSink(outputFile, UTF_8)
          .write(printer.print(valueSetGenerator.generateCodeSystemAndValueSetsFile(inputPackage)));
    }

    // TODO: Move this logic to Protogenerator
    switch (packageInfo.getFileSplittingBehavior()) {
      case DEFAULT_SPLITTING_BEHAVIOR:
      case NO_SPLITTING:
        {
          FileDescriptorProto proto = generator.generateFileDescriptor(inputDefinitions);
          if (packageInfo.getLocalContainedResource()) {
            proto = generator.addContainedResource(proto, proto.getMessageTypeList());
          }
          writeProto(proto, args.outputName + ".proto", args, true, printer);
        }
        break;
      case SEPARATE_EXTENSIONS:
        writeWithSeparateExtensionsFile(inputDefinitions, generator, printer, packageInfo, args);
        break;
      case SPLIT_RESOURCES:
        writeSplitResources(inputDefinitions, generator, printer, packageInfo, args);
        break;
      case UNRECOGNIZED:
        throw new IllegalArgumentException(
            "Unrecognized file splitting behavior: " + packageInfo.getFileSplittingBehavior());
    }
  }

  private static FhirPackage applyFilter(FhirPackage fhirPackage, String type) {
    Predicate<StructureDefinition> isDatatype =
        def ->
            def.getKind().getValue() == StructureDefinitionKindCode.Value.PRIMITIVE_TYPE
                || def.getKind().getValue() == StructureDefinitionKindCode.Value.COMPLEX_TYPE;
    Predicate<StructureDefinition> isResource =
        def ->
            def.getKind().getValue() == StructureDefinitionKindCode.Value.RESOURCE
                // Despite being categorized as "Logical" rather than a "Resourcde",
                // MetadataResource is
                // included here for historical reasons (and lack of a better place...)
                || def.getId().getValue().equals("MetadataResource");
    Predicate<StructureDefinition> isConstraint =
        def -> def.getDerivation().getValue() == TypeDerivationRuleCode.Value.CONSTRAINT;
    Predicate<StructureDefinition> isExtensionProfile =
        isConstraint.and(
            def ->
                def.getBaseDefinition()
                    .getValue()
                    .equals("http://hl7.org/fhir/StructureDefinition/Extension"));
    if (type.equals("datatype")) {
      return fhirPackage.filterResources(isDatatype.and(isExtensionProfile.negate()));
    } else if (type.equals("extension")) {
      return fhirPackage.filterResources(isExtensionProfile);
    } else if (type.equals("resource")) {
      return fhirPackage.filterResources(isResource.and(isConstraint.negate()));
    } else if (type.equals("profile")) {
      return fhirPackage.filterResources(isResource.and(isConstraint));
    } else {
      throw new IllegalArgumentException("Unrecognized filter: " + type);
    }
  }

  void writeWithSeparateExtensionsFile(
      List<StructureDefinition> definitions,
      ProtoGenerator generator,
      ProtoFilePrinter printer,
      PackageInfo packageInfo,
      Args args)
      throws IOException {
    List<StructureDefinition> extensions = new ArrayList<>();
    List<StructureDefinition> profiles = new ArrayList<>();
    for (StructureDefinition structDef : definitions) {
      if (structDef.getBaseDefinition().getValue().equals(EXTENSION_STRUCTURE_DEFINITION_URL)) {
        extensions.add(structDef);
      } else {
        profiles.add(structDef);
      }
    }
    writeProto(
        generator.generateFileDescriptor(extensions),
        args.outputName + "_extensions.proto",
        args,
        false,
        printer);
    FileDescriptorProto mainFileProto = generator.generateFileDescriptor(profiles);
    if (packageInfo.getLocalContainedResource()) {
      mainFileProto =
          generator.addContainedResource(mainFileProto, mainFileProto.getMessageTypeList());
    }
    writeProto(mainFileProto, args.outputName + ".proto", args, true, printer);
  }

  void writeSplitResources(
      List<StructureDefinition> definitions,
      ProtoGenerator generator,
      ProtoFilePrinter printer,
      PackageInfo packageInfo,
      Args args)
      throws IOException {
    // Divide into three categories.
    // Extensions and datatypes will be printed into a single aggregate file each,
    // while resources will be printed into one file per resource.
    // Note primititives are include in datatypes here.
    List<StructureDefinition> extensions = new ArrayList<>();
    List<StructureDefinition> datatypes = new ArrayList<>();
    List<StructureDefinition> resources = new ArrayList<>();

    for (StructureDefinition structDef : definitions) {
      StructureDefinitionKindCode.Value kind = structDef.getKind().getValue();
      if (structDef.getBaseDefinition().getValue().equals(EXTENSION_STRUCTURE_DEFINITION_URL)) {
        extensions.add(structDef);
      } else if (kind == StructureDefinitionKindCode.Value.RESOURCE) {
        resources.add(structDef);
      } else if (kind == StructureDefinitionKindCode.Value.PRIMITIVE_TYPE
          || kind == StructureDefinitionKindCode.Value.COMPLEX_TYPE) {
        datatypes.add(structDef);
      }
    }

    if (!extensions.isEmpty()) {
      writeProto(
          generator.generateFileDescriptor(extensions), "extensions.proto", args, false, printer);
    }

    if (!datatypes.isEmpty()) {
      writeProto(
          generator.generateFileDescriptor(datatypes), "datatypes.proto", args, false, printer);
    }

    // TODO: Move Contained Resource logic into ProtoGenerator.java
    if (!resources.isEmpty()) {
      List<DescriptorProto> containedTypes = new ArrayList<>();
      // Note that in the case where there is a contained resource that is local to a proto set,
      // (the usual case), we need to define the ContainedResource proto in the same file as the
      // Bundle proto to avoid a circular dependency.  Since we need to define all other resources
      // before we can define ContainedResource, we defer printing the Bundle file until after
      // all other resources are generated, and after we've added in ContainedResource.
      FileDescriptorProto deferredBundleFile = null;
      for (StructureDefinition structDef : definitions) {
        List<StructureDefinition> oneResource = new ArrayList<>();
        oneResource.add(structDef);
        FileDescriptorProto fileProto = generator.generateFileDescriptor(oneResource);
        DescriptorProto type = fileProto.getMessageType(0);
        String filename =
            resourceNameToFileName(
                GeneratorUtils.getTypeName(structDef, packageInfo.getFhirVersion()), generator);
        if (type.getName().equals("Bundle")) {
          deferredBundleFile = fileProto;
        } else {
          writeProto(fileProto, filename, args, true, printer);
        }
        if (!type.getOptions().getExtension(Annotations.isAbstractType)) {
          containedTypes.add(type);
        }
      }
      if (deferredBundleFile != null) {
        if (packageInfo.getLocalContainedResource()) {
          FileDescriptorProto.Builder fileBuilder =
              generator.addContainedResource(deferredBundleFile, containedTypes).toBuilder();
          String importRoot = args.outputDirectory;
          while (importRoot.contains("/../")) {
            // resolve foo/bar/baz/../../quux into foo/quux
            importRoot = importRoot.replaceAll("/[^/]*/\\.\\./", "/");
          }
          for (DescriptorProto type : containedTypes) {
            if (!type.getName().equals("Bundle")) {
              fileBuilder.addDependency(
                  new File(importRoot, resourceNameToFileName(type.getName(), generator))
                      .toString());
            }
          }
          writeProto(
              fileBuilder.build(), "bundle_and_contained_resource.proto", args, true, printer);
        } else {
          writeProto(deferredBundleFile, "bundle.proto", args, true, printer);
        }
      }
    }
  }

  String resourceNameToFileName(String resourceName, ProtoGenerator generator) {
    return CaseFormat.UPPER_CAMEL.to(
            CaseFormat.LOWER_UNDERSCORE,
            GeneratorUtils.resolveAcronyms(GeneratorUtils.toFieldTypeCase(resourceName)))
        + ".proto";
  }

  private void writeProto(
      FileDescriptorProto proto,
      String protoFileName,
      Args args,
      boolean includeAdditionalImports,
      ProtoFilePrinter printer)
      throws IOException {
    if (includeAdditionalImports) {
      for (String additionalImport : args.additionalImports) {
        proto = proto.toBuilder().addDependency(new File(additionalImport).toString()).build();
      }
    }
    if (args.sort) {
      List<DescriptorProto> messages = new ArrayList<>(proto.getMessageTypeList());
      proto =
          proto
              .toBuilder()
              .clearMessageType()
              .addAllMessageType(
                  messages.stream()
                      .sorted(
                          (a, b) -> {
                            boolean aIsPrimitive = AnnotationUtils.isPrimitiveType(a);
                            boolean bIsPrimitive = AnnotationUtils.isPrimitiveType(b);
                            if (aIsPrimitive != bIsPrimitive) {
                              return aIsPrimitive ? -1 : 1;
                            } else {
                              return a.getName().compareTo(b.getName());
                            }
                          })
                      .collect(Collectors.toList()))
              .build();
    }

    String protoFileContents = printer.print(proto);

    if (args.emitProto) {
      // Save the result as a .proto file
      writer.println("Writing " + protoFileName + "...");
      writer.flush();
      File outputFile = new File(args.outputDirectory, protoFileName);
      Files.asCharSink(outputFile, UTF_8).write(protoFileContents);
    }

    if (args.emitDescriptors) {
      // Save the result as individual .descriptor.prototxt files
      writer.println("Writing individual descriptors to " + args.descriptorOutputDirectory + "...");
      writer.flush();
      for (DescriptorProto descriptor : proto.getMessageTypeList()) {
        if (descriptor.getName().equals("ContainedResource")) {
          continue;
        }
        String fileBaseName = typeToSourceFileBaseName.get(descriptor.getName());
        if (fileBaseName == null) {
          throw new IllegalArgumentException(
              "No file basename associated with type: "
                  + descriptor.getName()
                  + "\n"
                  + typeToSourceFileBaseName);
        }
        File outputFile =
            new File(args.descriptorOutputDirectory, fileBaseName + ".descriptor.prototxt");
        Files.asCharSink(outputFile, UTF_8).write(descriptor.toString());
      }
    }
  }

  public static void main(String[] argv) throws IOException {
    // Each non-flag argument is assumed to be an input file.
    Args args = new Args();
    JCommander jcommander = new JCommander(args);
    try {
      jcommander.parse(argv);
    } catch (ParameterException exception) {
      System.err.printf("Invalid usage: %s\n", exception.getMessage());
      System.exit(1);
    }
    new ProtoGeneratorMain(
            new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out, UTF_8))))
        .run(args);
  }
}
