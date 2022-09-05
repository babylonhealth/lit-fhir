use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::UnionDateTimeOrString;
use crate::hl7::UnionPositiveIntOrString;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct Immunization_Reaction {
  pub(crate) id: Option<String>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) detail: Option<Box<dyn Reference>>,
  pub(crate) reported: Option<bool>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Immunization_Performer {
  pub(crate) id: Option<String>,
  pub(crate) actor: Box<dyn Reference>,
  pub(crate) function: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Immunization_Education {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) reference: Option<String>,
  pub(crate) documentType: Option<String>,
  pub(crate) publicationDate: Option<DateTime<FixedOffset>>,
  pub(crate) presentationDate: Option<DateTime<FixedOffset>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Immunization_ProtocolApplied {
  pub(crate) id: Option<String>,
  pub(crate) series: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) authority: Option<Box<dyn Reference>>,
  pub(crate) targetDisease: Vector<Box<dyn CodeableConcept>>,
  pub(crate) doseNumber: UnionPositiveIntOrString,
  pub(crate) seriesDoses: Option<UnionPositiveIntOrString>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct ImmunizationRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) site: Option<Box<dyn CodeableConcept>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) route: Option<Box<dyn CodeableConcept>>,
  pub(crate) status: String,
  pub(crate) patient: Box<dyn Reference>,
  pub(crate) language: Option<String>,
  pub(crate) recorded: Option<DateTime<FixedOffset>>,
  pub(crate) location: Option<Box<dyn Reference>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) encounter: Option<Box<dyn Reference>>,
  pub(crate) lotNumber: Option<String>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) reasonCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) vaccineCode: Box<dyn CodeableConcept>,
  pub(crate) isSubpotent: Option<bool>,
  pub(crate) statusReason: Option<Box<dyn CodeableConcept>>,
  pub(crate) reportOrigin: Option<Box<dyn CodeableConcept>>,
  pub(crate) manufacturer: Option<Box<dyn Reference>>,
  pub(crate) doseQuantity: Option<Box<dyn Quantity>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) occurrence: UnionDateTimeOrString,
  pub(crate) primarySource: Option<bool>,
  pub(crate) fundingSource: Option<Box<dyn CodeableConcept>>,
  pub(crate) expirationDate: Option<FHIRDate>,
  pub(crate) reasonReference: Vector<Box<dyn Reference>>,
  pub(crate) subpotentReason: Vector<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) programEligibility: Vector<Box<dyn CodeableConcept>>,
  pub(crate) reaction: Vector<Immunization_Reaction>,
  pub(crate) performer: Vector<Immunization_Performer>,
  pub(crate) education: Vector<Immunization_Education>,
  pub(crate) protocolApplied: Vector<Immunization_ProtocolApplied>,
}

pub trait Immunization : DomainResource {
  fn site(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn route(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn status(&self) -> &String;
  fn patient(&self) -> &Box<dyn Reference>;
  fn recorded(&self) -> &Option<DateTime<FixedOffset>>;
  fn location(&self) -> &Option<Box<dyn Reference>>;
  fn encounter(&self) -> &Option<Box<dyn Reference>>;
  fn lotNumber(&self) -> &Option<String>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn vaccineCode(&self) -> &Box<dyn CodeableConcept>;
  fn isSubpotent(&self) -> &Option<bool>;
  fn statusReason(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn reportOrigin(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn manufacturer(&self) -> &Option<Box<dyn Reference>>;
  fn doseQuantity(&self) -> &Option<Box<dyn Quantity>>;
  fn occurrence(&self) -> &UnionDateTimeOrString;
  fn primarySource(&self) -> &Option<bool>;
  fn fundingSource(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn expirationDate(&self) -> &Option<FHIRDate>;
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>>;
  fn subpotentReason(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn programEligibility(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn reaction(&self) -> &Vector<Immunization_Reaction>;
  fn performer(&self) -> &Vector<Immunization_Performer>;
  fn education(&self) -> &Vector<Immunization_Education>;
  fn protocolApplied(&self) -> &Vector<Immunization_ProtocolApplied>;
}

dyn_clone::clone_trait_object!(Immunization);

impl FHIRObject for ImmunizationRaw {
}

impl Resource for ImmunizationRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for ImmunizationRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Immunization for ImmunizationRaw {
  fn site(&self) -> &Option<Box<dyn CodeableConcept>> { &self.site }
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn route(&self) -> &Option<Box<dyn CodeableConcept>> { &self.route }
  fn status(&self) -> &String { &self.status }
  fn patient(&self) -> &Box<dyn Reference> { &self.patient }
  fn recorded(&self) -> &Option<DateTime<FixedOffset>> { &self.recorded }
  fn location(&self) -> &Option<Box<dyn Reference>> { &self.location }
  fn encounter(&self) -> &Option<Box<dyn Reference>> { &self.encounter }
  fn lotNumber(&self) -> &Option<String> { &self.lotNumber }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.reasonCode }
  fn vaccineCode(&self) -> &Box<dyn CodeableConcept> { &self.vaccineCode }
  fn isSubpotent(&self) -> &Option<bool> { &self.isSubpotent }
  fn statusReason(&self) -> &Option<Box<dyn CodeableConcept>> { &self.statusReason }
  fn reportOrigin(&self) -> &Option<Box<dyn CodeableConcept>> { &self.reportOrigin }
  fn manufacturer(&self) -> &Option<Box<dyn Reference>> { &self.manufacturer }
  fn doseQuantity(&self) -> &Option<Box<dyn Quantity>> { &self.doseQuantity }
  fn occurrence(&self) -> &UnionDateTimeOrString { &self.occurrence }
  fn primarySource(&self) -> &Option<bool> { &self.primarySource }
  fn fundingSource(&self) -> &Option<Box<dyn CodeableConcept>> { &self.fundingSource }
  fn expirationDate(&self) -> &Option<FHIRDate> { &self.expirationDate }
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>> { &self.reasonReference }
  fn subpotentReason(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.subpotentReason }
  fn programEligibility(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.programEligibility }
  fn reaction(&self) -> &Vector<Immunization_Reaction> { &self.reaction }
  fn performer(&self) -> &Vector<Immunization_Performer> { &self.performer }
  fn education(&self) -> &Vector<Immunization_Education> { &self.education }
  fn protocolApplied(&self) -> &Vector<Immunization_ProtocolApplied> { &self.protocolApplied }
}

