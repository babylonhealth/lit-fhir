use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Attachment::Attachment;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::ExplanationOfBenefit_Item_Adjudication::ExplanationOfBenefit_Item_Adjudication;
use crate::core::model::Period::Period;
use crate::core::model::Money::Money;
use crate::hl7::UnionAddressOrReference;
use crate::core::UnionCodeableConceptOrReference;
use crate::core::model::Coding::Coding;
use crate::hl7::Union_2028408917;
use crate::hl7::UnionDateOrPeriod;
use crate::core::model::Quantity::Quantity;
use crate::hl7::UnionAddressOrCodeableConceptOrReference;
use crate::hl7::UnionMoneyOrUnsignedInt;
use crate::hl7::UnionMoneyOrStringOrUnsignedInt;



#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_Payee {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) party: Option<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_Total {
  pub(crate) id: Option<String>,
  pub(crate) amount: Money,
  pub(crate) category: CodeableConcept,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_Related {
  pub(crate) id: Option<String>,
  pub(crate) claim: Option<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) reference: Option<Identifier>,
  pub(crate) relationship: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_Payment {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) date: Option<FHIRDate>,
  pub(crate) amount: Option<Money>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) adjustment: Option<Money>,
  pub(crate) identifier: Option<Identifier>,
  pub(crate) adjustmentReason: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_CareTeam {
  pub(crate) id: Option<String>,
  pub(crate) role: Option<CodeableConcept>,
  pub(crate) sequence: u32,
  pub(crate) provider: Reference,
  pub(crate) extension: Vector<Extension>,
  pub(crate) responsible: Option<bool>,
  pub(crate) qualification: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_Accident {
  pub(crate) id: Option<String>,
  pub(crate) date: Option<FHIRDate>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) location: Option<UnionAddressOrReference>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_Diagnosis {
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
pub struct ExplanationOfBenefit_Procedure {
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
pub struct ExplanationOfBenefit_Insurance {
  pub(crate) id: Option<String>,
  pub(crate) focal: bool,
  pub(crate) coverage: Reference,
  pub(crate) extension: Vector<Extension>,
  pub(crate) preAuthRef: Vector<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_ProcessNote {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<String>,
  pub(crate) text: Option<String>,
  pub(crate) number: Option<u32>,
  pub(crate) language: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_SupportingInfo {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) reason: Option<Coding>,
  pub(crate) sequence: u32,
  pub(crate) category: CodeableConcept,
  pub(crate) value: Option<Union_2028408917>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) timing: Option<UnionDateOrPeriod>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_Item_Adjudication {
  pub(crate) id: Option<String>,
  pub(crate) value: Option<BigDecimal>,
  pub(crate) reason: Option<CodeableConcept>,
  pub(crate) amount: Option<Money>,
  pub(crate) category: CodeableConcept,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_Item_Detail_SubDetail {
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
  pub(crate) noteNumber: Vector<u32>,
  pub(crate) programCode: Vector<CodeableConcept>,
  pub(crate) adjudication: Vector<ExplanationOfBenefit_Item_Adjudication>,
  pub(crate) productOrService: CodeableConcept,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_Item_Detail {
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
  pub(crate) noteNumber: Vector<u32>,
  pub(crate) programCode: Vector<CodeableConcept>,
  pub(crate) adjudication: Vector<ExplanationOfBenefit_Item_Adjudication>,
  pub(crate) productOrService: CodeableConcept,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) subDetail: Vector<ExplanationOfBenefit_Item_Detail_SubDetail>,
}

#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_Item {
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
  pub(crate) noteNumber: Vector<u32>,
  pub(crate) programCode: Vector<CodeableConcept>,
  pub(crate) serviced: Option<UnionDateOrPeriod>,
  pub(crate) location: Option<UnionAddressOrCodeableConceptOrReference>,
  pub(crate) careTeamSequence: Vector<u32>,
  pub(crate) productOrService: CodeableConcept,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) diagnosisSequence: Vector<u32>,
  pub(crate) procedureSequence: Vector<u32>,
  pub(crate) informationSequence: Vector<u32>,
  pub(crate) adjudication: Vector<ExplanationOfBenefit_Item_Adjudication>,
  pub(crate) detail: Vector<ExplanationOfBenefit_Item_Detail>,
}


#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_AddItem_Detail_SubDetail {
  pub(crate) id: Option<String>,
  pub(crate) net: Option<Money>,
  pub(crate) factor: Option<BigDecimal>,
  pub(crate) modifier: Vector<CodeableConcept>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) unitPrice: Option<Money>,
  pub(crate) noteNumber: Vector<u32>,
  pub(crate) adjudication: Vector<ExplanationOfBenefit_Item_Adjudication>,
  pub(crate) productOrService: CodeableConcept,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_AddItem_Detail {
  pub(crate) id: Option<String>,
  pub(crate) net: Option<Money>,
  pub(crate) factor: Option<BigDecimal>,
  pub(crate) modifier: Vector<CodeableConcept>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) unitPrice: Option<Money>,
  pub(crate) noteNumber: Vector<u32>,
  pub(crate) adjudication: Vector<ExplanationOfBenefit_Item_Adjudication>,
  pub(crate) productOrService: CodeableConcept,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) subDetail: Vector<ExplanationOfBenefit_AddItem_Detail_SubDetail>,
}

