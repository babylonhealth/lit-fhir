use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct Claim_Payee {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) party: Option<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Claim_Related {
  pub(crate) id: Option<String>,
  pub(crate) claim: Option<Reference>,
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
  pub(crate) provider: Reference,
  pub(crate) extension: Vector<Extension>,
  pub(crate) responsible: Option<Boolean>,
  pub(crate) qualification: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Claim_Accident {
  pub(crate) id: Option<String>,
  pub(crate) date: FHIRDate,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) location: Option<Address | Reference>,
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
  pub(crate) diagnosis: CodeableConcept | Reference,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Claim_Procedure {
  pub(crate) id: Option<String>,
  pub(crate) udi: Vector<Reference>,
  pub(crate) _type: Vector<CodeableConcept>,
  pub(crate) date: Option<Date>,
  pub(crate) sequence: u32,
  pub(crate) extension: Vector<Extension>,
  pub(crate) procedure: CodeableConcept | Reference,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Claim_Insurance {
  pub(crate) id: Option<String>,
  pub(crate) focal: Boolean,
  pub(crate) sequence: u32,
  pub(crate) coverage: Reference,
  pub(crate) extension: Vector<Extension>,
  pub(crate) identifier: Option<Identifier>,
  pub(crate) preAuthRef: Vector<String>,
  pub(crate) claimResponse: Option<Reference>,
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
  pub(crate) value: Option<Attachment | Boolean | Quantity | Reference | String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) timing: Option<FHIRDate | Period>,
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
  pub(crate) serviced: Option<FHIRDate | Period>,
  pub(crate) location: Option<Address | CodeableConcept | Reference>,
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
  pub(crate) use: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) total: Option<Money>,
  pub(crate) status: String,
  pub(crate) subType: Option<CodeableConcept>,
  pub(crate) patient: Reference,
  pub(crate) created: Date,
  pub(crate) enterer: Option<Reference>,
  pub(crate) insurer: Option<Reference>,
  pub(crate) provider: Reference,
  pub(crate) priority: CodeableConcept,
  pub(crate) referral: Option<Reference>,
  pub(crate) facility: Option<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) fundsReserve: Option<CodeableConcept>,
  pub(crate) prescription: Option<Reference>,
  pub(crate) billablePeriod: Option<Period>,
  pub(crate) originalPrescription: Option<Reference>,
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