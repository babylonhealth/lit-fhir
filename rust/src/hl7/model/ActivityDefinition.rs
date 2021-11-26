use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Dosage::Dosage;
use crate::core::model::Reference::Reference;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::hl7::Union01405873694;
use crate::core::model::Identifier::Identifier;
use crate::core::UnionCodeableConceptOrReference;
use crate::core::model::UsageContext::UsageContext;
use crate::core::model::Period::Period;
use crate::core::model::RelatedArtifact::RelatedArtifact;
use crate::core::model::Expression::Expression;



#[derive(Clone, Debug)]
pub struct ActivityDefinition_Participant {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) role: Option<CodeableConcept>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct ActivityDefinition_DynamicValue {
  pub(crate) id: Option<String>,
  pub(crate) path: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) expression: Expression,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct ActivityDefinition {
  pub(crate) url: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) kind: Option<String>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) title: Option<String>,
  pub(crate) usage: Option<String>,
  pub(crate) topic: Vector<CodeableConcept>,
  pub(crate) status: String,
  pub(crate) author: Vector<ContactDetail>,
  pub(crate) editor: Vector<ContactDetail>,
  pub(crate) intent: Option<String>,
  pub(crate) dosage: Vector<Dosage>,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) purpose: Option<String>,
  pub(crate) library: Vector<String>,
  pub(crate) profile: Option<String>,
  pub(crate) subtitle: Option<String>,
  pub(crate) reviewer: Vector<ContactDetail>,
  pub(crate) endorser: Vector<ContactDetail>,
  pub(crate) priority: Option<String>,
  pub(crate) location: Option<Reference>,
  pub(crate) quantity: Option<Quantity>,
  pub(crate) bodySite: Vector<CodeableConcept>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) timing: Option<Union01405873694>,
  pub(crate) transform: Option<String>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) subject: Option<UnionCodeableConceptOrReference>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) product: Option<UnionCodeableConceptOrReference>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) approvalDate: Option<FHIRDate>,
  pub(crate) doNotPerform: Option<bool>,
  pub(crate) lastReviewDate: Option<FHIRDate>,
  pub(crate) effectivePeriod: Option<Period>,
  pub(crate) relatedArtifact: Vector<RelatedArtifact>,
  pub(crate) specimenRequirement: Vector<Reference>,
  pub(crate) observationRequirement: Vector<Reference>,
  pub(crate) observationResultRequirement: Vector<Reference>,
  pub(crate) participant: Vector<ActivityDefinition_Participant>,
  pub(crate) dynamicValue: Vector<ActivityDefinition_DynamicValue>,
}