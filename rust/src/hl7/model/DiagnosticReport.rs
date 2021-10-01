use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct DiagnosticReport_Media {
  pub(crate) id?: String,
  pub(crate) link: Reference,
  pub(crate) comment?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct DiagnosticReport {
  pub(crate) code: CodeableConcept,
  pub(crate) status: String,
  pub(crate) issued?: Date,
  pub(crate) result?: Reference,
  pub(crate) basedOn?: Reference,
  pub(crate) subject?: Reference,
  pub(crate) category?: CodeableConcept,
  pub(crate) specimen?: Reference,
  pub(crate) encounter?: Reference,
  pub(crate) performer?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) conclusion?: String,
  pub(crate) effective?: Date | Period,
  pub(crate) imagingStudy?: Reference,
  pub(crate) presentedForm?: Attachment,
  pub(crate) conclusionCode?: CodeableConcept,
  pub(crate) resultsInterpreter?: Reference,
  pub(crate) media?: DiagnosticReport_Media,
}