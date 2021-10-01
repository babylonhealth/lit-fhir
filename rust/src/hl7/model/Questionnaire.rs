use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Questionnaire_Item_Initial {
  pub(crate) id: Option<String>,
  pub(crate) value: Attachment | BigDecimal | Boolean | Coding | FHIRDate | Date | i32 | Date | Quantity | Reference | String | String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct Questionnaire_Item_EnableWhen {
  pub(crate) id: Option<String>,
  pub(crate) question: String,
  pub(crate) operator: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) answer: BigDecimal | Boolean | Coding | FHIRDate | Date | i32 | Date | Quantity | Reference | String,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct Questionnaire_Item_AnswerOption {
  pub(crate) id: Option<String>,
  pub(crate) value: Coding | FHIRDate | i32 | Date | Reference | String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) initialSelected: Option<Boolean>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Questionnaire_Item {
  pub(crate) id: Option<String>,
  pub(crate) code: Vector<Coding>,
  pub(crate) text: Option<String>,
  pub(crate) _type: String,
  pub(crate) item: Vector<Questionnaire_Item>,
  pub(crate) linkId: String,
  pub(crate) prefix: Option<String>,
  pub(crate) repeats: Option<Boolean>,
  pub(crate) required: Option<Boolean>,
  pub(crate) readOnly: Option<Boolean>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) maxLength: Option<i32>,
  pub(crate) definition: Option<String>,
  pub(crate) enableBehavior: Option<String>,
  pub(crate) answerValueSet: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) initial: Vector<Questionnaire_Item_Initial>,
  pub(crate) enableWhen: Vector<Questionnaire_Item_EnableWhen>,
  pub(crate) answerOption: Vector<Questionnaire_Item_AnswerOption>,
}

#[derive(Clone, Debug)]
pub struct Questionnaire {
  pub(crate) url: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) date: Option<Date>,
  pub(crate) code: Vector<Coding>,
  pub(crate) title: Option<String>,
  pub(crate) status: String,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) purpose: Option<String>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) derivedFrom: Vector<String>,
  pub(crate) subjectType: Vector<String>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<Boolean>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) approvalDate: Option<FHIRDate>,
  pub(crate) lastReviewDate: Option<FHIRDate>,
  pub(crate) effectivePeriod: Option<Period>,
  pub(crate) item: Vector<Questionnaire_Item>,
}