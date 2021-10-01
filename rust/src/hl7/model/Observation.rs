use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Observation_Component {
  pub(crate) id: Option<String>,
  pub(crate) code: CodeableConcept,
  pub(crate) value: Option<Boolean | CodeableConcept | Date | i32 | Date | Period | Quantity | Range | Ratio | SampledData | String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) interpretation: Vector<CodeableConcept>,
  pub(crate) referenceRange: Vector<Observation_ReferenceRange>,
  pub(crate) dataAbsentReason: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Observation_ReferenceRange {
  pub(crate) id: Option<String>,
  pub(crate) low: Option<Quantity>,
  pub(crate) age: Option<Range>,
  pub(crate) high: Option<Quantity>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) text: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) appliesTo: Vector<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Observation {
  pub(crate) code: CodeableConcept,
  pub(crate) note: Vector<Annotation>,
  pub(crate) focus: Vector<Reference>,
  pub(crate) partOf: Vector<Reference>,
  pub(crate) status: String,
  pub(crate) issued: Option<Date>,
  pub(crate) method: Option<CodeableConcept>,
  pub(crate) device: Option<Reference>,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) subject: Option<Reference>,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) value: Option<Boolean | CodeableConcept | Date | i32 | Date | Period | Quantity | Range | Ratio | SampledData | String>,
  pub(crate) bodySite: Option<CodeableConcept>,
  pub(crate) specimen: Option<Reference>,
  pub(crate) encounter: Option<Reference>,
  pub(crate) performer: Vector<Reference>,
  pub(crate) hasMember: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) derivedFrom: Vector<Reference>,
  pub(crate) effective: Option<Date | Period | Timing | Date>,
  pub(crate) interpretation: Vector<CodeableConcept>,
  pub(crate) dataAbsentReason: Option<CodeableConcept>,
  pub(crate) component: Vector<Observation_Component>,
  pub(crate) referenceRange: Vector<Observation_ReferenceRange>,
}