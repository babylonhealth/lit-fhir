use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct ElementDefinition_Base {
  pub(crate) id?: String,
  pub(crate) min: u32,
  pub(crate) max: String,
  pub(crate) path: String,
  pub(crate) extension?: Extension,
}


pub struct ElementDefinition_Example {
  pub(crate) id?: String,
  pub(crate) label: String,
  pub(crate) value: Address | Age | Annotation | Attachment | String | BigDecimal | Boolean | String | String | CodeableConcept | Coding | ContactDetail | ContactPoint | Contributor | Count | DataRequirement | Distance | Dosage | Duration | Expression | FHIRDate | Date | HumanName | String | Identifier | i32 | Date | String | Meta | Money | String | ParameterDefinition | Period | u32 | Quantity | Range | Ratio | Reference | RelatedArtifact | SampledData | Signature | String | Timing | TriggerDefinition | String | u32 | String | String | UsageContext | Date,
  pub(crate) extension?: Extension,
}


pub struct ElementDefinition_Mapping {
  pub(crate) id?: String,
  pub(crate) map: String,
  pub(crate) comment?: String,
  pub(crate) identity: String,
  pub(crate) language?: String,
  pub(crate) extension?: Extension,
}


pub struct ElementDefinition_Type {
  pub(crate) id?: String,
  pub(crate) code: String,
  pub(crate) profile?: String,
  pub(crate) extension?: Extension,
  pub(crate) versioning?: String,
  pub(crate) aggregation?: String,
  pub(crate) targetProfile?: String,
}


pub struct ElementDefinition_Binding {
  pub(crate) id?: String,
  pub(crate) strength: String,
  pub(crate) valueSet?: String,
  pub(crate) extension?: Extension,
  pub(crate) description?: String,
}


pub struct ElementDefinition_Constraint {
  pub(crate) id?: String,
  pub(crate) key: String,
  pub(crate) human: String,
  pub(crate) xpath?: String,
  pub(crate) source?: String,
  pub(crate) severity: String,
  pub(crate) extension?: Extension,
  pub(crate) expression?: String,
  pub(crate) requirements?: String,
}


pub struct ElementDefinition_Slicing_Discriminator {
  pub(crate) id?: String,
  pub(crate) _type: String,
  pub(crate) path: String,
  pub(crate) extension?: Extension,
}

pub struct ElementDefinition_Slicing {
  pub(crate) id?: String,
  pub(crate) rules: String,
  pub(crate) ordered?: Boolean,
  pub(crate) extension?: Extension,
  pub(crate) description?: String,
  pub(crate) discriminator?: ElementDefinition_Slicing_Discriminator,
}

pub struct ElementDefinition {
  pub(crate) min?: u32,
  pub(crate) max?: String,
  pub(crate) path: String,
  pub(crate) code?: Coding,
  pub(crate) label?: String,
  pub(crate) short?: String,
  pub(crate) alias?: String,
  pub(crate) comment?: String,
  pub(crate) fixed?: Address | Age | Annotation | Attachment | String | BigDecimal | Boolean | String | String | CodeableConcept | Coding | ContactDetail | ContactPoint | Contributor | Count | DataRequirement | Distance | Dosage | Duration | Expression | FHIRDate | Date | HumanName | String | Identifier | i32 | Date | String | Meta | Money | String | ParameterDefinition | Period | u32 | Quantity | Range | Ratio | Reference | RelatedArtifact | SampledData | Signature | String | Timing | TriggerDefinition | String | u32 | String | String | UsageContext | Date,
  pub(crate) sliceName?: String,
  pub(crate) maxLength?: i32,
  pub(crate) condition?: String,
  pub(crate) isSummary?: Boolean,
  pub(crate) definition?: String,
  pub(crate) pattern?: Address | Age | Annotation | Attachment | String | BigDecimal | Boolean | String | String | CodeableConcept | Coding | ContactDetail | ContactPoint | Contributor | Count | DataRequirement | Distance | Dosage | Duration | Expression | FHIRDate | Date | HumanName | String | Identifier | i32 | Date | String | Meta | Money | String | ParameterDefinition | Period | u32 | Quantity | Range | Ratio | Reference | RelatedArtifact | SampledData | Signature | String | Timing | TriggerDefinition | String | u32 | String | String | UsageContext | Date,
  pub(crate) isModifier?: Boolean,
  pub(crate) minValue?: BigDecimal | FHIRDate | Date | i32 | Date | u32 | Quantity | u32 | Date,
  pub(crate) maxValue?: BigDecimal | FHIRDate | Date | i32 | Date | u32 | Quantity | u32 | Date,
  pub(crate) mustSupport?: Boolean,
  pub(crate) requirements?: String,
  pub(crate) orderMeaning?: String,
  pub(crate) representation?: String,
  pub(crate) base?: ElementDefinition_Base,
  pub(crate) defaultValue?: Address | Age | Annotation | Attachment | String | BigDecimal | Boolean | String | String | CodeableConcept | Coding | ContactDetail | ContactPoint | Contributor | Count | DataRequirement | Distance | Dosage | Duration | Expression | FHIRDate | Date | HumanName | String | Identifier | i32 | Date | String | Meta | Money | String | ParameterDefinition | Period | u32 | Quantity | Range | Ratio | Reference | RelatedArtifact | SampledData | Signature | String | Timing | TriggerDefinition | String | u32 | String | String | UsageContext | Date,
  pub(crate) contentReference?: String,
  pub(crate) isModifierReason?: String,
  pub(crate) example?: ElementDefinition_Example,
  pub(crate) mapping?: ElementDefinition_Mapping,
  pub(crate) _type?: ElementDefinition_Type,
  pub(crate) meaningWhenMissing?: String,
  pub(crate) sliceIsConstraining?: Boolean,
  pub(crate) binding?: ElementDefinition_Binding,
  pub(crate) constraint?: ElementDefinition_Constraint,
  pub(crate) slicing?: ElementDefinition_Slicing,
}