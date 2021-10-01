use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct BiologicallyDerivedProduct_Storage {
  pub(crate) id?: String,
  pub(crate) scale?: String,
  pub(crate) duration?: Period,
  pub(crate) extension?: Extension,
  pub(crate) description?: String,
  pub(crate) temperature?: BigDecimal,
  pub(crate) modifierExtension?: Extension,
}


pub struct BiologicallyDerivedProduct_Collection {
  pub(crate) id?: String,
  pub(crate) source?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) collector?: Reference,
  pub(crate) collected?: Date | Period,
  pub(crate) modifierExtension?: Extension,
}


pub struct BiologicallyDerivedProduct_Processing {
  pub(crate) id?: String,
  pub(crate) time?: Date | Period,
  pub(crate) additive?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) procedure?: CodeableConcept,
  pub(crate) description?: String,
  pub(crate) modifierExtension?: Extension,
}


pub struct BiologicallyDerivedProduct_Manipulation {
  pub(crate) id?: String,
  pub(crate) time?: Date | Period,
  pub(crate) extension?: Extension,
  pub(crate) description?: String,
  pub(crate) modifierExtension?: Extension,
}

pub struct BiologicallyDerivedProduct {
  pub(crate) status?: String,
  pub(crate) parent?: Reference,
  pub(crate) request?: Reference,
  pub(crate) quantity?: i32,
  pub(crate) identifier?: Identifier,
  pub(crate) productCode?: CodeableConcept,
  pub(crate) productCategory?: String,
  pub(crate) storage?: BiologicallyDerivedProduct_Storage,
  pub(crate) collection?: BiologicallyDerivedProduct_Collection,
  pub(crate) processing?: BiologicallyDerivedProduct_Processing,
  pub(crate) manipulation?: BiologicallyDerivedProduct_Manipulation,
}