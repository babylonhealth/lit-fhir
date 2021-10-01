use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct MeasureReport_Group_Population {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) count: Option<i32>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) subjectResults: Option<Reference>,
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
  pub(crate) subjectResults: Option<Reference>,
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
  pub(crate) date: Option<Date>,
  pub(crate) status: String,
  pub(crate) period: Period,
  pub(crate) measure: String,
  pub(crate) subject: Option<Reference>,
  pub(crate) reporter: Option<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) evaluatedResource: Vector<Reference>,
  pub(crate) improvementNotation: Option<CodeableConcept>,
  pub(crate) group: Vector<MeasureReport_Group>,
}