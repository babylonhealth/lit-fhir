use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct DiagnosticReport_Media {
  pub(crate) id: Option<String>,
  pub(crate) link: Reference,
  pub(crate) comment: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct DiagnosticReport {
  pub(crate) code: CodeableConcept,
  pub(crate) status: String,
  pub(crate) issued: Option<Date>,
  pub(crate) result: Vector<Reference>,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) subject: Option<Reference>,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) specimen: Vector<Reference>,
  pub(crate) encounter: Option<Reference>,
  pub(crate) performer: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) conclusion: Option<String>,
  pub(crate) effective: Option<Date | Period>,
  pub(crate) imagingStudy: Vector<Reference>,
  pub(crate) presentedForm: Vector<Attachment>,
  pub(crate) conclusionCode: Vector<CodeableConcept>,
  pub(crate) resultsInterpreter: Vector<Reference>,
  pub(crate) media: Vector<DiagnosticReport_Media>,
}