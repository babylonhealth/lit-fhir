use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactPoint::ContactPoint;
use crate::core::model::Extension::Extension;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::UnionCodingOrUri;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct MessageHeader_Source {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) version: Option<String>,
  pub(crate) contact: Option<Box<dyn ContactPoint>>,
  pub(crate) software: Option<String>,
  pub(crate) endpoint: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct MessageHeader_Response {
  pub(crate) id: Option<String>,
  pub(crate) code: String,
  pub(crate) details: Option<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: String,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct MessageHeader_Destination {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) target: Option<Box<dyn Reference>>,
  pub(crate) endpoint: String,
  pub(crate) receiver: Option<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct MessageHeaderRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) focus: Vector<Box<dyn Reference>>,
  pub(crate) sender: Option<Box<dyn Reference>>,
  pub(crate) author: Option<Box<dyn Reference>>,
  pub(crate) reason: Option<Box<dyn CodeableConcept>>,
  pub(crate) enterer: Option<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) event: UnionCodingOrUri,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) definition: Option<String>,
  pub(crate) responsible: Option<Box<dyn Reference>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) source: MessageHeader_Source,
  pub(crate) response: Option<MessageHeader_Response>,
  pub(crate) destination: Vector<MessageHeader_Destination>,
}

pub trait MessageHeader : DomainResource {
  fn focus(&self) -> &Vector<Box<dyn Reference>>;
  fn sender(&self) -> &Option<Box<dyn Reference>>;
  fn author(&self) -> &Option<Box<dyn Reference>>;
  fn reason(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn enterer(&self) -> &Option<Box<dyn Reference>>;
  fn event(&self) -> &UnionCodingOrUri;
  fn definition(&self) -> &Option<String>;
  fn responsible(&self) -> &Option<Box<dyn Reference>>;
  fn source(&self) -> &MessageHeader_Source;
  fn response(&self) -> &Option<MessageHeader_Response>;
  fn destination(&self) -> &Vector<MessageHeader_Destination>;
}

dyn_clone::clone_trait_object!(MessageHeader);

impl FHIRObject for MessageHeaderRaw {
}

impl Resource for MessageHeaderRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for MessageHeaderRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl MessageHeader for MessageHeaderRaw {
  fn focus(&self) -> &Vector<Box<dyn Reference>> { &self.focus }
  fn sender(&self) -> &Option<Box<dyn Reference>> { &self.sender }
  fn author(&self) -> &Option<Box<dyn Reference>> { &self.author }
  fn reason(&self) -> &Option<Box<dyn CodeableConcept>> { &self.reason }
  fn enterer(&self) -> &Option<Box<dyn Reference>> { &self.enterer }
  fn event(&self) -> &UnionCodingOrUri { &self.event }
  fn definition(&self) -> &Option<String> { &self.definition }
  fn responsible(&self) -> &Option<Box<dyn Reference>> { &self.responsible }
  fn source(&self) -> &MessageHeader_Source { &self.source }
  fn response(&self) -> &Option<MessageHeader_Response> { &self.response }
  fn destination(&self) -> &Vector<MessageHeader_Destination> { &self.destination }
}

