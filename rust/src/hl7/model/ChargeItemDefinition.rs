use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Money::Money;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct ChargeItemDefinition_Applicability {
  pub(crate) id: Option<String>,
  pub(crate) language: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) expression: Option<String>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct ChargeItemDefinition_PropertyGroup_PriceComponent {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) factor: Option<BigDecimal>,
  pub(crate) amount: Option<Box<dyn Money>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct ChargeItemDefinition_PropertyGroup {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) applicability: Vector<Box<dyn ChargeItemDefinition_Applicability>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) priceComponent: Vector<ChargeItemDefinition_PropertyGroup_PriceComponent>,
}

#[derive(Clone, Debug)]
pub struct ChargeItemDefinitionRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: String,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) title: Option<String>,
  pub(crate) partOf: Vector<String>,
  pub(crate) status: String,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<Box<dyn ContactDetail>>,
  pub(crate) language: Option<String>,
  pub(crate) replaces: Vector<String>,
  pub(crate) instance: Vector<Box<dyn Reference>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) useContext: Vector<Box<dyn UsageContext>>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<Box<dyn CodeableConcept>>,
  pub(crate) approvalDate: Option<FHIRDate>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) derivedFromUri: Vector<String>,
  pub(crate) lastReviewDate: Option<FHIRDate>,
  pub(crate) effectivePeriod: Option<Box<dyn Period>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) applicability: Vector<ChargeItemDefinition_Applicability>,
  pub(crate) propertyGroup: Vector<ChargeItemDefinition_PropertyGroup>,
}

pub trait ChargeItemDefinition : DomainResource {
  fn url(&self) -> &String;
  fn date(&self) -> &Option<DateTime<FixedOffset>>;
  fn code(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn title(&self) -> &Option<String>;
  fn partOf(&self) -> &Vector<String>;
  fn status(&self) -> &String;
  fn version(&self) -> &Option<String>;
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn replaces(&self) -> &Vector<String>;
  fn instance(&self) -> &Vector<Box<dyn Reference>>;
  fn publisher(&self) -> &Option<String>;
  fn copyright(&self) -> &Option<String>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>>;
  fn description(&self) -> &Option<String>;
  fn experimental(&self) -> &Option<bool>;
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn approvalDate(&self) -> &Option<FHIRDate>;
  fn derivedFromUri(&self) -> &Vector<String>;
  fn lastReviewDate(&self) -> &Option<FHIRDate>;
  fn effectivePeriod(&self) -> &Option<Box<dyn Period>>;
  fn applicability(&self) -> &Vector<ChargeItemDefinition_Applicability>;
  fn propertyGroup(&self) -> &Vector<ChargeItemDefinition_PropertyGroup>;
}

dyn_clone::clone_trait_object!(ChargeItemDefinition);

impl FHIRObject for ChargeItemDefinitionRaw {
}

impl Resource for ChargeItemDefinitionRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for ChargeItemDefinitionRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl ChargeItemDefinition for ChargeItemDefinitionRaw {
  fn url(&self) -> &String { &self.url }
  fn date(&self) -> &Option<DateTime<FixedOffset>> { &self.date }
  fn code(&self) -> &Option<Box<dyn CodeableConcept>> { &self.code }
  fn title(&self) -> &Option<String> { &self.title }
  fn partOf(&self) -> &Vector<String> { &self.partOf }
  fn status(&self) -> &String { &self.status }
  fn version(&self) -> &Option<String> { &self.version }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn replaces(&self) -> &Vector<String> { &self.replaces }
  fn instance(&self) -> &Vector<Box<dyn Reference>> { &self.instance }
  fn publisher(&self) -> &Option<String> { &self.publisher }
  fn copyright(&self) -> &Option<String> { &self.copyright }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn description(&self) -> &Option<String> { &self.description }
  fn experimental(&self) -> &Option<bool> { &self.experimental }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn approvalDate(&self) -> &Option<FHIRDate> { &self.approvalDate }
  fn derivedFromUri(&self) -> &Vector<String> { &self.derivedFromUri }
  fn lastReviewDate(&self) -> &Option<FHIRDate> { &self.lastReviewDate }
  fn effectivePeriod(&self) -> &Option<Box<dyn Period>> { &self.effectivePeriod }
  fn applicability(&self) -> &Vector<ChargeItemDefinition_Applicability> { &self.applicability }
  fn propertyGroup(&self) -> &Vector<ChargeItemDefinition_PropertyGroup> { &self.propertyGroup }
}

