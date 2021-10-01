use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct ChargeItem_Performer {
  pub(crate) id?: String,
  pub(crate) actor: Reference,
  pub(crate) function?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct ChargeItem {
  pub(crate) code: CodeableConcept,
  pub(crate) note?: Annotation,
  pub(crate) status: String,
  pub(crate) partOf?: Reference,
  pub(crate) reason?: CodeableConcept,
  pub(crate) subject: Reference,
  pub(crate) context?: Reference,
  pub(crate) enterer?: Reference,
  pub(crate) service?: Reference,
  pub(crate) account?: Reference,
  pub(crate) quantity?: Quantity,
  pub(crate) bodysite?: CodeableConcept,
  pub(crate) identifier?: Identifier,
  pub(crate) costCenter?: Reference,
  pub(crate) product?: CodeableConcept | Reference,
  pub(crate) enteredDate?: Date,
  pub(crate) definitionUri?: String,
  pub(crate) occurrence?: Date | Period | Timing,
  pub(crate) priceOverride?: Money,
  pub(crate) factorOverride?: BigDecimal,
  pub(crate) overrideReason?: String,
  pub(crate) definitionCanonical?: String,
  pub(crate) supportingInformation?: Reference,
  pub(crate) performingOrganization?: Reference,
  pub(crate) requestingOrganization?: Reference,
  pub(crate) performer?: ChargeItem_Performer,
}