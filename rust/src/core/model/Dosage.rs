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
use crate::core::model::Quantity::Quantity;
use crate::core::model::Ratio::Ratio;
use crate::core::model::Timing::Timing;
use crate::core::model::UnionAliases::UnionBooleanOrCodeableConcept;
use crate::core::model::UnionAliases::UnionQuantityOrRange;
use crate::core::model::UnionAliases::UnionQuantityOrRangeOrRatio;



#[derive(Clone, Debug)]
pub struct Dosage_DoseAndRate {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) dose: Option<UnionQuantityOrRange>,
  pub(crate) rate: Option<UnionQuantityOrRangeOrRatio>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct DosageRaw {
  pub(crate) id: Option<String>,
  pub(crate) text: Option<String>,
  pub(crate) site: Option<Box<dyn CodeableConcept>>,
  pub(crate) route: Option<Box<dyn CodeableConcept>>,
  pub(crate) timing: Option<Box<dyn Timing>>,
  pub(crate) method: Option<Box<dyn CodeableConcept>>,
  pub(crate) sequence: Option<i32>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) asNeeded: Option<UnionBooleanOrCodeableConcept>,
  pub(crate) maxDosePerPeriod: Option<Box<dyn Ratio>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) patientInstruction: Option<String>,
  pub(crate) maxDosePerLifetime: Option<Box<dyn Quantity>>,
  pub(crate) additionalInstruction: Vector<Box<dyn CodeableConcept>>,
  pub(crate) doseAndRate: Vector<Box<Dosage_DoseAndRate>>,
  pub(crate) maxDosePerAdministration: Option<Box<dyn Quantity>>,
}

pub trait Dosage : BackboneElement {
  fn text(&self) -> Option<&String>;
  fn site(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn route(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn timing(&self) -> Option<&Box<dyn Timing>>;
  fn method(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn sequence(&self) -> Option<&i32>;
  fn asNeeded(&self) -> Option<&UnionBooleanOrCodeableConcept>;
  fn maxDosePerPeriod(&self) -> Option<&Box<dyn Ratio>>;
  fn patientInstruction(&self) -> Option<&String>;
  fn maxDosePerLifetime(&self) -> Option<&Box<dyn Quantity>>;
  fn additionalInstruction(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn doseAndRate(&self) -> &Vector<Box<Dosage_DoseAndRate>>;
  fn maxDosePerAdministration(&self) -> Option<&Box<dyn Quantity>>;
}

dyn_clone::clone_trait_object!(Dosage);

impl FHIRObject for DosageRaw {
}

impl FHIRElement for DosageRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl BackboneElement for DosageRaw {
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Dosage for DosageRaw {
  fn text(&self) -> Option<&String> { self.text.as_ref() }
  fn site(&self) -> Option<&Box<dyn CodeableConcept>> { self.site.as_ref() }
  fn route(&self) -> Option<&Box<dyn CodeableConcept>> { self.route.as_ref() }
  fn timing(&self) -> Option<&Box<dyn Timing>> { self.timing.as_ref() }
  fn method(&self) -> Option<&Box<dyn CodeableConcept>> { self.method.as_ref() }
  fn sequence(&self) -> Option<&i32> { self.sequence.as_ref() }
  fn asNeeded(&self) -> Option<&UnionBooleanOrCodeableConcept> { self.asNeeded.as_ref() }
  fn maxDosePerPeriod(&self) -> Option<&Box<dyn Ratio>> { self.maxDosePerPeriod.as_ref() }
  fn patientInstruction(&self) -> Option<&String> { self.patientInstruction.as_ref() }
  fn maxDosePerLifetime(&self) -> Option<&Box<dyn Quantity>> { self.maxDosePerLifetime.as_ref() }
  fn additionalInstruction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.additionalInstruction }
  fn doseAndRate(&self) -> &Vector<Box<Dosage_DoseAndRate>> { &self.doseAndRate }
  fn maxDosePerAdministration(&self) -> Option<&Box<dyn Quantity>> { self.maxDosePerAdministration.as_ref() }
}

