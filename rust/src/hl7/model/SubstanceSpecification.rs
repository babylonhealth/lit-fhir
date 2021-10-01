use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct SubstanceSpecification_Code {
  pub(crate) id?: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) status?: CodeableConcept,
  pub(crate) source?: Reference,
  pub(crate) comment?: String,
  pub(crate) extension?: Extension,
  pub(crate) statusDate?: Date,
  pub(crate) modifierExtension?: Extension,
}


pub struct SubstanceSpecification_Moiety {
  pub(crate) id?: String,
  pub(crate) role?: CodeableConcept,
  pub(crate) name?: String,
  pub(crate) extension?: Extension,
  pub(crate) amount?: Quantity | String,
  pub(crate) identifier?: Identifier,
  pub(crate) stereochemistry?: CodeableConcept,
  pub(crate) opticalActivity?: CodeableConcept,
  pub(crate) molecularFormula?: String,
  pub(crate) modifierExtension?: Extension,
}


pub struct SubstanceSpecification_Property {
  pub(crate) id?: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) category?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) amount?: Quantity | String,
  pub(crate) parameters?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) definingSubstance?: CodeableConcept | Reference,
}


pub struct SubstanceSpecification_Name_Official {
  pub(crate) id?: String,
  pub(crate) date?: Date,
  pub(crate) status?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) authority?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
}

pub struct SubstanceSpecification_Name {
  pub(crate) id?: String,
  pub(crate) name: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) status?: CodeableConcept,
  pub(crate) domain?: CodeableConcept,
  pub(crate) source?: Reference,
  pub(crate) synonym?: SubstanceSpecification_Name,
  pub(crate) language?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) preferred?: Boolean,
  pub(crate) translation?: SubstanceSpecification_Name,
  pub(crate) jurisdiction?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
  pub(crate) official?: SubstanceSpecification_Name_Official,
}


pub struct SubstanceSpecification_Relationship {
  pub(crate) id?: String,
  pub(crate) source?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) amount?: Quantity | Range | Ratio | String,
  pub(crate) isDefining?: Boolean,
  pub(crate) amountType?: CodeableConcept,
  pub(crate) substance?: CodeableConcept | Reference,
  pub(crate) relationship?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
  pub(crate) amountRatioLowLimit?: Ratio,
}


pub struct SubstanceSpecification_Structure_Representation {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) attachment?: Attachment,
  pub(crate) representation?: String,
  pub(crate) modifierExtension?: Extension,
}



pub struct SubstanceSpecification_Structure_Isotope_MolecularWeight {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) method?: CodeableConcept,
  pub(crate) amount?: Quantity,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct SubstanceSpecification_Structure_Isotope {
  pub(crate) id?: String,
  pub(crate) name?: CodeableConcept,
  pub(crate) halfLife?: Quantity,
  pub(crate) extension?: Extension,
  pub(crate) identifier?: Identifier,
  pub(crate) substitution?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
  pub(crate) molecularWeight?: SubstanceSpecification_Structure_Isotope_MolecularWeight,
}

pub struct SubstanceSpecification_Structure {
  pub(crate) id?: String,
  pub(crate) source?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) stereochemistry?: CodeableConcept,
  pub(crate) opticalActivity?: CodeableConcept,
  pub(crate) molecularWeight?: SubstanceSpecification_Structure_Isotope_MolecularWeight,
  pub(crate) molecularFormula?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) molecularFormulaByMoiety?: String,
  pub(crate) representation?: SubstanceSpecification_Structure_Representation,
  pub(crate) isotope?: SubstanceSpecification_Structure_Isotope,
}

pub struct SubstanceSpecification {
  pub(crate) _type?: CodeableConcept,
  pub(crate) status?: CodeableConcept,
  pub(crate) domain?: CodeableConcept,
  pub(crate) source?: Reference,
  pub(crate) comment?: String,
  pub(crate) polymer?: Reference,
  pub(crate) protein?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) description?: String,
  pub(crate) nucleicAcid?: Reference,
  pub(crate) sourceMaterial?: Reference,
  pub(crate) molecularWeight?: SubstanceSpecification_Structure_Isotope_MolecularWeight,
  pub(crate) referenceInformation?: Reference,
  pub(crate) code?: String,
  pub(crate) moiety?: SubstanceSpecification_Moiety,
  pub(crate) property?: SubstanceSpecification_Property,
  pub(crate) name?: SubstanceSpecification_Name,
  pub(crate) relationship?: SubstanceSpecification_Relationship,
  pub(crate) structure?: SubstanceSpecification_Structure,
}