use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Procedure_Performer {
  pub(crate) id?: String,
  pub(crate) actor: Reference,
  pub(crate) function?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) onBehalfOf?: Reference,
  pub(crate) modifierExtension?: Extension,
}


pub struct Procedure_FocalDevice {
  pub(crate) id?: String,
  pub(crate) action?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) manipulated: Reference,
  pub(crate) modifierExtension?: Extension,
}

pub struct Procedure {
  pub(crate) code?: CodeableConcept,
  pub(crate) note?: Annotation,
  pub(crate) partOf?: Reference,
  pub(crate) status: String,
  pub(crate) report?: Reference,
  pub(crate) basedOn?: Reference,
  pub(crate) subject: Reference,
  pub(crate) outcome?: CodeableConcept,
  pub(crate) category?: CodeableConcept,
  pub(crate) recorder?: Reference,
  pub(crate) asserter?: Reference,
  pub(crate) location?: Reference,
  pub(crate) bodySite?: CodeableConcept,
  pub(crate) followUp?: CodeableConcept,
  pub(crate) usedCode?: CodeableConcept,
  pub(crate) encounter?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) reasonCode?: CodeableConcept,
  pub(crate) statusReason?: CodeableConcept,
  pub(crate) performed?: Age | Date | Period | Range | String,
  pub(crate) complication?: CodeableConcept,
  pub(crate) usedReference?: Reference,
  pub(crate) instantiatesUri?: String,
  pub(crate) reasonReference?: Reference,
  pub(crate) complicationDetail?: Reference,
  pub(crate) instantiatesCanonical?: String,
  pub(crate) performer?: Procedure_Performer,
  pub(crate) focalDevice?: Procedure_FocalDevice,
}