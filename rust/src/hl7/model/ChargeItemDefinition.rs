use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct ChargeItemDefinition_Applicability {
  pub(crate) id?: String,
  pub(crate) language?: String,
  pub(crate) extension?: Extension,
  pub(crate) expression?: String,
  pub(crate) description?: String,
  pub(crate) modifierExtension?: Extension,
}


pub struct ChargeItemDefinition_PropertyGroup_PriceComponent {
  pub(crate) id?: String,
  pub(crate) _type: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) factor?: BigDecimal,
  pub(crate) amount?: Money,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct ChargeItemDefinition_PropertyGroup {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) applicability?: ChargeItemDefinition_Applicability,
  pub(crate) modifierExtension?: Extension,
  pub(crate) priceComponent?: ChargeItemDefinition_PropertyGroup_PriceComponent,
}

pub struct ChargeItemDefinition {
  pub(crate) url: String,
  pub(crate) date?: Date,
  pub(crate) code?: CodeableConcept,
  pub(crate) title?: String,
  pub(crate) partOf?: String,
  pub(crate) status: String,
  pub(crate) version?: String,
  pub(crate) contact?: ContactDetail,
  pub(crate) replaces?: String,
  pub(crate) instance?: Reference,
  pub(crate) publisher?: String,
  pub(crate) copyright?: String,
  pub(crate) identifier?: Identifier,
  pub(crate) useContext?: UsageContext,
  pub(crate) description?: String,
  pub(crate) experimental?: Boolean,
  pub(crate) jurisdiction?: CodeableConcept,
  pub(crate) approvalDate?: FHIRDate,
  pub(crate) derivedFromUri?: String,
  pub(crate) lastReviewDate?: FHIRDate,
  pub(crate) effectivePeriod?: Period,
  pub(crate) applicability?: ChargeItemDefinition_Applicability,
  pub(crate) propertyGroup?: ChargeItemDefinition_PropertyGroup,
}