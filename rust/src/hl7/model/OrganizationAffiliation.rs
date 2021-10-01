use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct OrganizationAffiliation {
  pub(crate) code: Vector<CodeableConcept>,
  pub(crate) active: Option<Boolean>,
  pub(crate) period: Option<Period>,
  pub(crate) network: Vector<Reference>,
  pub(crate) telecom: Vector<ContactPoint>,
  pub(crate) location: Vector<Reference>,
  pub(crate) endpoint: Vector<Reference>,
  pub(crate) specialty: Vector<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) organization: Option<Reference>,
  pub(crate) healthcareService: Vector<Reference>,
  pub(crate) participatingOrganization: Option<Reference>,
}