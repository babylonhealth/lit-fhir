use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Measure_SupplementalData {
  pub(crate) id?: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) usage?: CodeableConcept,
  pub(crate) criteria: Expression,
  pub(crate) extension?: Extension,
  pub(crate) description?: String,
  pub(crate) modifierExtension?: Extension,
}


pub struct Measure_Group_Population {
  pub(crate) id?: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) criteria: Expression,
  pub(crate) extension?: Extension,
  pub(crate) description?: String,
  pub(crate) modifierExtension?: Extension,
}



pub struct Measure_Group_Stratifier_Component {
  pub(crate) id?: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) criteria: Expression,
  pub(crate) extension?: Extension,
  pub(crate) description?: String,
  pub(crate) modifierExtension?: Extension,
}

pub struct Measure_Group_Stratifier {
  pub(crate) id?: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) criteria?: Expression,
  pub(crate) extension?: Extension,
  pub(crate) description?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) component?: Measure_Group_Stratifier_Component,
}

pub struct Measure_Group {
  pub(crate) id?: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) description?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) population?: Measure_Group_Population,
  pub(crate) stratifier?: Measure_Group_Stratifier,
}

pub struct Measure {
  pub(crate) url?: String,
  pub(crate) name?: String,
  pub(crate) date?: Date,
  pub(crate) _type?: CodeableConcept,
  pub(crate) title?: String,
  pub(crate) usage?: String,
  pub(crate) topic?: CodeableConcept,
  pub(crate) status: String,
  pub(crate) author?: ContactDetail,
  pub(crate) editor?: ContactDetail,
  pub(crate) version?: String,
  pub(crate) contact?: ContactDetail,
  pub(crate) purpose?: String,
  pub(crate) library?: String,
  pub(crate) scoring?: CodeableConcept,
  pub(crate) subtitle?: String,
  pub(crate) reviewer?: ContactDetail,
  pub(crate) endorser?: ContactDetail,
  pub(crate) guidance?: String,
  pub(crate) publisher?: String,
  pub(crate) copyright?: String,
  pub(crate) rationale?: String,
  pub(crate) identifier?: Identifier,
  pub(crate) subject?: CodeableConcept | Reference,
  pub(crate) useContext?: UsageContext,
  pub(crate) disclaimer?: String,
  pub(crate) definition?: String,
  pub(crate) description?: String,
  pub(crate) experimental?: Boolean,
  pub(crate) jurisdiction?: CodeableConcept,
  pub(crate) approvalDate?: FHIRDate,
  pub(crate) lastReviewDate?: FHIRDate,
  pub(crate) riskAdjustment?: String,
  pub(crate) effectivePeriod?: Period,
  pub(crate) relatedArtifact?: RelatedArtifact,
  pub(crate) rateAggregation?: String,
  pub(crate) compositeScoring?: CodeableConcept,
  pub(crate) improvementNotation?: CodeableConcept,
  pub(crate) clinicalRecommendationStatement?: String,
  pub(crate) supplementalData?: Measure_SupplementalData,
  pub(crate) group?: Measure_Group,
}