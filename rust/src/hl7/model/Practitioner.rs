use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

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
pub struct Practitioner_Qualification {
  pub(crate) id: Option<String>,
  pub(crate) code: Box<dyn CodeableConcept>,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) issuer: Option<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct PractitionerRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: Vector<Box<dyn HumanName>>,
  pub(crate) photo: Vector<Box<dyn Attachment>>,
  pub(crate) active: Option<bool>,
  pub(crate) gender: Option<String>,
  pub(crate) telecom: Vector<Box<dyn ContactPoint>>,
  pub(crate) address: Vector<Box<dyn Address>>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) birthDate: Option<FHIRDate>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) communication: Vector<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) qualification: Vector<Practitioner_Qualification>,
}

pub trait Practitioner : DomainResource {
  fn name(&self) -> &Vector<Box<dyn HumanName>>;
  fn photo(&self) -> &Vector<Box<dyn Attachment>>;
  fn active(&self) -> &Option<bool>;
  fn gender(&self) -> &Option<String>;
  fn telecom(&self) -> &Vector<Box<dyn ContactPoint>>;
  fn address(&self) -> &Vector<Box<dyn Address>>;
  fn birthDate(&self) -> &Option<FHIRDate>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn communication(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn qualification(&self) -> &Vector<Practitioner_Qualification>;
}

dyn_clone::clone_trait_object!(Practitioner);

impl FHIRObject for PractitionerRaw {
}

impl Resource for PractitionerRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for PractitionerRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Practitioner for PractitionerRaw {
  fn name(&self) -> &Vector<Box<dyn HumanName>> { &self.name }
  fn photo(&self) -> &Vector<Box<dyn Attachment>> { &self.photo }
  fn active(&self) -> &Option<bool> { &self.active }
  fn gender(&self) -> &Option<String> { &self.gender }
  fn telecom(&self) -> &Vector<Box<dyn ContactPoint>> { &self.telecom }
  fn address(&self) -> &Vector<Box<dyn Address>> { &self.address }
  fn birthDate(&self) -> &Option<FHIRDate> { &self.birthDate }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn communication(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.communication }
  fn qualification(&self) -> &Vector<Practitioner_Qualification> { &self.qualification }
}

