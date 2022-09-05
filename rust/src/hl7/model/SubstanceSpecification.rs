use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::UnionCodeableConceptOrReference;
use crate::core::model::Attachment::Attachment;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Ratio::Ratio;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::Union00133982841;
use crate::hl7::UnionQuantityOrString;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct SubstanceSpecification_Code {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) status: Option<Box<dyn CodeableConcept>>,
  pub(crate) source: Vector<Box<dyn Reference>>,
  pub(crate) comment: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) statusDate: Option<DateTime<FixedOffset>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct SubstanceSpecification_Moiety {
  pub(crate) id: Option<String>,
  pub(crate) role: Option<Box<dyn CodeableConcept>>,
  pub(crate) name: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) amount: Option<UnionQuantityOrString>,
  pub(crate) identifier: Option<Box<dyn Identifier>>,
  pub(crate) stereochemistry: Option<Box<dyn CodeableConcept>>,
  pub(crate) opticalActivity: Option<Box<dyn CodeableConcept>>,
  pub(crate) molecularFormula: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct SubstanceSpecification_Property {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) category: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) amount: Option<UnionQuantityOrString>,
  pub(crate) parameters: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) definingSubstance: Option<UnionCodeableConceptOrReference>,
}


#[derive(Clone, Debug)]
pub struct SubstanceSpecification_Name_Official {
  pub(crate) id: Option<String>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) status: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) authority: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct SubstanceSpecification_Name {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) status: Option<Box<dyn CodeableConcept>>,
  pub(crate) domain: Vector<Box<dyn CodeableConcept>>,
  pub(crate) source: Vector<Box<dyn Reference>>,
  pub(crate) synonym: Vector<Box<dyn SubstanceSpecification_Name>>,
  pub(crate) language: Vector<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) preferred: Option<bool>,
  pub(crate) translation: Vector<Box<dyn SubstanceSpecification_Name>>,
  pub(crate) jurisdiction: Vector<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) official: Vector<SubstanceSpecification_Name_Official>,
}


#[derive(Clone, Debug)]
pub struct SubstanceSpecification_Relationship {
  pub(crate) id: Option<String>,
  pub(crate) source: Vector<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) amount: Option<Union00133982841>,
  pub(crate) isDefining: Option<bool>,
  pub(crate) amountType: Option<Box<dyn CodeableConcept>>,
  pub(crate) substance: Option<UnionCodeableConceptOrReference>,
  pub(crate) relationship: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) amountRatioLowLimit: Option<Box<dyn Ratio>>,
}


#[derive(Clone, Debug)]
pub struct SubstanceSpecification_Structure_Representation {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) attachment: Option<Box<dyn Attachment>>,
  pub(crate) representation: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct SubstanceSpecification_Structure_Isotope_MolecularWeight {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) method: Option<Box<dyn CodeableConcept>>,
  pub(crate) amount: Option<Box<dyn Quantity>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct SubstanceSpecification_Structure_Isotope {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<Box<dyn CodeableConcept>>,
  pub(crate) halfLife: Option<Box<dyn Quantity>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Option<Box<dyn Identifier>>,
  pub(crate) substitution: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) molecularWeight: Option<SubstanceSpecification_Structure_Isotope_MolecularWeight>,
}

#[derive(Clone, Debug)]
pub struct SubstanceSpecification_Structure {
  pub(crate) id: Option<String>,
  pub(crate) source: Vector<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) stereochemistry: Option<Box<dyn CodeableConcept>>,
  pub(crate) opticalActivity: Option<Box<dyn CodeableConcept>>,
  pub(crate) molecularWeight: Option<Box<dyn SubstanceSpecification_Structure_Isotope_MolecularWeight>>,
  pub(crate) molecularFormula: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) molecularFormulaByMoiety: Option<String>,
  pub(crate) representation: Vector<SubstanceSpecification_Structure_Representation>,
  pub(crate) isotope: Vector<SubstanceSpecification_Structure_Isotope>,
}

