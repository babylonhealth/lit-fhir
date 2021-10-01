use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct ObservationDefinition_QualifiedInterval {
  pub(crate) id: Option<String>,
  pub(crate) age: Option<Range>,
  pub(crate) range: Option<Range>,
  pub(crate) gender: Option<String>,
  pub(crate) context: Option<CodeableConcept>,
  pub(crate) category: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) appliesTo: Vector<CodeableConcept>,
  pub(crate) condition: Option<String>,
  pub(crate) gestationalAge: Option<Range>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct ObservationDefinition_QuantitativeDetails {
  pub(crate) id: Option<String>,
  pub(crate) unit: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) customaryUnit: Option<CodeableConcept>,
  pub(crate) conversionFactor: Option<BigDecimal>,
  pub(crate) decimalPrecision: Option<i32>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct ObservationDefinition {
  pub(crate) code: CodeableConcept,
  pub(crate) method: Option<CodeableConcept>,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) permittedDataType: Vector<String>,
  pub(crate) validCodedValueSet: Option<Reference>,
  pub(crate) preferredReportName: Option<String>,
  pub(crate) normalCodedValueSet: Option<Reference>,
  pub(crate) abnormalCodedValueSet: Option<Reference>,
  pub(crate) criticalCodedValueSet: Option<Reference>,
  pub(crate) multipleResultsAllowed: Option<Boolean>,
  pub(crate) qualifiedInterval: Vector<ObservationDefinition_QualifiedInterval>,
  pub(crate) quantitativeDetails: Option<ObservationDefinition_QuantitativeDetails>,
}