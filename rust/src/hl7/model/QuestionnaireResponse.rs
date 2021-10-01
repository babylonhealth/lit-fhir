use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct QuestionnaireResponse_Item_Answer {
  pub(crate) id: Option<String>,
  pub(crate) item: Vector<QuestionnaireResponse_Item>,
  pub(crate) value: Option<Attachment | BigDecimal | Boolean | Coding | FHIRDate | Date | i32 | Date | Quantity | Reference | String | String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct QuestionnaireResponse_Item {
  pub(crate) id: Option<String>,
  pub(crate) text: Option<String>,
  pub(crate) item: Vector<QuestionnaireResponse_Item>,
  pub(crate) linkId: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) definition: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) answer: Vector<QuestionnaireResponse_Item_Answer>,
}

#[derive(Clone, Debug)]
pub struct QuestionnaireResponse {
  pub(crate) partOf: Vector<Reference>,
  pub(crate) status: String,
  pub(crate) author: Option<Reference>,
  pub(crate) source: Option<Reference>,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) subject: Option<Reference>,
  pub(crate) authored: Option<Date>,
  pub(crate) encounter: Option<Reference>,
  pub(crate) identifier: Option<Identifier>,
  pub(crate) questionnaire: Option<String>,
  pub(crate) item: Vector<QuestionnaireResponse_Item>,
}