use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct SubstanceSpecification_Code {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) status: Option<CodeableConcept>,
  pub(crate) source: Vector<Reference>,
  pub(crate) comment: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) statusDate: Option<Date>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct SubstanceSpecification_Moiety {
  pub(crate) id: Option<String>,
  pub(crate) role: Option<CodeableConcept>,
  pub(crate) name: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) amount: Option<Quantity | String>,
  pub(crate) identifier: Option<Identifier>,
  pub(crate) stereochemistry: Option<CodeableConcept>,
  pub(crate) opticalActivity: Option<CodeableConcept>,
  pub(crate) molecularFormula: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct SubstanceSpecification_Property {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) category: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) amount: Option<Quantity | String>,
  pub(crate) parameters: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) definingSubstance: Option<CodeableConcept | Reference>,
}


#[derive(Clone, Debug)]
pub struct SubstanceSpecification_Name_Official {
  pub(crate) id: Option<String>,
  pub(crate) date: Option<Date>,
  pub(crate) status: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) authority: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct SubstanceSpecification_Name {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) status: Option<CodeableConcept>,
  pub(crate) domain: Vector<CodeableConcept>,
  pub(crate) source: Vector<Reference>,
  pub(crate) synonym: Vector<SubstanceSpecification_Name>,
  pub(crate) language: Vector<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) preferred: Option<Boolean>,
  pub(crate) translation: Vector<SubstanceSpecification_Name>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) official: Vector<SubstanceSpecification_Name_Official>,
}


#[derive(Clone, Debug)]
pub struct SubstanceSpecification_Relationship {
  pub(crate) id: Option<String>,
  pub(crate) source: Vector<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) amount: Option<Quantity | Range | Ratio | String>,
  pub(crate) isDefining: Option<Boolean>,
  pub(crate) amountType: Option<CodeableConcept>,
  pub(crate) substance: Option<CodeableConcept | Reference>,
  pub(crate) relationship: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) amountRatioLowLimit: Option<Ratio>,
}


#[derive(Clone, Debug)]
pub struct SubstanceSpecification_Structure_Representation {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) attachment: Option<Attachment>,
  pub(crate) representation: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct SubstanceSpecification_Structure_Isotope_MolecularWeight {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) method: Option<CodeableConcept>,
  pub(crate) amount: Option<Quantity>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct SubstanceSpecification_Structure_Isotope {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<CodeableConcept>,
  pub(crate) halfLife: Option<Quantity>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) identifier: Option<Identifier>,
  pub(crate) substitution: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) molecularWeight: Option<SubstanceSpecification_Structure_Isotope_MolecularWeight>,
}

#[derive(Clone, Debug)]
pub struct SubstanceSpecification_Structure {
  pub(crate) id: Option<String>,
  pub(crate) source: Vector<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) stereochemistry: Option<CodeableConcept>,
  pub(crate) opticalActivity: Option<CodeableConcept>,
  pub(crate) molecularWeight: Option<SubstanceSpecification_Structure_Isotope_MolecularWeight>,
  pub(crate) molecularFormula: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) molecularFormulaByMoiety: Option<String>,
  pub(crate) representation: Vector<SubstanceSpecification_Structure_Representation>,
  pub(crate) isotope: Vector<SubstanceSpecification_Structure_Isotope>,
}

#[derive(Clone, Debug)]
pub struct SubstanceSpecification {
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) status: Option<CodeableConcept>,
  pub(crate) domain: Option<CodeableConcept>,
  pub(crate) source: Vector<Reference>,
  pub(crate) comment: Option<String>,
  pub(crate) polymer: Option<Reference>,
  pub(crate) protein: Option<Reference>,
  pub(crate) identifier: Option<Identifier>,
  pub(crate) description: Option<String>,
  pub(crate) nucleicAcid: Option<Reference>,
  pub(crate) sourceMaterial: Option<Reference>,
  pub(crate) molecularWeight: Vector<SubstanceSpecification_Structure_Isotope_MolecularWeight>,
  pub(crate) referenceInformation: Option<Reference>,
  pub(crate) code: Vector<String>,
  pub(crate) moiety: Vector<SubstanceSpecification_Moiety>,
  pub(crate) property: Vector<SubstanceSpecification_Property>,
  pub(crate) name: Vector<SubstanceSpecification_Name>,
  pub(crate) relationship: Vector<SubstanceSpecification_Relationship>,
  pub(crate) structure: Option<SubstanceSpecification_Structure>,
}