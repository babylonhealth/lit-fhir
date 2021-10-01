use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct CarePlan_Activity_Detail {
  pub(crate) id?: String,
  pub(crate) kind?: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) goal?: Reference,
  pub(crate) status: String,
  pub(crate) location?: Reference,
  pub(crate) quantity?: Quantity,
  pub(crate) extension?: Extension,
  pub(crate) performer?: Reference,
  pub(crate) reasonCode?: CodeableConcept,
  pub(crate) product?: CodeableConcept | Reference,
  pub(crate) dailyAmount?: Quantity,
  pub(crate) description?: String,
  pub(crate) statusReason?: CodeableConcept,
  pub(crate) doNotPerform?: Boolean,
  pub(crate) scheduled?: Period | String | Timing,
  pub(crate) instantiatesUri?: String,
  pub(crate) reasonReference?: Reference,
  pub(crate) modifierExtension?: Extension,
  pub(crate) instantiatesCanonical?: String,
}

pub struct CarePlan_Activity {
  pub(crate) id?: String,
  pub(crate) progress?: Annotation,
  pub(crate) extension?: Extension,
  pub(crate) reference?: Reference,
  pub(crate) outcomeReference?: Reference,
  pub(crate) modifierExtension?: Extension,
  pub(crate) outcomeCodeableConcept?: CodeableConcept,
  pub(crate) detail?: CarePlan_Activity_Detail,
}

pub struct CarePlan {
  pub(crate) goal?: Reference,
  pub(crate) note?: Annotation,
  pub(crate) title?: String,
  pub(crate) partOf?: Reference,
  pub(crate) status: String,
  pub(crate) intent: String,
  pub(crate) period?: Period,
  pub(crate) author?: Reference,
  pub(crate) basedOn?: Reference,
  pub(crate) subject: Reference,
  pub(crate) created?: Date,
  pub(crate) replaces?: Reference,
  pub(crate) category?: CodeableConcept,
  pub(crate) careTeam?: Reference,
  pub(crate) encounter?: Reference,
  pub(crate) addresses?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) description?: String,
  pub(crate) contributor?: Reference,
  pub(crate) supportingInfo?: Reference,
  pub(crate) instantiatesUri?: String,
  pub(crate) instantiatesCanonical?: String,
  pub(crate) activity?: CarePlan_Activity,
}