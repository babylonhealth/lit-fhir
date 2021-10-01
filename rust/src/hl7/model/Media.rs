use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Media {
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) view: Option<CodeableConcept>,
  pub(crate) note: Vector<Annotation>,
  pub(crate) width: Option<u32>,
  pub(crate) partOf: Vector<Reference>,
  pub(crate) status: String,
  pub(crate) issued: Option<Date>,
  pub(crate) device: Option<Reference>,
  pub(crate) height: Option<u32>,
  pub(crate) frames: Option<u32>,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) subject: Option<Reference>,
  pub(crate) content: Attachment,
  pub(crate) modality: Option<CodeableConcept>,
  pub(crate) operator: Option<Reference>,
  pub(crate) bodySite: Option<CodeableConcept>,
  pub(crate) duration: Option<BigDecimal>,
  pub(crate) encounter: Option<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) created: Option<Date | Period>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) deviceName: Option<String>,
}