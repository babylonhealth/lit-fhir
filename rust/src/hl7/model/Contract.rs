use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Coding::Coding;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Money::Money;
use crate::core::model::Period::Period;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::Signature::Signature;
use crate::core::model::UnionAliases::UnionCodeableConceptOrReference;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::Union01113166363;
use crate::hl7::model::UnionAliases::UnionAttachmentOrReference;
use crate::hl7::model::UnionAliases::UnionDateTimeOrPeriodOrTiming;



#[derive(Clone, Debug)]
pub struct Contract_Rule {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) content: UnionAttachmentOrReference,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Contract_Legal {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) content: UnionAttachmentOrReference,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Contract_Signer {
  pub(crate) id: Option<String>,
  pub(crate) _type: Box<dyn Coding>,
  pub(crate) party: Box<dyn Reference>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) signature: Vector<Box<dyn Signature>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Contract_Friendly {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) content: UnionAttachmentOrReference,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Contract_ContentDefinition {
  pub(crate) id: Option<String>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) subType: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) publisher: Option<Box<dyn Reference>>,
  pub(crate) copyright: Option<String>,
  pub(crate) publicationDate: Option<DateTime<FixedOffset>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) publicationStatus: String,
}


#[derive(Clone, Debug)]
pub struct Contract_Term_Offer_Party {
  pub(crate) id: Option<String>,
  pub(crate) role: Box<dyn CodeableConcept>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) reference: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct Contract_Term_Offer_Answer {
  pub(crate) id: Option<String>,
  pub(crate) value: Union01113166363,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct Contract_Term_Offer {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) text: Option<String>,
  pub(crate) topic: Option<Box<dyn Reference>>,
  pub(crate) linkId: Vector<String>,
  pub(crate) decision: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) decisionMode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) securityLabelNumber: Vector<u32>,
  pub(crate) party: Vector<Box<Contract_Term_Offer_Party>>,
  pub(crate) answer: Vector<Box<Contract_Term_Offer_Answer>>,
}



#[derive(Clone, Debug)]
pub struct Contract_Term_SecurityLabel {
  pub(crate) id: Option<String>,
  pub(crate) number: Vector<u32>,
  pub(crate) control: Vector<Box<dyn Coding>>,
  pub(crate) category: Vector<Box<dyn Coding>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) classification: Box<dyn Coding>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct Contract_Term_Action_Subject {
  pub(crate) id: Option<String>,
  pub(crate) role: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) reference: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct Contract_Term_Action {
  pub(crate) id: Option<String>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) intent: Box<dyn CodeableConcept>,
  pub(crate) linkId: Vector<String>,
  pub(crate) status: Box<dyn CodeableConcept>,
  pub(crate) reason: Vector<String>,
  pub(crate) context: Option<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) requester: Vector<Box<dyn Reference>>,
  pub(crate) performer: Option<Box<dyn Reference>>,
  pub(crate) reasonCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) doNotPerform: Option<bool>,
  pub(crate) reasonLinkId: Vector<String>,
  pub(crate) contextLinkId: Vector<String>,
  pub(crate) occurrence: Option<UnionDateTimeOrPeriodOrTiming>,
  pub(crate) performerType: Vector<Box<dyn CodeableConcept>>,
  pub(crate) performerRole: Option<Box<dyn CodeableConcept>>,
  pub(crate) requesterLinkId: Vector<String>,
  pub(crate) performerLinkId: Vector<String>,
  pub(crate) reasonReference: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) securityLabelNumber: Vector<u32>,
  pub(crate) subject: Vector<Box<Contract_Term_Action_Subject>>,
}



#[derive(Clone, Debug)]
pub struct Contract_Term_Asset_Context {
  pub(crate) id: Option<String>,
  pub(crate) code: Vector<Box<dyn CodeableConcept>>,
  pub(crate) text: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) reference: Option<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct Contract_Term_Asset_ValuedItem {
  pub(crate) id: Option<String>,
  pub(crate) net: Option<Box<dyn Money>>,
  pub(crate) factor: Option<BigDecimal>,
  pub(crate) points: Option<BigDecimal>,
  pub(crate) linkId: Vector<String>,
  pub(crate) payment: Option<String>,
  pub(crate) quantity: Option<Box<dyn Quantity>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) entity: Option<UnionCodeableConceptOrReference>,
  pub(crate) unitPrice: Option<Box<dyn Money>>,
  pub(crate) recipient: Option<Box<dyn Reference>>,
  pub(crate) identifier: Option<Box<dyn Identifier>>,
  pub(crate) paymentDate: Option<DateTime<FixedOffset>>,
  pub(crate) responsible: Option<Box<dyn Reference>>,
  pub(crate) effectiveTime: Option<DateTime<FixedOffset>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) securityLabelNumber: Vector<u32>,
}

