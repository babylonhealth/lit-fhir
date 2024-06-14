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
use crate::hl7::model::UnionAliases::Union01850316684;
use crate::hl7::model::UnionAliases::UnionDateTimeOrPeriodOrTiming;



#[derive(Clone, Debug)]
pub struct SupplyRequest_Parameter {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) value: Option<Union01850316684>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct SupplyRequestRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) status: Option<String>,
  pub(crate) item: UnionCodeableConceptOrReference,
  pub(crate) language: Option<String>,
  pub(crate) category: Option<Box<dyn CodeableConcept>>,
  pub(crate) priority: Option<String>,
  pub(crate) quantity: Box<dyn Quantity>,
  pub(crate) supplier: Vector<Box<dyn Reference>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) requester: Option<Box<dyn Reference>>,
  pub(crate) deliverTo: Option<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) authoredOn: Option<DateTime<FixedOffset>>,
  pub(crate) reasonCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) deliverFrom: Option<Box<dyn Reference>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) occurrence: Option<UnionDateTimeOrPeriodOrTiming>,
  pub(crate) reasonReference: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) parameter: Vector<Box<SupplyRequest_Parameter>>,
}

pub trait SupplyRequest : DomainResource {
  fn status(&self) -> Option<&String>;
  fn item(&self) -> &UnionCodeableConceptOrReference;
  fn category(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn priority(&self) -> Option<&String>;
  fn quantity(&self) -> &Box<dyn Quantity>;
  fn supplier(&self) -> &Vector<Box<dyn Reference>>;
  fn requester(&self) -> Option<&Box<dyn Reference>>;
  fn deliverTo(&self) -> Option<&Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn authoredOn(&self) -> Option<&DateTime<FixedOffset>>;
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn deliverFrom(&self) -> Option<&Box<dyn Reference>>;
  fn occurrence(&self) -> Option<&UnionDateTimeOrPeriodOrTiming>;
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>>;
  fn parameter(&self) -> &Vector<Box<SupplyRequest_Parameter>>;
}

dyn_clone::clone_trait_object!(SupplyRequest);

impl FHIRObject for SupplyRequestRaw {
}

impl Resource for SupplyRequestRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for SupplyRequestRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl SupplyRequest for SupplyRequestRaw {
  fn status(&self) -> Option<&String> { self.status.as_ref() }
  fn item(&self) -> &UnionCodeableConceptOrReference { &self.item }
  fn category(&self) -> Option<&Box<dyn CodeableConcept>> { self.category.as_ref() }
  fn priority(&self) -> Option<&String> { self.priority.as_ref() }
  fn quantity(&self) -> &Box<dyn Quantity> { &self.quantity }
  fn supplier(&self) -> &Vector<Box<dyn Reference>> { &self.supplier }
  fn requester(&self) -> Option<&Box<dyn Reference>> { self.requester.as_ref() }
  fn deliverTo(&self) -> Option<&Box<dyn Reference>> { self.deliverTo.as_ref() }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn authoredOn(&self) -> Option<&DateTime<FixedOffset>> { self.authoredOn.as_ref() }
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.reasonCode }
  fn deliverFrom(&self) -> Option<&Box<dyn Reference>> { self.deliverFrom.as_ref() }
  fn occurrence(&self) -> Option<&UnionDateTimeOrPeriodOrTiming> { self.occurrence.as_ref() }
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>> { &self.reasonReference }
  fn parameter(&self) -> &Vector<Box<SupplyRequest_Parameter>> { &self.parameter }
}

