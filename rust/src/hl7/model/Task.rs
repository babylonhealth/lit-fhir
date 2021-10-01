use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Task_Input {
  pub(crate) id?: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) value: Address | Age | Annotation | Attachment | String | BigDecimal | Boolean | String | String | CodeableConcept | Coding | ContactDetail | ContactPoint | Contributor | Count | DataRequirement | Distance | Dosage | Duration | Expression | FHIRDate | Date | HumanName | String | Identifier | i32 | Date | String | Meta | Money | String | ParameterDefinition | Period | u32 | Quantity | Range | Ratio | Reference | RelatedArtifact | SampledData | Signature | String | Timing | TriggerDefinition | String | u32 | String | String | UsageContext | Date,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct Task_Output {
  pub(crate) id?: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) value: Address | Age | Annotation | Attachment | String | BigDecimal | Boolean | String | String | CodeableConcept | Coding | ContactDetail | ContactPoint | Contributor | Count | DataRequirement | Distance | Dosage | Duration | Expression | FHIRDate | Date | HumanName | String | Identifier | i32 | Date | String | Meta | Money | String | ParameterDefinition | Period | u32 | Quantity | Range | Ratio | Reference | RelatedArtifact | SampledData | Signature | String | Timing | TriggerDefinition | String | u32 | String | String | UsageContext | Date,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct Task_Restriction {
  pub(crate) id?: String,
  pub(crate) period?: Period,
  pub(crate) extension?: Extension,
  pub(crate) recipient?: Reference,
  pub(crate) repetitions?: u32,
  pub(crate) modifierExtension?: Extension,
}

pub struct Task {
  pub(crate) for?: Reference,
  pub(crate) code?: CodeableConcept,
  pub(crate) note?: Annotation,
  pub(crate) focus?: Reference,
  pub(crate) owner?: Reference,
  pub(crate) partOf?: Reference,
  pub(crate) status: String,
  pub(crate) intent: String,
  pub(crate) basedOn?: Reference,
  pub(crate) priority?: String,
  pub(crate) location?: Reference,
  pub(crate) encounter?: Reference,
  pub(crate) requester?: Reference,
  pub(crate) insurance?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) authoredOn?: Date,
  pub(crate) reasonCode?: CodeableConcept,
  pub(crate) description?: String,
  pub(crate) statusReason?: CodeableConcept,
  pub(crate) lastModified?: Date,
  pub(crate) performerType?: CodeableConcept,
  pub(crate) businessStatus?: CodeableConcept,
  pub(crate) instantiatesUri?: String,
  pub(crate) groupIdentifier?: Identifier,
  pub(crate) executionPeriod?: Period,
  pub(crate) reasonReference?: Reference,
  pub(crate) relevantHistory?: Reference,
  pub(crate) instantiatesCanonical?: String,
  pub(crate) input?: Task_Input,
  pub(crate) output?: Task_Output,
  pub(crate) restriction?: Task_Restriction,
}