#[derive(Clone, Debug)]
pub struct Contract_Term_Asset {
  pub(crate) id: Option<String>,
  pub(crate) _type: Vector<Box<dyn CodeableConcept>>,
  pub(crate) text: Option<String>,
  pub(crate) scope: Option<Box<dyn CodeableConcept>>,
  pub(crate) period: Vector<Box<dyn Period>>,
  pub(crate) linkId: Vector<String>,
  pub(crate) answer: Vector<Box<Contract_Term_Offer_Answer>>,
  pub(crate) subtype: Vector<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) condition: Option<String>,
  pub(crate) usePeriod: Vector<Box<dyn Period>>,
  pub(crate) periodType: Vector<Box<dyn CodeableConcept>>,
  pub(crate) relationship: Option<Box<dyn Coding>>,
  pub(crate) typeReference: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) securityLabelNumber: Vector<u32>,
  pub(crate) context: Vector<Box<Contract_Term_Asset_Context>>,
  pub(crate) valuedItem: Vector<Box<Contract_Term_Asset_ValuedItem>>,
}

#[derive(Clone, Debug)]
pub struct Contract_Term {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) text: Option<String>,
  pub(crate) group: Vector<Box<Contract_Term>>,
  pub(crate) issued: Option<DateTime<FixedOffset>>,
  pub(crate) applies: Option<Box<dyn Period>>,
  pub(crate) subType: Option<Box<dyn CodeableConcept>>,
  pub(crate) topic: Option<UnionCodeableConceptOrReference>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Option<Box<dyn Identifier>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) offer: Box<Contract_Term_Offer>,
  pub(crate) securityLabel: Vector<Box<Contract_Term_SecurityLabel>>,
  pub(crate) action: Vector<Box<Contract_Term_Action>>,
  pub(crate) asset: Vector<Box<Contract_Term_Asset>>,
}

#[derive(Clone, Debug)]
pub struct ContractRaw {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) site: Vector<Box<dyn Reference>>,
  pub(crate) name: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) title: Option<String>,
  pub(crate) alias: Vector<String>,
  pub(crate) scope: Option<Box<dyn CodeableConcept>>,
  pub(crate) status: Option<String>,
  pub(crate) issued: Option<DateTime<FixedOffset>>,
  pub(crate) domain: Vector<Box<dyn Reference>>,
  pub(crate) author: Option<Box<dyn Reference>>,
  pub(crate) version: Option<String>,
  pub(crate) applies: Option<Box<dyn Period>>,
  pub(crate) subject: Vector<Box<dyn Reference>>,
  pub(crate) subType: Vector<Box<dyn CodeableConcept>>,
  pub(crate) language: Option<String>,
  pub(crate) subtitle: Option<String>,
  pub(crate) topic: Option<UnionCodeableConceptOrReference>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) authority: Vector<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) legalState: Option<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) expirationType: Option<Box<dyn CodeableConcept>>,
  pub(crate) supportingInfo: Vector<Box<dyn Reference>>,
  pub(crate) instantiatesUri: Option<String>,
  pub(crate) relevantHistory: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) contentDerivative: Option<Box<dyn CodeableConcept>>,
  pub(crate) legallyBinding: Option<UnionAttachmentOrReference>,
  pub(crate) instantiatesCanonical: Option<Box<dyn Reference>>,
  pub(crate) rule: Vector<Box<Contract_Rule>>,
  pub(crate) legal: Vector<Box<Contract_Legal>>,
  pub(crate) signer: Vector<Box<Contract_Signer>>,
  pub(crate) friendly: Vector<Box<Contract_Friendly>>,
  pub(crate) contentDefinition: Option<Box<Contract_ContentDefinition>>,
  pub(crate) term: Vector<Box<Contract_Term>>,
}

