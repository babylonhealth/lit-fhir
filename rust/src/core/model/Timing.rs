use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::BackboneElement::BackboneElement;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::FHIRElement::FHIRElement;
use crate::core::model::UnionAliases::UnionDurationOrPeriodOrRange;



#[derive(Clone, Debug)]
pub struct Timing_Repeat {
  pub(crate) id: Option<String>,
  pub(crate) when: Vector<String>,
  pub(crate) count: Option<u32>,
  pub(crate) period: Option<BigDecimal>,
  pub(crate) offset: Option<u32>,
  pub(crate) countMax: Option<u32>,
  pub(crate) duration: Option<BigDecimal>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) bounds: Option<UnionDurationOrPeriodOrRange>,
  pub(crate) frequency: Option<u32>,
  pub(crate) periodMax: Option<BigDecimal>,
  pub(crate) dayOfWeek: Vector<String>,
  pub(crate) timeOfDay: Vector<LocalTime>,
  pub(crate) periodUnit: Option<String>,
  pub(crate) durationMax: Option<BigDecimal>,
  pub(crate) durationUnit: Option<String>,
  pub(crate) frequencyMax: Option<u32>,
}

#[derive(Clone, Debug)]
pub struct TimingRaw {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) event: Vector<DateTime<FixedOffset>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) repeat: Option<Box<Timing_Repeat>>,
}

pub trait Timing : BackboneElement {
  fn code(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn event(&self) -> &Vector<DateTime<FixedOffset>>;
  fn repeat(&self) -> Option<&Box<Timing_Repeat>>;
}

dyn_clone::clone_trait_object!(Timing);

impl FHIRObject for TimingRaw {
}

impl FHIRElement for TimingRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl BackboneElement for TimingRaw {
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Timing for TimingRaw {
  fn code(&self) -> Option<&Box<dyn CodeableConcept>> { self.code.as_ref() }
  fn event(&self) -> &Vector<DateTime<FixedOffset>> { &self.event }
  fn repeat(&self) -> Option<&Box<Timing_Repeat>> { self.repeat.as_ref() }
}

