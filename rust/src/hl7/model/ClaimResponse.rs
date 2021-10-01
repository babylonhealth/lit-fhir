use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct ClaimResponse_Total {
  pub(crate) id?: String,
  pub(crate) amount: Money,
  pub(crate) category: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct ClaimResponse_Error {
  pub(crate) id?: String,
  pub(crate) code: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) itemSequence?: u32,
  pub(crate) detailSequence?: u32,
  pub(crate) modifierExtension?: Extension,
  pub(crate) subDetailSequence?: u32,
}


pub struct ClaimResponse_Payment {
  pub(crate) id?: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) date?: FHIRDate,
  pub(crate) amount: Money,
  pub(crate) extension?: Extension,
  pub(crate) adjustment?: Money,
  pub(crate) identifier?: Identifier,
  pub(crate) adjustmentReason?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
}


pub struct ClaimResponse_ProcessNote {
  pub(crate) id?: String,
  pub(crate) _type?: String,
  pub(crate) text: String,
  pub(crate) number?: u32,
  pub(crate) language?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct ClaimResponse_Insurance {
  pub(crate) id?: String,
  pub(crate) focal: Boolean,
  pub(crate) sequence: u32,
  pub(crate) coverage: Reference,
  pub(crate) extension?: Extension,
  pub(crate) claimResponse?: Reference,
  pub(crate) modifierExtension?: Extension,
  pub(crate) businessArrangement?: String,
}


pub struct ClaimResponse_Item_Adjudication {
  pub(crate) id?: String,
  pub(crate) value?: BigDecimal,
  pub(crate) reason?: CodeableConcept,
  pub(crate) amount?: Money,
  pub(crate) category: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}



pub struct ClaimResponse_Item_Detail_SubDetail {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) noteNumber?: u32,
  pub(crate) adjudication?: ClaimResponse_Item_Adjudication,
  pub(crate) modifierExtension?: Extension,
  pub(crate) subDetailSequence: u32,
}

pub struct ClaimResponse_Item_Detail {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) noteNumber?: u32,
  pub(crate) adjudication: ClaimResponse_Item_Adjudication,
  pub(crate) detailSequence: u32,
  pub(crate) modifierExtension?: Extension,
  pub(crate) subDetail?: ClaimResponse_Item_Detail_SubDetail,
}

pub struct ClaimResponse_Item {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) noteNumber?: u32,
  pub(crate) itemSequence: u32,
  pub(crate) modifierExtension?: Extension,
  pub(crate) adjudication: ClaimResponse_Item_Adjudication,
  pub(crate) detail?: ClaimResponse_Item_Detail,
}


pub struct ClaimResponse_AddItem_Detail_SubDetail {
  pub(crate) id?: String,
  pub(crate) net?: Money,
  pub(crate) factor?: BigDecimal,
  pub(crate) modifier?: CodeableConcept,
  pub(crate) quantity?: Quantity,
  pub(crate) extension?: Extension,
  pub(crate) unitPrice?: Money,
  pub(crate) noteNumber?: u32,
  pub(crate) adjudication: ClaimResponse_Item_Adjudication,
  pub(crate) productOrService: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
}

pub struct ClaimResponse_AddItem_Detail {
  pub(crate) id?: String,
  pub(crate) net?: Money,
  pub(crate) factor?: BigDecimal,
  pub(crate) modifier?: CodeableConcept,
  pub(crate) quantity?: Quantity,
  pub(crate) extension?: Extension,
  pub(crate) unitPrice?: Money,
  pub(crate) noteNumber?: u32,
  pub(crate) adjudication: ClaimResponse_Item_Adjudication,
  pub(crate) productOrService: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
  pub(crate) subDetail?: ClaimResponse_AddItem_Detail_SubDetail,
}

pub struct ClaimResponse_AddItem {
  pub(crate) id?: String,
  pub(crate) net?: Money,
  pub(crate) factor?: BigDecimal,
  pub(crate) subSite?: CodeableConcept,
  pub(crate) provider?: Reference,
  pub(crate) modifier?: CodeableConcept,
  pub(crate) quantity?: Quantity,
  pub(crate) bodySite?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) unitPrice?: Money,
  pub(crate) noteNumber?: u32,
  pub(crate) programCode?: CodeableConcept,
  pub(crate) serviced?: FHIRDate | Period,
  pub(crate) location?: Address | CodeableConcept | Reference,
  pub(crate) itemSequence?: u32,
  pub(crate) adjudication: ClaimResponse_Item_Adjudication,
  pub(crate) detailSequence?: u32,
  pub(crate) productOrService: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
  pub(crate) subdetailSequence?: u32,
  pub(crate) detail?: ClaimResponse_AddItem_Detail,
}

pub struct ClaimResponse {
  pub(crate) use: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) form?: Attachment,
  pub(crate) status: String,
  pub(crate) subType?: CodeableConcept,
  pub(crate) patient: Reference,
  pub(crate) created: Date,
  pub(crate) insurer: Reference,
  pub(crate) request?: Reference,
  pub(crate) outcome: String,
  pub(crate) formCode?: CodeableConcept,
  pub(crate) requestor?: Reference,
  pub(crate) payeeType?: CodeableConcept,
  pub(crate) identifier?: Identifier,
  pub(crate) preAuthRef?: String,
  pub(crate) disposition?: String,
  pub(crate) adjudication?: ClaimResponse_Item_Adjudication,
  pub(crate) fundsReserve?: CodeableConcept,
  pub(crate) preAuthPeriod?: Period,
  pub(crate) communicationRequest?: Reference,
  pub(crate) total?: ClaimResponse_Total,
  pub(crate) error?: ClaimResponse_Error,
  pub(crate) payment?: ClaimResponse_Payment,
  pub(crate) processNote?: ClaimResponse_ProcessNote,
  pub(crate) insurance?: ClaimResponse_Insurance,
  pub(crate) item?: ClaimResponse_Item,
  pub(crate) addItem?: ClaimResponse_AddItem,
}