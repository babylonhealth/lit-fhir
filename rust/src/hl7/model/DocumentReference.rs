use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Attachment::Attachment;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Coding::Coding;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct DocumentReference_Content {
  pub(crate) id: Option<String>,
  pub(crate) format: Option<Box<dyn Coding>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) attachment: Box<dyn Attachment>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct DocumentReference_Context {
  pub(crate) id: Option<String>,
  pub(crate) event: Vector<Box<dyn CodeableConcept>>,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) related: Vector<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) encounter: Vector<Box<dyn Reference>>,
  pub(crate) facilityType: Option<Box<dyn CodeableConcept>>,
  pub(crate) practiceSetting: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) sourcePatientInfo: Option<Box<dyn Reference>>,
}


#[derive(Clone, Debug)]
pub struct DocumentReference_RelatesTo {
  pub(crate) id: Option<String>,
  pub(crate) code: String,
  pub(crate) target: Box<dyn Reference>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct DocumentReferenceRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) status: String,
  pub(crate) author: Vector<Box<dyn Reference>>,
  pub(crate) subject: Option<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) category: Vector<Box<dyn CodeableConcept>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) docStatus: Option<String>,
  pub(crate) custodian: Option<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) description: Option<String>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) authenticator: Option<Box<dyn Reference>>,
  pub(crate) securityLabel: Vector<Box<dyn CodeableConcept>>,
  pub(crate) masterIdentifier: Option<Box<dyn Identifier>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) content: Vector<DocumentReference_Content>,
  pub(crate) context: Option<DocumentReference_Context>,
  pub(crate) relatesTo: Vector<DocumentReference_RelatesTo>,
}

pub trait DocumentReference : DomainResource {
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn date(&self) -> &Option<DateTime<FixedOffset>>;
  fn status(&self) -> &String;
  fn author(&self) -> &Vector<Box<dyn Reference>>;
  fn subject(&self) -> &Option<Box<dyn Reference>>;
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn docStatus(&self) -> &Option<String>;
  fn custodian(&self) -> &Option<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn description(&self) -> &Option<String>;
  fn authenticator(&self) -> &Option<Box<dyn Reference>>;
  fn securityLabel(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn masterIdentifier(&self) -> &Option<Box<dyn Identifier>>;
  fn content(&self) -> &Vector<DocumentReference_Content>;
  fn context(&self) -> &Option<DocumentReference_Context>;
  fn relatesTo(&self) -> &Vector<DocumentReference_RelatesTo>;
}

dyn_clone::clone_trait_object!(DocumentReference);

impl FHIRObject for DocumentReferenceRaw {
}

impl Resource for DocumentReferenceRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for DocumentReferenceRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl DocumentReference for DocumentReferenceRaw {
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>> { &self._type }
  fn date(&self) -> &Option<DateTime<FixedOffset>> { &self.date }
  fn status(&self) -> &String { &self.status }
  fn author(&self) -> &Vector<Box<dyn Reference>> { &self.author }
  fn subject(&self) -> &Option<Box<dyn Reference>> { &self.subject }
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.category }
  fn docStatus(&self) -> &Option<String> { &self.docStatus }
  fn custodian(&self) -> &Option<Box<dyn Reference>> { &self.custodian }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn description(&self) -> &Option<String> { &self.description }
  fn authenticator(&self) -> &Option<Box<dyn Reference>> { &self.authenticator }
  fn securityLabel(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.securityLabel }
  fn masterIdentifier(&self) -> &Option<Box<dyn Identifier>> { &self.masterIdentifier }
  fn content(&self) -> &Vector<DocumentReference_Content> { &self.content }
  fn context(&self) -> &Option<DocumentReference_Context> { &self.context }
  fn relatesTo(&self) -> &Vector<DocumentReference_RelatesTo> { &self.relatesTo }
}

