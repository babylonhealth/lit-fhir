use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct ResearchStudy_Arm {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct ResearchStudy_Objective {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct ResearchStudy {
  pub(crate) site: Vector<Reference>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) title: Option<String>,
  pub(crate) phase: Option<CodeableConcept>,
  pub(crate) focus: Vector<CodeableConcept>,
  pub(crate) partOf: Vector<Reference>,
  pub(crate) status: String,
  pub(crate) period: Option<Period>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) keyword: Vector<CodeableConcept>,
  pub(crate) sponsor: Option<Reference>,
  pub(crate) protocol: Vector<Reference>,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) location: Vector<CodeableConcept>,
  pub(crate) condition: Vector<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) enrollment: Vector<Reference>,
  pub(crate) description: Option<String>,
  pub(crate) reasonStopped: Option<CodeableConcept>,
  pub(crate) relatedArtifact: Vector<RelatedArtifact>,
  pub(crate) primaryPurposeType: Option<CodeableConcept>,
  pub(crate) principalInvestigator: Option<Reference>,
  pub(crate) arm: Vector<ResearchStudy_Arm>,
  pub(crate) objective: Vector<ResearchStudy_Objective>,
}