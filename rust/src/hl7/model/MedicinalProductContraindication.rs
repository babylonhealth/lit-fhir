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
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::UnionAliases::UnionCodeableConceptOrReference;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct MedicinalProductContraindication_OtherTherapy {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) medication: UnionCodeableConceptOrReference,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) therapyRelationshipType: Box<dyn CodeableConcept>,
}

#[derive(Clone, Debug)]
pub struct MedicinalProductContraindicationRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) subject: Vector<Box<dyn Reference>>,
  pub(crate) disease: Option<Box<dyn CodeableConcept>>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) population: Vector<String>,
  pub(crate) comorbidity: Vector<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) diseaseStatus: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) therapeuticIndication: Vector<Box<dyn Reference>>,
  pub(crate) otherTherapy: Vector<Box<MedicinalProductContraindication_OtherTherapy>>,
}

pub trait MedicinalProductContraindication : DomainResource {
  fn subject(&self) -> &Vector<Box<dyn Reference>>;
  fn disease(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn population(&self) -> &Vector<String>;
  fn comorbidity(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn diseaseStatus(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn therapeuticIndication(&self) -> &Vector<Box<dyn Reference>>;
  fn otherTherapy(&self) -> &Vector<Box<MedicinalProductContraindication_OtherTherapy>>;
}

dyn_clone::clone_trait_object!(MedicinalProductContraindication);

impl FHIRObject for MedicinalProductContraindicationRaw {
}

impl Resource for MedicinalProductContraindicationRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for MedicinalProductContraindicationRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl MedicinalProductContraindication for MedicinalProductContraindicationRaw {
  fn subject(&self) -> &Vector<Box<dyn Reference>> { &self.subject }
  fn disease(&self) -> Option<&Box<dyn CodeableConcept>> { self.disease.as_ref() }
  fn population(&self) -> &Vector<String> { &self.population }
  fn comorbidity(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.comorbidity }
  fn diseaseStatus(&self) -> Option<&Box<dyn CodeableConcept>> { self.diseaseStatus.as_ref() }
  fn therapeuticIndication(&self) -> &Vector<Box<dyn Reference>> { &self.therapeuticIndication }
  fn otherTherapy(&self) -> &Vector<Box<MedicinalProductContraindication_OtherTherapy>> { &self.otherTherapy }
}

