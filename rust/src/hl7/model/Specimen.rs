use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Duration::Duration;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::UnionAliases::UnionCodeableConceptOrReference;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::UnionCodeableConceptOrDuration;
use crate::hl7::model::UnionAliases::UnionDateTimeOrPeriod;



#[derive(Clone, Debug)]
pub struct Specimen_Container {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) capacity: Option<Box<dyn Quantity>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) description: Option<String>,
  pub(crate) additive: Option<UnionCodeableConceptOrReference>,
  pub(crate) specimenQuantity: Option<Box<dyn Quantity>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Specimen_Collection {
  pub(crate) id: Option<String>,
  pub(crate) method: Option<Box<dyn CodeableConcept>>,
  pub(crate) duration: Option<Box<dyn Duration>>,
  pub(crate) quantity: Option<Box<dyn Quantity>>,
  pub(crate) bodySite: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) collector: Option<Box<dyn Reference>>,
  pub(crate) collected: Option<UnionDateTimeOrPeriod>,
  pub(crate) fastingStatus: Option<UnionCodeableConceptOrDuration>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Specimen_Processing {
  pub(crate) id: Option<String>,
  pub(crate) time: Option<UnionDateTimeOrPeriod>,
  pub(crate) additive: Vector<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) procedure: Option<Box<dyn CodeableConcept>>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct SpecimenRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) status: Option<String>,
  pub(crate) parent: Vector<Box<dyn Reference>>,
  pub(crate) subject: Option<Box<dyn Reference>>,
  pub(crate) request: Vector<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) condition: Vector<Box<dyn CodeableConcept>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) receivedTime: Option<DateTime<FixedOffset>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) accessionIdentifier: Option<Box<dyn Identifier>>,
  pub(crate) container: Vector<Box<Specimen_Container>>,
  pub(crate) collection: Option<Box<Specimen_Collection>>,
  pub(crate) processing: Vector<Box<Specimen_Processing>>,
}

pub trait Specimen : DomainResource {
  fn _type(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn status(&self) -> Option<&String>;
  fn parent(&self) -> &Vector<Box<dyn Reference>>;
  fn subject(&self) -> Option<&Box<dyn Reference>>;
  fn request(&self) -> &Vector<Box<dyn Reference>>;
  fn condition(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn receivedTime(&self) -> Option<&DateTime<FixedOffset>>;
  fn accessionIdentifier(&self) -> Option<&Box<dyn Identifier>>;
  fn container(&self) -> &Vector<Box<Specimen_Container>>;
  fn collection(&self) -> Option<&Box<Specimen_Collection>>;
  fn processing(&self) -> &Vector<Box<Specimen_Processing>>;
}

dyn_clone::clone_trait_object!(Specimen);

impl FHIRObject for SpecimenRaw {
}

impl Resource for SpecimenRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for SpecimenRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Specimen for SpecimenRaw {
  fn _type(&self) -> Option<&Box<dyn CodeableConcept>> { self._type.as_ref() }
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn status(&self) -> Option<&String> { self.status.as_ref() }
  fn parent(&self) -> &Vector<Box<dyn Reference>> { &self.parent }
  fn subject(&self) -> Option<&Box<dyn Reference>> { self.subject.as_ref() }
  fn request(&self) -> &Vector<Box<dyn Reference>> { &self.request }
  fn condition(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.condition }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn receivedTime(&self) -> Option<&DateTime<FixedOffset>> { self.receivedTime.as_ref() }
  fn accessionIdentifier(&self) -> Option<&Box<dyn Identifier>> { self.accessionIdentifier.as_ref() }
  fn container(&self) -> &Vector<Box<Specimen_Container>> { &self.container }
  fn collection(&self) -> Option<&Box<Specimen_Collection>> { self.collection.as_ref() }
  fn processing(&self) -> &Vector<Box<Specimen_Processing>> { &self.processing }
}

