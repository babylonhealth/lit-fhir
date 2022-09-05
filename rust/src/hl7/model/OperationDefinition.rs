use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

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
pub struct OperationDefinition_Overload {
  pub(crate) id: Option<String>,
  pub(crate) comment: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) parameterName: Vector<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct OperationDefinition_Parameter_Binding {
  pub(crate) id: Option<String>,
  pub(crate) strength: String,
  pub(crate) valueSet: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct OperationDefinition_Parameter_ReferencedFrom {
  pub(crate) id: Option<String>,
  pub(crate) source: String,
  pub(crate) sourceId: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct OperationDefinition_Parameter {
  pub(crate) id: Option<String>,
  pub(crate) _use: String,
  pub(crate) min: i32,
  pub(crate) max: String,
  pub(crate) name: String,
  pub(crate) _type: Option<String>,
  pub(crate) part: Vector<Box<OperationDefinition_Parameter>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) searchType: Option<String>,
  pub(crate) documentation: Option<String>,
  pub(crate) targetProfile: Vector<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) binding: Option<Box<OperationDefinition_Parameter_Binding>>,
  pub(crate) referencedFrom: Vector<Box<OperationDefinition_Parameter_ReferencedFrom>>,
}

#[derive(Clone, Debug)]
pub struct OperationDefinitionRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) name: String,
  pub(crate) kind: String,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) code: String,
  pub(crate) base: Option<String>,
  pub(crate) _type: bool,
  pub(crate) title: Option<String>,
  pub(crate) status: String,
  pub(crate) system: bool,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<Box<dyn ContactDetail>>,
  pub(crate) purpose: Option<String>,
  pub(crate) comment: Option<String>,
  pub(crate) language: Option<String>,
  pub(crate) resource: Vector<String>,
  pub(crate) instance: bool,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) publisher: Option<String>,
  pub(crate) useContext: Vector<Box<dyn UsageContext>>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<Box<dyn CodeableConcept>>,
  pub(crate) affectsState: Option<bool>,
  pub(crate) inputProfile: Option<String>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) outputProfile: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) overload: Vector<Box<OperationDefinition_Overload>>,
  pub(crate) parameter: Vector<Box<OperationDefinition_Parameter>>,
}

pub trait OperationDefinition : DomainResource {
  fn url(&self) -> &Option<String>;
  fn name(&self) -> &String;
  fn kind(&self) -> &String;
  fn date(&self) -> &Option<DateTime<FixedOffset>>;
  fn code(&self) -> &String;
  fn base(&self) -> &Option<String>;
  fn _type(&self) -> &bool;
  fn title(&self) -> &Option<String>;
  fn status(&self) -> &String;
  fn system(&self) -> &bool;
  fn version(&self) -> &Option<String>;
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>>;
  fn purpose(&self) -> &Option<String>;
  fn comment(&self) -> &Option<String>;
  fn resource(&self) -> &Vector<String>;
  fn instance(&self) -> &bool;
  fn publisher(&self) -> &Option<String>;
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>>;
  fn description(&self) -> &Option<String>;
  fn experimental(&self) -> &Option<bool>;
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn affectsState(&self) -> &Option<bool>;
  fn inputProfile(&self) -> &Option<String>;
  fn outputProfile(&self) -> &Option<String>;
  fn overload(&self) -> &Vector<Box<OperationDefinition_Overload>>;
  fn parameter(&self) -> &Vector<Box<OperationDefinition_Parameter>>;
}

dyn_clone::clone_trait_object!(OperationDefinition);

impl FHIRObject for OperationDefinitionRaw {
}

impl Resource for OperationDefinitionRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for OperationDefinitionRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl OperationDefinition for OperationDefinitionRaw {
  fn url(&self) -> &Option<String> { &self.url }
  fn name(&self) -> &String { &self.name }
  fn kind(&self) -> &String { &self.kind }
  fn date(&self) -> &Option<DateTime<FixedOffset>> { &self.date }
  fn code(&self) -> &String { &self.code }
  fn base(&self) -> &Option<String> { &self.base }
  fn _type(&self) -> &bool { &self._type }
  fn title(&self) -> &Option<String> { &self.title }
  fn status(&self) -> &String { &self.status }
  fn system(&self) -> &bool { &self.system }
  fn version(&self) -> &Option<String> { &self.version }
  fn contact(&self) -> &Vector<Box<dyn ContactDetail>> { &self.contact }
  fn purpose(&self) -> &Option<String> { &self.purpose }
  fn comment(&self) -> &Option<String> { &self.comment }
  fn resource(&self) -> &Vector<String> { &self.resource }
  fn instance(&self) -> &bool { &self.instance }
  fn publisher(&self) -> &Option<String> { &self.publisher }
  fn useContext(&self) -> &Vector<Box<dyn UsageContext>> { &self.useContext }
  fn description(&self) -> &Option<String> { &self.description }
  fn experimental(&self) -> &Option<bool> { &self.experimental }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn affectsState(&self) -> &Option<bool> { &self.affectsState }
  fn inputProfile(&self) -> &Option<String> { &self.inputProfile }
  fn outputProfile(&self) -> &Option<String> { &self.outputProfile }
  fn overload(&self) -> &Vector<Box<OperationDefinition_Overload>> { &self.overload }
  fn parameter(&self) -> &Vector<Box<OperationDefinition_Parameter>> { &self.parameter }
}

