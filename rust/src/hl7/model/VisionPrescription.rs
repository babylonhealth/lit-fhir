use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct VisionPrescription_LensSpecification_Prism {
  pub(crate) id: Option<String>,
  pub(crate) base: String,
  pub(crate) amount: BigDecimal,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct VisionPrescription_LensSpecification {
  pub(crate) id: Option<String>,
  pub(crate) eye: String,
  pub(crate) add: Option<BigDecimal>,
  pub(crate) axis: Option<i32>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) power: Option<BigDecimal>,
  pub(crate) color: Option<String>,
  pub(crate) brand: Option<String>,
  pub(crate) sphere: Option<BigDecimal>,
  pub(crate) product: Box<dyn CodeableConcept>,
  pub(crate) cylinder: Option<BigDecimal>,
  pub(crate) diameter: Option<BigDecimal>,
  pub(crate) duration: Option<Box<dyn Quantity>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) backCurve: Option<BigDecimal>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) prism: Vector<Box<VisionPrescription_LensSpecification_Prism>>,
}

#[derive(Clone, Debug)]
pub struct VisionPrescriptionRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) status: String,
  pub(crate) created: DateTime<FixedOffset>,
  pub(crate) patient: Box<dyn Reference>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) encounter: Option<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) prescriber: Box<dyn Reference>,
  pub(crate) dateWritten: DateTime<FixedOffset>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) lensSpecification: Vector<Box<VisionPrescription_LensSpecification>>,
}

pub trait VisionPrescription : DomainResource {
  fn status(&self) -> &String;
  fn created(&self) -> &DateTime<FixedOffset>;
  fn patient(&self) -> &Box<dyn Reference>;
  fn encounter(&self) -> &Option<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn prescriber(&self) -> &Box<dyn Reference>;
  fn dateWritten(&self) -> &DateTime<FixedOffset>;
  fn lensSpecification(&self) -> &Vector<Box<VisionPrescription_LensSpecification>>;
}

dyn_clone::clone_trait_object!(VisionPrescription);

impl FHIRObject for VisionPrescriptionRaw {
}

impl Resource for VisionPrescriptionRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for VisionPrescriptionRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl VisionPrescription for VisionPrescriptionRaw {
  fn status(&self) -> &String { &self.status }
  fn created(&self) -> &DateTime<FixedOffset> { &self.created }
  fn patient(&self) -> &Box<dyn Reference> { &self.patient }
  fn encounter(&self) -> &Option<Box<dyn Reference>> { &self.encounter }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn prescriber(&self) -> &Box<dyn Reference> { &self.prescriber }
  fn dateWritten(&self) -> &DateTime<FixedOffset> { &self.dateWritten }
  fn lensSpecification(&self) -> &Vector<Box<VisionPrescription_LensSpecification>> { &self.lensSpecification }
}

