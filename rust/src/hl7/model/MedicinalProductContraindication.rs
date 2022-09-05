use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::UnionCodeableConceptOrReference;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
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
  pub(crate) population: Vector<any>,
  pub(crate) comorbidity: Vector<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) diseaseStatus: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) therapeuticIndication: Vector<Box<dyn Reference>>,
  pub(crate) otherTherapy: Vector<MedicinalProductContraindication_OtherTherapy>,
}

pub trait MedicinalProductContraindication : DomainResource {
  fn subject(&self) -> &Vector<Box<dyn Reference>>;
  fn disease(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn population(&self) -> &Vector<any>;
  fn comorbidity(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn diseaseStatus(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn therapeuticIndication(&self) -> &Vector<Box<dyn Reference>>;
  fn otherTherapy(&self) -> &Vector<MedicinalProductContraindication_OtherTherapy>;
}

dyn_clone::clone_trait_object!(MedicinalProductContraindication);

impl FHIRObject for MedicinalProductContraindicationRaw {
}

impl Resource for MedicinalProductContraindicationRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for MedicinalProductContraindicationRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl MedicinalProductContraindication for MedicinalProductContraindicationRaw {
  fn subject(&self) -> &Vector<Box<dyn Reference>> { &self.subject }
  fn disease(&self) -> &Option<Box<dyn CodeableConcept>> { &self.disease }
  fn population(&self) -> &Vector<any> { &self.population }
  fn comorbidity(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.comorbidity }
  fn diseaseStatus(&self) -> &Option<Box<dyn CodeableConcept>> { &self.diseaseStatus }
  fn therapeuticIndication(&self) -> &Vector<Box<dyn Reference>> { &self.therapeuticIndication }
  fn otherTherapy(&self) -> &Vector<MedicinalProductContraindication_OtherTherapy> { &self.otherTherapy }
}

