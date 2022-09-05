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
use crate::core::model::UnionAliases::UnionCodeableConceptOrReference;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::UnionDateTimeOrPeriod;
use crate::hl7::model::UnionAliases::UnionQuantityOrRatio;



#[derive(Clone, Debug)]
pub struct MedicationAdministration_Dosage {
  pub(crate) id: Option<String>,
  pub(crate) text: Option<String>,
  pub(crate) site: Option<Box<dyn CodeableConcept>>,
  pub(crate) dose: Option<Box<dyn Quantity>>,
  pub(crate) route: Option<Box<dyn CodeableConcept>>,
  pub(crate) method: Option<Box<dyn CodeableConcept>>,
  pub(crate) rate: Option<UnionQuantityOrRatio>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct MedicationAdministration_Performer {
  pub(crate) id: Option<String>,
  pub(crate) actor: Box<dyn Reference>,
  pub(crate) function: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct MedicationAdministrationRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) partOf: Vector<Box<dyn Reference>>,
  pub(crate) status: String,
  pub(crate) device: Vector<Box<dyn Reference>>,
  pub(crate) subject: Box<dyn Reference>,
  pub(crate) context: Option<Box<dyn Reference>>,
  pub(crate) request: Option<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) category: Option<Box<dyn CodeableConcept>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) reasonCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) instantiates: Vector<String>,
  pub(crate) statusReason: Vector<Box<dyn CodeableConcept>>,
  pub(crate) effective: UnionDateTimeOrPeriod,
  pub(crate) eventHistory: Vector<Box<dyn Reference>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) medication: UnionCodeableConceptOrReference,
  pub(crate) reasonReference: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) supportingInformation: Vector<Box<dyn Reference>>,
  pub(crate) dosage: Option<Box<MedicationAdministration_Dosage>>,
  pub(crate) performer: Vector<Box<MedicationAdministration_Performer>>,
}

pub trait MedicationAdministration : DomainResource {
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn partOf(&self) -> &Vector<Box<dyn Reference>>;
  fn status(&self) -> &String;
  fn device(&self) -> &Vector<Box<dyn Reference>>;
  fn subject(&self) -> &Box<dyn Reference>;
  fn context(&self) -> &Option<Box<dyn Reference>>;
  fn request(&self) -> &Option<Box<dyn Reference>>;
  fn category(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn instantiates(&self) -> &Vector<String>;
  fn statusReason(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn effective(&self) -> &UnionDateTimeOrPeriod;
  fn eventHistory(&self) -> &Vector<Box<dyn Reference>>;
  fn medication(&self) -> &UnionCodeableConceptOrReference;
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>>;
  fn supportingInformation(&self) -> &Vector<Box<dyn Reference>>;
  fn dosage(&self) -> &Option<Box<MedicationAdministration_Dosage>>;
  fn performer(&self) -> &Vector<Box<MedicationAdministration_Performer>>;
}

dyn_clone::clone_trait_object!(MedicationAdministration);

impl FHIRObject for MedicationAdministrationRaw {
}

impl Resource for MedicationAdministrationRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for MedicationAdministrationRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl MedicationAdministration for MedicationAdministrationRaw {
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn partOf(&self) -> &Vector<Box<dyn Reference>> { &self.partOf }
  fn status(&self) -> &String { &self.status }
  fn device(&self) -> &Vector<Box<dyn Reference>> { &self.device }
  fn subject(&self) -> &Box<dyn Reference> { &self.subject }
  fn context(&self) -> &Option<Box<dyn Reference>> { &self.context }
  fn request(&self) -> &Option<Box<dyn Reference>> { &self.request }
  fn category(&self) -> &Option<Box<dyn CodeableConcept>> { &self.category }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.reasonCode }
  fn instantiates(&self) -> &Vector<String> { &self.instantiates }
  fn statusReason(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.statusReason }
  fn effective(&self) -> &UnionDateTimeOrPeriod { &self.effective }
  fn eventHistory(&self) -> &Vector<Box<dyn Reference>> { &self.eventHistory }
  fn medication(&self) -> &UnionCodeableConceptOrReference { &self.medication }
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>> { &self.reasonReference }
  fn supportingInformation(&self) -> &Vector<Box<dyn Reference>> { &self.supportingInformation }
  fn dosage(&self) -> &Option<Box<MedicationAdministration_Dosage>> { &self.dosage }
  fn performer(&self) -> &Vector<Box<MedicationAdministration_Performer>> { &self.performer }
}

