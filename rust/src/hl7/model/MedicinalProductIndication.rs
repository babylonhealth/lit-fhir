use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Meta::Meta;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::UnionAliases::UnionCodeableConceptOrReference;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct MedicinalProductIndication_OtherTherapy {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) medication: UnionCodeableConceptOrReference,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) therapyRelationshipType: Box<dyn CodeableConcept>,
}

#[derive(Clone, Debug)]
pub struct MedicinalProductIndicationRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) subject: Vector<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) duration: Option<Box<dyn Quantity>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) population: Vector<String>,
  pub(crate) comorbidity: Vector<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) diseaseStatus: Option<Box<dyn CodeableConcept>>,
  pub(crate) intendedEffect: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) undesirableEffect: Vector<Box<dyn Reference>>,
  pub(crate) diseaseSymptomProcedure: Option<Box<dyn CodeableConcept>>,
  pub(crate) otherTherapy: Vector<Box<MedicinalProductIndication_OtherTherapy>>,
}

pub trait MedicinalProductIndication : DomainResource {
  fn subject(&self) -> &Vector<Box<dyn Reference>>;
  fn duration(&self) -> &Option<Box<dyn Quantity>>;
  fn population(&self) -> &Vector<String>;
  fn comorbidity(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn diseaseStatus(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn intendedEffect(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn undesirableEffect(&self) -> &Vector<Box<dyn Reference>>;
  fn diseaseSymptomProcedure(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn otherTherapy(&self) -> &Vector<Box<MedicinalProductIndication_OtherTherapy>>;
}

dyn_clone::clone_trait_object!(MedicinalProductIndication);

impl FHIRObject for MedicinalProductIndicationRaw {
}

impl Resource for MedicinalProductIndicationRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for MedicinalProductIndicationRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl MedicinalProductIndication for MedicinalProductIndicationRaw {
  fn subject(&self) -> &Vector<Box<dyn Reference>> { &self.subject }
  fn duration(&self) -> &Option<Box<dyn Quantity>> { &self.duration }
  fn population(&self) -> &Vector<String> { &self.population }
  fn comorbidity(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.comorbidity }
  fn diseaseStatus(&self) -> &Option<Box<dyn CodeableConcept>> { &self.diseaseStatus }
  fn intendedEffect(&self) -> &Option<Box<dyn CodeableConcept>> { &self.intendedEffect }
  fn undesirableEffect(&self) -> &Vector<Box<dyn Reference>> { &self.undesirableEffect }
  fn diseaseSymptomProcedure(&self) -> &Option<Box<dyn CodeableConcept>> { &self.diseaseSymptomProcedure }
  fn otherTherapy(&self) -> &Vector<Box<MedicinalProductIndication_OtherTherapy>> { &self.otherTherapy }
}

