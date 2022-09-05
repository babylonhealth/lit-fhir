use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::Union01113166363;



#[derive(Clone, Debug)]
pub struct QuestionnaireResponse_Item_Answer {
  pub(crate) id: Option<String>,
  pub(crate) item: Vector<Box<QuestionnaireResponse_Item>>,
  pub(crate) value: Option<Union01113166363>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct QuestionnaireResponse_Item {
  pub(crate) id: Option<String>,
  pub(crate) text: Option<String>,
  pub(crate) item: Vector<Box<QuestionnaireResponse_Item>>,
  pub(crate) linkId: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) definition: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) answer: Vector<Box<QuestionnaireResponse_Item_Answer>>,
}

#[derive(Clone, Debug)]
pub struct QuestionnaireResponseRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) partOf: Vector<Box<dyn Reference>>,
  pub(crate) status: String,
  pub(crate) author: Option<Box<dyn Reference>>,
  pub(crate) source: Option<Box<dyn Reference>>,
  pub(crate) basedOn: Vector<Box<dyn Reference>>,
  pub(crate) subject: Option<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) authored: Option<DateTime<FixedOffset>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) encounter: Option<Box<dyn Reference>>,
  pub(crate) identifier: Option<Box<dyn Identifier>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) questionnaire: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) item: Vector<Box<QuestionnaireResponse_Item>>,
}

pub trait QuestionnaireResponse : DomainResource {
  fn partOf(&self) -> &Vector<Box<dyn Reference>>;
  fn status(&self) -> &String;
  fn author(&self) -> &Option<Box<dyn Reference>>;
  fn source(&self) -> &Option<Box<dyn Reference>>;
  fn basedOn(&self) -> &Vector<Box<dyn Reference>>;
  fn subject(&self) -> &Option<Box<dyn Reference>>;
  fn authored(&self) -> &Option<DateTime<FixedOffset>>;
  fn encounter(&self) -> &Option<Box<dyn Reference>>;
  fn identifier(&self) -> &Option<Box<dyn Identifier>>;
  fn questionnaire(&self) -> &Option<String>;
  fn item(&self) -> &Vector<Box<QuestionnaireResponse_Item>>;
}

dyn_clone::clone_trait_object!(QuestionnaireResponse);

impl FHIRObject for QuestionnaireResponseRaw {
}

impl Resource for QuestionnaireResponseRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for QuestionnaireResponseRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl QuestionnaireResponse for QuestionnaireResponseRaw {
  fn partOf(&self) -> &Vector<Box<dyn Reference>> { &self.partOf }
  fn status(&self) -> &String { &self.status }
  fn author(&self) -> &Option<Box<dyn Reference>> { &self.author }
  fn source(&self) -> &Option<Box<dyn Reference>> { &self.source }
  fn basedOn(&self) -> &Vector<Box<dyn Reference>> { &self.basedOn }
  fn subject(&self) -> &Option<Box<dyn Reference>> { &self.subject }
  fn authored(&self) -> &Option<DateTime<FixedOffset>> { &self.authored }
  fn encounter(&self) -> &Option<Box<dyn Reference>> { &self.encounter }
  fn identifier(&self) -> &Option<Box<dyn Identifier>> { &self.identifier }
  fn questionnaire(&self) -> &Option<String> { &self.questionnaire }
  fn item(&self) -> &Vector<Box<QuestionnaireResponse_Item>> { &self.item }
}

