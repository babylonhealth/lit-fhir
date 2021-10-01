use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct CareTeam_Participant {
  pub(crate) id: Option<String>,
  pub(crate) role: Vector<CodeableConcept>,
  pub(crate) member: Option<Reference>,
  pub(crate) period: Option<Period>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) onBehalfOf: Option<Reference>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct CareTeam {
  pub(crate) name: Option<String>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) status: Option<String>,
  pub(crate) period: Option<Period>,
  pub(crate) subject: Option<Reference>,
  pub(crate) telecom: Vector<ContactPoint>,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) encounter: Option<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) managingOrganization: Vector<Reference>,
  pub(crate) participant: Vector<CareTeam_Participant>,
}