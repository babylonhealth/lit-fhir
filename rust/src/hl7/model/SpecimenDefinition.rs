use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct SpecimenDefinition_TypeTested_Handling {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) maxDuration?: Duration,
  pub(crate) instruction?: String,
  pub(crate) temperatureRange?: Range,
  pub(crate) modifierExtension?: Extension,
  pub(crate) temperatureQualifier?: CodeableConcept,
}



pub struct SpecimenDefinition_TypeTested_Container_Additive {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) additive: CodeableConcept | Reference,
  pub(crate) modifierExtension?: Extension,
}

pub struct SpecimenDefinition_TypeTested_Container {
  pub(crate) id?: String,
  pub(crate) cap?: CodeableConcept,
  pub(crate) _type?: CodeableConcept,
  pub(crate) material?: CodeableConcept,
  pub(crate) capacity?: Quantity,
  pub(crate) extension?: Extension,
  pub(crate) description?: String,
  pub(crate) preparation?: String,
  pub(crate) minimumVolume?: Quantity | String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) additive?: SpecimenDefinition_TypeTested_Container_Additive,
}

pub struct SpecimenDefinition_TypeTested {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) isDerived?: Boolean,
  pub(crate) preference: String,
  pub(crate) requirement?: String,
  pub(crate) retentionTime?: Duration,
  pub(crate) modifierExtension?: Extension,
  pub(crate) rejectionCriterion?: CodeableConcept,
  pub(crate) handling?: SpecimenDefinition_TypeTested_Handling,
  pub(crate) container?: SpecimenDefinition_TypeTested_Container,
}

pub struct SpecimenDefinition {
  pub(crate) identifier?: Identifier,
  pub(crate) timeAspect?: String,
  pub(crate) collection?: CodeableConcept,
  pub(crate) typeCollected?: CodeableConcept,
  pub(crate) patientPreparation?: CodeableConcept,
  pub(crate) typeTested?: SpecimenDefinition_TypeTested,
}