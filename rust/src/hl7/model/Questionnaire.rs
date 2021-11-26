use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Coding::Coding;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Questionnaire_Item::Questionnaire_Item;
use crate::core::model::Resource::Resource;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::Union00857130015;
use crate::hl7::Union01113166363;
use crate::hl7::Union_1280102327;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct Questionnaire_Item_Initial {
  pub(crate) id: Option<String>,
  pub(crate) value: Union01113166363,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct Questionnaire_Item_EnableWhen {
  pub(crate) id: Option<String>,
  pub(crate) question: String,
  pub(crate) operator: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) answer: Union_1280102327,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct Questionnaire_Item_AnswerOption {
  pub(crate) id: Option<String>,
  pub(crate) value: Union00857130015,
  pub(crate) extension: Vector<Extension>,
  pub(crate) initialSelected: Option<bool>,
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
  pub(crate) repeats: Option<bool>,
  pub(crate) required: Option<bool>,
  pub(crate) readOnly: Option<bool>,
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
  pub(crate) date: Option<DateTime<FixedOffset>>,
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
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) approvalDate: Option<FHIRDate>,
  pub(crate) lastReviewDate: Option<FHIRDate>,
  pub(crate) effectivePeriod: Option<Period>,
  pub(crate) item: Vector<Questionnaire_Item>,
}