use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Questionnaire_Item_Initial {
  pub(crate) id?: String,
  pub(crate) value: Attachment | BigDecimal | Boolean | Coding | FHIRDate | Date | i32 | Date | Quantity | Reference | String | String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}



pub struct Questionnaire_Item_EnableWhen {
  pub(crate) id?: String,
  pub(crate) question: String,
  pub(crate) operator: String,
  pub(crate) extension?: Extension,
  pub(crate) answer: BigDecimal | Boolean | Coding | FHIRDate | Date | i32 | Date | Quantity | Reference | String,
  pub(crate) modifierExtension?: Extension,
}



pub struct Questionnaire_Item_AnswerOption {
  pub(crate) id?: String,
  pub(crate) value: Coding | FHIRDate | i32 | Date | Reference | String,
  pub(crate) extension?: Extension,
  pub(crate) initialSelected?: Boolean,
  pub(crate) modifierExtension?: Extension,
}

pub struct Questionnaire_Item {
  pub(crate) id?: String,
  pub(crate) code?: Coding,
  pub(crate) text?: String,
  pub(crate) _type: String,
  pub(crate) item?: Questionnaire_Item,
  pub(crate) linkId: String,
  pub(crate) prefix?: String,
  pub(crate) repeats?: Boolean,
  pub(crate) required?: Boolean,
  pub(crate) readOnly?: Boolean,
  pub(crate) extension?: Extension,
  pub(crate) maxLength?: i32,
  pub(crate) definition?: String,
  pub(crate) enableBehavior?: String,
  pub(crate) answerValueSet?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) initial?: Questionnaire_Item_Initial,
  pub(crate) enableWhen?: Questionnaire_Item_EnableWhen,
  pub(crate) answerOption?: Questionnaire_Item_AnswerOption,
}

pub struct Questionnaire {
  pub(crate) url?: String,
  pub(crate) name?: String,
  pub(crate) date?: Date,
  pub(crate) code?: Coding,
  pub(crate) title?: String,
  pub(crate) status: String,
  pub(crate) version?: String,
  pub(crate) contact?: ContactDetail,
  pub(crate) purpose?: String,
  pub(crate) publisher?: String,
  pub(crate) copyright?: String,
  pub(crate) identifier?: Identifier,
  pub(crate) useContext?: UsageContext,
  pub(crate) derivedFrom?: String,
  pub(crate) subjectType?: String,
  pub(crate) description?: String,
  pub(crate) experimental?: Boolean,
  pub(crate) jurisdiction?: CodeableConcept,
  pub(crate) approvalDate?: FHIRDate,
  pub(crate) lastReviewDate?: FHIRDate,
  pub(crate) effectivePeriod?: Period,
  pub(crate) item?: Questionnaire_Item,
}