use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct List_Entry {
  pub(crate) id: Option<String>,
  pub(crate) flag: Option<CodeableConcept>,
  pub(crate) date: Option<Date>,
  pub(crate) item: Reference,
  pub(crate) deleted: Option<Boolean>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct List {
  pub(crate) mode: String,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) date: Option<Date>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) title: Option<String>,
  pub(crate) status: String,
  pub(crate) source: Option<Reference>,
  pub(crate) subject: Option<Reference>,
  pub(crate) encounter: Option<Reference>,
  pub(crate) orderedBy: Option<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) emptyReason: Option<CodeableConcept>,
  pub(crate) entry: Vector<List_Entry>,
}