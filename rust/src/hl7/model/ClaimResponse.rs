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
use crate::core::model::ClaimResponse_Item_Adjudication::ClaimResponse_Item_Adjudication;
use crate::core::model::Period::Period;
use crate::core::model::Money::Money;
use crate::core::model::Quantity::Quantity;
use crate::hl7::UnionDateOrPeriod;
use crate::hl7::UnionAddressOrCodeableConceptOrReference;



#[derive(Clone, Debug)]
pub struct ClaimResponse_Total {
  pub(crate) id: Option<String>,
  pub(crate) amount: Money,
  pub(crate) category: CodeableConcept,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct ClaimResponse_Error {
  pub(crate) id: Option<String>,
  pub(crate) code: CodeableConcept,
  pub(crate) extension: Vector<Extension>,
  pub(crate) itemSequence: Option<u32>,
  pub(crate) detailSequence: Option<u32>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) subDetailSequence: Option<u32>,
}


#[derive(Clone, Debug)]
pub struct ClaimResponse_Payment {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) date: Option<FHIRDate>,
  pub(crate) amount: Money,
  pub(crate) extension: Vector<Extension>,
  pub(crate) adjustment: Option<Money>,
  pub(crate) identifier: Option<Identifier>,
  pub(crate) adjustmentReason: Option<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct ClaimResponse_ProcessNote {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<String>,
  pub(crate) text: String,
  pub(crate) number: Option<u32>,
  pub(crate) language: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct ClaimResponse_Insurance {
  pub(crate) id: Option<String>,
  pub(crate) focal: bool,
  pub(crate) sequence: u32,
  pub(crate) coverage: Reference,
  pub(crate) extension: Vector<Extension>,
  pub(crate) claimResponse: Option<Reference>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) businessArrangement: Option<String>,
}


#[derive(Clone, Debug)]
pub struct ClaimResponse_Item_Adjudication {
  pub(crate) id: Option<String>,
  pub(crate) value: Option<BigDecimal>,
  pub(crate) reason: Option<CodeableConcept>,
  pub(crate) amount: Option<Money>,
  pub(crate) category: CodeableConcept,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct ClaimResponse_Item_Detail_SubDetail {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) noteNumber: Vector<u32>,
  pub(crate) adjudication: Vector<ClaimResponse_Item_Adjudication>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) subDetailSequence: u32,
}

#[derive(Clone, Debug)]
pub struct ClaimResponse_Item_Detail {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) noteNumber: Vector<u32>,
  pub(crate) adjudication: Vector<ClaimResponse_Item_Adjudication>,
  pub(crate) detailSequence: u32,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) subDetail: Vector<ClaimResponse_Item_Detail_SubDetail>,
}

#[derive(Clone, Debug)]
pub struct ClaimResponse_Item {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) noteNumber: Vector<u32>,
  pub(crate) itemSequence: u32,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) adjudication: Vector<ClaimResponse_Item_Adjudication>,
  pub(crate) detail: Vector<ClaimResponse_Item_Detail>,
}


#[derive(Clone, Debug)]
pub struct ClaimResponse_AddItem_Detail_SubDetail {
  pub(crate) id: Option<String>,
  pub(crate) net: Option<Money>,
  pub(crate) factor: Option<BigDecimal>,
  pub(crate) modifier: Vector<CodeableConcept>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) unitPrice: Option<Money>,
  pub(crate) noteNumber: Vector<u32>,
  pub(crate) adjudication: Vector<ClaimResponse_Item_Adjudication>,
  pub(crate) productOrService: CodeableConcept,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct ClaimResponse_AddItem_Detail {
  pub(crate) id: Option<String>,
  pub(crate) net: Option<Money>,
  pub(crate) factor: Option<BigDecimal>,
  pub(crate) modifier: Vector<CodeableConcept>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) unitPrice: Option<Money>,
  pub(crate) noteNumber: Vector<u32>,
  pub(crate) adjudication: Vector<ClaimResponse_Item_Adjudication>,
  pub(crate) productOrService: CodeableConcept,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) subDetail: Vector<ClaimResponse_AddItem_Detail_SubDetail>,
}

#[derive(Clone, Debug)]
pub struct ClaimResponse_AddItem {
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
  pub(crate) adjudication: Vector<ClaimResponse_Item_Adjudication>,
  pub(crate) detailSequence: Vector<u32>,
  pub(crate) productOrService: CodeableConcept,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) subdetailSequence: Vector<u32>,
  pub(crate) detail: Vector<ClaimResponse_AddItem_Detail>,
}

#[derive(Clone, Debug)]
pub struct ClaimResponse {
  pub(crate) _use: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) form: Option<Attachment>,
  pub(crate) status: String,
  pub(crate) subType: Option<CodeableConcept>,
  pub(crate) patient: Reference,
  pub(crate) created: DateTime<FixedOffset>,
  pub(crate) insurer: Reference,
  pub(crate) request: Option<Reference>,
  pub(crate) outcome: String,
  pub(crate) formCode: Option<CodeableConcept>,
  pub(crate) requestor: Option<Reference>,
  pub(crate) payeeType: Option<CodeableConcept>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) preAuthRef: Option<String>,
  pub(crate) disposition: Option<String>,
  pub(crate) adjudication: Vector<ClaimResponse_Item_Adjudication>,
  pub(crate) fundsReserve: Option<CodeableConcept>,
  pub(crate) preAuthPeriod: Option<Period>,
  pub(crate) communicationRequest: Vector<Reference>,
  pub(crate) total: Vector<ClaimResponse_Total>,
  pub(crate) error: Vector<ClaimResponse_Error>,
  pub(crate) payment: Option<ClaimResponse_Payment>,
  pub(crate) processNote: Vector<ClaimResponse_ProcessNote>,
  pub(crate) insurance: Vector<ClaimResponse_Insurance>,
  pub(crate) item: Vector<ClaimResponse_Item>,
  pub(crate) addItem: Vector<ClaimResponse_AddItem>,
}