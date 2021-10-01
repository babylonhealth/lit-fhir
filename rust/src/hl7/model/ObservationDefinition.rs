use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct ObservationDefinition_QualifiedInterval {
  pub(crate) id?: String,
  pub(crate) age?: Range,
  pub(crate) range?: Range,
  pub(crate) gender?: String,
  pub(crate) context?: CodeableConcept,
  pub(crate) category?: String,
  pub(crate) extension?: Extension,
  pub(crate) appliesTo?: CodeableConcept,
  pub(crate) condition?: String,
  pub(crate) gestationalAge?: Range,
  pub(crate) modifierExtension?: Extension,
}


pub struct ObservationDefinition_QuantitativeDetails {
  pub(crate) id?: String,
  pub(crate) unit?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) customaryUnit?: CodeableConcept,
  pub(crate) conversionFactor?: BigDecimal,
  pub(crate) decimalPrecision?: i32,
  pub(crate) modifierExtension?: Extension,
}

pub struct ObservationDefinition {
  pub(crate) code: CodeableConcept,
  pub(crate) method?: CodeableConcept,
  pub(crate) category?: CodeableConcept,
  pub(crate) identifier?: Identifier,
  pub(crate) permittedDataType?: String,
  pub(crate) validCodedValueSet?: Reference,
  pub(crate) preferredReportName?: String,
  pub(crate) normalCodedValueSet?: Reference,
  pub(crate) abnormalCodedValueSet?: Reference,
  pub(crate) criticalCodedValueSet?: Reference,
  pub(crate) multipleResultsAllowed?: Boolean,
  pub(crate) qualifiedInterval?: ObservationDefinition_QualifiedInterval,
  pub(crate) quantitativeDetails?: ObservationDefinition_QuantitativeDetails,
}