use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::UnionDateTimeOrPeriod;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct MedicinalProductAuthorization_Procedure {
  pub(crate) id: Option<String>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) date: Option<UnionDateTimeOrPeriod>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Option<Box<dyn Identifier>>,
  pub(crate) application: Vector<Box<dyn MedicinalProductAuthorization_Procedure>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct MedicinalProductAuthorization_JurisdictionalAuthorization {
  pub(crate) id: Option<String>,
  pub(crate) country: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) jurisdiction: Vector<Box<dyn CodeableConcept>>,
  pub(crate) validityPeriod: Option<Box<dyn Period>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) legalStatusOfSupply: Option<Box<dyn CodeableConcept>>,
}

#[derive(Clone, Debug)]
pub struct MedicinalProductAuthorizationRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) status: Option<Box<dyn CodeableConcept>>,
  pub(crate) holder: Option<Box<dyn Reference>>,
  pub(crate) subject: Option<Box<dyn Reference>>,
  pub(crate) country: Vector<Box<dyn CodeableConcept>>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) regulator: Option<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) statusDate: Option<DateTime<FixedOffset>>,
  pub(crate) legalBasis: Option<Box<dyn CodeableConcept>>,
  pub(crate) restoreDate: Option<DateTime<FixedOffset>>,
  pub(crate) jurisdiction: Vector<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) validityPeriod: Option<Box<dyn Period>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) dataExclusivityPeriod: Option<Box<dyn Period>>,
  pub(crate) internationalBirthDate: Option<DateTime<FixedOffset>>,
  pub(crate) dateOfFirstAuthorization: Option<DateTime<FixedOffset>>,
  pub(crate) procedure: Option<MedicinalProductAuthorization_Procedure>,
  pub(crate) jurisdictionalAuthorization: Vector<MedicinalProductAuthorization_JurisdictionalAuthorization>,
}

pub trait MedicinalProductAuthorization : DomainResource {
  fn status(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn holder(&self) -> &Option<Box<dyn Reference>>;
  fn subject(&self) -> &Option<Box<dyn Reference>>;
  fn country(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn regulator(&self) -> &Option<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn statusDate(&self) -> &Option<DateTime<FixedOffset>>;
  fn legalBasis(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn restoreDate(&self) -> &Option<DateTime<FixedOffset>>;
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn validityPeriod(&self) -> &Option<Box<dyn Period>>;
  fn dataExclusivityPeriod(&self) -> &Option<Box<dyn Period>>;
  fn internationalBirthDate(&self) -> &Option<DateTime<FixedOffset>>;
  fn dateOfFirstAuthorization(&self) -> &Option<DateTime<FixedOffset>>;
  fn procedure(&self) -> &Option<MedicinalProductAuthorization_Procedure>;
  fn jurisdictionalAuthorization(&self) -> &Vector<MedicinalProductAuthorization_JurisdictionalAuthorization>;
}

dyn_clone::clone_trait_object!(MedicinalProductAuthorization);

impl FHIRObject for MedicinalProductAuthorizationRaw {
}

impl Resource for MedicinalProductAuthorizationRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for MedicinalProductAuthorizationRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl MedicinalProductAuthorization for MedicinalProductAuthorizationRaw {
  fn status(&self) -> &Option<Box<dyn CodeableConcept>> { &self.status }
  fn holder(&self) -> &Option<Box<dyn Reference>> { &self.holder }
  fn subject(&self) -> &Option<Box<dyn Reference>> { &self.subject }
  fn country(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.country }
  fn regulator(&self) -> &Option<Box<dyn Reference>> { &self.regulator }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn statusDate(&self) -> &Option<DateTime<FixedOffset>> { &self.statusDate }
  fn legalBasis(&self) -> &Option<Box<dyn CodeableConcept>> { &self.legalBasis }
  fn restoreDate(&self) -> &Option<DateTime<FixedOffset>> { &self.restoreDate }
  fn jurisdiction(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.jurisdiction }
  fn validityPeriod(&self) -> &Option<Box<dyn Period>> { &self.validityPeriod }
  fn dataExclusivityPeriod(&self) -> &Option<Box<dyn Period>> { &self.dataExclusivityPeriod }
  fn internationalBirthDate(&self) -> &Option<DateTime<FixedOffset>> { &self.internationalBirthDate }
  fn dateOfFirstAuthorization(&self) -> &Option<DateTime<FixedOffset>> { &self.dateOfFirstAuthorization }
  fn procedure(&self) -> &Option<MedicinalProductAuthorization_Procedure> { &self.procedure }
  fn jurisdictionalAuthorization(&self) -> &Vector<MedicinalProductAuthorization_JurisdictionalAuthorization> { &self.jurisdictionalAuthorization }
}

