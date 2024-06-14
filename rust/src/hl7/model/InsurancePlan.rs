use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Address::Address;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactPoint::ContactPoint;
use crate::core::model::Extension::Extension;
use crate::core::model::HumanName::HumanName;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Money::Money;
use crate::core::model::Period::Period;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct InsurancePlan_Contact {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<Box<dyn HumanName>>,
  pub(crate) purpose: Option<Box<dyn CodeableConcept>>,
  pub(crate) telecom: Vector<Box<dyn ContactPoint>>,
  pub(crate) address: Option<Box<dyn Address>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct InsurancePlan_Coverage_Benefit_Limit {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) value: Option<Box<dyn Quantity>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct InsurancePlan_Coverage_Benefit {
  pub(crate) id: Option<String>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) requirement: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) limit: Vector<Box<InsurancePlan_Coverage_Benefit_Limit>>,
}

#[derive(Clone, Debug)]
pub struct InsurancePlan_Coverage {
  pub(crate) id: Option<String>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) network: Vector<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) benefit: Vector<Box<InsurancePlan_Coverage_Benefit>>,
}


#[derive(Clone, Debug)]
pub struct InsurancePlan_Plan_GeneralCost {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) cost: Option<Box<dyn Money>>,
  pub(crate) comment: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) groupSize: Option<u32>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct InsurancePlan_Plan_SpecificCost_Benefit_Cost {
  pub(crate) id: Option<String>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) value: Option<Box<dyn Quantity>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) qualifiers: Vector<Box<dyn CodeableConcept>>,
  pub(crate) applicability: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct InsurancePlan_Plan_SpecificCost_Benefit {
  pub(crate) id: Option<String>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) cost: Vector<Box<InsurancePlan_Plan_SpecificCost_Benefit_Cost>>,
}

#[derive(Clone, Debug)]
pub struct InsurancePlan_Plan_SpecificCost {
  pub(crate) id: Option<String>,
  pub(crate) category: Box<dyn CodeableConcept>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) benefit: Vector<Box<InsurancePlan_Plan_SpecificCost_Benefit>>,
}

#[derive(Clone, Debug)]
pub struct InsurancePlan_Plan {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) network: Vector<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) coverageArea: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) generalCost: Vector<Box<InsurancePlan_Plan_GeneralCost>>,
  pub(crate) specificCost: Vector<Box<InsurancePlan_Plan_SpecificCost>>,
}

#[derive(Clone, Debug)]
pub struct InsurancePlanRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: Vector<Box<dyn CodeableConcept>>,
  pub(crate) name: Option<String>,
  pub(crate) alias: Vector<String>,
  pub(crate) status: Option<String>,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) ownedBy: Option<Box<dyn Reference>>,
  pub(crate) network: Vector<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) endpoint: Vector<Box<dyn Reference>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) coverageArea: Vector<Box<dyn Reference>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) administeredBy: Option<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) contact: Vector<Box<InsurancePlan_Contact>>,
  pub(crate) coverage: Vector<Box<InsurancePlan_Coverage>>,
  pub(crate) plan: Vector<Box<InsurancePlan_Plan>>,
}

pub trait InsurancePlan : DomainResource {
  fn _type(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn name(&self) -> Option<&String>;
  fn alias(&self) -> &Vector<String>;
  fn status(&self) -> Option<&String>;
  fn period(&self) -> Option<&Box<dyn Period>>;
  fn ownedBy(&self) -> Option<&Box<dyn Reference>>;
  fn network(&self) -> &Vector<Box<dyn Reference>>;
  fn endpoint(&self) -> &Vector<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn coverageArea(&self) -> &Vector<Box<dyn Reference>>;
  fn administeredBy(&self) -> Option<&Box<dyn Reference>>;
  fn contact(&self) -> &Vector<Box<InsurancePlan_Contact>>;
  fn coverage(&self) -> &Vector<Box<InsurancePlan_Coverage>>;
  fn plan(&self) -> &Vector<Box<InsurancePlan_Plan>>;
}

dyn_clone::clone_trait_object!(InsurancePlan);

impl FHIRObject for InsurancePlanRaw {
}

impl Resource for InsurancePlanRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for InsurancePlanRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl InsurancePlan for InsurancePlanRaw {
  fn _type(&self) -> &Vector<Box<dyn CodeableConcept>> { &self._type }
  fn name(&self) -> Option<&String> { self.name.as_ref() }
  fn alias(&self) -> &Vector<String> { &self.alias }
  fn status(&self) -> Option<&String> { self.status.as_ref() }
  fn period(&self) -> Option<&Box<dyn Period>> { self.period.as_ref() }
  fn ownedBy(&self) -> Option<&Box<dyn Reference>> { self.ownedBy.as_ref() }
  fn network(&self) -> &Vector<Box<dyn Reference>> { &self.network }
  fn endpoint(&self) -> &Vector<Box<dyn Reference>> { &self.endpoint }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn coverageArea(&self) -> &Vector<Box<dyn Reference>> { &self.coverageArea }
  fn administeredBy(&self) -> Option<&Box<dyn Reference>> { self.administeredBy.as_ref() }
  fn contact(&self) -> &Vector<Box<InsurancePlan_Contact>> { &self.contact }
  fn coverage(&self) -> &Vector<Box<InsurancePlan_Coverage>> { &self.coverage }
  fn plan(&self) -> &Vector<Box<InsurancePlan_Plan>> { &self.plan }
}

