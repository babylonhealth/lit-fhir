use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::UnionCodeableConceptOrReference;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Duration::Duration;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Range::Range;
use crate::core::model::Resource::Resource;
use crate::hl7::UnionQuantityOrString;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct SpecimenDefinition_TypeTested_Handling {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) maxDuration: Option<Box<dyn Duration>>,
  pub(crate) instruction: Option<String>,
  pub(crate) temperatureRange: Option<Box<dyn Range>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) temperatureQualifier: Option<Box<dyn CodeableConcept>>,
}



#[derive(Clone, Debug)]
pub struct SpecimenDefinition_TypeTested_Container_Additive {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) additive: UnionCodeableConceptOrReference,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct SpecimenDefinition_TypeTested_Container {
  pub(crate) id: Option<String>,
  pub(crate) cap: Option<Box<dyn CodeableConcept>>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) material: Option<Box<dyn CodeableConcept>>,
  pub(crate) capacity: Option<Box<dyn Quantity>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: Option<String>,
  pub(crate) preparation: Option<String>,
  pub(crate) minimumVolume: Option<UnionQuantityOrString>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) additive: Vector<SpecimenDefinition_TypeTested_Container_Additive>,
}

#[derive(Clone, Debug)]
pub struct SpecimenDefinition_TypeTested {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) isDerived: Option<bool>,
  pub(crate) preference: String,
  pub(crate) requirement: Option<String>,
  pub(crate) retentionTime: Option<Box<dyn Duration>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) rejectionCriterion: Vector<Box<dyn CodeableConcept>>,
  pub(crate) handling: Vector<SpecimenDefinition_TypeTested_Handling>,
  pub(crate) container: Option<SpecimenDefinition_TypeTested_Container>,
}

#[derive(Clone, Debug)]
pub struct SpecimenDefinitionRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Option<Box<dyn Identifier>>,
  pub(crate) timeAspect: Option<String>,
  pub(crate) collection: Vector<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) typeCollected: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) patientPreparation: Vector<Box<dyn CodeableConcept>>,
  pub(crate) typeTested: Vector<SpecimenDefinition_TypeTested>,
}

pub trait SpecimenDefinition : DomainResource {
  fn identifier(&self) -> &Option<Box<dyn Identifier>>;
  fn timeAspect(&self) -> &Option<String>;
  fn collection(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn typeCollected(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn patientPreparation(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn typeTested(&self) -> &Vector<SpecimenDefinition_TypeTested>;
}

dyn_clone::clone_trait_object!(SpecimenDefinition);

impl FHIRObject for SpecimenDefinitionRaw {
}

impl Resource for SpecimenDefinitionRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for SpecimenDefinitionRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl SpecimenDefinition for SpecimenDefinitionRaw {
  fn identifier(&self) -> &Option<Box<dyn Identifier>> { &self.identifier }
  fn timeAspect(&self) -> &Option<String> { &self.timeAspect }
  fn collection(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.collection }
  fn typeCollected(&self) -> &Option<Box<dyn CodeableConcept>> { &self.typeCollected }
  fn patientPreparation(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.patientPreparation }
  fn typeTested(&self) -> &Vector<SpecimenDefinition_TypeTested> { &self.typeTested }
}

