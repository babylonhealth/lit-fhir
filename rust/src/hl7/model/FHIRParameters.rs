use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct FHIRParameters_Parameter {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) part: Vector<FHIRParameters_Parameter>,
  pub(crate) value: Option<Address | Age | Annotation | Attachment | String | BigDecimal | Boolean | String | String | CodeableConcept | Coding | ContactDetail | ContactPoint | Contributor | Count | DataRequirement | Distance | Dosage | Duration | Expression | FHIRDate | Date | HumanName | String | Identifier | i32 | Date | String | Meta | Money | String | ParameterDefinition | Period | u32 | Quantity | Range | Ratio | Reference | RelatedArtifact | SampledData | Signature | String | Timing | TriggerDefinition | String | u32 | String | String | UsageContext | Date>,
  pub(crate) resource: Option<Resource>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct FHIRParameters {
  pub(crate) parameter: Vector<FHIRParameters_Parameter>,
}