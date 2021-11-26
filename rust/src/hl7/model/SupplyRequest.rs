use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::UnionCodeableConceptOrReference;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::Union01850316684;
use crate::hl7::UnionDateTimeOrPeriodOrTiming;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct SupplyRequest_Parameter {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<CodeableConcept>,
  pub(crate) value: Option<Union01850316684>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct SupplyRequest {
  pub(crate) status: Option<String>,
  pub(crate) item: UnionCodeableConceptOrReference,
  pub(crate) category: Option<CodeableConcept>,
  pub(crate) priority: Option<String>,
  pub(crate) quantity: Quantity,
  pub(crate) supplier: Vector<Reference>,
  pub(crate) requester: Option<Box<Reference>>,
  pub(crate) deliverTo: Option<Box<Reference>>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) authoredOn: Option<DateTime<FixedOffset>>,
  pub(crate) reasonCode: Vector<CodeableConcept>,
  pub(crate) deliverFrom: Option<Box<Reference>>,
  pub(crate) occurrence: Option<UnionDateTimeOrPeriodOrTiming>,
  pub(crate) reasonReference: Vector<Reference>,
  pub(crate) parameter: Vector<SupplyRequest_Parameter>,
}