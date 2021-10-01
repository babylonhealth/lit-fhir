use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Specimen_Container {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) capacity: Option<Quantity>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) description: Option<String>,
  pub(crate) additive: Option<CodeableConcept | Reference>,
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
  pub(crate) collector: Option<Reference>,
  pub(crate) collected: Option<Date | Period>,
  pub(crate) fastingStatus: Option<CodeableConcept | Duration>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Specimen_Processing {
  pub(crate) id: Option<String>,
  pub(crate) time: Option<Date | Period>,
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
  pub(crate) subject: Option<Reference>,
  pub(crate) request: Vector<Reference>,
  pub(crate) condition: Vector<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) receivedTime: Option<Date>,
  pub(crate) accessionIdentifier: Option<Identifier>,
  pub(crate) container: Vector<Specimen_Container>,
  pub(crate) collection: Option<Specimen_Collection>,
  pub(crate) processing: Vector<Specimen_Processing>,
}