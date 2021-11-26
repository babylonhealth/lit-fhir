use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactPoint::ContactPoint;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct OrganizationAffiliation {
  pub(crate) code: Vector<CodeableConcept>,
  pub(crate) active: Option<bool>,
  pub(crate) period: Option<Period>,
  pub(crate) network: Vector<Reference>,
  pub(crate) telecom: Vector<ContactPoint>,
  pub(crate) location: Vector<Reference>,
  pub(crate) endpoint: Vector<Reference>,
  pub(crate) specialty: Vector<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) organization: Option<Box<Reference>>,
  pub(crate) healthcareService: Vector<Reference>,
  pub(crate) participatingOrganization: Option<Box<Reference>>,
}