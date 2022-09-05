use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Attachment::Attachment;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Meta::Meta;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct SubstancePolymer_MonomerSet_StartingMaterial {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) amount: Option<String>,
  pub(crate) material: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) isDefining: Option<bool>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct SubstancePolymer_MonomerSet {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) ratioType: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) startingMaterial: Vector<Box<SubstancePolymer_MonomerSet_StartingMaterial>>,
}


#[derive(Clone, Debug)]
pub struct SubstancePolymer_Repeat_RepeatUnit_DegreeOfPolymerisation {
  pub(crate) id: Option<String>,
  pub(crate) degree: Option<Box<dyn CodeableConcept>>,
  pub(crate) amount: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct SubstancePolymer_Repeat_RepeatUnit_StructuralRepresentation {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) attachment: Option<Box<dyn Attachment>>,
  pub(crate) representation: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct SubstancePolymer_Repeat_RepeatUnit {
  pub(crate) id: Option<String>,
  pub(crate) amount: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) repeatUnit: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) orientationOfPolymerisation: Option<Box<dyn CodeableConcept>>,
  pub(crate) degreeOfPolymerisation: Vector<Box<SubstancePolymer_Repeat_RepeatUnit_DegreeOfPolymerisation>>,
  pub(crate) structuralRepresentation: Vector<Box<SubstancePolymer_Repeat_RepeatUnit_StructuralRepresentation>>,
}

#[derive(Clone, Debug)]
pub struct SubstancePolymer_Repeat {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) numberOfUnits: Option<i32>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) repeatUnitAmountType: Option<Box<dyn CodeableConcept>>,
  pub(crate) averageMolecularFormula: Option<String>,
  pub(crate) repeatUnit: Vector<Box<SubstancePolymer_Repeat_RepeatUnit>>,
}

#[derive(Clone, Debug)]
pub struct SubstancePolymerRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) class: Option<Box<dyn CodeableConcept>>,
  pub(crate) language: Option<String>,
  pub(crate) geometry: Option<Box<dyn CodeableConcept>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modification: Vector<String>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) copolymerConnectivity: Vector<Box<dyn CodeableConcept>>,
  pub(crate) monomerSet: Vector<Box<SubstancePolymer_MonomerSet>>,
  pub(crate) repeat: Vector<Box<SubstancePolymer_Repeat>>,
}

pub trait SubstancePolymer : DomainResource {
  fn class(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn geometry(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn modification(&self) -> &Vector<String>;
  fn copolymerConnectivity(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn monomerSet(&self) -> &Vector<Box<SubstancePolymer_MonomerSet>>;
  fn repeat(&self) -> &Vector<Box<SubstancePolymer_Repeat>>;
}

dyn_clone::clone_trait_object!(SubstancePolymer);

impl FHIRObject for SubstancePolymerRaw {
}

impl Resource for SubstancePolymerRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for SubstancePolymerRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl SubstancePolymer for SubstancePolymerRaw {
  fn class(&self) -> &Option<Box<dyn CodeableConcept>> { &self.class }
  fn geometry(&self) -> &Option<Box<dyn CodeableConcept>> { &self.geometry }
  fn modification(&self) -> &Vector<String> { &self.modification }
  fn copolymerConnectivity(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.copolymerConnectivity }
  fn monomerSet(&self) -> &Vector<Box<SubstancePolymer_MonomerSet>> { &self.monomerSet }
  fn repeat(&self) -> &Vector<Box<SubstancePolymer_Repeat>> { &self.repeat }
}

