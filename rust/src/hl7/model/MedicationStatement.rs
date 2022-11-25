use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Dosage::Dosage;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::UnionAliases::UnionCodeableConceptOrReference;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::UnionDateTimeOrPeriod;



#[derive(Clone, Debug)]
pub struct MedicationStatementRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) partOf: Vector<Box<dyn Reference>>,
  pub(crate) status: String,
  pub(crate) dosage: Vector<Box<dyn Dosage>>,
  pub(crate) basedOn: Vector<Box<dyn Reference>>,
  pub(crate) subject: Box<dyn Reference>,
  pub(crate) context: Option<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) category: Option<Box<dyn CodeableConcept>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) reasonCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) derivedFrom: Vector<Box<dyn Reference>>,
  pub(crate) statusReason: Vector<Box<dyn CodeableConcept>>,
  pub(crate) effective: Option<UnionDateTimeOrPeriod>,
  pub(crate) dateAsserted: Option<DateTime<FixedOffset>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) medication: UnionCodeableConceptOrReference,
  pub(crate) reasonReference: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) informationSource: Option<Box<dyn Reference>>,
}

pub trait MedicationStatement : DomainResource {
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn partOf(&self) -> &Vector<Box<dyn Reference>>;
  fn status(&self) -> &String;
  fn dosage(&self) -> &Vector<Box<dyn Dosage>>;
  fn basedOn(&self) -> &Vector<Box<dyn Reference>>;
  fn subject(&self) -> &Box<dyn Reference>;
  fn context(&self) -> Option<&Box<dyn Reference>>;
  fn category(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn derivedFrom(&self) -> &Vector<Box<dyn Reference>>;
  fn statusReason(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn effective(&self) -> Option<&UnionDateTimeOrPeriod>;
  fn dateAsserted(&self) -> Option<&DateTime<FixedOffset>>;
  fn medication(&self) -> &UnionCodeableConceptOrReference;
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>>;
  fn informationSource(&self) -> Option<&Box<dyn Reference>>;
}

dyn_clone::clone_trait_object!(MedicationStatement);

impl FHIRObject for MedicationStatementRaw {
}

impl Resource for MedicationStatementRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for MedicationStatementRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl MedicationStatement for MedicationStatementRaw {
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn partOf(&self) -> &Vector<Box<dyn Reference>> { &self.partOf }
  fn status(&self) -> &String { &self.status }
  fn dosage(&self) -> &Vector<Box<dyn Dosage>> { &self.dosage }
  fn basedOn(&self) -> &Vector<Box<dyn Reference>> { &self.basedOn }
  fn subject(&self) -> &Box<dyn Reference> { &self.subject }
  fn context(&self) -> Option<&Box<dyn Reference>> { self.context.as_ref() }
  fn category(&self) -> Option<&Box<dyn CodeableConcept>> { self.category.as_ref() }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.reasonCode }
  fn derivedFrom(&self) -> &Vector<Box<dyn Reference>> { &self.derivedFrom }
  fn statusReason(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.statusReason }
  fn effective(&self) -> Option<&UnionDateTimeOrPeriod> { self.effective.as_ref() }
  fn dateAsserted(&self) -> Option<&DateTime<FixedOffset>> { self.dateAsserted.as_ref() }
  fn medication(&self) -> &UnionCodeableConceptOrReference { &self.medication }
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>> { &self.reasonReference }
  fn informationSource(&self) -> Option<&Box<dyn Reference>> { self.informationSource.as_ref() }
}

