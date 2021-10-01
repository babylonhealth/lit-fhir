use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct ChargeItemDefinition_Applicability {
  pub(crate) id: Option<String>,
  pub(crate) language: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) expression: Option<String>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct ChargeItemDefinition_PropertyGroup_PriceComponent {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) factor: Option<BigDecimal>,
  pub(crate) amount: Option<Money>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct ChargeItemDefinition_PropertyGroup {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) applicability: Vector<ChargeItemDefinition_Applicability>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) priceComponent: Vector<ChargeItemDefinition_PropertyGroup_PriceComponent>,
}

#[derive(Clone, Debug)]
pub struct ChargeItemDefinition {
  pub(crate) url: String,
  pub(crate) date: Option<Date>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) title: Option<String>,
  pub(crate) partOf: Vector<String>,
  pub(crate) status: String,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) replaces: Vector<String>,
  pub(crate) instance: Vector<Reference>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<Boolean>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) approvalDate: Option<FHIRDate>,
  pub(crate) derivedFromUri: Vector<String>,
  pub(crate) lastReviewDate: Option<FHIRDate>,
  pub(crate) effectivePeriod: Option<Period>,
  pub(crate) applicability: Vector<ChargeItemDefinition_Applicability>,
  pub(crate) propertyGroup: Vector<ChargeItemDefinition_PropertyGroup>,
}