use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct QuestionnaireResponse_Item_Answer {
  pub(crate) id?: String,
  pub(crate) item?: QuestionnaireResponse_Item,
  pub(crate) value?: Attachment | BigDecimal | Boolean | Coding | FHIRDate | Date | i32 | Date | Quantity | Reference | String | String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct QuestionnaireResponse_Item {
  pub(crate) id?: String,
  pub(crate) text?: String,
  pub(crate) item?: QuestionnaireResponse_Item,
  pub(crate) linkId: String,
  pub(crate) extension?: Extension,
  pub(crate) definition?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) answer?: QuestionnaireResponse_Item_Answer,
}

pub struct QuestionnaireResponse {
  pub(crate) partOf?: Reference,
  pub(crate) status: String,
  pub(crate) author?: Reference,
  pub(crate) source?: Reference,
  pub(crate) basedOn?: Reference,
  pub(crate) subject?: Reference,
  pub(crate) authored?: Date,
  pub(crate) encounter?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) questionnaire?: String,
  pub(crate) item?: QuestionnaireResponse_Item,
}