use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::UnionCodeableConceptOrReference;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Duration::Duration;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Range::Range;
use crate::core::model::Resource::Resource;
use crate::hl7::UnionQuantityOrString;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct SpecimenDefinition_TypeTested_Handling {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) maxDuration: Option<Duration>,
  pub(crate) instruction: Option<String>,
  pub(crate) temperatureRange: Option<Range>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) temperatureQualifier: Option<CodeableConcept>,
}



#[derive(Clone, Debug)]
pub struct SpecimenDefinition_TypeTested_Container_Additive {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) additive: UnionCodeableConceptOrReference,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct SpecimenDefinition_TypeTested_Container {
  pub(crate) id: Option<String>,
  pub(crate) cap: Option<CodeableConcept>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) material: Option<CodeableConcept>,
  pub(crate) capacity: Option<Quantity>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Option<String>,
  pub(crate) preparation: Option<String>,
  pub(crate) minimumVolume: Option<UnionQuantityOrString>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) additive: Vector<SpecimenDefinition_TypeTested_Container_Additive>,
}

#[derive(Clone, Debug)]
pub struct SpecimenDefinition_TypeTested {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) isDerived: Option<bool>,
  pub(crate) preference: String,
  pub(crate) requirement: Option<String>,
  pub(crate) retentionTime: Option<Duration>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) rejectionCriterion: Vector<CodeableConcept>,
  pub(crate) handling: Vector<SpecimenDefinition_TypeTested_Handling>,
  pub(crate) container: Option<SpecimenDefinition_TypeTested_Container>,
}

#[derive(Clone, Debug)]
pub struct SpecimenDefinition {
  pub(crate) identifier: Option<Identifier>,
  pub(crate) timeAspect: Option<String>,
  pub(crate) collection: Vector<CodeableConcept>,
  pub(crate) typeCollected: Option<CodeableConcept>,
  pub(crate) patientPreparation: Vector<CodeableConcept>,
  pub(crate) typeTested: Vector<SpecimenDefinition_TypeTested>,
}