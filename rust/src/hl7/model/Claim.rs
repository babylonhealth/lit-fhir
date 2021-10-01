use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Claim_Payee {
  pub(crate) id?: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) party?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct Claim_Related {
  pub(crate) id?: String,
  pub(crate) claim?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) reference?: Identifier,
  pub(crate) relationship?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
}


pub struct Claim_CareTeam {
  pub(crate) id?: String,
  pub(crate) role?: CodeableConcept,
  pub(crate) sequence: u32,
  pub(crate) provider: Reference,
  pub(crate) extension?: Extension,
  pub(crate) responsible?: Boolean,
  pub(crate) qualification?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
}


pub struct Claim_Accident {
  pub(crate) id?: String,
  pub(crate) date: FHIRDate,
  pub(crate) _type?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) location?: Address | Reference,
  pub(crate) modifierExtension?: Extension,
}


pub struct Claim_Diagnosis {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) sequence: u32,
  pub(crate) extension?: Extension,
  pub(crate) onAdmission?: CodeableConcept,
  pub(crate) packageCode?: CodeableConcept,
  pub(crate) diagnosis: CodeableConcept | Reference,
  pub(crate) modifierExtension?: Extension,
}


pub struct Claim_Procedure {
  pub(crate) id?: String,
  pub(crate) udi?: Reference,
  pub(crate) _type?: CodeableConcept,
  pub(crate) date?: Date,
  pub(crate) sequence: u32,
  pub(crate) extension?: Extension,
  pub(crate) procedure: CodeableConcept | Reference,
  pub(crate) modifierExtension?: Extension,
}


pub struct Claim_Insurance {
  pub(crate) id?: String,
  pub(crate) focal: Boolean,
  pub(crate) sequence: u32,
  pub(crate) coverage: Reference,
  pub(crate) extension?: Extension,
  pub(crate) identifier?: Identifier,
  pub(crate) preAuthRef?: String,
  pub(crate) claimResponse?: Reference,
  pub(crate) modifierExtension?: Extension,
  pub(crate) businessArrangement?: String,
}


pub struct Claim_SupportingInfo {
  pub(crate) id?: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) reason?: CodeableConcept,
  pub(crate) sequence: u32,
  pub(crate) category: CodeableConcept,
  pub(crate) value?: Attachment | Boolean | Quantity | Reference | String,
  pub(crate) extension?: Extension,
  pub(crate) timing?: FHIRDate | Period,
  pub(crate) modifierExtension?: Extension,
}


pub struct Claim_Item_Detail_SubDetail {
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
  pub(crate) programCode?: CodeableConcept,
  pub(crate) productOrService: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
}

pub struct Claim_Item_Detail {
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
  pub(crate) programCode?: CodeableConcept,
  pub(crate) productOrService: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
  pub(crate) subDetail?: Claim_Item_Detail_SubDetail,
}

pub struct Claim_Item {
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
  pub(crate) programCode?: CodeableConcept,
  pub(crate) serviced?: FHIRDate | Period,
  pub(crate) location?: Address | CodeableConcept | Reference,
  pub(crate) careTeamSequence?: u32,
  pub(crate) productOrService: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
  pub(crate) diagnosisSequence?: u32,
  pub(crate) procedureSequence?: u32,
  pub(crate) informationSequence?: u32,
  pub(crate) detail?: Claim_Item_Detail,
}

pub struct Claim {
  pub(crate) use: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) total?: Money,
  pub(crate) status: String,
  pub(crate) subType?: CodeableConcept,
  pub(crate) patient: Reference,
  pub(crate) created: Date,
  pub(crate) enterer?: Reference,
  pub(crate) insurer?: Reference,
  pub(crate) provider: Reference,
  pub(crate) priority: CodeableConcept,
  pub(crate) referral?: Reference,
  pub(crate) facility?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) fundsReserve?: CodeableConcept,
  pub(crate) prescription?: Reference,
  pub(crate) billablePeriod?: Period,
  pub(crate) originalPrescription?: Reference,
  pub(crate) payee?: Claim_Payee,
  pub(crate) related?: Claim_Related,
  pub(crate) careTeam?: Claim_CareTeam,
  pub(crate) accident?: Claim_Accident,
  pub(crate) diagnosis?: Claim_Diagnosis,
  pub(crate) procedure?: Claim_Procedure,
  pub(crate) insurance: Claim_Insurance,
  pub(crate) supportingInfo?: Claim_SupportingInfo,
  pub(crate) item?: Claim_Item,
}