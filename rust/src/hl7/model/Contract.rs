use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::UnionCodeableConceptOrReference;
use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Coding::Coding;
use crate::core::model::Contract_Term::Contract_Term;
use crate::core::model::Contract_Term_Offer_Answer::Contract_Term_Offer_Answer;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Money::Money;
use crate::core::model::Period::Period;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::Signature::Signature;
use crate::hl7::Union01113166363;
use crate::hl7::UnionAttachmentOrReference;
use crate::hl7::UnionDateTimeOrPeriodOrTiming;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct Contract_Rule {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) content: UnionAttachmentOrReference,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Contract_Legal {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) content: UnionAttachmentOrReference,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Contract_Signer {
  pub(crate) id: Option<String>,
  pub(crate) _type: Coding,
  pub(crate) party: Box<Reference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) signature: Vector<Signature>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Contract_Friendly {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) content: UnionAttachmentOrReference,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct Contract_ContentDefinition {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) subType: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) publisher: Option<Box<Reference>>,
  pub(crate) copyright: Option<String>,
  pub(crate) publicationDate: Option<DateTime<FixedOffset>>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) publicationStatus: String,
}


#[derive(Clone, Debug)]
pub struct Contract_Term_Offer_Party {
  pub(crate) id: Option<String>,
  pub(crate) role: CodeableConcept,
  pub(crate) extension: Vector<Extension>,
  pub(crate) reference: Vector<Reference>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct Contract_Term_Offer_Answer {
  pub(crate) id: Option<String>,
  pub(crate) value: Union01113166363,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Contract_Term_Offer {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) text: Option<String>,
  pub(crate) topic: Option<Box<Reference>>,
  pub(crate) linkId: Vector<String>,
  pub(crate) decision: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) decisionMode: Vector<CodeableConcept>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) securityLabelNumber: Vector<u32>,
  pub(crate) party: Vector<Contract_Term_Offer_Party>,
  pub(crate) answer: Vector<Contract_Term_Offer_Answer>,
}



#[derive(Clone, Debug)]
pub struct Contract_Term_SecurityLabel {
  pub(crate) id: Option<String>,
  pub(crate) number: Vector<u32>,
  pub(crate) control: Vector<Coding>,
  pub(crate) category: Vector<Coding>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) classification: Coding,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct Contract_Term_Action_Subject {
  pub(crate) id: Option<String>,
  pub(crate) role: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) reference: Vector<Reference>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct Contract_Term_Action {
  pub(crate) id: Option<String>,
  pub(crate) _type: CodeableConcept,
  pub(crate) note: Vector<Annotation>,
  pub(crate) intent: CodeableConcept,
  pub(crate) linkId: Vector<String>,
  pub(crate) status: CodeableConcept,
  pub(crate) reason: Vector<String>,
  pub(crate) context: Option<Box<Reference>>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) requester: Vector<Reference>,
  pub(crate) performer: Option<Box<Reference>>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) doNotPerform: Option<bool>,
  pub(crate) reasonLinkId: Vector<String>,
  pub(crate) contextLinkId: Vector<String>,
  pub(crate) occurrence: Option<UnionDateTimeOrPeriodOrTiming>,
  pub(crate) performerType: Vector<CodeableConcept>,
  pub(crate) performerRole: Option<CodeableConcept>,
  pub(crate) requesterLinkId: Vector<String>,
  pub(crate) performerLinkId: Vector<String>,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) securityLabelNumber: Vector<u32>,
  pub(crate) subject: Vector<Contract_Term_Action_Subject>,
}



