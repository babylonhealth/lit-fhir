use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct ElementDefinition_Base {
  pub(crate) id: Option<String>,
  pub(crate) min: u32,
  pub(crate) max: String,
  pub(crate) path: String,
  pub(crate) extension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct ElementDefinition_Example {
  pub(crate) id: Option<String>,
  pub(crate) label: String,
  pub(crate) value: Address | Age | Annotation | Attachment | String | BigDecimal | Boolean | String | String | CodeableConcept | Coding | ContactDetail | ContactPoint | Contributor | Count | DataRequirement | Distance | Dosage | Duration | Expression | FHIRDate | Date | HumanName | String | Identifier | i32 | Date | String | Meta | Money | String | ParameterDefinition | Period | u32 | Quantity | Range | Ratio | Reference | RelatedArtifact | SampledData | Signature | String | Timing | TriggerDefinition | String | u32 | String | String | UsageContext | Date,
  pub(crate) extension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct ElementDefinition_Mapping {
  pub(crate) id: Option<String>,
  pub(crate) map: String,
  pub(crate) comment: Option<String>,
  pub(crate) identity: String,
  pub(crate) language: Option<String>,
  pub(crate) extension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct ElementDefinition_Type {
  pub(crate) id: Option<String>,
  pub(crate) code: String,
  pub(crate) profile: Vector<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) versioning: Option<String>,
  pub(crate) aggregation: Vector<String>,
  pub(crate) targetProfile: Vector<String>,
}


#[derive(Clone, Debug)]
pub struct ElementDefinition_Binding {
  pub(crate) id: Option<String>,
  pub(crate) strength: String,
  pub(crate) valueSet: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Option<String>,
}


#[derive(Clone, Debug)]
pub struct ElementDefinition_Constraint {
  pub(crate) id: Option<String>,
  pub(crate) key: String,
  pub(crate) human: String,
  pub(crate) xpath: Option<String>,
  pub(crate) source: Option<String>,
  pub(crate) severity: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) expression: Option<String>,
  pub(crate) requirements: Option<String>,
}


#[derive(Clone, Debug)]
pub struct ElementDefinition_Slicing_Discriminator {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) path: String,
  pub(crate) extension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct ElementDefinition_Slicing {
  pub(crate) id: Option<String>,
  pub(crate) rules: String,
  pub(crate) ordered: Option<Boolean>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Option<String>,
  pub(crate) discriminator: Vector<ElementDefinition_Slicing_Discriminator>,
}

#[derive(Clone, Debug)]
pub struct ElementDefinition {
  pub(crate) min: Option<u32>,
  pub(crate) max: Option<String>,
  pub(crate) path: String,
  pub(crate) code: Vector<Coding>,
  pub(crate) label: Option<String>,
  pub(crate) short: Option<String>,
  pub(crate) alias: Vector<String>,
  pub(crate) comment: Option<String>,
  pub(crate) fixed: Option<Address | Age | Annotation | Attachment | String | BigDecimal | Boolean | String | String | CodeableConcept | Coding | ContactDetail | ContactPoint | Contributor | Count | DataRequirement | Distance | Dosage | Duration | Expression | FHIRDate | Date | HumanName | String | Identifier | i32 | Date | String | Meta | Money | String | ParameterDefinition | Period | u32 | Quantity | Range | Ratio | Reference | RelatedArtifact | SampledData | Signature | String | Timing | TriggerDefinition | String | u32 | String | String | UsageContext | Date>,
  pub(crate) sliceName: Option<String>,
  pub(crate) maxLength: Option<i32>,
  pub(crate) condition: Vector<String>,
  pub(crate) isSummary: Option<Boolean>,
  pub(crate) definition: Option<String>,
  pub(crate) pattern: Option<Address | Age | Annotation | Attachment | String | BigDecimal | Boolean | String | String | CodeableConcept | Coding | ContactDetail | ContactPoint | Contributor | Count | DataRequirement | Distance | Dosage | Duration | Expression | FHIRDate | Date | HumanName | String | Identifier | i32 | Date | String | Meta | Money | String | ParameterDefinition | Period | u32 | Quantity | Range | Ratio | Reference | RelatedArtifact | SampledData | Signature | String | Timing | TriggerDefinition | String | u32 | String | String | UsageContext | Date>,
  pub(crate) isModifier: Option<Boolean>,
  pub(crate) minValue: Option<BigDecimal | FHIRDate | Date | i32 | Date | u32 | Quantity | u32 | Date>,
  pub(crate) maxValue: Option<BigDecimal | FHIRDate | Date | i32 | Date | u32 | Quantity | u32 | Date>,
  pub(crate) mustSupport: Option<Boolean>,
  pub(crate) requirements: Option<String>,
  pub(crate) orderMeaning: Option<String>,
  pub(crate) representation: Vector<String>,
  pub(crate) base: Option<ElementDefinition_Base>,
  pub(crate) defaultValue: Option<Address | Age | Annotation | Attachment | String | BigDecimal | Boolean | String | String | CodeableConcept | Coding | ContactDetail | ContactPoint | Contributor | Count | DataRequirement | Distance | Dosage | Duration | Expression | FHIRDate | Date | HumanName | String | Identifier | i32 | Date | String | Meta | Money | String | ParameterDefinition | Period | u32 | Quantity | Range | Ratio | Reference | RelatedArtifact | SampledData | Signature | String | Timing | TriggerDefinition | String | u32 | String | String | UsageContext | Date>,
  pub(crate) contentReference: Option<String>,
  pub(crate) isModifierReason: Option<String>,
  pub(crate) example: Vector<ElementDefinition_Example>,
  pub(crate) mapping: Vector<ElementDefinition_Mapping>,
  pub(crate) _type: Vector<ElementDefinition_Type>,
  pub(crate) meaningWhenMissing: Option<String>,
  pub(crate) sliceIsConstraining: Option<Boolean>,
  pub(crate) binding: Option<ElementDefinition_Binding>,
  pub(crate) constraint: Vector<ElementDefinition_Constraint>,
  pub(crate) slicing: Option<ElementDefinition_Slicing>,
}