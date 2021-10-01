use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct BiologicallyDerivedProduct_Storage {
  pub(crate) id: Option<String>,
  pub(crate) scale: Option<String>,
  pub(crate) duration: Option<Period>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Option<String>,
  pub(crate) temperature: Option<BigDecimal>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct BiologicallyDerivedProduct_Collection {
  pub(crate) id: Option<String>,
  pub(crate) source: Option<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) collector: Option<Reference>,
  pub(crate) collected: Option<Date | Period>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct BiologicallyDerivedProduct_Processing {
  pub(crate) id: Option<String>,
  pub(crate) time: Option<Date | Period>,
  pub(crate) additive: Option<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) procedure: Option<CodeableConcept>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct BiologicallyDerivedProduct_Manipulation {
  pub(crate) id: Option<String>,
  pub(crate) time: Option<Date | Period>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct BiologicallyDerivedProduct {
  pub(crate) status: Option<String>,
  pub(crate) parent: Vector<Reference>,
  pub(crate) request: Vector<Reference>,
  pub(crate) quantity: Option<i32>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) productCode: Option<CodeableConcept>,
  pub(crate) productCategory: Option<String>,
  pub(crate) storage: Vector<BiologicallyDerivedProduct_Storage>,
  pub(crate) collection: Option<BiologicallyDerivedProduct_Collection>,
  pub(crate) processing: Vector<BiologicallyDerivedProduct_Processing>,
  pub(crate) manipulation: Option<BiologicallyDerivedProduct_Manipulation>,
}