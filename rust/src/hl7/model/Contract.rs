use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Contract_Rule {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) content: Attachment | Reference,
  pub(crate) modifierExtension?: Extension,
}


pub struct Contract_Legal {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) content: Attachment | Reference,
  pub(crate) modifierExtension?: Extension,
}


pub struct Contract_Signer {
  pub(crate) id?: String,
  pub(crate) _type: Coding,
  pub(crate) party: Reference,
  pub(crate) extension?: Extension,
  pub(crate) signature: Signature,
  pub(crate) modifierExtension?: Extension,
}


pub struct Contract_Friendly {
  pub(crate) id?: String,
  pub(crate) extension?: Extension,
  pub(crate) content: Attachment | Reference,
  pub(crate) modifierExtension?: Extension,
}


pub struct Contract_ContentDefinition {
  pub(crate) id?: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) subType?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) publisher?: Reference,
  pub(crate) copyright?: String,
  pub(crate) publicationDate?: Date,
  pub(crate) modifierExtension?: Extension,
  pub(crate) publicationStatus: String,
}


pub struct Contract_Term_Offer_Party {
  pub(crate) id?: String,
  pub(crate) role: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) reference: Reference,
  pub(crate) modifierExtension?: Extension,
}



pub struct Contract_Term_Offer_Answer {
  pub(crate) id?: String,
  pub(crate) value: Attachment | BigDecimal | Boolean | Coding | FHIRDate | Date | i32 | Date | Quantity | Reference | String | String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct Contract_Term_Offer {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) text?: String,
  pub(crate) topic?: Reference,
  pub(crate) linkId?: String,
  pub(crate) decision?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) identifier?: Identifier,
  pub(crate) decisionMode?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
  pub(crate) securityLabelNumber?: u32,
  pub(crate) party?: Contract_Term_Offer_Party,
  pub(crate) answer?: Contract_Term_Offer_Answer,
}



pub struct Contract_Term_SecurityLabel {
  pub(crate) id?: String,
  pub(crate) number?: u32,
  pub(crate) control?: Coding,
  pub(crate) category?: Coding,
  pub(crate) extension?: Extension,
  pub(crate) classification: Coding,
  pub(crate) modifierExtension?: Extension,
}



pub struct Contract_Term_Action_Subject {
  pub(crate) id?: String,
  pub(crate) role?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) reference: Reference,
  pub(crate) modifierExtension?: Extension,
}

pub struct Contract_Term_Action {
  pub(crate) id?: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) note?: Annotation,
  pub(crate) intent: CodeableConcept,
  pub(crate) linkId?: String,
  pub(crate) status: CodeableConcept,
  pub(crate) reason?: String,
  pub(crate) context?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) requester?: Reference,
  pub(crate) performer?: Reference,
  pub(crate) reasonCode?: CodeableConcept,
  pub(crate) doNotPerform?: Boolean,
  pub(crate) reasonLinkId?: String,
  pub(crate) contextLinkId?: String,
  pub(crate) occurrence?: Date | Period | Timing,
  pub(crate) performerType?: CodeableConcept,
  pub(crate) performerRole?: CodeableConcept,
  pub(crate) requesterLinkId?: String,
  pub(crate) performerLinkId?: String,
  pub(crate) reasonReference?: Reference,
  pub(crate) modifierExtension?: Extension,
  pub(crate) securityLabelNumber?: u32,
  pub(crate) subject?: Contract_Term_Action_Subject,
}



pub struct Contract_Term_Asset_Context {
  pub(crate) id?: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) text?: String,
  pub(crate) extension?: Extension,
  pub(crate) reference?: Reference,
  pub(crate) modifierExtension?: Extension,
}



pub struct Contract_Term_Asset_ValuedItem {
  pub(crate) id?: String,
  pub(crate) net?: Money,
  pub(crate) factor?: BigDecimal,
  pub(crate) points?: BigDecimal,
  pub(crate) linkId?: String,
  pub(crate) payment?: String,
  pub(crate) quantity?: Quantity,
  pub(crate) extension?: Extension,
  pub(crate) entity?: CodeableConcept | Reference,
  pub(crate) unitPrice?: Money,
  pub(crate) recipient?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) paymentDate?: Date,
  pub(crate) responsible?: Reference,
  pub(crate) effectiveTime?: Date,
  pub(crate) modifierExtension?: Extension,
  pub(crate) securityLabelNumber?: u32,
}

pub struct Contract_Term_Asset {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) text?: String,
  pub(crate) scope?: CodeableConcept,
  pub(crate) period?: Period,
  pub(crate) linkId?: String,
  pub(crate) answer?: Contract_Term_Offer_Answer,
  pub(crate) subtype?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) condition?: String,
  pub(crate) usePeriod?: Period,
  pub(crate) periodType?: CodeableConcept,
  pub(crate) relationship?: Coding,
  pub(crate) typeReference?: Reference,
  pub(crate) modifierExtension?: Extension,
  pub(crate) securityLabelNumber?: u32,
  pub(crate) context?: Contract_Term_Asset_Context,
  pub(crate) valuedItem?: Contract_Term_Asset_ValuedItem,
}

pub struct Contract_Term {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) text?: String,
  pub(crate) group?: Contract_Term,
  pub(crate) issued?: Date,
  pub(crate) applies?: Period,
  pub(crate) subType?: CodeableConcept,
  pub(crate) topic?: CodeableConcept | Reference,
  pub(crate) extension?: Extension,
  pub(crate) identifier?: Identifier,
  pub(crate) modifierExtension?: Extension,
  pub(crate) offer: Contract_Term_Offer,
  pub(crate) securityLabel?: Contract_Term_SecurityLabel,
  pub(crate) action?: Contract_Term_Action,
  pub(crate) asset?: Contract_Term_Asset,
}

pub struct Contract {
  pub(crate) url?: String,
  pub(crate) site?: Reference,
  pub(crate) name?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) title?: String,
  pub(crate) alias?: String,
  pub(crate) scope?: CodeableConcept,
  pub(crate) status?: String,
  pub(crate) issued?: Date,
  pub(crate) domain?: Reference,
  pub(crate) author?: Reference,
  pub(crate) version?: String,
  pub(crate) applies?: Period,
  pub(crate) subject?: Reference,
  pub(crate) subType?: CodeableConcept,
  pub(crate) subtitle?: String,
  pub(crate) topic?: CodeableConcept | Reference,
  pub(crate) authority?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) legalState?: CodeableConcept,
  pub(crate) expirationType?: CodeableConcept,
  pub(crate) supportingInfo?: Reference,
  pub(crate) instantiatesUri?: String,
  pub(crate) relevantHistory?: Reference,
  pub(crate) contentDerivative?: CodeableConcept,
  pub(crate) legallyBinding?: Attachment | Reference,
  pub(crate) instantiatesCanonical?: Reference,
  pub(crate) rule?: Contract_Rule,
  pub(crate) legal?: Contract_Legal,
  pub(crate) signer?: Contract_Signer,
  pub(crate) friendly?: Contract_Friendly,
  pub(crate) contentDefinition?: Contract_ContentDefinition,
  pub(crate) term?: Contract_Term,
}