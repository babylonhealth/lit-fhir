use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::Union00659500323;
use crate::hl7::model::UnionAliases::UnionAgeOrRangeOrString;
use crate::hl7::model::UnionAliases::UnionDateOrPeriodOrString;
use crate::hl7::model::UnionAliases::Union_1204024681;



#[derive(Clone, Debug)]
pub struct FamilyMemberHistory_Condition {
  pub(crate) id: Option<String>,
  pub(crate) code: Box<dyn CodeableConcept>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) outcome: Option<Box<dyn CodeableConcept>>,
  pub(crate) onset: Option<Box<Union_1204024681>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) contributedToDeath: Option<bool>,
}

#[derive(Clone, Debug)]
pub struct FamilyMemberHistoryRaw {
  pub(crate) id: Option<String>,
  pub(crate) sex: Option<Box<dyn CodeableConcept>>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) name: Option<String>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) status: String,
  pub(crate) age: Option<UnionAgeOrRangeOrString>,
  pub(crate) patient: Box<dyn Reference>,
  pub(crate) born: Option<UnionDateOrPeriodOrString>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) reasonCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) deceased: Option<Union00659500323>,
  pub(crate) relationship: Box<dyn CodeableConcept>,
  pub(crate) estimatedAge: Option<bool>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) instantiatesUri: Vector<String>,
  pub(crate) reasonReference: Vector<Box<dyn Reference>>,
  pub(crate) dataAbsentReason: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) instantiatesCanonical: Vector<String>,
  pub(crate) condition: Vector<Box<FamilyMemberHistory_Condition>>,
}

pub trait FamilyMemberHistory : DomainResource {
  fn sex(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn date(&self) -> Option<&DateTime<FixedOffset>>;
  fn name(&self) -> Option<&String>;
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn status(&self) -> &String;
  fn age(&self) -> Option<&UnionAgeOrRangeOrString>;
  fn patient(&self) -> &Box<dyn Reference>;
  fn born(&self) -> Option<&UnionDateOrPeriodOrString>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn deceased(&self) -> Option<&Union00659500323>;
  fn relationship(&self) -> &Box<dyn CodeableConcept>;
  fn estimatedAge(&self) -> Option<&bool>;
  fn instantiatesUri(&self) -> &Vector<String>;
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>>;
  fn dataAbsentReason(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn instantiatesCanonical(&self) -> &Vector<String>;
  fn condition(&self) -> &Vector<Box<FamilyMemberHistory_Condition>>;
}

dyn_clone::clone_trait_object!(FamilyMemberHistory);

impl FHIRObject for FamilyMemberHistoryRaw {
}

impl Resource for FamilyMemberHistoryRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for FamilyMemberHistoryRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl FamilyMemberHistory for FamilyMemberHistoryRaw {
  fn sex(&self) -> Option<&Box<dyn CodeableConcept>> { self.sex.as_ref() }
  fn date(&self) -> Option<&DateTime<FixedOffset>> { self.date.as_ref() }
  fn name(&self) -> Option<&String> { self.name.as_ref() }
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn status(&self) -> &String { &self.status }
  fn age(&self) -> Option<&UnionAgeOrRangeOrString> { self.age.as_ref() }
  fn patient(&self) -> &Box<dyn Reference> { &self.patient }
  fn born(&self) -> Option<&UnionDateOrPeriodOrString> { self.born.as_ref() }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.reasonCode }
  fn deceased(&self) -> Option<&Union00659500323> { self.deceased.as_ref() }
  fn relationship(&self) -> &Box<dyn CodeableConcept> { &self.relationship }
  fn estimatedAge(&self) -> Option<&bool> { self.estimatedAge.as_ref() }
  fn instantiatesUri(&self) -> &Vector<String> { &self.instantiatesUri }
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>> { &self.reasonReference }
  fn dataAbsentReason(&self) -> Option<&Box<dyn CodeableConcept>> { self.dataAbsentReason.as_ref() }
  fn instantiatesCanonical(&self) -> &Vector<String> { &self.instantiatesCanonical }
  fn condition(&self) -> &Vector<Box<FamilyMemberHistory_Condition>> { &self.condition }
}

