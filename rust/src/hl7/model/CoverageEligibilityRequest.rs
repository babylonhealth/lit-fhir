use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::UnionCodeableConceptOrReference;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Money::Money;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::UnionDateOrPeriod;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct CoverageEligibilityRequest_Insurance {
  pub(crate) id: Option<String>,
  pub(crate) focal: Option<bool>,
  pub(crate) coverage: Box<dyn Reference>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) businessArrangement: Option<String>,
}


#[derive(Clone, Debug)]
pub struct CoverageEligibilityRequest_SupportingInfo {
  pub(crate) id: Option<String>,
  pub(crate) sequence: u32,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) information: Box<dyn Reference>,
  pub(crate) appliesToAll: Option<bool>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct CoverageEligibilityRequest_Item_Diagnosis {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) diagnosis: Option<UnionCodeableConceptOrReference>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct CoverageEligibilityRequest_Item {
  pub(crate) id: Option<String>,
  pub(crate) detail: Vector<Box<dyn Reference>>,
  pub(crate) category: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifier: Vector<Box<dyn CodeableConcept>>,
  pub(crate) provider: Option<Box<dyn Reference>>,
  pub(crate) quantity: Option<Box<dyn Quantity>>,
  pub(crate) facility: Option<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) unitPrice: Option<Box<dyn Money>>,
  pub(crate) productOrService: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) supportingInfoSequence: Vector<u32>,
  pub(crate) diagnosis: Vector<CoverageEligibilityRequest_Item_Diagnosis>,
}

#[derive(Clone, Debug)]
pub struct CoverageEligibilityRequestRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) status: String,
  pub(crate) purpose: Vector<String>,
  pub(crate) patient: Box<dyn Reference>,
  pub(crate) created: DateTime<FixedOffset>,
  pub(crate) enterer: Option<Box<dyn Reference>>,
  pub(crate) insurer: Box<dyn Reference>,
  pub(crate) language: Option<String>,
  pub(crate) priority: Option<Box<dyn CodeableConcept>>,
  pub(crate) provider: Option<Box<dyn Reference>>,
  pub(crate) facility: Option<Box<dyn Reference>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) serviced: Option<UnionDateOrPeriod>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) insurance: Vector<CoverageEligibilityRequest_Insurance>,
  pub(crate) supportingInfo: Vector<CoverageEligibilityRequest_SupportingInfo>,
  pub(crate) item: Vector<CoverageEligibilityRequest_Item>,
}

pub trait CoverageEligibilityRequest : DomainResource {
  fn status(&self) -> &String;
  fn purpose(&self) -> &Vector<String>;
  fn patient(&self) -> &Box<dyn Reference>;
  fn created(&self) -> &DateTime<FixedOffset>;
  fn enterer(&self) -> &Option<Box<dyn Reference>>;
  fn insurer(&self) -> &Box<dyn Reference>;
  fn priority(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn provider(&self) -> &Option<Box<dyn Reference>>;
  fn facility(&self) -> &Option<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn serviced(&self) -> &Option<UnionDateOrPeriod>;
  fn insurance(&self) -> &Vector<CoverageEligibilityRequest_Insurance>;
  fn supportingInfo(&self) -> &Vector<CoverageEligibilityRequest_SupportingInfo>;
  fn item(&self) -> &Vector<CoverageEligibilityRequest_Item>;
}

dyn_clone::clone_trait_object!(CoverageEligibilityRequest);

impl FHIRObject for CoverageEligibilityRequestRaw {
}

impl Resource for CoverageEligibilityRequestRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for CoverageEligibilityRequestRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl CoverageEligibilityRequest for CoverageEligibilityRequestRaw {
  fn status(&self) -> &String { &self.status }
  fn purpose(&self) -> &Vector<String> { &self.purpose }
  fn patient(&self) -> &Box<dyn Reference> { &self.patient }
  fn created(&self) -> &DateTime<FixedOffset> { &self.created }
  fn enterer(&self) -> &Option<Box<dyn Reference>> { &self.enterer }
  fn insurer(&self) -> &Box<dyn Reference> { &self.insurer }
  fn priority(&self) -> &Option<Box<dyn CodeableConcept>> { &self.priority }
  fn provider(&self) -> &Option<Box<dyn Reference>> { &self.provider }
  fn facility(&self) -> &Option<Box<dyn Reference>> { &self.facility }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn serviced(&self) -> &Option<UnionDateOrPeriod> { &self.serviced }
  fn insurance(&self) -> &Vector<CoverageEligibilityRequest_Insurance> { &self.insurance }
  fn supportingInfo(&self) -> &Vector<CoverageEligibilityRequest_SupportingInfo> { &self.supportingInfo }
  fn item(&self) -> &Vector<CoverageEligibilityRequest_Item> { &self.item }
}

