use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::Annotation::Annotation;
use crate::core::model::Reference::Reference;
use crate::core::model::Coding::Coding;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::CodeableConcept::CodeableConcept;



#[derive(Clone, Debug)]
pub struct ImagingStudy_Series_Instance {
  pub(crate) id: Option<String>,
  pub(crate) uid: String,
  pub(crate) title: Option<String>,
  pub(crate) number: Option<u32>,
  pub(crate) sopClass: Coding,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct ImagingStudy_Series_Performer {
  pub(crate) id: Option<String>,
  pub(crate) actor: Box<Reference>,
  pub(crate) function: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct ImagingStudy_Series {
  pub(crate) id: Option<String>,
  pub(crate) uid: String,
  pub(crate) number: Option<u32>,
  pub(crate) started: Option<DateTime<FixedOffset>>,
  pub(crate) modality: Coding,
  pub(crate) endpoint: Vector<Reference>,
  pub(crate) bodySite: Option<Coding>,
  pub(crate) specimen: Vector<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) laterality: Option<Coding>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) numberOfInstances: Option<u32>,
  pub(crate) instance: Vector<ImagingStudy_Series_Instance>,
  pub(crate) performer: Vector<ImagingStudy_Series_Performer>,
}

#[derive(Clone, Debug)]
pub struct ImagingStudy {
  pub(crate) note: Vector<Annotation>,
  pub(crate) status: String,
  pub(crate) subject: Box<Reference>,
  pub(crate) started: Option<DateTime<FixedOffset>>,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) modality: Vector<Coding>,
  pub(crate) referrer: Option<Box<Reference>>,
  pub(crate) endpoint: Vector<Reference>,
  pub(crate) location: Option<Box<Reference>>,
  pub(crate) encounter: Option<Box<Reference>>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) interpreter: Vector<Reference>,
  pub(crate) description: Option<String>,
  pub(crate) procedureCode: Vector<CodeableConcept>,
  pub(crate) numberOfSeries: Option<u32>,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) numberOfInstances: Option<u32>,
  pub(crate) procedureReference: Option<Box<Reference>>,
  pub(crate) series: Vector<ImagingStudy_Series>,
}