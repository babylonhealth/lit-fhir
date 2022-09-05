use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Range::Range;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct ObservationDefinition_QualifiedInterval {
  pub(crate) id: Option<String>,
  pub(crate) age: Option<Box<dyn Range>>,
  pub(crate) range: Option<Box<dyn Range>>,
  pub(crate) gender: Option<String>,
  pub(crate) context: Option<Box<dyn CodeableConcept>>,
  pub(crate) category: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) appliesTo: Vector<Box<dyn CodeableConcept>>,
  pub(crate) condition: Option<String>,
  pub(crate) gestationalAge: Option<Box<dyn Range>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct ObservationDefinition_QuantitativeDetails {
  pub(crate) id: Option<String>,
  pub(crate) unit: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) customaryUnit: Option<Box<dyn CodeableConcept>>,
  pub(crate) conversionFactor: Option<BigDecimal>,
  pub(crate) decimalPrecision: Option<i32>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct ObservationDefinitionRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) code: Box<dyn CodeableConcept>,
  pub(crate) method: Option<Box<dyn CodeableConcept>>,
  pub(crate) language: Option<String>,
  pub(crate) category: Vector<Box<dyn CodeableConcept>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) permittedDataType: Vector<String>,
  pub(crate) validCodedValueSet: Option<Box<dyn Reference>>,
  pub(crate) preferredReportName: Option<String>,
  pub(crate) normalCodedValueSet: Option<Box<dyn Reference>>,
  pub(crate) abnormalCodedValueSet: Option<Box<dyn Reference>>,
  pub(crate) criticalCodedValueSet: Option<Box<dyn Reference>>,
  pub(crate) multipleResultsAllowed: Option<bool>,
  pub(crate) qualifiedInterval: Vector<ObservationDefinition_QualifiedInterval>,
  pub(crate) quantitativeDetails: Option<ObservationDefinition_QuantitativeDetails>,
}

pub trait ObservationDefinition : DomainResource {
  fn code(&self) -> &Box<dyn CodeableConcept>;
  fn method(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn permittedDataType(&self) -> &Vector<String>;
  fn validCodedValueSet(&self) -> &Option<Box<dyn Reference>>;
  fn preferredReportName(&self) -> &Option<String>;
  fn normalCodedValueSet(&self) -> &Option<Box<dyn Reference>>;
  fn abnormalCodedValueSet(&self) -> &Option<Box<dyn Reference>>;
  fn criticalCodedValueSet(&self) -> &Option<Box<dyn Reference>>;
  fn multipleResultsAllowed(&self) -> &Option<bool>;
  fn qualifiedInterval(&self) -> &Vector<ObservationDefinition_QualifiedInterval>;
  fn quantitativeDetails(&self) -> &Option<ObservationDefinition_QuantitativeDetails>;
}

dyn_clone::clone_trait_object!(ObservationDefinition);

impl FHIRObject for ObservationDefinitionRaw {
}

impl Resource for ObservationDefinitionRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for ObservationDefinitionRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl ObservationDefinition for ObservationDefinitionRaw {
  fn code(&self) -> &Box<dyn CodeableConcept> { &self.code }
  fn method(&self) -> &Option<Box<dyn CodeableConcept>> { &self.method }
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.category }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn permittedDataType(&self) -> &Vector<String> { &self.permittedDataType }
  fn validCodedValueSet(&self) -> &Option<Box<dyn Reference>> { &self.validCodedValueSet }
  fn preferredReportName(&self) -> &Option<String> { &self.preferredReportName }
  fn normalCodedValueSet(&self) -> &Option<Box<dyn Reference>> { &self.normalCodedValueSet }
  fn abnormalCodedValueSet(&self) -> &Option<Box<dyn Reference>> { &self.abnormalCodedValueSet }
  fn criticalCodedValueSet(&self) -> &Option<Box<dyn Reference>> { &self.criticalCodedValueSet }
  fn multipleResultsAllowed(&self) -> &Option<bool> { &self.multipleResultsAllowed }
  fn qualifiedInterval(&self) -> &Vector<ObservationDefinition_QualifiedInterval> { &self.qualifiedInterval }
  fn quantitativeDetails(&self) -> &Option<ObservationDefinition_QuantitativeDetails> { &self.quantitativeDetails }
}

