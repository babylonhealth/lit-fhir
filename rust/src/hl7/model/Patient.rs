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
use crate::hl7::model::UnionAliases::UnionBooleanOrDateTime;
use crate::hl7::model::UnionAliases::UnionBooleanOrInteger;



#[derive(Clone, Debug)]
pub struct Patient_Link {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) other: Box<dyn Reference>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Patient_Contact {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<Box<dyn HumanName>>,
  pub(crate) gender: Option<String>,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) telecom: Vector<Box<dyn ContactPoint>>,
  pub(crate) address: Option<Box<dyn Address>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) relationship: Vector<Box<dyn CodeableConcept>>,
  pub(crate) organization: Option<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Patient_Communication {
  pub(crate) id: Option<String>,
  pub(crate) language: Box<dyn CodeableConcept>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) preferred: Option<bool>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct PatientRaw {
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
  pub(crate) birthDate: Option<LocalDate>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) deceased: Option<UnionBooleanOrDateTime>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) maritalStatus: Option<Box<dyn CodeableConcept>>,
  pub(crate) multipleBirth: Option<UnionBooleanOrInteger>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) generalPractitioner: Vector<Box<dyn Reference>>,
  pub(crate) managingOrganization: Option<Box<dyn Reference>>,
  pub(crate) link: Vector<Box<Patient_Link>>,
  pub(crate) contact: Vector<Box<Patient_Contact>>,
  pub(crate) communication: Vector<Box<Patient_Communication>>,
}

pub trait Patient : DomainResource {
  fn name(&self) -> &Vector<Box<dyn HumanName>>;
  fn photo(&self) -> &Vector<Box<dyn Attachment>>;
  fn active(&self) -> &Option<bool>;
  fn gender(&self) -> &Option<String>;
  fn telecom(&self) -> &Vector<Box<dyn ContactPoint>>;
  fn address(&self) -> &Vector<Box<dyn Address>>;
  fn birthDate(&self) -> &Option<LocalDate>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn deceased(&self) -> &Option<UnionBooleanOrDateTime>;
  fn maritalStatus(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn multipleBirth(&self) -> &Option<UnionBooleanOrInteger>;
  fn generalPractitioner(&self) -> &Vector<Box<dyn Reference>>;
  fn managingOrganization(&self) -> &Option<Box<dyn Reference>>;
  fn link(&self) -> &Vector<Box<Patient_Link>>;
  fn contact(&self) -> &Vector<Box<Patient_Contact>>;
  fn communication(&self) -> &Vector<Box<Patient_Communication>>;
}

dyn_clone::clone_trait_object!(Patient);

impl FHIRObject for PatientRaw {
}

impl Resource for PatientRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for PatientRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Patient for PatientRaw {
  fn name(&self) -> &Vector<Box<dyn HumanName>> { &self.name }
  fn photo(&self) -> &Vector<Box<dyn Attachment>> { &self.photo }
  fn active(&self) -> &Option<bool> { &self.active }
  fn gender(&self) -> &Option<String> { &self.gender }
  fn telecom(&self) -> &Vector<Box<dyn ContactPoint>> { &self.telecom }
  fn address(&self) -> &Vector<Box<dyn Address>> { &self.address }
  fn birthDate(&self) -> &Option<LocalDate> { &self.birthDate }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn deceased(&self) -> &Option<UnionBooleanOrDateTime> { &self.deceased }
  fn maritalStatus(&self) -> &Option<Box<dyn CodeableConcept>> { &self.maritalStatus }
  fn multipleBirth(&self) -> &Option<UnionBooleanOrInteger> { &self.multipleBirth }
  fn generalPractitioner(&self) -> &Vector<Box<dyn Reference>> { &self.generalPractitioner }
  fn managingOrganization(&self) -> &Option<Box<dyn Reference>> { &self.managingOrganization }
  fn link(&self) -> &Vector<Box<Patient_Link>> { &self.link }
  fn contact(&self) -> &Vector<Box<Patient_Contact>> { &self.contact }
  fn communication(&self) -> &Vector<Box<Patient_Communication>> { &self.communication }
}
