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
use crate::hl7::UnionMoneyOrQuantity;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct Coverage_Class {
  pub(crate) id: Option<String>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) name: Option<String>,
  pub(crate) value: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Coverage_CostToBeneficiary_Exception {
  pub(crate) id: Option<String>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct Coverage_CostToBeneficiary {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) value: UnionMoneyOrQuantity,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) exception: Vector<Coverage_CostToBeneficiary_Exception>,
}

#[derive(Clone, Debug)]
pub struct CoverageRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) payor: Vector<Box<dyn Reference>>,
  pub(crate) order: Option<u32>,
  pub(crate) status: String,
  pub(crate) period: Option<Box<dyn Period>>,
  pub(crate) network: Option<String>,
  pub(crate) language: Option<String>,
  pub(crate) contract: Vector<Box<dyn Reference>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) dependent: Option<String>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) subscriber: Option<Box<dyn Reference>>,
  pub(crate) beneficiary: Box<dyn Reference>,
  pub(crate) subrogation: Option<bool>,
  pub(crate) policyHolder: Option<Box<dyn Reference>>,
  pub(crate) subscriberId: Option<String>,
  pub(crate) relationship: Option<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) class: Vector<Coverage_Class>,
  pub(crate) costToBeneficiary: Vector<Coverage_CostToBeneficiary>,
}

pub trait Coverage : DomainResource {
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn payor(&self) -> &Vector<Box<dyn Reference>>;
  fn order(&self) -> &Option<u32>;
  fn status(&self) -> &String;
  fn period(&self) -> &Option<Box<dyn Period>>;
  fn network(&self) -> &Option<String>;
  fn contract(&self) -> &Vector<Box<dyn Reference>>;
  fn dependent(&self) -> &Option<String>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn subscriber(&self) -> &Option<Box<dyn Reference>>;
  fn beneficiary(&self) -> &Box<dyn Reference>;
  fn subrogation(&self) -> &Option<bool>;
  fn policyHolder(&self) -> &Option<Box<dyn Reference>>;
  fn subscriberId(&self) -> &Option<String>;
  fn relationship(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn class(&self) -> &Vector<Coverage_Class>;
  fn costToBeneficiary(&self) -> &Vector<Coverage_CostToBeneficiary>;
}

dyn_clone::clone_trait_object!(Coverage);

impl FHIRObject for CoverageRaw {
}

impl Resource for CoverageRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for CoverageRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Coverage for CoverageRaw {
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>> { &self._type }
  fn payor(&self) -> &Vector<Box<dyn Reference>> { &self.payor }
  fn order(&self) -> &Option<u32> { &self.order }
  fn status(&self) -> &String { &self.status }
  fn period(&self) -> &Option<Box<dyn Period>> { &self.period }
  fn network(&self) -> &Option<String> { &self.network }
  fn contract(&self) -> &Vector<Box<dyn Reference>> { &self.contract }
  fn dependent(&self) -> &Option<String> { &self.dependent }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn subscriber(&self) -> &Option<Box<dyn Reference>> { &self.subscriber }
  fn beneficiary(&self) -> &Box<dyn Reference> { &self.beneficiary }
  fn subrogation(&self) -> &Option<bool> { &self.subrogation }
  fn policyHolder(&self) -> &Option<Box<dyn Reference>> { &self.policyHolder }
  fn subscriberId(&self) -> &Option<String> { &self.subscriberId }
  fn relationship(&self) -> &Option<Box<dyn CodeableConcept>> { &self.relationship }
  fn class(&self) -> &Vector<Coverage_Class> { &self.class }
  fn costToBeneficiary(&self) -> &Vector<Coverage_CostToBeneficiary> { &self.costToBeneficiary }
}

