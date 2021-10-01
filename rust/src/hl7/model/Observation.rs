use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Observation_Component {
  pub(crate) id?: String,
  pub(crate) code: CodeableConcept,
  pub(crate) value?: Boolean | CodeableConcept | Date | i32 | Date | Period | Quantity | Range | Ratio | SampledData | String,
  pub(crate) extension?: Extension,
  pub(crate) interpretation?: CodeableConcept,
  pub(crate) referenceRange?: Observation_ReferenceRange,
  pub(crate) dataAbsentReason?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
}


pub struct Observation_ReferenceRange {
  pub(crate) id?: String,
  pub(crate) low?: Quantity,
  pub(crate) age?: Range,
  pub(crate) high?: Quantity,
  pub(crate) _type?: CodeableConcept,
  pub(crate) text?: String,
  pub(crate) extension?: Extension,
  pub(crate) appliesTo?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
}

pub struct Observation {
  pub(crate) code: CodeableConcept,
  pub(crate) note?: Annotation,
  pub(crate) focus?: Reference,
  pub(crate) partOf?: Reference,
  pub(crate) status: String,
  pub(crate) issued?: Date,
  pub(crate) method?: CodeableConcept,
  pub(crate) device?: Reference,
  pub(crate) basedOn?: Reference,
  pub(crate) subject?: Reference,
  pub(crate) category?: CodeableConcept,
  pub(crate) value?: Boolean | CodeableConcept | Date | i32 | Date | Period | Quantity | Range | Ratio | SampledData | String,
  pub(crate) bodySite?: CodeableConcept,
  pub(crate) specimen?: Reference,
  pub(crate) encounter?: Reference,
  pub(crate) performer?: Reference,
  pub(crate) hasMember?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) derivedFrom?: Reference,
  pub(crate) effective?: Date | Period | Timing | Date,
  pub(crate) interpretation?: CodeableConcept,
  pub(crate) dataAbsentReason?: CodeableConcept,
  pub(crate) component?: Observation_Component,
  pub(crate) referenceRange?: Observation_ReferenceRange,
}