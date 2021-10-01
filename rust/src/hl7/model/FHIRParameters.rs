use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct FHIRParameters_Parameter {
  pub(crate) id?: String,
  pub(crate) name: String,
  pub(crate) part?: FHIRParameters_Parameter,
  pub(crate) value?: Address | Age | Annotation | Attachment | String | BigDecimal | Boolean | String | String | CodeableConcept | Coding | ContactDetail | ContactPoint | Contributor | Count | DataRequirement | Distance | Dosage | Duration | Expression | FHIRDate | Date | HumanName | String | Identifier | i32 | Date | String | Meta | Money | String | ParameterDefinition | Period | u32 | Quantity | Range | Ratio | Reference | RelatedArtifact | SampledData | Signature | String | Timing | TriggerDefinition | String | u32 | String | String | UsageContext | Date,
  pub(crate) resource?: Resource,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct FHIRParameters {
  pub(crate) parameter?: FHIRParameters_Parameter,
}