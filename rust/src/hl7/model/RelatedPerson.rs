use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Address::Address;
use crate::core::model::Attachment::Attachment;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactPoint::ContactPoint;
use crate::core::model::Extension::Extension;
use crate::core::model::HumanName::HumanName;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct RelatedPerson_Communication {
  pub(crate) id: Option<String>,
  pub(crate) language: Box<dyn CodeableConcept>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) preferred: Option<bool>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct RelatedPersonRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: Vector<Box<dyn HumanName>>,
  pub(crate) photo: Vector<Box<dyn Attachment>>,
  pub(crate) active: Option<bool>,
  pub(crate) gender: Option<String>,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) patient: Box<dyn Reference>,
  pub(crate) telecom: Vector<Box<dyn ContactPoint>>,
  pub(crate) address: Vector<Box<dyn Address>>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) birthDate: Option<LocalDate>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) relationship: Vector<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) communication: Vector<Box<RelatedPerson_Communication>>,
}

pub trait RelatedPerson : DomainResource {
  fn name(&self) -> &Vector<Box<dyn HumanName>>;
  fn photo(&self) -> &Vector<Box<dyn Attachment>>;
  fn active(&self) -> &Option<bool>;
  fn gender(&self) -> &Option<String>;
  fn period(&self) -> &Option<Box<dyn Period>>;
  fn patient(&self) -> &Box<dyn Reference>;
  fn telecom(&self) -> &Vector<Box<dyn ContactPoint>>;
  fn address(&self) -> &Vector<Box<dyn Address>>;
  fn birthDate(&self) -> &Option<LocalDate>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn relationship(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn communication(&self) -> &Vector<Box<RelatedPerson_Communication>>;
}

dyn_clone::clone_trait_object!(RelatedPerson);

impl FHIRObject for RelatedPersonRaw {
}

impl Resource for RelatedPersonRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for RelatedPersonRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl RelatedPerson for RelatedPersonRaw {
  fn name(&self) -> &Vector<Box<dyn HumanName>> { &self.name }
  fn photo(&self) -> &Vector<Box<dyn Attachment>> { &self.photo }
  fn active(&self) -> &Option<bool> { &self.active }
  fn gender(&self) -> &Option<String> { &self.gender }
  fn period(&self) -> &Option<Box<dyn Period>> { &self.period }
  fn patient(&self) -> &Box<dyn Reference> { &self.patient }
  fn telecom(&self) -> &Vector<Box<dyn ContactPoint>> { &self.telecom }
  fn address(&self) -> &Vector<Box<dyn Address>> { &self.address }
  fn birthDate(&self) -> &Option<LocalDate> { &self.birthDate }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn relationship(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.relationship }
  fn communication(&self) -> &Vector<Box<RelatedPerson_Communication>> { &self.communication }
}

