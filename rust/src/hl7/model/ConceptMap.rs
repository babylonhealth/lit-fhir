use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;


use crate::core::model::Meta::Meta;
use crate::hl7::model::Narrative::Narrative;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Resource::Resource;
use crate::core::model::Extension::Extension;
use crate::hl7::UnionCanonicalOrUri;
use crate::core::model::Identifier::Identifier;
use crate::core::model::UsageContext::UsageContext;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ConceptMap_Group_Element_Target_DependsOn::ConceptMap_Group_Element_Target_DependsOn;



#[derive(Clone, Debug)]
pub struct ConceptMap_Group_Unmapped {
  pub(crate) id: Option<String>,
  pub(crate) url: Option<String>,
  pub(crate) mode: String,
  pub(crate) code: Option<String>,
  pub(crate) display: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct ConceptMap_Group_Element_Target_DependsOn {
  pub(crate) id: Option<String>,
  pub(crate) value: String,
  pub(crate) system: Option<String>,
  pub(crate) display: Option<String>,
  pub(crate) property: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct ConceptMap_Group_Element_Target {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<String>,
  pub(crate) display: Option<String>,
  pub(crate) comment: Option<String>,
  pub(crate) product: Vector<ConceptMap_Group_Element_Target_DependsOn>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) equivalence: String,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) dependsOn: Vector<ConceptMap_Group_Element_Target_DependsOn>,
}

#[derive(Clone, Debug)]
pub struct ConceptMap_Group_Element {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<String>,
  pub(crate) display: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) target: Vector<ConceptMap_Group_Element_Target>,
}

#[derive(Clone, Debug)]
pub struct ConceptMap_Group {
  pub(crate) id: Option<String>,
  pub(crate) source: Option<String>,
  pub(crate) target: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) sourceVersion: Option<String>,
  pub(crate) targetVersion: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) unmapped: Option<ConceptMap_Group_Unmapped>,
  pub(crate) element: Vector<ConceptMap_Group_FHIRElement>,
}

#[derive(Clone, Debug)]
pub struct ConceptMap {
  pub(crate) url: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) title: Option<String>,
  pub(crate) status: String,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) purpose: Option<String>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) source: Option<UnionCanonicalOrUri>,
  pub(crate) target: Option<UnionCanonicalOrUri>,
  pub(crate) identifier: Option<Identifier>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) group: Vector<ConceptMap_Group>,
}