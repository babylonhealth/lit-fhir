use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Dosage::Dosage;
use crate::core::model::Duration::Duration;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Period::Period;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::UnionAliases::UnionBooleanOrCodeableConcept;
use crate::core::model::UnionAliases::UnionCodeableConceptOrReference;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::UnionBooleanOrReference;



#[derive(Clone, Debug)]
pub struct MedicationRequest_Substitution {
  pub(crate) id: Option<String>,
  pub(crate) reason: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) allowed: UnionBooleanOrCodeableConcept,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct MedicationRequest_DispenseRequest_InitialFill {
  pub(crate) id: Option<String>,
  pub(crate) quantity: Option<Box<dyn Quantity>>,
  pub(crate) duration: Option<Box<dyn Duration>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct MedicationRequest_DispenseRequest {
  pub(crate) id: Option<String>,
  pub(crate) quantity: Option<Box<dyn Quantity>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) performer: Option<Box<dyn Reference>>,
  pub(crate) validityPeriod: Option<Box<dyn Period>>,
  pub(crate) dispenseInterval: Option<Box<dyn Duration>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) numberOfRepeatsAllowed: Option<u32>,
  pub(crate) expectedSupplyDuration: Option<Box<dyn Duration>>,
  pub(crate) initialFill: Option<Box<MedicationRequest_DispenseRequest_InitialFill>>,
}

#[derive(Clone, Debug)]
pub struct MedicationRequestRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) status: String,
  pub(crate) intent: String,
  pub(crate) subject: Box<dyn Reference>,
  pub(crate) basedOn: Vector<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) category: Vector<Box<dyn CodeableConcept>>,
  pub(crate) priority: Option<String>,
  pub(crate) recorder: Option<Box<dyn Reference>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) encounter: Option<Box<dyn Reference>>,
  pub(crate) requester: Option<Box<dyn Reference>>,
  pub(crate) performer: Option<Box<dyn Reference>>,
  pub(crate) insurance: Vector<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) authoredOn: Option<DateTime<FixedOffset>>,
  pub(crate) reasonCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) reported: Option<UnionBooleanOrReference>,
  pub(crate) statusReason: Option<Box<dyn CodeableConcept>>,
  pub(crate) doNotPerform: Option<bool>,
  pub(crate) eventHistory: Vector<Box<dyn Reference>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) medication: UnionCodeableConceptOrReference,
  pub(crate) performerType: Option<Box<dyn CodeableConcept>>,
  pub(crate) detectedIssue: Vector<Box<dyn Reference>>,
  pub(crate) reasonReference: Vector<Box<dyn Reference>>,
  pub(crate) instantiatesUri: Vector<String>,
  pub(crate) groupIdentifier: Option<Box<dyn Identifier>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) dosageInstruction: Vector<Box<dyn Dosage>>,
  pub(crate) priorPrescription: Option<Box<dyn Reference>>,
  pub(crate) courseOfTherapyType: Option<Box<dyn CodeableConcept>>,
  pub(crate) supportingInformation: Vector<Box<dyn Reference>>,
  pub(crate) instantiatesCanonical: Vector<String>,
  pub(crate) substitution: Option<Box<MedicationRequest_Substitution>>,
  pub(crate) dispenseRequest: Option<Box<MedicationRequest_DispenseRequest>>,
}

