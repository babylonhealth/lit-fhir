use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct ExplanationOfBenefit_Payee {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) party?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct ExplanationOfBenefit_Total {
  pub(crate) id?: String,
  pub(crate) amount: Money,
  pub(crate) category: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct ExplanationOfBenefit_Related {
  pub(crate) id?: String,
  pub(crate) claim?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) reference?: Identifier,
  pub(crate) relationship?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
}


pub struct ExplanationOfBenefit_Payment {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) date?: FHIRDate,
  pub(crate) amount?: Money,
  pub(crate) extension?: Extension,
  pub(crate) adjustment?: Money,
  pub(crate) identifier?: Identifier,
  pub(crate) adjustmentReason?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
}


pub struct ExplanationOfBenefit_CareTeam {
  pub(crate) id?: String,
  pub(crate) role?: CodeableConcept,
  pub(crate) sequence: u32,
  pub(crate) provider: Reference,
  pub(crate) extension?: Extension,
  pub(crate) responsible?: Boolean,
  pub(crate) qualification?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
}


pub struct ExplanationOfBenefit_Accident {
  pub(crate) id?: String,
  pub(crate) date?: FHIRDate,
  pub(crate) _type?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) location?: Address | Reference,
  pub(crate) modifierExtension?: Extension,
}


pub struct ExplanationOfBenefit_Diagnosis {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) sequence: u32,
  pub(crate) extension?: Extension,
  pub(crate) onAdmission?: CodeableConcept,
  pub(crate) packageCode?: CodeableConcept,
  pub(crate) diagnosis: CodeableConcept | Reference,
  pub(crate) modifierExtension?: Extension,
}


pub struct ExplanationOfBenefit_Procedure {
  pub(crate) id?: String,
  pub(crate) udi?: Reference,
  pub(crate) _type?: CodeableConcept,
  pub(crate) date?: Date,
  pub(crate) sequence: u32,
  pub(crate) extension?: Extension,
  pub(crate) procedure: CodeableConcept | Reference,
  pub(crate) modifierExtension?: Extension,
}


pub struct ExplanationOfBenefit_Insurance {
  pub(crate) id?: String,
  pub(crate) focal: Boolean,
  pub(crate) coverage: Reference,
  pub(crate) extension?: Extension,
  pub(crate) preAuthRef?: String,
  pub(crate) modifierExtension?: Extension,
}


pub struct ExplanationOfBenefit_ProcessNote {
  pub(crate) id?: String,
  pub(crate) _type?: String,
  pub(crate) text?: String,
  pub(crate) number?: u32,
  pub(crate) language?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct ExplanationOfBenefit_SupportingInfo {
  pub(crate) id?: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) reason?: Coding,
  pub(crate) sequence: u32,
  pub(crate) category: CodeableConcept,
  pub(crate) value?: Attachment | Boolean | Quantity | Reference | String,
  pub(crate) extension?: Extension,
  pub(crate) timing?: FHIRDate | Period,
  pub(crate) modifierExtension?: Extension,
}


pub struct ExplanationOfBenefit_Item_Adjudication {
  pub(crate) id?: String,
  pub(crate) value?: BigDecimal,
  pub(crate) reason?: CodeableConcept,
  pub(crate) amount?: Money,
  pub(crate) category: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}



pub struct ExplanationOfBenefit_Item_Detail_SubDetail {
  pub(crate) id?: String,
  pub(crate) net?: Money,
  pub(crate) udi?: Reference,
  pub(crate) factor?: BigDecimal,
  pub(crate) revenue?: CodeableConcept,
  pub(crate) sequence: u32,
  pub(crate) category?: CodeableConcept,
  pub(crate) modifier?: CodeableConcept,
  pub(crate) quantity?: Quantity,
  pub(crate) extension?: Extension,
  pub(crate) unitPrice?: Money,
  pub(crate) noteNumber?: u32,
  pub(crate) programCode?: CodeableConcept,
  pub(crate) adjudication?: ExplanationOfBenefit_Item_Adjudication,
  pub(crate) productOrService: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
}

pub struct ExplanationOfBenefit_Item_Detail {
  pub(crate) id?: String,
  pub(crate) net?: Money,
  pub(crate) udi?: Reference,
  pub(crate) factor?: BigDecimal,
  pub(crate) revenue?: CodeableConcept,
  pub(crate) sequence: u32,
  pub(crate) category?: CodeableConcept,
  pub(crate) modifier?: CodeableConcept,
  pub(crate) quantity?: Quantity,
  pub(crate) extension?: Extension,
  pub(crate) unitPrice?: Money,
  pub(crate) noteNumber?: u32,
  pub(crate) programCode?: CodeableConcept,
  pub(crate) adjudication?: ExplanationOfBenefit_Item_Adjudication,
  pub(crate) productOrService: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
  pub(crate) subDetail?: ExplanationOfBenefit_Item_Detail_SubDetail,
}

