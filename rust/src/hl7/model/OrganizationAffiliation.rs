use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactPoint::ContactPoint;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct OrganizationAffiliationRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) code: Vector<Box<dyn CodeableConcept>>,
  pub(crate) active: Option<bool>,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) network: Vector<Box<dyn Reference>>,
  pub(crate) telecom: Vector<Box<dyn ContactPoint>>,
  pub(crate) language: Option<String>,
  pub(crate) location: Vector<Box<dyn Reference>>,
  pub(crate) endpoint: Vector<Box<dyn Reference>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) specialty: Vector<Box<dyn CodeableConcept>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) organization: Option<Box<dyn Reference>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) healthcareService: Vector<Box<dyn Reference>>,
  pub(crate) participatingOrganization: Option<Box<dyn Reference>>,
}

pub trait OrganizationAffiliation : DomainResource {
  fn code(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn active(&self) -> &Option<bool>;
  fn period(&self) -> &Option<Box<dyn Period>>;
  fn network(&self) -> &Vector<Box<dyn Reference>>;
  fn telecom(&self) -> &Vector<Box<dyn ContactPoint>>;
  fn location(&self) -> &Vector<Box<dyn Reference>>;
  fn endpoint(&self) -> &Vector<Box<dyn Reference>>;
  fn specialty(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn organization(&self) -> &Option<Box<dyn Reference>>;
  fn healthcareService(&self) -> &Vector<Box<dyn Reference>>;
  fn participatingOrganization(&self) -> &Option<Box<dyn Reference>>;
}

dyn_clone::clone_trait_object!(OrganizationAffiliation);

impl FHIRObject for OrganizationAffiliationRaw {
}

impl Resource for OrganizationAffiliationRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for OrganizationAffiliationRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl OrganizationAffiliation for OrganizationAffiliationRaw {
  fn code(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.code }
  fn active(&self) -> &Option<bool> { &self.active }
  fn period(&self) -> &Option<Box<dyn Period>> { &self.period }
  fn network(&self) -> &Vector<Box<dyn Reference>> { &self.network }
  fn telecom(&self) -> &Vector<Box<dyn ContactPoint>> { &self.telecom }
  fn location(&self) -> &Vector<Box<dyn Reference>> { &self.location }
  fn endpoint(&self) -> &Vector<Box<dyn Reference>> { &self.endpoint }
  fn specialty(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.specialty }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn organization(&self) -> &Option<Box<dyn Reference>> { &self.organization }
  fn healthcareService(&self) -> &Vector<Box<dyn Reference>> { &self.healthcareService }
  fn participatingOrganization(&self) -> &Option<Box<dyn Reference>> { &self.participatingOrganization }
}

