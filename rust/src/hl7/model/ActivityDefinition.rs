use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct ActivityDefinition_Participant {
  pub(crate) id?: String,
  pub(crate) _type: String,
  pub(crate) role?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct ActivityDefinition_DynamicValue {
  pub(crate) id?: String,
  pub(crate) path: String,
  pub(crate) extension?: Extension,
  pub(crate) expression: Expression,
  pub(crate) modifierExtension?: Extension,
}

pub struct ActivityDefinition {
  pub(crate) url?: String,
  pub(crate) name?: String,
  pub(crate) date?: Date,
  pub(crate) kind?: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) title?: String,
  pub(crate) usage?: String,
  pub(crate) topic?: CodeableConcept,
  pub(crate) status: String,
  pub(crate) author?: ContactDetail,
  pub(crate) editor?: ContactDetail,
  pub(crate) intent?: String,
  pub(crate) dosage?: Dosage,
  pub(crate) version?: String,
  pub(crate) contact?: ContactDetail,
  pub(crate) purpose?: String,
  pub(crate) library?: String,
  pub(crate) profile?: String,
  pub(crate) subtitle?: String,
  pub(crate) reviewer?: ContactDetail,
  pub(crate) endorser?: ContactDetail,
  pub(crate) priority?: String,
  pub(crate) location?: Reference,
  pub(crate) quantity?: Quantity,
  pub(crate) bodySite?: CodeableConcept,
  pub(crate) publisher?: String,
  pub(crate) copyright?: String,
  pub(crate) timing?: Age | Duration | Date | Period | Range | Timing,
  pub(crate) transform?: String,
  pub(crate) identifier?: Identifier,
  pub(crate) subject?: CodeableConcept | Reference,
  pub(crate) useContext?: UsageContext,
  pub(crate) product?: CodeableConcept | Reference,
  pub(crate) description?: String,
  pub(crate) experimental?: Boolean,
  pub(crate) jurisdiction?: CodeableConcept,
  pub(crate) approvalDate?: FHIRDate,
  pub(crate) doNotPerform?: Boolean,
  pub(crate) lastReviewDate?: FHIRDate,
  pub(crate) effectivePeriod?: Period,
  pub(crate) relatedArtifact?: RelatedArtifact,
  pub(crate) specimenRequirement?: Reference,
  pub(crate) observationRequirement?: Reference,
  pub(crate) observationResultRequirement?: Reference,
  pub(crate) participant?: ActivityDefinition_Participant,
  pub(crate) dynamicValue?: ActivityDefinition_DynamicValue,
}