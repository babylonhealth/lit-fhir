use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Address::Address;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactPoint::ContactPoint;
use crate::core::model::Extension::Extension;
use crate::core::model::HumanName::HumanName;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Money::Money;
use crate::core::model::Period::Period;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct InsurancePlan_Contact {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<HumanName>,
  pub(crate) purpose: Option<CodeableConcept>,
  pub(crate) telecom: Vector<ContactPoint>,
  pub(crate) address: Option<Address>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct InsurancePlan_Coverage_Benefit_Limit {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) value: Option<Quantity>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct InsurancePlan_Coverage_Benefit {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) extension: Vector<Extension>,
  pub(crate) requirement: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) limit: Vector<InsurancePlan_Coverage_Benefit_Limit>,
}

#[derive(Clone, Debug)]
pub struct InsurancePlan_Coverage {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) network: Vector<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) benefit: Vector<InsurancePlan_Coverage_Benefit>,
}


#[derive(Clone, Debug)]
pub struct InsurancePlan_Plan_GeneralCost {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) cost: Option<Money>,
  pub(crate) comment: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) groupSize: Option<u32>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct InsurancePlan_Plan_SpecificCost_Benefit_Cost {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) value: Option<Quantity>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) qualifiers: Vector<CodeableConcept>,
  pub(crate) applicability: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct InsurancePlan_Plan_SpecificCost_Benefit {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) cost: Vector<InsurancePlan_Plan_SpecificCost_Benefit_Cost>,
}

#[derive(Clone, Debug)]
pub struct InsurancePlan_Plan_SpecificCost {
  pub(crate) id: Option<String>,
  pub(crate) category: CodeableConcept,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) benefit: Vector<InsurancePlan_Plan_SpecificCost_Benefit>,
}

#[derive(Clone, Debug)]
pub struct InsurancePlan_Plan {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) network: Vector<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) coverageArea: Vector<Reference>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) generalCost: Vector<InsurancePlan_Plan_GeneralCost>,
  pub(crate) specificCost: Vector<InsurancePlan_Plan_SpecificCost>,
}

#[derive(Clone, Debug)]
pub struct InsurancePlan {
  pub(crate) _type: Vector<CodeableConcept>,
  pub(crate) name: Option<String>,
  pub(crate) alias: Vector<String>,
  pub(crate) status: Option<String>,
  pub(crate) period: Option<Period>,
  pub(crate) ownedBy: Option<Box<Reference>>,
  pub(crate) network: Vector<Reference>,
  pub(crate) endpoint: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) coverageArea: Vector<Reference>,
  pub(crate) administeredBy: Option<Box<Reference>>,
  pub(crate) contact: Vector<InsurancePlan_Contact>,
  pub(crate) coverage: Vector<InsurancePlan_Coverage>,
  pub(crate) plan: Vector<InsurancePlan_Plan>,
}