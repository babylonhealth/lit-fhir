use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::UnionAliases::UnionCodeableConceptOrReference;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::UnionDateTimeOrPeriodOrTiming;



#[derive(Clone, Debug)]
pub struct SupplyDelivery_SuppliedItem {
  pub(crate) id: Option<String>,
  pub(crate) item: Option<UnionCodeableConceptOrReference>,
  pub(crate) quantity: Option<Box<dyn Quantity>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct SupplyDeliveryRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) partOf: Vector<Box<dyn Reference>>,
  pub(crate) status: Option<String>,
  pub(crate) basedOn: Vector<Box<dyn Reference>>,
  pub(crate) patient: Option<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) supplier: Option<Box<dyn Reference>>,
  pub(crate) receiver: Vector<Box<dyn Reference>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) destination: Option<Box<dyn Reference>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) occurrence: Option<UnionDateTimeOrPeriodOrTiming>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) suppliedItem: Option<Box<SupplyDelivery_SuppliedItem>>,
}

pub trait SupplyDelivery : DomainResource {
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn partOf(&self) -> &Vector<Box<dyn Reference>>;
  fn status(&self) -> &Option<String>;
  fn basedOn(&self) -> &Vector<Box<dyn Reference>>;
  fn patient(&self) -> &Option<Box<dyn Reference>>;
  fn supplier(&self) -> &Option<Box<dyn Reference>>;
  fn receiver(&self) -> &Vector<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn destination(&self) -> &Option<Box<dyn Reference>>;
  fn occurrence(&self) -> &Option<UnionDateTimeOrPeriodOrTiming>;
  fn suppliedItem(&self) -> &Option<Box<SupplyDelivery_SuppliedItem>>;
}

dyn_clone::clone_trait_object!(SupplyDelivery);

impl FHIRObject for SupplyDeliveryRaw {
}

impl Resource for SupplyDeliveryRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for SupplyDeliveryRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl SupplyDelivery for SupplyDeliveryRaw {
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>> { &self._type }
  fn partOf(&self) -> &Vector<Box<dyn Reference>> { &self.partOf }
  fn status(&self) -> &Option<String> { &self.status }
  fn basedOn(&self) -> &Vector<Box<dyn Reference>> { &self.basedOn }
  fn patient(&self) -> &Option<Box<dyn Reference>> { &self.patient }
  fn supplier(&self) -> &Option<Box<dyn Reference>> { &self.supplier }
  fn receiver(&self) -> &Vector<Box<dyn Reference>> { &self.receiver }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn destination(&self) -> &Option<Box<dyn Reference>> { &self.destination }
  fn occurrence(&self) -> &Option<UnionDateTimeOrPeriodOrTiming> { &self.occurrence }
  fn suppliedItem(&self) -> &Option<Box<SupplyDelivery_SuppliedItem>> { &self.suppliedItem }
}

