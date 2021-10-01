use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct MedicinalProductAuthorization_Procedure {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) date: Option<Date | Period>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) identifier: Option<Identifier>,
  pub(crate) application: Vector<MedicinalProductAuthorization_Procedure>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct MedicinalProductAuthorization_JurisdictionalAuthorization {
  pub(crate) id: Option<String>,
  pub(crate) country: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) validityPeriod: Option<Period>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) legalStatusOfSupply: Option<CodeableConcept>,
}

#[derive(Clone, Debug)]
pub struct MedicinalProductAuthorization {
  pub(crate) status: Option<CodeableConcept>,
  pub(crate) holder: Option<Reference>,
  pub(crate) subject: Option<Reference>,
  pub(crate) country: Vector<CodeableConcept>,
  pub(crate) regulator: Option<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) statusDate: Option<Date>,
  pub(crate) legalBasis: Option<CodeableConcept>,
  pub(crate) restoreDate: Option<Date>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) validityPeriod: Option<Period>,
  pub(crate) dataExclusivityPeriod: Option<Period>,
  pub(crate) internationalBirthDate: Option<Date>,
  pub(crate) dateOfFirstAuthorization: Option<Date>,
  pub(crate) procedure: Option<MedicinalProductAuthorization_Procedure>,
  pub(crate) jurisdictionalAuthorization: Vector<MedicinalProductAuthorization_JurisdictionalAuthorization>,
}