#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_AddItem {
  pub(crate) id: Option<String>,
  pub(crate) net: Option<Money>,
  pub(crate) factor: Option<BigDecimal>,
  pub(crate) subSite: Vector<CodeableConcept>,
  pub(crate) provider: Vector<Reference>,
  pub(crate) modifier: Vector<CodeableConcept>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) bodySite: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) unitPrice: Option<Money>,
  pub(crate) noteNumber: Vector<u32>,
  pub(crate) programCode: Vector<CodeableConcept>,
  pub(crate) serviced: Option<UnionDateOrPeriod>,
  pub(crate) location: Option<UnionAddressOrCodeableConceptOrReference>,
  pub(crate) itemSequence: Vector<u32>,
  pub(crate) adjudication: Vector<ExplanationOfBenefit_Item_Adjudication>,
  pub(crate) detailSequence: Vector<u32>,
  pub(crate) productOrService: CodeableConcept,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) subDetailSequence: Vector<u32>,
  pub(crate) detail: Vector<ExplanationOfBenefit_AddItem_Detail>,
}


#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_BenefitBalance_Financial {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) used: Option<UnionMoneyOrUnsignedInt>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) allowed: Option<UnionMoneyOrStringOrUnsignedInt>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_BenefitBalance {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) unit: Option<CodeableConcept>,
  pub(crate) term: Option<CodeableConcept>,
  pub(crate) network: Option<CodeableConcept>,
  pub(crate) category: CodeableConcept,
  pub(crate) excluded: Option<bool>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) financial: Vector<ExplanationOfBenefit_BenefitBalance_Financial>,
}

#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit {
  pub(crate) _use: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) form: Option<Attachment>,
  pub(crate) claim: Option<Reference>,
  pub(crate) status: String,
  pub(crate) subType: Option<CodeableConcept>,
  pub(crate) patient: Reference,
  pub(crate) created: DateTime<FixedOffset>,
  pub(crate) enterer: Option<Reference>,
  pub(crate) insurer: Reference,
  pub(crate) outcome: String,
  pub(crate) provider: Reference,
  pub(crate) priority: Option<CodeableConcept>,
  pub(crate) referral: Option<Reference>,
  pub(crate) facility: Option<Reference>,
  pub(crate) formCode: Option<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) preAuthRef: Vector<String>,
  pub(crate) precedence: Option<u32>,
  pub(crate) disposition: Option<String>,
  pub(crate) fundsReserve: Option<CodeableConcept>,
  pub(crate) prescription: Option<Reference>,
  pub(crate) adjudication: Vector<ExplanationOfBenefit_Item_Adjudication>,
  pub(crate) claimResponse: Option<Reference>,
  pub(crate) benefitPeriod: Option<Period>,
  pub(crate) billablePeriod: Option<Period>,
  pub(crate) preAuthRefPeriod: Vector<Period>,
  pub(crate) originalPrescription: Option<Reference>,
  pub(crate) fundsReserveRequested: Option<CodeableConcept>,
  pub(crate) payee: Option<ExplanationOfBenefit_Payee>,
  pub(crate) total: Vector<ExplanationOfBenefit_Total>,
  pub(crate) related: Vector<ExplanationOfBenefit_Related>,
  pub(crate) payment: Option<ExplanationOfBenefit_Payment>,
  pub(crate) careTeam: Vector<ExplanationOfBenefit_CareTeam>,
  pub(crate) accident: Option<ExplanationOfBenefit_Accident>,
  pub(crate) diagnosis: Vector<ExplanationOfBenefit_Diagnosis>,
  pub(crate) procedure: Vector<ExplanationOfBenefit_Procedure>,
  pub(crate) insurance: Vector<ExplanationOfBenefit_Insurance>,
  pub(crate) processNote: Vector<ExplanationOfBenefit_ProcessNote>,
  pub(crate) supportingInfo: Vector<ExplanationOfBenefit_SupportingInfo>,
  pub(crate) item: Vector<ExplanationOfBenefit_Item>,
  pub(crate) addItem: Vector<ExplanationOfBenefit_AddItem>,
  pub(crate) benefitBalance: Vector<ExplanationOfBenefit_BenefitBalance>,
}