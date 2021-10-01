use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct ChargeItem_Performer {
  pub(crate) id: Option<String>,
  pub(crate) actor: Reference,
  pub(crate) function: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct ChargeItem {
  pub(crate) code: CodeableConcept,
  pub(crate) note: Vector<Annotation>,
  pub(crate) status: String,
  pub(crate) partOf: Vector<Reference>,
  pub(crate) reason: Vector<CodeableConcept>,
  pub(crate) subject: Reference,
  pub(crate) context: Option<Reference>,
  pub(crate) enterer: Option<Reference>,
  pub(crate) service: Vector<Reference>,
  pub(crate) account: Vector<Reference>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) bodysite: Vector<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) costCenter: Option<Reference>,
  pub(crate) product: Option<CodeableConcept | Reference>,
  pub(crate) enteredDate: Option<Date>,
  pub(crate) definitionUri: Vector<String>,
  pub(crate) occurrence: Option<Date | Period | Timing>,
  pub(crate) priceOverride: Option<Money>,
  pub(crate) factorOverride: Option<BigDecimal>,
  pub(crate) overrideReason: Option<String>,
  pub(crate) definitionCanonical: Vector<String>,
  pub(crate) supportingInformation: Vector<Reference>,
  pub(crate) performingOrganization: Option<Reference>,
  pub(crate) requestingOrganization: Option<Reference>,
  pub(crate) performer: Vector<ChargeItem_Performer>,
}