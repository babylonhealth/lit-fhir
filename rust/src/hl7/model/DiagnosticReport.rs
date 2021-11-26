use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::hl7::UnionDateTimeOrPeriod;
use crate::core::model::Attachment::Attachment;



#[derive(Clone, Debug)]
pub struct DiagnosticReport_Media {
  pub(crate) id: Option<String>,
  pub(crate) link: Box<Reference>,
  pub(crate) comment: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct DiagnosticReport {
  pub(crate) code: CodeableConcept,
  pub(crate) status: String,
  pub(crate) issued: Option<DateTime<FixedOffset>>,
  pub(crate) result: Vector<Reference>,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) subject: Option<Box<Reference>>,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) specimen: Vector<Reference>,
  pub(crate) encounter: Option<Box<Reference>>,
  pub(crate) performer: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) conclusion: Option<String>,
  pub(crate) effective: Option<UnionDateTimeOrPeriod>,
  pub(crate) imagingStudy: Vector<Reference>,
  pub(crate) presentedForm: Vector<Attachment>,
  pub(crate) conclusionCode: Vector<CodeableConcept>,
  pub(crate) resultsInterpreter: Vector<Reference>,
  pub(crate) media: Vector<DiagnosticReport_Media>,
}