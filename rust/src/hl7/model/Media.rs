use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Media {
  pub(crate) _type?: CodeableConcept,
  pub(crate) view?: CodeableConcept,
  pub(crate) note?: Annotation,
  pub(crate) width?: u32,
  pub(crate) partOf?: Reference,
  pub(crate) status: String,
  pub(crate) issued?: Date,
  pub(crate) device?: Reference,
  pub(crate) height?: u32,
  pub(crate) frames?: u32,
  pub(crate) basedOn?: Reference,
  pub(crate) subject?: Reference,
  pub(crate) content: Attachment,
  pub(crate) modality?: CodeableConcept,
  pub(crate) operator?: Reference,
  pub(crate) bodySite?: CodeableConcept,
  pub(crate) duration?: BigDecimal,
  pub(crate) encounter?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) created?: Date | Period,
  pub(crate) reasonCode?: CodeableConcept,
  pub(crate) deviceName?: String,
}