pub struct ExplanationOfBenefit_Item {
  pub(crate) id?: String,
  pub(crate) net?: Money,
  pub(crate) udi?: Reference,
  pub(crate) factor?: BigDecimal,
  pub(crate) revenue?: CodeableConcept,
  pub(crate) subSite?: CodeableConcept,
  pub(crate) sequence: u32,
  pub(crate) category?: CodeableConcept,
  pub(crate) modifier?: CodeableConcept,
  pub(crate) quantity?: Quantity,
  pub(crate) bodySite?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) unitPrice?: Money,
  pub(crate) encounter?: Reference,
  pub(crate) noteNumber?: u32,
  pub(crate) programCode?: CodeableConcept,
  pub(crate) serviced?: FHIRDate | Period,
  pub(crate) location?: Address | CodeableConcept | Reference,
  pub(crate) careTeamSequence?: u32,
  pub(crate) productOrService: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
  pub(crate) diagnosisSequence?: u32,
  pub(crate) procedureSequence?: u32,
  pub(crate) informationSequence?: u32,
  pub(crate) adjudication?: ExplanationOfBenefit_Item_Adjudication,
  pub(crate) detail?: ExplanationOfBenefit_Item_Detail,
}


pub struct ExplanationOfBenefit_AddItem_Detail_SubDetail {
  pub(crate) id?: String,
  pub(crate) net?: Money,
  pub(crate) factor?: BigDecimal,
  pub(crate) modifier?: CodeableConcept,
  pub(crate) quantity?: Quantity,
  pub(crate) extension?: Extension,
  pub(crate) unitPrice?: Money,
  pub(crate) noteNumber?: u32,
  pub(crate) adjudication?: ExplanationOfBenefit_Item_Adjudication,
  pub(crate) productOrService: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
}

pub struct ExplanationOfBenefit_AddItem_Detail {
  pub(crate) id?: String,
  pub(crate) net?: Money,
  pub(crate) factor?: BigDecimal,
  pub(crate) modifier?: CodeableConcept,
  pub(crate) quantity?: Quantity,
  pub(crate) extension?: Extension,
  pub(crate) unitPrice?: Money,
  pub(crate) noteNumber?: u32,
  pub(crate) adjudication?: ExplanationOfBenefit_Item_Adjudication,
  pub(crate) productOrService: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
  pub(crate) subDetail?: ExplanationOfBenefit_AddItem_Detail_SubDetail,
}

pub struct ExplanationOfBenefit_AddItem {
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
  pub(crate) adjudication?: ExplanationOfBenefit_Item_Adjudication,
  pub(crate) detailSequence?: u32,
  pub(crate) productOrService: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
  pub(crate) subDetailSequence?: u32,
  pub(crate) detail?: ExplanationOfBenefit_AddItem_Detail,
}


pub struct ExplanationOfBenefit_BenefitBalance_Financial {
  pub(crate) id?: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) used?: Money | u32,
  pub(crate) extension?: Extension,
  pub(crate) allowed?: Money | String | u32,
  pub(crate) modifierExtension?: Extension,
}

pub struct ExplanationOfBenefit_BenefitBalance {
  pub(crate) id?: String,
  pub(crate) name?: String,
  pub(crate) unit?: CodeableConcept,
  pub(crate) term?: CodeableConcept,
  pub(crate) network?: CodeableConcept,
  pub(crate) category: CodeableConcept,
  pub(crate) excluded?: Boolean,
  pub(crate) extension?: Extension,
  pub(crate) description?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) financial?: ExplanationOfBenefit_BenefitBalance_Financial,
}

pub struct ExplanationOfBenefit {
  pub(crate) use: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) form?: Attachment,
  pub(crate) claim?: Reference,
  pub(crate) status: String,
  pub(crate) subType?: CodeableConcept,
  pub(crate) patient: Reference,
  pub(crate) created: Date,
  pub(crate) enterer?: Reference,
  pub(crate) insurer: Reference,
  pub(crate) outcome: String,
  pub(crate) provider: Reference,
  pub(crate) priority?: CodeableConcept,
  pub(crate) referral?: Reference,
  pub(crate) facility?: Reference,
  pub(crate) formCode?: CodeableConcept,
  pub(crate) identifier?: Identifier,
  pub(crate) preAuthRef?: String,
  pub(crate) precedence?: u32,
  pub(crate) disposition?: String,
  pub(crate) fundsReserve?: CodeableConcept,
  pub(crate) prescription?: Reference,
  pub(crate) adjudication?: ExplanationOfBenefit_Item_Adjudication,
  pub(crate) claimResponse?: Reference,
  pub(crate) benefitPeriod?: Period,
  pub(crate) billablePeriod?: Period,
  pub(crate) preAuthRefPeriod?: Period,
  pub(crate) originalPrescription?: Reference,
  pub(crate) fundsReserveRequested?: CodeableConcept,
  pub(crate) payee?: ExplanationOfBenefit_Payee,
  pub(crate) total?: ExplanationOfBenefit_Total,
  pub(crate) related?: ExplanationOfBenefit_Related,
  pub(crate) payment?: ExplanationOfBenefit_Payment,
  pub(crate) careTeam?: ExplanationOfBenefit_CareTeam,
  pub(crate) accident?: ExplanationOfBenefit_Accident,
  pub(crate) diagnosis?: ExplanationOfBenefit_Diagnosis,
  pub(crate) procedure?: ExplanationOfBenefit_Procedure,
  pub(crate) insurance: ExplanationOfBenefit_Insurance,
  pub(crate) processNote?: ExplanationOfBenefit_ProcessNote,
  pub(crate) supportingInfo?: ExplanationOfBenefit_SupportingInfo,
  pub(crate) item?: ExplanationOfBenefit_Item,
  pub(crate) addItem?: ExplanationOfBenefit_AddItem,
  pub(crate) benefitBalance?: ExplanationOfBenefit_BenefitBalance,
}