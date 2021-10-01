use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Task_Input {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) value: Address | Age | Annotation | Attachment | String | BigDecimal | Boolean | String | String | CodeableConcept | Coding | ContactDetail | ContactPoint | Contributor | Count | DataRequirement | Distance | Dosage | Duration | Expression | FHIRDate | Date | HumanName | String | Identifier | i32 | Date | String | Meta | Money | String | ParameterDefinition | Period | u32 | Quantity | Range | Ratio | Reference | RelatedArtifact | SampledData | Signature | String | Timing | TriggerDefinition | String | u32 | String | String | UsageContext | Date,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Task_Output {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) value: Address | Age | Annotation | Attachment | String | BigDecimal | Boolean | String | String | CodeableConcept | Coding | ContactDetail | ContactPoint | Contributor | Count | DataRequirement | Distance | Dosage | Duration | Expression | FHIRDate | Date | HumanName | String | Identifier | i32 | Date | String | Meta | Money | String | ParameterDefinition | Period | u32 | Quantity | Range | Ratio | Reference | RelatedArtifact | SampledData | Signature | String | Timing | TriggerDefinition | String | u32 | String | String | UsageContext | Date,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Task_Restriction {
  pub(crate) id: Option<String>,
  pub(crate) period: Option<Period>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) recipient: Vector<Reference>,
  pub(crate) repetitions: Option<u32>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Task {
  pub(crate) for: Option<Reference>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) focus: Option<Reference>,
  pub(crate) owner: Option<Reference>,
  pub(crate) partOf: Vector<Reference>,
  pub(crate) status: String,
  pub(crate) intent: String,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) priority: Option<String>,
  pub(crate) location: Option<Reference>,
  pub(crate) encounter: Option<Reference>,
  pub(crate) requester: Option<Reference>,
  pub(crate) insurance: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) authoredOn: Option<Date>,
  pub(crate) reasonCode: Option<CodeableConcept>,
  pub(crate) description: Option<String>,
  pub(crate) statusReason: Option<CodeableConcept>,
  pub(crate) lastModified: Option<Date>,
  pub(crate) performerType: Vector<CodeableConcept>,
  pub(crate) businessStatus: Option<CodeableConcept>,
  pub(crate) instantiatesUri: Option<String>,
  pub(crate) groupIdentifier: Option<Identifier>,
  pub(crate) executionPeriod: Option<Period>,
  pub(crate) reasonReference: Option<Reference>,
  pub(crate) relevantHistory: Vector<Reference>,
  pub(crate) instantiatesCanonical: Option<String>,
  pub(crate) input: Vector<Task_Input>,
  pub(crate) output: Vector<Task_Output>,
  pub(crate) restriction: Option<Task_Restriction>,
}