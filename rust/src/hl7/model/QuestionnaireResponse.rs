use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::QuestionnaireResponse_Item::QuestionnaireResponse_Item;
use crate::hl7::Union01113166363;



#[derive(Clone, Debug)]
pub struct QuestionnaireResponse_Item_Answer {
  pub(crate) id: Option<String>,
  pub(crate) item: Vector<QuestionnaireResponse_Item>,
  pub(crate) value: Option<Union01113166363>,
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
  pub(crate) author: Option<Box<Reference>>,
  pub(crate) source: Option<Box<Reference>>,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) subject: Option<Box<Reference>>,
  pub(crate) authored: Option<DateTime<FixedOffset>>,
  pub(crate) encounter: Option<Box<Reference>>,
  pub(crate) identifier: Option<Identifier>,
  pub(crate) questionnaire: Option<String>,
  pub(crate) item: Vector<QuestionnaireResponse_Item>,
}