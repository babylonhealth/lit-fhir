use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Money::Money;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Period::Period;
use crate::hl7::UnionAddressOrReference;
use crate::core::UnionCodeableConceptOrReference;
use crate::hl7::Union_2028408917;
use crate::hl7::UnionDateOrPeriod;
use crate::core::model::Quantity::Quantity;
use crate::hl7::UnionAddressOrCodeableConceptOrReference;



#[derive(Clone, Debug)]
pub struct Claim_Payee {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) party: Option<Box<Reference>>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Claim_Related {
  pub(crate) id: Option<String>,
  pub(crate) claim: Option<Box<Reference>>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) reference: Option<Identifier>,
  pub(crate) relationship: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Claim_CareTeam {
  pub(crate) id: Option<String>,
  pub(crate) role: Option<CodeableConcept>,
  pub(crate) sequence: u32,
  pub(crate) provider: Box<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) responsible: Option<bool>,
  pub(crate) qualification: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Claim_Accident {
  pub(crate) id: Option<String>,
  pub(crate) date: FHIRDate,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) location: Option<UnionAddressOrReference>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Claim_Diagnosis {
  pub(crate) id: Option<String>,
  pub(crate) _type: Vector<CodeableConcept>,
  pub(crate) sequence: u32,
  pub(crate) extension: Vector<Extension>,
  pub(crate) onAdmission: Option<CodeableConcept>,
  pub(crate) packageCode: Option<CodeableConcept>,
  pub(crate) diagnosis: UnionCodeableConceptOrReference,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Claim_Procedure {
  pub(crate) id: Option<String>,
  pub(crate) udi: Vector<Reference>,
  pub(crate) _type: Vector<CodeableConcept>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) sequence: u32,
  pub(crate) extension: Vector<Extension>,
  pub(crate) procedure: UnionCodeableConceptOrReference,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Claim_Insurance {
  pub(crate) id: Option<String>,
  pub(crate) focal: bool,
  pub(crate) sequence: u32,
  pub(crate) coverage: Box<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) identifier: Option<Identifier>,
  pub(crate) preAuthRef: Vector<String>,
  pub(crate) claimResponse: Option<Box<Reference>>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) businessArrangement: Option<String>,
}


#[derive(Clone, Debug)]
pub struct Claim_SupportingInfo {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) reason: Option<CodeableConcept>,
  pub(crate) sequence: u32,
  pub(crate) category: CodeableConcept,
  pub(crate) value: Option<Union_2028408917>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) timing: Option<UnionDateOrPeriod>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Claim_Item_Detail_SubDetail {
  pub(crate) id: Option<String>,
  pub(crate) net: Option<Money>,
  pub(crate) udi: Vector<Reference>,
  pub(crate) factor: Option<BigDecimal>,
  pub(crate) revenue: Option<CodeableConcept>,
  pub(crate) sequence: u32,
  pub(crate) category: Option<CodeableConcept>,
  pub(crate) modifier: Vector<CodeableConcept>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) unitPrice: Option<Money>,
  pub(crate) programCode: Vector<CodeableConcept>,
  pub(crate) productOrService: CodeableConcept,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Claim_Item_Detail {
  pub(crate) id: Option<String>,
  pub(crate) net: Option<Money>,
  pub(crate) udi: Vector<Reference>,
  pub(crate) factor: Option<BigDecimal>,
  pub(crate) revenue: Option<CodeableConcept>,
  pub(crate) sequence: u32,
  pub(crate) category: Option<CodeableConcept>,
  pub(crate) modifier: Vector<CodeableConcept>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) unitPrice: Option<Money>,
  pub(crate) programCode: Vector<CodeableConcept>,
  pub(crate) productOrService: CodeableConcept,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) subDetail: Vector<Claim_Item_Detail_SubDetail>,
}

#[derive(Clone, Debug)]
pub struct Claim_Item {
  pub(crate) id: Option<String>,
  pub(crate) net: Option<Money>,
  pub(crate) udi: Vector<Reference>,
  pub(crate) factor: Option<BigDecimal>,
  pub(crate) revenue: Option<CodeableConcept>,
  pub(crate) subSite: Vector<CodeableConcept>,
  pub(crate) sequence: u32,
  pub(crate) category: Option<CodeableConcept>,
  pub(crate) modifier: Vector<CodeableConcept>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) bodySite: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) unitPrice: Option<Money>,
  pub(crate) encounter: Vector<Reference>,
  pub(crate) programCode: Vector<CodeableConcept>,
  pub(crate) serviced: Option<UnionDateOrPeriod>,
  pub(crate) location: Option<UnionAddressOrCodeableConceptOrReference>,
  pub(crate) careTeamSequence: Vector<u32>,
  pub(crate) productOrService: CodeableConcept,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) diagnosisSequence: Vector<u32>,
  pub(crate) procedureSequence: Vector<u32>,
  pub(crate) informationSequence: Vector<u32>,
  pub(crate) detail: Vector<Claim_Item_Detail>,
}

#[derive(Clone, Debug)]
pub struct Claim {
  pub(crate) _use: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) total: Option<Money>,
  pub(crate) status: String,
  pub(crate) subType: Option<CodeableConcept>,
  pub(crate) patient: Box<Reference>,
  pub(crate) created: DateTime<FixedOffset>,
  pub(crate) enterer: Option<Box<Reference>>,
  pub(crate) insurer: Option<Box<Reference>>,
  pub(crate) provider: Box<Reference>,
  pub(crate) priority: CodeableConcept,
  pub(crate) referral: Option<Box<Reference>>,
  pub(crate) facility: Option<Box<Reference>>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) fundsReserve: Option<CodeableConcept>,
  pub(crate) prescription: Option<Box<Reference>>,
  pub(crate) billablePeriod: Option<Period>,
  pub(crate) originalPrescription: Option<Box<Reference>>,
  pub(crate) payee: Option<Claim_Payee>,
  pub(crate) related: Vector<Claim_Related>,
  pub(crate) careTeam: Vector<Claim_CareTeam>,
  pub(crate) accident: Option<Claim_Accident>,
  pub(crate) diagnosis: Vector<Claim_Diagnosis>,
  pub(crate) procedure: Vector<Claim_Procedure>,
  pub(crate) insurance: Vector<Claim_Insurance>,
  pub(crate) supportingInfo: Vector<Claim_SupportingInfo>,
  pub(crate) item: Vector<Claim_Item>,
}