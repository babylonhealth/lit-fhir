use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::UnionCodeableConceptOrReference;
use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Duration::Duration;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::UnionCodeableConceptOrDuration;
use crate::hl7::UnionDateTimeOrPeriod;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct Specimen_Container {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) capacity: Option<Quantity>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) description: Option<String>,
  pub(crate) additive: Option<UnionCodeableConceptOrReference>,
  pub(crate) specimenQuantity: Option<Quantity>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Specimen_Collection {
  pub(crate) id: Option<String>,
  pub(crate) method: Option<CodeableConcept>,
  pub(crate) duration: Option<Duration>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) bodySite: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) collector: Option<Box<Reference>>,
  pub(crate) collected: Option<UnionDateTimeOrPeriod>,
  pub(crate) fastingStatus: Option<UnionCodeableConceptOrDuration>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Specimen_Processing {
  pub(crate) id: Option<String>,
  pub(crate) time: Option<UnionDateTimeOrPeriod>,
  pub(crate) additive: Vector<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) procedure: Option<CodeableConcept>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Specimen {
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) status: Option<String>,
  pub(crate) parent: Vector<Reference>,
  pub(crate) subject: Option<Box<Reference>>,
  pub(crate) request: Vector<Reference>,
  pub(crate) condition: Vector<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) receivedTime: Option<DateTime<FixedOffset>>,
  pub(crate) accessionIdentifier: Option<Identifier>,
  pub(crate) container: Vector<Specimen_Container>,
  pub(crate) collection: Option<Specimen_Collection>,
  pub(crate) processing: Vector<Specimen_Processing>,
}