#[derive(Clone, Debug)]
pub struct SubstanceSpecificationRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) status: Option<Box<dyn CodeableConcept>>,
  pub(crate) domain: Option<Box<dyn CodeableConcept>>,
  pub(crate) source: Vector<Box<dyn Reference>>,
  pub(crate) comment: Option<String>,
  pub(crate) polymer: Option<Box<dyn Reference>>,
  pub(crate) protein: Option<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Option<Box<dyn Identifier>>,
  pub(crate) description: Option<String>,
  pub(crate) nucleicAcid: Option<Box<dyn Reference>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) sourceMaterial: Option<Box<dyn Reference>>,
  pub(crate) molecularWeight: Vector<Box<dyn SubstanceSpecification_Structure_Isotope_MolecularWeight>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) referenceInformation: Option<Box<dyn Reference>>,
  pub(crate) code: Vector<String>,
  pub(crate) moiety: Vector<SubstanceSpecification_Moiety>,
  pub(crate) property: Vector<SubstanceSpecification_Property>,
  pub(crate) name: Vector<SubstanceSpecification_Name>,
  pub(crate) relationship: Vector<SubstanceSpecification_Relationship>,
  pub(crate) structure: Option<SubstanceSpecification_Structure>,
}

pub trait SubstanceSpecification : DomainResource {
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn status(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn domain(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn source(&self) -> &Vector<Box<dyn Reference>>;
  fn comment(&self) -> &Option<String>;
  fn polymer(&self) -> &Option<Box<dyn Reference>>;
  fn protein(&self) -> &Option<Box<dyn Reference>>;
  fn identifier(&self) -> &Option<Box<dyn Identifier>>;
  fn description(&self) -> &Option<String>;
  fn nucleicAcid(&self) -> &Option<Box<dyn Reference>>;
  fn sourceMaterial(&self) -> &Option<Box<dyn Reference>>;
  fn molecularWeight(&self) -> &Vector<Box<dyn SubstanceSpecification_Structure_Isotope_MolecularWeight>>;
  fn referenceInformation(&self) -> &Option<Box<dyn Reference>>;
  fn code(&self) -> &Vector<String>;
  fn moiety(&self) -> &Vector<SubstanceSpecification_Moiety>;
  fn property(&self) -> &Vector<SubstanceSpecification_Property>;
  fn name(&self) -> &Vector<SubstanceSpecification_Name>;
  fn relationship(&self) -> &Vector<SubstanceSpecification_Relationship>;
  fn structure(&self) -> &Option<SubstanceSpecification_Structure>;
}

dyn_clone::clone_trait_object!(SubstanceSpecification);

impl FHIRObject for SubstanceSpecificationRaw {
}

impl Resource for SubstanceSpecificationRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for SubstanceSpecificationRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl SubstanceSpecification for SubstanceSpecificationRaw {
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>> { &self._type }
  fn status(&self) -> &Option<Box<dyn CodeableConcept>> { &self.status }
  fn domain(&self) -> &Option<Box<dyn CodeableConcept>> { &self.domain }
  fn source(&self) -> &Vector<Box<dyn Reference>> { &self.source }
  fn comment(&self) -> &Option<String> { &self.comment }
  fn polymer(&self) -> &Option<Box<dyn Reference>> { &self.polymer }
  fn protein(&self) -> &Option<Box<dyn Reference>> { &self.protein }
  fn identifier(&self) -> &Option<Box<dyn Identifier>> { &self.identifier }
  fn description(&self) -> &Option<String> { &self.description }
  fn nucleicAcid(&self) -> &Option<Box<dyn Reference>> { &self.nucleicAcid }
  fn sourceMaterial(&self) -> &Option<Box<dyn Reference>> { &self.sourceMaterial }
  fn molecularWeight(&self) -> &Vector<Box<dyn SubstanceSpecification_Structure_Isotope_MolecularWeight>> { &self.molecularWeight }
  fn referenceInformation(&self) -> &Option<Box<dyn Reference>> { &self.referenceInformation }
  fn code(&self) -> &Vector<String> { &self.code }
  fn moiety(&self) -> &Vector<SubstanceSpecification_Moiety> { &self.moiety }
  fn property(&self) -> &Vector<SubstanceSpecification_Property> { &self.property }
  fn name(&self) -> &Vector<SubstanceSpecification_Name> { &self.name }
  fn relationship(&self) -> &Vector<SubstanceSpecification_Relationship> { &self.relationship }
  fn structure(&self) -> &Option<SubstanceSpecification_Structure> { &self.structure }
}

