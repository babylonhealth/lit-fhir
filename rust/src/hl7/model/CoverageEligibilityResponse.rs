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
use crate::hl7::UnionDateOrPeriod;
use crate::hl7::UnionMoneyOrStringOrUnsignedInt;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct CoverageEligibilityResponse_Error {
  pub(crate) id: Option<String>,
  pub(crate) code: Box<dyn CodeableConcept>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct CoverageEligibilityResponse_Insurance_Item_Benefit {
  pub(crate) id: Option<String>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) used: Option<UnionMoneyOrStringOrUnsignedInt>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) allowed: Option<UnionMoneyOrStringOrUnsignedInt>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct CoverageEligibilityResponse_Insurance_Item {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) unit: Option<Box<dyn CodeableConcept>>,
  pub(crate) term: Option<Box<dyn CodeableConcept>>,
  pub(crate) network: Option<Box<dyn CodeableConcept>>,
  pub(crate) category: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifier: Vector<Box<dyn CodeableConcept>>,
  pub(crate) provider: Option<Box<dyn Reference>>,
  pub(crate) excluded: Option<bool>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: Option<String>,
  pub(crate) productOrService: Option<Box<dyn CodeableConcept>>,
  pub(crate) authorizationUrl: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) authorizationRequired: Option<bool>,
  pub(crate) authorizationSupporting: Vector<Box<dyn CodeableConcept>>,
  pub(crate) benefit: Vector<CoverageEligibilityResponse_Insurance_Item_Benefit>,
}

#[derive(Clone, Debug)]
pub struct CoverageEligibilityResponse_Insurance {
  pub(crate) id: Option<String>,
  pub(crate) inforce: Option<bool>,
  pub(crate) coverage: Box<dyn Reference>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) benefitPeriod: Option<Box<dyn Period>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) item: Vector<CoverageEligibilityResponse_Insurance_Item>,
}

#[derive(Clone, Debug)]
pub struct CoverageEligibilityResponseRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) form: Option<Box<dyn CodeableConcept>>,
  pub(crate) status: String,
  pub(crate) purpose: Vector<String>,
  pub(crate) patient: Box<dyn Reference>,
  pub(crate) created: DateTime<FixedOffset>,
  pub(crate) request: Box<dyn Reference>,
  pub(crate) outcome: String,
  pub(crate) insurer: Box<dyn Reference>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) requestor: Option<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) preAuthRef: Option<String>,
  pub(crate) serviced: Option<UnionDateOrPeriod>,
  pub(crate) disposition: Option<String>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) error: Vector<CoverageEligibilityResponse_Error>,
  pub(crate) insurance: Vector<CoverageEligibilityResponse_Insurance>,
}

pub trait CoverageEligibilityResponse : DomainResource {
  fn form(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn status(&self) -> &String;
  fn purpose(&self) -> &Vector<String>;
  fn patient(&self) -> &Box<dyn Reference>;
  fn created(&self) -> &DateTime<FixedOffset>;
  fn request(&self) -> &Box<dyn Reference>;
  fn outcome(&self) -> &String;
  fn insurer(&self) -> &Box<dyn Reference>;
  fn requestor(&self) -> &Option<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn preAuthRef(&self) -> &Option<String>;
  fn serviced(&self) -> &Option<UnionDateOrPeriod>;
  fn disposition(&self) -> &Option<String>;
  fn error(&self) -> &Vector<CoverageEligibilityResponse_Error>;
  fn insurance(&self) -> &Vector<CoverageEligibilityResponse_Insurance>;
}

dyn_clone::clone_trait_object!(CoverageEligibilityResponse);

impl FHIRObject for CoverageEligibilityResponseRaw {
}

impl Resource for CoverageEligibilityResponseRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for CoverageEligibilityResponseRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl CoverageEligibilityResponse for CoverageEligibilityResponseRaw {
  fn form(&self) -> &Option<Box<dyn CodeableConcept>> { &self.form }
  fn status(&self) -> &String { &self.status }
  fn purpose(&self) -> &Vector<String> { &self.purpose }
  fn patient(&self) -> &Box<dyn Reference> { &self.patient }
  fn created(&self) -> &DateTime<FixedOffset> { &self.created }
  fn request(&self) -> &Box<dyn Reference> { &self.request }
  fn outcome(&self) -> &String { &self.outcome }
  fn insurer(&self) -> &Box<dyn Reference> { &self.insurer }
  fn requestor(&self) -> &Option<Box<dyn Reference>> { &self.requestor }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn preAuthRef(&self) -> &Option<String> { &self.preAuthRef }
  fn serviced(&self) -> &Option<UnionDateOrPeriod> { &self.serviced }
  fn disposition(&self) -> &Option<String> { &self.disposition }
  fn error(&self) -> &Vector<CoverageEligibilityResponse_Error> { &self.error }
  fn insurance(&self) -> &Vector<CoverageEligibilityResponse_Insurance> { &self.insurance }
}

