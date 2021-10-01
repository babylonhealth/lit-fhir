use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct MedicinalProduct_SpecialDesignation {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) date?: Date,
  pub(crate) status?: CodeableConcept,
  pub(crate) species?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) identifier?: Identifier,
  pub(crate) intendedUse?: CodeableConcept,
  pub(crate) indication?: CodeableConcept | Reference,
  pub(crate) modifierExtension?: Extension,
}


pub struct MedicinalProduct_Name_NamePart {
  pub(crate) id?: String,
  pub(crate) part: String,
  pub(crate) _type: Coding,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}



pub struct MedicinalProduct_Name_CountryLanguage {
  pub(crate) id?: String,
  pub(crate) country: CodeableConcept,
  pub(crate) language: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) jurisdiction?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
}

pub struct MedicinalProduct_Name {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) productName: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) namePart?: MedicinalProduct_Name_NamePart,
  pub(crate) countryLanguage?: MedicinalProduct_Name_CountryLanguage,
}


pub struct MedicinalProduct_ManufacturingBusinessOperation {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) regulator?: Reference,
  pub(crate) manufacturer?: Reference,
  pub(crate) operationType?: CodeableConcept,
  pub(crate) effectiveDate?: Date,
  pub(crate) modifierExtension?: Extension,
  pub(crate) confidentialityIndicator?: CodeableConcept,
  pub(crate) authorisationReferenceNumber?: Identifier,
}

pub struct MedicinalProduct {
  pub(crate) _type?: CodeableConcept,
  pub(crate) domain?: Coding,
  pub(crate) contact?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) masterFile?: Reference,
  pub(crate) clinicalTrial?: Reference,
  pub(crate) crossReference?: Identifier,
  pub(crate) specialMeasures?: String,
  pub(crate) marketingStatus?: any,
  pub(crate) attachedDocument?: Reference,
  pub(crate) legalStatusOfSupply?: CodeableConcept,
  pub(crate) productClassification?: CodeableConcept,
  pub(crate) pharmaceuticalProduct?: Reference,
  pub(crate) paediatricUseIndicator?: CodeableConcept,
  pub(crate) packagedMedicinalProduct?: Reference,
  pub(crate) additionalMonitoringIndicator?: CodeableConcept,
  pub(crate) combinedPharmaceuticalDoseForm?: CodeableConcept,
  pub(crate) specialDesignation?: MedicinalProduct_SpecialDesignation,
  pub(crate) name: MedicinalProduct_Name,
  pub(crate) manufacturingBusinessOperation?: MedicinalProduct_ManufacturingBusinessOperation,
}