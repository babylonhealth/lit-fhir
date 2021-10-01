use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct MeasureReport_Group_Population {
  pub(crate) id?: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) count?: i32,
  pub(crate) extension?: Extension,
  pub(crate) subjectResults?: Reference,
  pub(crate) modifierExtension?: Extension,
}



pub struct MeasureReport_Group_Stratifier_Stratum_Component {
  pub(crate) id?: String,
  pub(crate) code: CodeableConcept,
  pub(crate) value: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}



pub struct MeasureReport_Group_Stratifier_Stratum_Population {
  pub(crate) id?: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) count?: i32,
  pub(crate) extension?: Extension,
  pub(crate) subjectResults?: Reference,
  pub(crate) modifierExtension?: Extension,
}

pub struct MeasureReport_Group_Stratifier_Stratum {
  pub(crate) id?: String,
  pub(crate) value?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) measureScore?: Quantity,
  pub(crate) modifierExtension?: Extension,
  pub(crate) component?: MeasureReport_Group_Stratifier_Stratum_Component,
  pub(crate) population?: MeasureReport_Group_Stratifier_Stratum_Population,
}

pub struct MeasureReport_Group_Stratifier {
  pub(crate) id?: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
  pub(crate) stratum?: MeasureReport_Group_Stratifier_Stratum,
}

pub struct MeasureReport_Group {
  pub(crate) id?: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) measureScore?: Quantity,
  pub(crate) modifierExtension?: Extension,
  pub(crate) population?: MeasureReport_Group_Population,
  pub(crate) stratifier?: MeasureReport_Group_Stratifier,
}

pub struct MeasureReport {
  pub(crate) _type: String,
  pub(crate) date?: Date,
  pub(crate) status: String,
  pub(crate) period: Period,
  pub(crate) measure: String,
  pub(crate) subject?: Reference,
  pub(crate) reporter?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) evaluatedResource?: Reference,
  pub(crate) improvementNotation?: CodeableConcept,
  pub(crate) group?: MeasureReport_Group,
}