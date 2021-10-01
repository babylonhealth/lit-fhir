use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct MedicinalProductAuthorization_Procedure {
  pub(crate) id?: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) date?: Date | Period,
  pub(crate) extension?: Extension,
  pub(crate) identifier?: Identifier,
  pub(crate) application?: MedicinalProductAuthorization_Procedure,
  pub(crate) modifierExtension?: Extension,
}


pub struct MedicinalProductAuthorization_JurisdictionalAuthorization {
  pub(crate) id?: String,
  pub(crate) country?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) identifier?: Identifier,
  pub(crate) jurisdiction?: CodeableConcept,
  pub(crate) validityPeriod?: Period,
  pub(crate) modifierExtension?: Extension,
  pub(crate) legalStatusOfSupply?: CodeableConcept,
}

pub struct MedicinalProductAuthorization {
  pub(crate) status?: CodeableConcept,
  pub(crate) holder?: Reference,
  pub(crate) subject?: Reference,
  pub(crate) country?: CodeableConcept,
  pub(crate) regulator?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) statusDate?: Date,
  pub(crate) legalBasis?: CodeableConcept,
  pub(crate) restoreDate?: Date,
  pub(crate) jurisdiction?: CodeableConcept,
  pub(crate) validityPeriod?: Period,
  pub(crate) dataExclusivityPeriod?: Period,
  pub(crate) internationalBirthDate?: Date,
  pub(crate) dateOfFirstAuthorization?: Date,
  pub(crate) procedure?: MedicinalProductAuthorization_Procedure,
  pub(crate) jurisdictionalAuthorization?: MedicinalProductAuthorization_JurisdictionalAuthorization,
}