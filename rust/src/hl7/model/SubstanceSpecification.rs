use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::UnionCodeableConceptOrReference;
use crate::core::model::Attachment::Attachment;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Ratio::Ratio;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::SubstanceSpecification_Name::SubstanceSpecification_Name;
use crate::core::model::SubstanceSpecification_Structure_Isotope_MolecularWeight::SubstanceSpecification_Structure_Isotope_MolecularWeight;
use crate::hl7::Union00133982841;
use crate::hl7::UnionQuantityOrString;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct SubstanceSpecification_Code {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) status: Option<CodeableConcept>,
  pub(crate) source: Vector<Reference>,
  pub(crate) comment: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) statusDate: Option<DateTime<FixedOffset>>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct SubstanceSpecification_Moiety {
  pub(crate) id: Option<String>,
  pub(crate) role: Option<CodeableConcept>,
  pub(crate) name: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) amount: Option<UnionQuantityOrString>,
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
  pub(crate) amount: Option<UnionQuantityOrString>,
  pub(crate) parameters: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) definingSubstance: Option<UnionCodeableConceptOrReference>,
}


#[derive(Clone, Debug)]
pub struct SubstanceSpecification_Name_Official {
  pub(crate) id: Option<String>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
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
  pub(crate) preferred: Option<bool>,
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
  pub(crate) amount: Option<Union00133982841>,
  pub(crate) isDefining: Option<bool>,
  pub(crate) amountType: Option<CodeableConcept>,
  pub(crate) substance: Option<UnionCodeableConceptOrReference>,
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
  pub(crate) polymer: Option<Box<Reference>>,
  pub(crate) protein: Option<Box<Reference>>,
  pub(crate) identifier: Option<Identifier>,
  pub(crate) description: Option<String>,
  pub(crate) nucleicAcid: Option<Box<Reference>>,
  pub(crate) sourceMaterial: Option<Box<Reference>>,
  pub(crate) molecularWeight: Vector<SubstanceSpecification_Structure_Isotope_MolecularWeight>,
  pub(crate) referenceInformation: Option<Box<Reference>>,
  pub(crate) code: Vector<String>,
  pub(crate) moiety: Vector<SubstanceSpecification_Moiety>,
  pub(crate) property: Vector<SubstanceSpecification_Property>,
  pub(crate) name: Vector<SubstanceSpecification_Name>,
  pub(crate) relationship: Vector<SubstanceSpecification_Relationship>,
  pub(crate) structure: Option<SubstanceSpecification_Structure>,
}