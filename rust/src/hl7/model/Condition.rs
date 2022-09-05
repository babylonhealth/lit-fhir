use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::Union01474038381;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct Condition_Stage {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) summary: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) assessment: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Condition_Evidence {
  pub(crate) id: Option<String>,
  pub(crate) code: Vector<Box<dyn CodeableConcept>>,
  pub(crate) detail: Vector<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct ConditionRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) subject: Box<dyn Reference>,
  pub(crate) language: Option<String>,
  pub(crate) category: Vector<Box<dyn CodeableConcept>>,
  pub(crate) severity: Option<Box<dyn CodeableConcept>>,
  pub(crate) bodySite: Vector<Box<dyn CodeableConcept>>,
  pub(crate) onset: Option<Union01474038381>,
  pub(crate) recorder: Option<Box<dyn Reference>>,
  pub(crate) asserter: Option<Box<dyn Reference>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) encounter: Option<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) abatement: Option<Union01474038381>,
  pub(crate) recordedDate: Option<DateTime<FixedOffset>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) clinicalStatus: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) verificationStatus: Option<Box<dyn CodeableConcept>>,
  pub(crate) stage: Vector<Condition_Stage>,
  pub(crate) evidence: Vector<Condition_Evidence>,
}

pub trait Condition : DomainResource {
  fn code(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn subject(&self) -> &Box<dyn Reference>;
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn severity(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn bodySite(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn onset(&self) -> &Option<Union01474038381>;
  fn recorder(&self) -> &Option<Box<dyn Reference>>;
  fn asserter(&self) -> &Option<Box<dyn Reference>>;
  fn encounter(&self) -> &Option<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn abatement(&self) -> &Option<Union01474038381>;
  fn recordedDate(&self) -> &Option<DateTime<FixedOffset>>;
  fn clinicalStatus(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn verificationStatus(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn stage(&self) -> &Vector<Condition_Stage>;
  fn evidence(&self) -> &Vector<Condition_Evidence>;
}

dyn_clone::clone_trait_object!(Condition);

impl FHIRObject for ConditionRaw {
}

impl Resource for ConditionRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for ConditionRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Condition for ConditionRaw {
  fn code(&self) -> &Option<Box<dyn CodeableConcept>> { &self.code }
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn subject(&self) -> &Box<dyn Reference> { &self.subject }
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.category }
  fn severity(&self) -> &Option<Box<dyn CodeableConcept>> { &self.severity }
  fn bodySite(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.bodySite }
  fn onset(&self) -> &Option<Union01474038381> { &self.onset }
  fn recorder(&self) -> &Option<Box<dyn Reference>> { &self.recorder }
  fn asserter(&self) -> &Option<Box<dyn Reference>> { &self.asserter }
  fn encounter(&self) -> &Option<Box<dyn Reference>> { &self.encounter }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn abatement(&self) -> &Option<Union01474038381> { &self.abatement }
  fn recordedDate(&self) -> &Option<DateTime<FixedOffset>> { &self.recordedDate }
  fn clinicalStatus(&self) -> &Option<Box<dyn CodeableConcept>> { &self.clinicalStatus }
  fn verificationStatus(&self) -> &Option<Box<dyn CodeableConcept>> { &self.verificationStatus }
  fn stage(&self) -> &Vector<Condition_Stage> { &self.stage }
  fn evidence(&self) -> &Vector<Condition_Evidence> { &self.evidence }
}

