use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::MedicinalProductAuthorization_Procedure::MedicinalProductAuthorization_Procedure;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::UnionDateTimeOrPeriod;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct MedicinalProductAuthorization_Procedure {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) date: Option<UnionDateTimeOrPeriod>,
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
  pub(crate) holder: Option<Box<Reference>>,
  pub(crate) subject: Option<Box<Reference>>,
  pub(crate) country: Vector<CodeableConcept>,
  pub(crate) regulator: Option<Box<Reference>>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) statusDate: Option<DateTime<FixedOffset>>,
  pub(crate) legalBasis: Option<CodeableConcept>,
  pub(crate) restoreDate: Option<DateTime<FixedOffset>>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) validityPeriod: Option<Period>,
  pub(crate) dataExclusivityPeriod: Option<Period>,
  pub(crate) internationalBirthDate: Option<DateTime<FixedOffset>>,
  pub(crate) dateOfFirstAuthorization: Option<DateTime<FixedOffset>>,
  pub(crate) procedure: Option<MedicinalProductAuthorization_Procedure>,
  pub(crate) jurisdictionalAuthorization: Vector<MedicinalProductAuthorization_JurisdictionalAuthorization>,
}