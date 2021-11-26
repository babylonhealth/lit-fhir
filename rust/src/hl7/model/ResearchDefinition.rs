use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::UnionCodeableConceptOrReference;
use crate::core::model::UsageContext::UsageContext;
use crate::core::model::Period::Period;
use crate::core::model::RelatedArtifact::RelatedArtifact;



#[derive(Clone, Debug)]
pub struct ResearchDefinition {
  pub(crate) url: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) title: Option<String>,
  pub(crate) usage: Option<String>,
  pub(crate) topic: Vector<CodeableConcept>,
  pub(crate) status: String,
  pub(crate) author: Vector<ContactDetail>,
  pub(crate) editor: Vector<ContactDetail>,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) comment: Vector<String>,
  pub(crate) purpose: Option<String>,
  pub(crate) library: Vector<String>,
  pub(crate) outcome: Option<Box<Reference>>,
  pub(crate) subtitle: Option<String>,
  pub(crate) reviewer: Vector<ContactDetail>,
  pub(crate) endorser: Vector<ContactDetail>,
  pub(crate) exposure: Option<Box<Reference>>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) shortTitle: Option<String>,
  pub(crate) subject: Option<UnionCodeableConceptOrReference>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) population: Box<Reference>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) approvalDate: Option<FHIRDate>,
  pub(crate) lastReviewDate: Option<FHIRDate>,
  pub(crate) effectivePeriod: Option<Period>,
  pub(crate) relatedArtifact: Vector<RelatedArtifact>,
  pub(crate) exposureAlternative: Option<Box<Reference>>,
}