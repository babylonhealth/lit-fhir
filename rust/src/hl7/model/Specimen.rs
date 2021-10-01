use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Specimen_Container {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) capacity?: Quantity,
  pub(crate) extension?: Extension,
  pub(crate) identifier?: Identifier,
  pub(crate) description?: String,
  pub(crate) additive?: CodeableConcept | Reference,
  pub(crate) specimenQuantity?: Quantity,
  pub(crate) modifierExtension?: Extension,
}


pub struct Specimen_Collection {
  pub(crate) id?: String,
  pub(crate) method?: CodeableConcept,
  pub(crate) duration?: Duration,
  pub(crate) quantity?: Quantity,
  pub(crate) bodySite?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) collector?: Reference,
  pub(crate) collected?: Date | Period,
  pub(crate) fastingStatus?: CodeableConcept | Duration,
  pub(crate) modifierExtension?: Extension,
}


pub struct Specimen_Processing {
  pub(crate) id?: String,
  pub(crate) time?: Date | Period,
  pub(crate) additive?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) procedure?: CodeableConcept,
  pub(crate) description?: String,
  pub(crate) modifierExtension?: Extension,
}

pub struct Specimen {
  pub(crate) _type?: CodeableConcept,
  pub(crate) note?: Annotation,
  pub(crate) status?: String,
  pub(crate) parent?: Reference,
  pub(crate) subject?: Reference,
  pub(crate) request?: Reference,
  pub(crate) condition?: CodeableConcept,
  pub(crate) identifier?: Identifier,
  pub(crate) receivedTime?: Date,
  pub(crate) accessionIdentifier?: Identifier,
  pub(crate) container?: Specimen_Container,
  pub(crate) collection?: Specimen_Collection,
  pub(crate) processing?: Specimen_Processing,
}