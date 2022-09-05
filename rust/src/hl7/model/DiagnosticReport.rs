use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Attachment::Attachment;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::UnionDateTimeOrPeriod;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct DiagnosticReport_Media {
  pub(crate) id: Option<String>,
  pub(crate) link: Box<dyn Reference>,
  pub(crate) comment: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct DiagnosticReportRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) code: Box<dyn CodeableConcept>,
  pub(crate) status: String,
  pub(crate) issued: Option<DateTime<FixedOffset>>,
  pub(crate) result: Vector<Box<dyn Reference>>,
  pub(crate) basedOn: Vector<Box<dyn Reference>>,
  pub(crate) subject: Option<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) category: Vector<Box<dyn CodeableConcept>>,
  pub(crate) specimen: Vector<Box<dyn Reference>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) encounter: Option<Box<dyn Reference>>,
  pub(crate) performer: Vector<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) conclusion: Option<String>,
  pub(crate) effective: Option<UnionDateTimeOrPeriod>,
  pub(crate) imagingStudy: Vector<Box<dyn Reference>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) presentedForm: Vector<Box<dyn Attachment>>,
  pub(crate) conclusionCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) resultsInterpreter: Vector<Box<dyn Reference>>,
  pub(crate) media: Vector<DiagnosticReport_Media>,
}

pub trait DiagnosticReport : DomainResource {
  fn code(&self) -> &Box<dyn CodeableConcept>;
  fn status(&self) -> &String;
  fn issued(&self) -> &Option<DateTime<FixedOffset>>;
  fn result(&self) -> &Vector<Box<dyn Reference>>;
  fn basedOn(&self) -> &Vector<Box<dyn Reference>>;
  fn subject(&self) -> &Option<Box<dyn Reference>>;
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn specimen(&self) -> &Vector<Box<dyn Reference>>;
  fn encounter(&self) -> &Option<Box<dyn Reference>>;
  fn performer(&self) -> &Vector<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn conclusion(&self) -> &Option<String>;
  fn effective(&self) -> &Option<UnionDateTimeOrPeriod>;
  fn imagingStudy(&self) -> &Vector<Box<dyn Reference>>;
  fn presentedForm(&self) -> &Vector<Box<dyn Attachment>>;
  fn conclusionCode(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn resultsInterpreter(&self) -> &Vector<Box<dyn Reference>>;
  fn media(&self) -> &Vector<DiagnosticReport_Media>;
}

dyn_clone::clone_trait_object!(DiagnosticReport);

impl FHIRObject for DiagnosticReportRaw {
}

impl Resource for DiagnosticReportRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for DiagnosticReportRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl DiagnosticReport for DiagnosticReportRaw {
  fn code(&self) -> &Box<dyn CodeableConcept> { &self.code }
  fn status(&self) -> &String { &self.status }
  fn issued(&self) -> &Option<DateTime<FixedOffset>> { &self.issued }
  fn result(&self) -> &Vector<Box<dyn Reference>> { &self.result }
  fn basedOn(&self) -> &Vector<Box<dyn Reference>> { &self.basedOn }
  fn subject(&self) -> &Option<Box<dyn Reference>> { &self.subject }
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.category }
  fn specimen(&self) -> &Vector<Box<dyn Reference>> { &self.specimen }
  fn encounter(&self) -> &Option<Box<dyn Reference>> { &self.encounter }
  fn performer(&self) -> &Vector<Box<dyn Reference>> { &self.performer }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn conclusion(&self) -> &Option<String> { &self.conclusion }
  fn effective(&self) -> &Option<UnionDateTimeOrPeriod> { &self.effective }
  fn imagingStudy(&self) -> &Vector<Box<dyn Reference>> { &self.imagingStudy }
  fn presentedForm(&self) -> &Vector<Box<dyn Attachment>> { &self.presentedForm }
  fn conclusionCode(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.conclusionCode }
  fn resultsInterpreter(&self) -> &Vector<Box<dyn Reference>> { &self.resultsInterpreter }
  fn media(&self) -> &Vector<DiagnosticReport_Media> { &self.media }
}

