use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::UnionCodeableConceptOrReference;
use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Money::Money;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::UnionDateTimeOrPeriodOrTiming;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct ChargeItem_Performer {
  pub(crate) id: Option<String>,
  pub(crate) actor: Box<dyn Reference>,
  pub(crate) function: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct ChargeItemRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) code: Box<dyn CodeableConcept>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) status: String,
  pub(crate) partOf: Vector<Box<dyn Reference>>,
  pub(crate) reason: Vector<Box<dyn CodeableConcept>>,
  pub(crate) subject: Box<dyn Reference>,
  pub(crate) context: Option<Box<dyn Reference>>,
  pub(crate) enterer: Option<Box<dyn Reference>>,
  pub(crate) service: Vector<Box<dyn Reference>>,
  pub(crate) account: Vector<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) quantity: Option<Box<dyn Quantity>>,
  pub(crate) bodysite: Vector<Box<dyn CodeableConcept>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) costCenter: Option<Box<dyn Reference>>,
  pub(crate) product: Option<UnionCodeableConceptOrReference>,
  pub(crate) enteredDate: Option<DateTime<FixedOffset>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) definitionUri: Vector<String>,
  pub(crate) occurrence: Option<UnionDateTimeOrPeriodOrTiming>,
  pub(crate) priceOverride: Option<Box<dyn Money>>,
  pub(crate) factorOverride: Option<BigDecimal>,
  pub(crate) overrideReason: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) definitionCanonical: Vector<String>,
  pub(crate) supportingInformation: Vector<Box<dyn Reference>>,
  pub(crate) performingOrganization: Option<Box<dyn Reference>>,
  pub(crate) requestingOrganization: Option<Box<dyn Reference>>,
  pub(crate) performer: Vector<ChargeItem_Performer>,
}

pub trait ChargeItem : DomainResource {
  fn code(&self) -> &Box<dyn CodeableConcept>;
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn status(&self) -> &String;
  fn partOf(&self) -> &Vector<Box<dyn Reference>>;
  fn reason(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn subject(&self) -> &Box<dyn Reference>;
  fn context(&self) -> &Option<Box<dyn Reference>>;
  fn enterer(&self) -> &Option<Box<dyn Reference>>;
  fn service(&self) -> &Vector<Box<dyn Reference>>;
  fn account(&self) -> &Vector<Box<dyn Reference>>;
  fn quantity(&self) -> &Option<Box<dyn Quantity>>;
  fn bodysite(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn costCenter(&self) -> &Option<Box<dyn Reference>>;
  fn product(&self) -> &Option<UnionCodeableConceptOrReference>;
  fn enteredDate(&self) -> &Option<DateTime<FixedOffset>>;
  fn definitionUri(&self) -> &Vector<String>;
  fn occurrence(&self) -> &Option<UnionDateTimeOrPeriodOrTiming>;
  fn priceOverride(&self) -> &Option<Box<dyn Money>>;
  fn factorOverride(&self) -> &Option<BigDecimal>;
  fn overrideReason(&self) -> &Option<String>;
  fn definitionCanonical(&self) -> &Vector<String>;
  fn supportingInformation(&self) -> &Vector<Box<dyn Reference>>;
  fn performingOrganization(&self) -> &Option<Box<dyn Reference>>;
  fn requestingOrganization(&self) -> &Option<Box<dyn Reference>>;
  fn performer(&self) -> &Vector<ChargeItem_Performer>;
}

dyn_clone::clone_trait_object!(ChargeItem);

impl FHIRObject for ChargeItemRaw {
}

impl Resource for ChargeItemRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for ChargeItemRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl ChargeItem for ChargeItemRaw {
  fn code(&self) -> &Box<dyn CodeableConcept> { &self.code }
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn status(&self) -> &String { &self.status }
  fn partOf(&self) -> &Vector<Box<dyn Reference>> { &self.partOf }
  fn reason(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.reason }
  fn subject(&self) -> &Box<dyn Reference> { &self.subject }
  fn context(&self) -> &Option<Box<dyn Reference>> { &self.context }
  fn enterer(&self) -> &Option<Box<dyn Reference>> { &self.enterer }
  fn service(&self) -> &Vector<Box<dyn Reference>> { &self.service }
  fn account(&self) -> &Vector<Box<dyn Reference>> { &self.account }
  fn quantity(&self) -> &Option<Box<dyn Quantity>> { &self.quantity }
  fn bodysite(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.bodysite }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn costCenter(&self) -> &Option<Box<dyn Reference>> { &self.costCenter }
  fn product(&self) -> &Option<UnionCodeableConceptOrReference> { &self.product }
  fn enteredDate(&self) -> &Option<DateTime<FixedOffset>> { &self.enteredDate }
  fn definitionUri(&self) -> &Vector<String> { &self.definitionUri }
  fn occurrence(&self) -> &Option<UnionDateTimeOrPeriodOrTiming> { &self.occurrence }
  fn priceOverride(&self) -> &Option<Box<dyn Money>> { &self.priceOverride }
  fn factorOverride(&self) -> &Option<BigDecimal> { &self.factorOverride }
  fn overrideReason(&self) -> &Option<String> { &self.overrideReason }
  fn definitionCanonical(&self) -> &Vector<String> { &self.definitionCanonical }
  fn supportingInformation(&self) -> &Vector<Box<dyn Reference>> { &self.supportingInformation }
  fn performingOrganization(&self) -> &Option<Box<dyn Reference>> { &self.performingOrganization }
  fn requestingOrganization(&self) -> &Option<Box<dyn Reference>> { &self.requestingOrganization }
  fn performer(&self) -> &Vector<ChargeItem_Performer> { &self.performer }
}

