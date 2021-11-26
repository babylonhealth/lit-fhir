use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Observation_ReferenceRange::Observation_ReferenceRange;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Range::Range;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::Union00107722725;
use crate::hl7::Union02118820890;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct Observation_Component {
  pub(crate) id: Option<String>,
  pub(crate) code: CodeableConcept,
  pub(crate) value: Option<Union02118820890>,
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
  pub(crate) issued: Option<DateTime<FixedOffset>>,
  pub(crate) method: Option<CodeableConcept>,
  pub(crate) device: Option<Box<Reference>>,
  pub(crate) basedOn: Vector<Reference>,
  pub(crate) subject: Option<Box<Reference>>,
  pub(crate) category: Vector<CodeableConcept>,
  pub(crate) value: Option<Union02118820890>,
  pub(crate) bodySite: Option<CodeableConcept>,
  pub(crate) specimen: Option<Box<Reference>>,
  pub(crate) encounter: Option<Box<Reference>>,
  pub(crate) performer: Vector<Reference>,
  pub(crate) hasMember: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) derivedFrom: Vector<Reference>,
  pub(crate) effective: Option<Union00107722725>,
  pub(crate) interpretation: Vector<CodeableConcept>,
  pub(crate) dataAbsentReason: Option<CodeableConcept>,
  pub(crate) component: Vector<Observation_Component>,
  pub(crate) referenceRange: Vector<Observation_ReferenceRange>,
}