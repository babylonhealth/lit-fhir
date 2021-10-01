use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Immunization_Reaction {
  pub(crate) id?: String,
  pub(crate) date?: Date,
  pub(crate) detail?: Reference,
  pub(crate) reported?: Boolean,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct Immunization_Performer {
  pub(crate) id?: String,
  pub(crate) actor: Reference,
  pub(crate) function?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct Immunization_Education {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) reference?: String,
  pub(crate) documentType?: String,
  pub(crate) publicationDate?: Date,
  pub(crate) presentationDate?: Date,
  pub(crate) modifierExtension?: Extension,
}


pub struct Immunization_ProtocolApplied {
  pub(crate) id?: String,
  pub(crate) series?: String,
  pub(crate) extension?: Extension,
  pub(crate) authority?: Reference,
  pub(crate) targetDisease?: CodeableConcept,
  pub(crate) doseNumber: u32 | String,
  pub(crate) seriesDoses?: u32 | String,
  pub(crate) modifierExtension?: Extension,
}

pub struct Immunization {
  pub(crate) site?: CodeableConcept,
  pub(crate) note?: Annotation,
  pub(crate) route?: CodeableConcept,
  pub(crate) status: String,
  pub(crate) patient: Reference,
  pub(crate) recorded?: Date,
  pub(crate) location?: Reference,
  pub(crate) encounter?: Reference,
  pub(crate) lotNumber?: String,
  pub(crate) identifier?: Identifier,
  pub(crate) reasonCode?: CodeableConcept,
  pub(crate) vaccineCode: CodeableConcept,
  pub(crate) isSubpotent?: Boolean,
  pub(crate) statusReason?: CodeableConcept,
  pub(crate) reportOrigin?: CodeableConcept,
  pub(crate) manufacturer?: Reference,
  pub(crate) doseQuantity?: Quantity,
  pub(crate) occurrence: Date | String,
  pub(crate) primarySource?: Boolean,
  pub(crate) fundingSource?: CodeableConcept,
  pub(crate) expirationDate?: FHIRDate,
  pub(crate) reasonReference?: Reference,
  pub(crate) subpotentReason?: CodeableConcept,
  pub(crate) programEligibility?: CodeableConcept,
  pub(crate) reaction?: Immunization_Reaction,
  pub(crate) performer?: Immunization_Performer,
  pub(crate) education?: Immunization_Education,
  pub(crate) protocolApplied?: Immunization_ProtocolApplied,
}