#[derive(Clone, Debug)]
pub struct Contract_Term_Asset_Context {
  pub(crate) id: Option<String>,
  pub(crate) code: Vector<CodeableConcept>,
  pub(crate) text: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) reference: Option<Box<Reference>>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct Contract_Term_Asset_ValuedItem {
  pub(crate) id: Option<String>,
  pub(crate) net: Option<Money>,
  pub(crate) factor: Option<BigDecimal>,
  pub(crate) points: Option<BigDecimal>,
  pub(crate) linkId: Vector<String>,
  pub(crate) payment: Option<String>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) entity: Option<UnionCodeableConceptOrReference>,
  pub(crate) unitPrice: Option<Money>,
  pub(crate) recipient: Option<Box<Reference>>,
  pub(crate) identifier: Option<Identifier>,
  pub(crate) paymentDate: Option<DateTime<FixedOffset>>,
  pub(crate) responsible: Option<Box<Reference>>,
  pub(crate) effectiveTime: Option<DateTime<FixedOffset>>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) securityLabelNumber: Vector<u32>,
}

#[derive(Clone, Debug)]
pub struct Contract_Term_Asset {
  pub(crate) id: Option<String>,
  pub(crate) _type: Vector<CodeableConcept>,
  pub(crate) text: Option<String>,
  pub(crate) scope: Option<CodeableConcept>,
  pub(crate) period: Vector<Period>,
  pub(crate) linkId: Vector<String>,
  pub(crate) answer: Vector<Contract_Term_Offer_Answer>,
  pub(crate) subtype: Vector<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) condition: Option<String>,
  pub(crate) usePeriod: Vector<Period>,
  pub(crate) periodType: Vector<CodeableConcept>,
  pub(crate) relationship: Option<Coding>,
  pub(crate) typeReference: Vector<Reference>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) securityLabelNumber: Vector<u32>,
  pub(crate) context: Vector<Contract_Term_Asset_Context>,
  pub(crate) valuedItem: Vector<Contract_Term_Asset_ValuedItem>,
}

#[derive(Clone, Debug)]
pub struct Contract_Term {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) text: Option<String>,
  pub(crate) group: Vector<Contract_Term>,
  pub(crate) issued: Option<DateTime<FixedOffset>>,
  pub(crate) applies: Option<Period>,
  pub(crate) subType: Option<CodeableConcept>,
  pub(crate) topic: Option<UnionCodeableConceptOrReference>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) identifier: Option<Identifier>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) offer: Contract_Term_Offer,
  pub(crate) securityLabel: Vector<Contract_Term_SecurityLabel>,
  pub(crate) action: Vector<Contract_Term_Action>,
  pub(crate) asset: Vector<Contract_Term_Asset>,
}

#[derive(Clone, Debug)]
pub struct Contract {
  pub(crate) url: Option<String>,
  pub(crate) site: Vector<Reference>,
  pub(crate) name: Option<String>,
  pub(crate) _type: Option<CodeableConcept>,
  pub(crate) title: Option<String>,
  pub(crate) alias: Vector<String>,
  pub(crate) scope: Option<CodeableConcept>,
  pub(crate) status: Option<String>,
  pub(crate) issued: Option<DateTime<FixedOffset>>,
  pub(crate) domain: Vector<Reference>,
  pub(crate) author: Option<Box<Reference>>,
  pub(crate) version: Option<String>,
  pub(crate) applies: Option<Period>,
  pub(crate) subject: Vector<Reference>,
  pub(crate) subType: Vector<CodeableConcept>,
  pub(crate) subtitle: Option<String>,
  pub(crate) topic: Option<UnionCodeableConceptOrReference>,
  pub(crate) authority: Vector<Reference>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) legalState: Option<CodeableConcept>,
  pub(crate) expirationType: Option<CodeableConcept>,
  pub(crate) supportingInfo: Vector<Reference>,
  pub(crate) instantiatesUri: Option<String>,
  pub(crate) relevantHistory: Vector<Reference>,
  pub(crate) contentDerivative: Option<CodeableConcept>,
  pub(crate) legallyBinding: Option<UnionAttachmentOrReference>,
  pub(crate) instantiatesCanonical: Option<Box<Reference>>,
  pub(crate) rule: Vector<Contract_Rule>,
  pub(crate) legal: Vector<Contract_Legal>,
  pub(crate) signer: Vector<Contract_Signer>,
  pub(crate) friendly: Vector<Contract_Friendly>,
  pub(crate) contentDefinition: Option<Contract_ContentDefinition>,
  pub(crate) term: Vector<Contract_Term>,
}