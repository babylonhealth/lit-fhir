use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct SubstancePolymer_MonomerSet_StartingMaterial {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) amount?: any,
  pub(crate) material?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) isDefining?: Boolean,
  pub(crate) modifierExtension?: Extension,
}

pub struct SubstancePolymer_MonomerSet {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) ratioType?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
  pub(crate) startingMaterial?: SubstancePolymer_MonomerSet_StartingMaterial,
}


pub struct SubstancePolymer_Repeat_RepeatUnit_DegreeOfPolymerisation {
  pub(crate) id?: String,
  pub(crate) degree?: CodeableConcept,
  pub(crate) amount?: any,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}



pub struct SubstancePolymer_Repeat_RepeatUnit_StructuralRepresentation {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) attachment?: Attachment,
  pub(crate) representation?: String,
  pub(crate) modifierExtension?: Extension,
}

pub struct SubstancePolymer_Repeat_RepeatUnit {
  pub(crate) id?: String,
  pub(crate) amount?: any,
  pub(crate) extension?: Extension,
  pub(crate) repeatUnit?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) orientationOfPolymerisation?: CodeableConcept,
  pub(crate) degreeOfPolymerisation?: SubstancePolymer_Repeat_RepeatUnit_DegreeOfPolymerisation,
  pub(crate) structuralRepresentation?: SubstancePolymer_Repeat_RepeatUnit_StructuralRepresentation,
}

pub struct SubstancePolymer_Repeat {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) numberOfUnits?: i32,
  pub(crate) modifierExtension?: Extension,
  pub(crate) repeatUnitAmountType?: CodeableConcept,
  pub(crate) averageMolecularFormula?: String,
  pub(crate) repeatUnit?: SubstancePolymer_Repeat_RepeatUnit,
}

pub struct SubstancePolymer {
  pub(crate) class?: CodeableConcept,
  pub(crate) geometry?: CodeableConcept,
  pub(crate) modification?: String,
  pub(crate) copolymerConnectivity?: CodeableConcept,
  pub(crate) monomerSet?: SubstancePolymer_MonomerSet,
  pub(crate) repeat?: SubstancePolymer_Repeat,
}