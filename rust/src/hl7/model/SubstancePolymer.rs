use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Attachment::Attachment;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Meta::Meta;
use crate::core::model::Resource::Resource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct SubstancePolymer_MonomerSet_StartingMaterial {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) amount: Option<any>,
  pub(crate) material: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) isDefining: Option<bool>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct SubstancePolymer_MonomerSet {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) ratioType: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) startingMaterial: Vector<SubstancePolymer_MonomerSet_StartingMaterial>,
}


#[derive(Clone, Debug)]
pub struct SubstancePolymer_Repeat_RepeatUnit_DegreeOfPolymerisation {
  pub(crate) id: Option<String>,
  pub(crate) degree: Option<CodeableConcept>,
  pub(crate) amount: Option<any>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct SubstancePolymer_Repeat_RepeatUnit_StructuralRepresentation {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) attachment: Option<Attachment>,
  pub(crate) representation: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct SubstancePolymer_Repeat_RepeatUnit {
  pub(crate) id: Option<String>,
  pub(crate) amount: Option<any>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) repeatUnit: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) orientationOfPolymerisation: Option<CodeableConcept>,
  pub(crate) degreeOfPolymerisation: Vector<SubstancePolymer_Repeat_RepeatUnit_DegreeOfPolymerisation>,
  pub(crate) structuralRepresentation: Vector<SubstancePolymer_Repeat_RepeatUnit_StructuralRepresentation>,
}

#[derive(Clone, Debug)]
pub struct SubstancePolymer_Repeat {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) numberOfUnits: Option<i32>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) repeatUnitAmountType: Option<CodeableConcept>,
  pub(crate) averageMolecularFormula: Option<String>,
  pub(crate) repeatUnit: Vector<SubstancePolymer_Repeat_RepeatUnit>,
}

#[derive(Clone, Debug)]
pub struct SubstancePolymer {
  pub(crate) class: Option<CodeableConcept>,
  pub(crate) geometry: Option<CodeableConcept>,
  pub(crate) modification: Vector<String>,
  pub(crate) copolymerConnectivity: Vector<CodeableConcept>,
  pub(crate) monomerSet: Vector<SubstancePolymer_MonomerSet>,
  pub(crate) repeat: Vector<SubstancePolymer_Repeat>,
}