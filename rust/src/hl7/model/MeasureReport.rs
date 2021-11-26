use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct MeasureReport_Group_Population {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) count: Option<i32>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) subjectResults: Option<Box<Reference>>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct MeasureReport_Group_Stratifier_Stratum_Component {
  pub(crate) id: Option<String>,
  pub(crate) code: CodeableConcept,
  pub(crate) value: CodeableConcept,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct MeasureReport_Group_Stratifier_Stratum_Population {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) count: Option<i32>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) subjectResults: Option<Box<Reference>>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct MeasureReport_Group_Stratifier_Stratum {
  pub(crate) id: Option<String>,
  pub(crate) value: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) measureScore: Option<Quantity>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) component: Vector<MeasureReport_Group_Stratifier_Stratum_Component>,
  pub(crate) population: Vector<MeasureReport_Group_Stratifier_Stratum_Population>,
}

#[derive(Clone, Debug)]
pub struct MeasureReport_Group_Stratifier {
  pub(crate) id: Option<String>,
  pub(crate) code: Vector<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) stratum: Vector<MeasureReport_Group_Stratifier_Stratum>,
}

#[derive(Clone, Debug)]
pub struct MeasureReport_Group {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) measureScore: Option<Quantity>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) population: Vector<MeasureReport_Group_Population>,
  pub(crate) stratifier: Vector<MeasureReport_Group_Stratifier>,
}

#[derive(Clone, Debug)]
pub struct MeasureReport {
  pub(crate) _type: String,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) status: String,
  pub(crate) period: Period,
  pub(crate) measure: String,
  pub(crate) subject: Option<Box<Reference>>,
  pub(crate) reporter: Option<Box<Reference>>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) evaluatedResource: Vector<Reference>,
  pub(crate) improvementNotation: Option<CodeableConcept>,
  pub(crate) group: Vector<MeasureReport_Group>,
}