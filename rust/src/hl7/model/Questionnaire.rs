use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Coding::Coding;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Resource::Resource;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::Union00857130015;
use crate::hl7::Union01113166363;
use crate::hl7::Union_1280102327;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct Questionnaire_Item_Initial {
  pub(crate) id: Option<String>,
  pub(crate) value: Union01113166363,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct Questionnaire_Item_EnableWhen {
  pub(crate) id: Option<String>,
  pub(crate) question: String,
  pub(crate) operator: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) answer: Union_1280102327,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct Questionnaire_Item_AnswerOption {
  pub(crate) id: Option<String>,
  pub(crate) value: Union00857130015,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) initialSelected: Option<bool>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct Questionnaire_Item {
  pub(crate) id: Option<String>,
  pub(crate) code: Vector<Box<dyn Coding>>,
  pub(crate) text: Option<String>,
  pub(crate) _type: String,
  pub(crate) item: Vector<Box<dyn Questionnaire_Item>>,
  pub(crate) linkId: String,
  pub(crate) prefix: Option<String>,
  pub(crate) repeats: Option<bool>,
  pub(crate) required: Option<bool>,
  pub(crate) readOnly: Option<bool>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) maxLength: Option<i32>,
  pub(crate) definition: Option<String>,
  pub(crate) enableBehavior: Option<String>,
  pub(crate) answerValueSet: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) initial: Vector<Questionnaire_Item_Initial>,
  pub(crate) enableWhen: Vector<Questionnaire_Item_EnableWhen>,
  pub(crate) answerOption: Vector<Questionnaire_Item_AnswerOption>,
}

#[derive(Clone, Debug)]
pub struct QuestionnaireRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: Option<String>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) code: Vector<Box<dyn Coding>>,
  pub(crate) title: Option<String>,
  pub(crate) status: String,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<Box<dyn ContactDetail>>,
  pub(crate) purpose: Option<String>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) useContext: Vector<Box<dyn UsageContext>>,
  pub(crate) derivedFrom: Vector<String>,
  pub(crate) subjectType: Vector<String>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<Box<dyn CodeableConcept>>,
  pub(crate) approvalDate: Option<FHIRDate>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) lastReviewDate: Option<FHIRDate>,
  pub(crate) effectivePeriod: Option<Box<dyn Period>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) item: Vector<Questionnaire_Item>,
}

pub trait Questionnaire : DomainResource {
  fn url(&self) -> &Option<String>;
  fn name(&self) -> &Option<String>;
  fn date(&self) -> &Option<DateTime<FixedOffset>>;
  fn code(&self) -> &Vector<Box<dyn Coding>>;
  fn title(&self) -> &Option<String>;
  fn status(&self) -> &String;
  fn version(&self) -> &Option<String>;
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn purpose(&self) -> &Option<String>;
  fn publisher(&self) -> &Option<String>;
  fn copyright(&self) -> &Option<String>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>>;
  fn derivedFrom(&self) -> &Vector<String>;
  fn subjectType(&self) -> &Vector<String>;
  fn description(&self) -> &Option<String>;
  fn experimental(&self) -> &Option<bool>;
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn approvalDate(&self) -> &Option<FHIRDate>;
  fn lastReviewDate(&self) -> &Option<FHIRDate>;
  fn effectivePeriod(&self) -> &Option<Box<dyn Period>>;
  fn item(&self) -> &Vector<Questionnaire_Item>;
}

dyn_clone::clone_trait_object!(Questionnaire);

impl FHIRObject for QuestionnaireRaw {
}

impl Resource for QuestionnaireRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for QuestionnaireRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Questionnaire for QuestionnaireRaw {
  fn url(&self) -> &Option<String> { &self.url }
  fn name(&self) -> &Option<String> { &self.name }
  fn date(&self) -> &Option<DateTime<FixedOffset>> { &self.date }
  fn code(&self) -> &Vector<Box<dyn Coding>> { &self.code }
  fn title(&self) -> &Option<String> { &self.title }
  fn status(&self) -> &String { &self.status }
  fn version(&self) -> &Option<String> { &self.version }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn purpose(&self) -> &Option<String> { &self.purpose }
  fn publisher(&self) -> &Option<String> { &self.publisher }
  fn copyright(&self) -> &Option<String> { &self.copyright }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn derivedFrom(&self) -> &Vector<String> { &self.derivedFrom }
  fn subjectType(&self) -> &Vector<String> { &self.subjectType }
  fn description(&self) -> &Option<String> { &self.description }
  fn experimental(&self) -> &Option<bool> { &self.experimental }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn approvalDate(&self) -> &Option<FHIRDate> { &self.approvalDate }
  fn lastReviewDate(&self) -> &Option<FHIRDate> { &self.lastReviewDate }
  fn effectivePeriod(&self) -> &Option<Box<dyn Period>> { &self.effectivePeriod }
  fn item(&self) -> &Vector<Questionnaire_Item> { &self.item }
}

