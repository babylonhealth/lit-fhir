use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Extension::Extension;
use crate::core::model::Meta::Meta;
use crate::core::model::Resource::Resource;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct SearchParameter_Component {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) definition: String,
  pub(crate) expression: String,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct SearchParameterRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: String,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: String,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) code: String,
  pub(crate) base: Vector<String>,
  pub(crate) _type: String,
  pub(crate) xpath: Option<String>,
  pub(crate) chain: Vector<String>,
  pub(crate) status: String,
  pub(crate) target: Vector<String>,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<Box<dyn ContactDetail>>,
  pub(crate) purpose: Option<String>,
  pub(crate) language: Option<String>,
  pub(crate) modifier: Vector<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) publisher: Option<String>,
  pub(crate) useContext: Vector<Box<dyn UsageContext>>,
  pub(crate) expression: Option<String>,
  pub(crate) xpathUsage: Option<String>,
  pub(crate) multipleOr: Option<bool>,
  pub(crate) comparator: Vector<String>,
  pub(crate) derivedFrom: Option<String>,
  pub(crate) description: String,
  pub(crate) multipleAnd: Option<bool>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) component: Vector<SearchParameter_Component>,
}

pub trait SearchParameter : DomainResource {
  fn url(&self) -> &String;
  fn name(&self) -> &String;
  fn date(&self) -> &Option<DateTime<FixedOffset>>;
  fn code(&self) -> &String;
  fn base(&self) -> &Vector<String>;
  fn _type(&self) -> &String;
  fn xpath(&self) -> &Option<String>;
  fn chain(&self) -> &Vector<String>;
  fn status(&self) -> &String;
  fn target(&self) -> &Vector<String>;
  fn version(&self) -> &Option<String>;
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn purpose(&self) -> &Option<String>;
  fn modifier(&self) -> &Vector<String>;
  fn publisher(&self) -> &Option<String>;
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>>;
  fn expression(&self) -> &Option<String>;
  fn xpathUsage(&self) -> &Option<String>;
  fn multipleOr(&self) -> &Option<bool>;
  fn comparator(&self) -> &Vector<String>;
  fn derivedFrom(&self) -> &Option<String>;
  fn description(&self) -> &String;
  fn multipleAnd(&self) -> &Option<bool>;
  fn experimental(&self) -> &Option<bool>;
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn component(&self) -> &Vector<SearchParameter_Component>;
}

dyn_clone::clone_trait_object!(SearchParameter);

impl FHIRObject for SearchParameterRaw {
}

impl Resource for SearchParameterRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for SearchParameterRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl SearchParameter for SearchParameterRaw {
  fn url(&self) -> &String { &self.url }
  fn name(&self) -> &String { &self.name }
  fn date(&self) -> &Option<DateTime<FixedOffset>> { &self.date }
  fn code(&self) -> &String { &self.code }
  fn base(&self) -> &Vector<String> { &self.base }
  fn _type(&self) -> &String { &self._type }
  fn xpath(&self) -> &Option<String> { &self.xpath }
  fn chain(&self) -> &Vector<String> { &self.chain }
  fn status(&self) -> &String { &self.status }
  fn target(&self) -> &Vector<String> { &self.target }
  fn version(&self) -> &Option<String> { &self.version }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn purpose(&self) -> &Option<String> { &self.purpose }
  fn modifier(&self) -> &Vector<String> { &self.modifier }
  fn publisher(&self) -> &Option<String> { &self.publisher }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn expression(&self) -> &Option<String> { &self.expression }
  fn xpathUsage(&self) -> &Option<String> { &self.xpathUsage }
  fn multipleOr(&self) -> &Option<bool> { &self.multipleOr }
  fn comparator(&self) -> &Vector<String> { &self.comparator }
  fn derivedFrom(&self) -> &Option<String> { &self.derivedFrom }
  fn description(&self) -> &String { &self.description }
  fn multipleAnd(&self) -> &Option<bool> { &self.multipleAnd }
  fn experimental(&self) -> &Option<bool> { &self.experimental }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn component(&self) -> &Vector<SearchParameter_Component> { &self.component }
}

