use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




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
  pub(crate) actor: Reference,
  pub(crate) function: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct ImagingStudy_Series {
  pub(crate) id: Option<String>,
  pub(crate) uid: String,
  pub(crate) number: Option<u32>,
  pub(crate) started: Option<Date>,
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
  pub(crate) subject: Reference,
  pub(crate) started: Option<Date>,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) modality: Vector<Coding>,
  pub(crate) referrer: Option<Reference>,
  pub(crate) endpoint: Vector<Reference>,
  pub(crate) location: Option<Reference>,
  pub(crate) encounter: Option<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) interpreter: Vector<Reference>,
  pub(crate) description: Option<String>,
  pub(crate) procedureCode: Vector<CodeableConcept>,
  pub(crate) numberOfSeries: Option<u32>,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) numberOfInstances: Option<u32>,
  pub(crate) procedureReference: Option<Reference>,
  pub(crate) series: Vector<ImagingStudy_Series>,
}