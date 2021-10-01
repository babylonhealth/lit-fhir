use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Measure_SupplementalData {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) usage: Vector<CodeableConcept>,
  pub(crate) criteria: Expression,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Measure_Group_Population {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) criteria: Expression,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct Measure_Group_Stratifier_Component {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) criteria: Expression,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Measure_Group_Stratifier {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) criteria: Option<Expression>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) component: Vector<Measure_Group_Stratifier_Component>,
}

#[derive(Clone, Debug)]
pub struct Measure_Group {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) population: Vector<Measure_Group_Population>,
  pub(crate) stratifier: Vector<Measure_Group_Stratifier>,
}

#[derive(Clone, Debug)]
pub struct Measure {
  pub(crate) url: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) date: Option<Date>,
  pub(crate) _type: Vector<CodeableConcept>,
  pub(crate) title: Option<String>,
  pub(crate) usage: Option<String>,
  pub(crate) topic: Vector<CodeableConcept>,
  pub(crate) status: String,
  pub(crate) author: Vector<ContactDetail>,
  pub(crate) editor: Vector<ContactDetail>,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) purpose: Option<String>,
  pub(crate) library: Vector<String>,
  pub(crate) scoring: Option<CodeableConcept>,
  pub(crate) subtitle: Option<String>,
  pub(crate) reviewer: Vector<ContactDetail>,
  pub(crate) endorser: Vector<ContactDetail>,
  pub(crate) guidance: Option<String>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) rationale: Option<String>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) subject: Option<CodeableConcept | Reference>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) disclaimer: Option<String>,
  pub(crate) definition: Vector<String>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<Boolean>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) approvalDate: Option<FHIRDate>,
  pub(crate) lastReviewDate: Option<FHIRDate>,
  pub(crate) riskAdjustment: Option<String>,
  pub(crate) effectivePeriod: Option<Period>,
  pub(crate) relatedArtifact: Vector<RelatedArtifact>,
  pub(crate) rateAggregation: Option<String>,
  pub(crate) compositeScoring: Option<CodeableConcept>,
  pub(crate) improvementNotation: Option<CodeableConcept>,
  pub(crate) clinicalRecommendationStatement: Option<String>,
  pub(crate) supplementalData: Vector<Measure_SupplementalData>,
  pub(crate) group: Vector<Measure_Group>,
}