pub trait MedicationRequest : DomainResource {
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn status(&self) -> &String;
  fn intent(&self) -> &String;
  fn subject(&self) -> &Box<dyn Reference>;
  fn basedOn(&self) -> &Vector<Box<dyn Reference>>;
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn priority(&self) -> Option<&String>;
  fn recorder(&self) -> Option<&Box<dyn Reference>>;
  fn encounter(&self) -> Option<&Box<dyn Reference>>;
  fn requester(&self) -> Option<&Box<dyn Reference>>;
  fn performer(&self) -> Option<&Box<dyn Reference>>;
  fn insurance(&self) -> &Vector<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn authoredOn(&self) -> Option<&DateTime<FixedOffset>>;
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn reported(&self) -> Option<&UnionBooleanOrReference>;
  fn statusReason(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn doNotPerform(&self) -> Option<&bool>;
  fn eventHistory(&self) -> &Vector<Box<dyn Reference>>;
  fn medication(&self) -> &UnionCodeableConceptOrReference;
  fn performerType(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn detectedIssue(&self) -> &Vector<Box<dyn Reference>>;
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>>;
  fn instantiatesUri(&self) -> &Vector<String>;
  fn groupIdentifier(&self) -> Option<&Box<dyn Identifier>>;
  fn dosageInstruction(&self) -> &Vector<Box<dyn Dosage>>;
  fn priorPrescription(&self) -> Option<&Box<dyn Reference>>;
  fn courseOfTherapyType(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn supportingInformation(&self) -> &Vector<Box<dyn Reference>>;
  fn instantiatesCanonical(&self) -> &Vector<String>;
  fn substitution(&self) -> Option<&Box<MedicationRequest_Substitution>>;
  fn dispenseRequest(&self) -> Option<&Box<MedicationRequest_DispenseRequest>>;
}

dyn_clone::clone_trait_object!(MedicationRequest);

impl FHIRObject for MedicationRequestRaw {
}

impl Resource for MedicationRequestRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for MedicationRequestRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl MedicationRequest for MedicationRequestRaw {
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn status(&self) -> &String { &self.status }
  fn intent(&self) -> &String { &self.intent }
  fn subject(&self) -> &Box<dyn Reference> { &self.subject }
  fn basedOn(&self) -> &Vector<Box<dyn Reference>> { &self.basedOn }
  fn category(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.category }
  fn priority(&self) -> Option<&String> { self.priority.as_ref() }
  fn recorder(&self) -> Option<&Box<dyn Reference>> { self.recorder.as_ref() }
  fn encounter(&self) -> Option<&Box<dyn Reference>> { self.encounter.as_ref() }
  fn requester(&self) -> Option<&Box<dyn Reference>> { self.requester.as_ref() }
  fn performer(&self) -> Option<&Box<dyn Reference>> { self.performer.as_ref() }
  fn insurance(&self) -> &Vector<Box<dyn Reference>> { &self.insurance }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn authoredOn(&self) -> Option<&DateTime<FixedOffset>> { self.authoredOn.as_ref() }
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.reasonCode }
  fn reported(&self) -> Option<&UnionBooleanOrReference> { self.reported.as_ref() }
  fn statusReason(&self) -> Option<&Box<dyn CodeableConcept>> { self.statusReason.as_ref() }
  fn doNotPerform(&self) -> Option<&bool> { self.doNotPerform.as_ref() }
  fn eventHistory(&self) -> &Vector<Box<dyn Reference>> { &self.eventHistory }
  fn medication(&self) -> &UnionCodeableConceptOrReference { &self.medication }
  fn performerType(&self) -> Option<&Box<dyn CodeableConcept>> { self.performerType.as_ref() }
  fn detectedIssue(&self) -> &Vector<Box<dyn Reference>> { &self.detectedIssue }
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>> { &self.reasonReference }
  fn instantiatesUri(&self) -> &Vector<String> { &self.instantiatesUri }
  fn groupIdentifier(&self) -> Option<&Box<dyn Identifier>> { self.groupIdentifier.as_ref() }
  fn dosageInstruction(&self) -> &Vector<Box<dyn Dosage>> { &self.dosageInstruction }
  fn priorPrescription(&self) -> Option<&Box<dyn Reference>> { self.priorPrescription.as_ref() }
  fn courseOfTherapyType(&self) -> Option<&Box<dyn CodeableConcept>> { self.courseOfTherapyType.as_ref() }
  fn supportingInformation(&self) -> &Vector<Box<dyn Reference>> { &self.supportingInformation }
  fn instantiatesCanonical(&self) -> &Vector<String> { &self.instantiatesCanonical }
  fn substitution(&self) -> Option<&Box<MedicationRequest_Substitution>> { self.substitution.as_ref() }
  fn dispenseRequest(&self) -> Option<&Box<MedicationRequest_DispenseRequest>> { self.dispenseRequest.as_ref() }
}