pub trait Contract : DomainResource {
  fn url(&self) -> &Option<String>;
  fn site(&self) -> &Vector<Box<dyn Reference>>;
  fn name(&self) -> &Option<String>;
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn title(&self) -> &Option<String>;
  fn alias(&self) -> &Vector<String>;
  fn scope(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn status(&self) -> &Option<String>;
  fn issued(&self) -> &Option<DateTime<FixedOffset>>;
  fn domain(&self) -> &Vector<Box<dyn Reference>>;
  fn author(&self) -> &Option<Box<dyn Reference>>;
  fn version(&self) -> &Option<String>;
  fn applies(&self) -> &Option<Box<dyn Period>>;
  fn subject(&self) -> &Vector<Box<dyn Reference>>;
  fn subType(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn subtitle(&self) -> &Option<String>;
  fn topic(&self) -> &Option<UnionCodeableConceptOrReference>;
  fn authority(&self) -> &Vector<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn legalState(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn expirationType(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn supportingInfo(&self) -> &Vector<Box<dyn Reference>>;
  fn instantiatesUri(&self) -> &Option<String>;
  fn relevantHistory(&self) -> &Vector<Box<dyn Reference>>;
  fn contentDerivative(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn legallyBinding(&self) -> &Option<UnionAttachmentOrReference>;
  fn instantiatesCanonical(&self) -> &Option<Box<dyn Reference>>;
  fn rule(&self) -> &Vector<Box<Contract_Rule>>;
  fn legal(&self) -> &Vector<Box<Contract_Legal>>;
  fn signer(&self) -> &Vector<Box<Contract_Signer>>;
  fn friendly(&self) -> &Vector<Box<Contract_Friendly>>;
  fn contentDefinition(&self) -> &Option<Box<Contract_ContentDefinition>>;
  fn term(&self) -> &Vector<Box<Contract_Term>>;
}

dyn_clone::clone_trait_object!(Contract);

impl FHIRObject for ContractRaw {
}

impl Resource for ContractRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for ContractRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Contract for ContractRaw {
  fn url(&self) -> &Option<String> { &self.url }
  fn site(&self) -> &Vector<Box<dyn Reference>> { &self.site }
  fn name(&self) -> &Option<String> { &self.name }
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>> { &self._type }
  fn title(&self) -> &Option<String> { &self.title }
  fn alias(&self) -> &Vector<String> { &self.alias }
  fn scope(&self) -> &Option<Box<dyn CodeableConcept>> { &self.scope }
  fn status(&self) -> &Option<String> { &self.status }
  fn issued(&self) -> &Option<DateTime<FixedOffset>> { &self.issued }
  fn domain(&self) -> &Vector<Box<dyn Reference>> { &self.domain }
  fn author(&self) -> &Option<Box<dyn Reference>> { &self.author }
  fn version(&self) -> &Option<String> { &self.version }
  fn applies(&self) -> &Option<Box<dyn Period>> { &self.applies }
  fn subject(&self) -> &Vector<Box<dyn Reference>> { &self.subject }
  fn subType(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.subType }
  fn subtitle(&self) -> &Option<String> { &self.subtitle }
  fn topic(&self) -> &Option<UnionCodeableConceptOrReference> { &self.topic }
  fn authority(&self) -> &Vector<Box<dyn Reference>> { &self.authority }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn legalState(&self) -> &Option<Box<dyn CodeableConcept>> { &self.legalState }
  fn expirationType(&self) -> &Option<Box<dyn CodeableConcept>> { &self.expirationType }
  fn supportingInfo(&self) -> &Vector<Box<dyn Reference>> { &self.supportingInfo }
  fn instantiatesUri(&self) -> &Option<String> { &self.instantiatesUri }
  fn relevantHistory(&self) -> &Vector<Box<dyn Reference>> { &self.relevantHistory }
  fn contentDerivative(&self) -> &Option<Box<dyn CodeableConcept>> { &self.contentDerivative }
  fn legallyBinding(&self) -> &Option<UnionAttachmentOrReference> { &self.legallyBinding }
  fn instantiatesCanonical(&self) -> &Option<Box<dyn Reference>> { &self.instantiatesCanonical }
  fn rule(&self) -> &Vector<Box<Contract_Rule>> { &self.rule }
  fn legal(&self) -> &Vector<Box<Contract_Legal>> { &self.legal }
  fn signer(&self) -> &Vector<Box<Contract_Signer>> { &self.signer }
  fn friendly(&self) -> &Vector<Box<Contract_Friendly>> { &self.friendly }
  fn contentDefinition(&self) -> &Option<Box<Contract_ContentDefinition>> { &self.contentDefinition }
  fn term(&self) -> &Vector<Box<Contract_Term>> { &self.term }
}

