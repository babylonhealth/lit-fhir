use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct MeasureReport_Group_Population {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) count: Option<i32>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) subjectResults: Option<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct MeasureReport_Group_Stratifier_Stratum_Component {
  pub(crate) id: Option<String>,
  pub(crate) code: Box<dyn CodeableConcept>,
  pub(crate) value: Box<dyn CodeableConcept>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct MeasureReport_Group_Stratifier_Stratum_Population {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) count: Option<i32>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) subjectResults: Option<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct MeasureReport_Group_Stratifier_Stratum {
  pub(crate) id: Option<String>,
  pub(crate) value: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) measureScore: Option<Box<dyn Quantity>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) component: Vector<MeasureReport_Group_Stratifier_Stratum_Component>,
  pub(crate) population: Vector<MeasureReport_Group_Stratifier_Stratum_Population>,
}

#[derive(Clone, Debug)]
pub struct MeasureReport_Group_Stratifier {
  pub(crate) id: Option<String>,
  pub(crate) code: Vector<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) stratum: Vector<MeasureReport_Group_Stratifier_Stratum>,
}

#[derive(Clone, Debug)]
pub struct MeasureReport_Group {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) measureScore: Option<Box<dyn Quantity>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) population: Vector<MeasureReport_Group_Population>,
  pub(crate) stratifier: Vector<MeasureReport_Group_Stratifier>,
}

#[derive(Clone, Debug)]
pub struct MeasureReportRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: String,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) status: String,
  pub(crate) period: Box<dyn Period>,
  pub(crate) measure: String,
  pub(crate) subject: Option<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) reporter: Option<Box<dyn Reference>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) evaluatedResource: Vector<Box<dyn Reference>>,
  pub(crate) improvementNotation: Option<Box<dyn CodeableConcept>>,
  pub(crate) group: Vector<MeasureReport_Group>,
}

pub trait MeasureReport : DomainResource {
  fn _type(&self) -> &String;
  fn date(&self) -> &Option<DateTime<FixedOffset>>;
  fn status(&self) -> &String;
  fn period(&self) -> &Box<dyn Period>;
  fn measure(&self) -> &String;
  fn subject(&self) -> &Option<Box<dyn Reference>>;
  fn reporter(&self) -> &Option<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn evaluatedResource(&self) -> &Vector<Box<dyn Reference>>;
  fn improvementNotation(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn group(&self) -> &Vector<MeasureReport_Group>;
}

dyn_clone::clone_trait_object!(MeasureReport);

impl FHIRObject for MeasureReportRaw {
}

impl Resource for MeasureReportRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for MeasureReportRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl MeasureReport for MeasureReportRaw {
  fn _type(&self) -> &String { &self._type }
  fn date(&self) -> &Option<DateTime<FixedOffset>> { &self.date }
  fn status(&self) -> &String { &self.status }
  fn period(&self) -> &Box<dyn Period> { &self.period }
  fn measure(&self) -> &String { &self.measure }
  fn subject(&self) -> &Option<Box<dyn Reference>> { &self.subject }
  fn reporter(&self) -> &Option<Box<dyn Reference>> { &self.reporter }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn evaluatedResource(&self) -> &Vector<Box<dyn Reference>> { &self.evaluatedResource }
  fn improvementNotation(&self) -> &Option<Box<dyn CodeableConcept>> { &self.improvementNotation }
  fn group(&self) -> &Vector<MeasureReport_Group> { &self.group }
}

