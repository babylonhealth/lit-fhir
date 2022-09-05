use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::UnionCodeableConceptOrReference;
use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Dosage::Dosage;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct MedicationDispense_Performer {
  pub(crate) id: Option<String>,
  pub(crate) actor: Box<dyn Reference>,
  pub(crate) function: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct MedicationDispense_Substitution {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) reason: Vector<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) wasSubstituted: bool,
  pub(crate) responsibleParty: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct MedicationDispenseRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) partOf: Vector<Box<dyn Reference>>,
  pub(crate) status: String,
  pub(crate) subject: Option<Box<dyn Reference>>,
  pub(crate) context: Option<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) category: Option<Box<dyn CodeableConcept>>,
  pub(crate) location: Option<Box<dyn Reference>>,
  pub(crate) quantity: Option<Box<dyn Quantity>>,
  pub(crate) receiver: Vector<Box<dyn Reference>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) daysSupply: Option<Box<dyn Quantity>>,
  pub(crate) destination: Option<Box<dyn Reference>>,
  pub(crate) whenPrepared: Option<DateTime<FixedOffset>>,
  pub(crate) eventHistory: Vector<Box<dyn Reference>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) medication: UnionCodeableConceptOrReference,
  pub(crate) detectedIssue: Vector<Box<dyn Reference>>,
  pub(crate) whenHandedOver: Option<DateTime<FixedOffset>>,
  pub(crate) statusReason: Option<UnionCodeableConceptOrReference>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) dosageInstruction: Vector<Box<dyn Dosage>>,
  pub(crate) supportingInformation: Vector<Box<dyn Reference>>,
  pub(crate) authorizingPrescription: Vector<Box<dyn Reference>>,
  pub(crate) performer: Vector<MedicationDispense_Performer>,
  pub(crate) substitution: Option<MedicationDispense_Substitution>,
}

pub trait MedicationDispense : DomainResource {
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn partOf(&self) -> &Vector<Box<dyn Reference>>;
  fn status(&self) -> &String;
  fn subject(&self) -> &Option<Box<dyn Reference>>;
  fn context(&self) -> &Option<Box<dyn Reference>>;
  fn category(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn location(&self) -> &Option<Box<dyn Reference>>;
  fn quantity(&self) -> &Option<Box<dyn Quantity>>;
  fn receiver(&self) -> &Vector<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn daysSupply(&self) -> &Option<Box<dyn Quantity>>;
  fn destination(&self) -> &Option<Box<dyn Reference>>;
  fn whenPrepared(&self) -> &Option<DateTime<FixedOffset>>;
  fn eventHistory(&self) -> &Vector<Box<dyn Reference>>;
  fn medication(&self) -> &UnionCodeableConceptOrReference;
  fn detectedIssue(&self) -> &Vector<Box<dyn Reference>>;
  fn whenHandedOver(&self) -> &Option<DateTime<FixedOffset>>;
  fn statusReason(&self) -> &Option<UnionCodeableConceptOrReference>;
  fn dosageInstruction(&self) -> &Vector<Box<dyn Dosage>>;
  fn supportingInformation(&self) -> &Vector<Box<dyn Reference>>;
  fn authorizingPrescription(&self) -> &Vector<Box<dyn Reference>>;
  fn performer(&self) -> &Vector<MedicationDispense_Performer>;
  fn substitution(&self) -> &Option<MedicationDispense_Substitution>;
}

dyn_clone::clone_trait_object!(MedicationDispense);

impl FHIRObject for MedicationDispenseRaw {
}

impl Resource for MedicationDispenseRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for MedicationDispenseRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl MedicationDispense for MedicationDispenseRaw {
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>> { &self._type }
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn partOf(&self) -> &Vector<Box<dyn Reference>> { &self.partOf }
  fn status(&self) -> &String { &self.status }
  fn subject(&self) -> &Option<Box<dyn Reference>> { &self.subject }
  fn context(&self) -> &Option<Box<dyn Reference>> { &self.context }
  fn category(&self) -> &Option<Box<dyn CodeableConcept>> { &self.category }
  fn location(&self) -> &Option<Box<dyn Reference>> { &self.location }
  fn quantity(&self) -> &Option<Box<dyn Quantity>> { &self.quantity }
  fn receiver(&self) -> &Vector<Box<dyn Reference>> { &self.receiver }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn daysSupply(&self) -> &Option<Box<dyn Quantity>> { &self.daysSupply }
  fn destination(&self) -> &Option<Box<dyn Reference>> { &self.destination }
  fn whenPrepared(&self) -> &Option<DateTime<FixedOffset>> { &self.whenPrepared }
  fn eventHistory(&self) -> &Vector<Box<dyn Reference>> { &self.eventHistory }
  fn medication(&self) -> &UnionCodeableConceptOrReference { &self.medication }
  fn detectedIssue(&self) -> &Vector<Box<dyn Reference>> { &self.detectedIssue }
  fn whenHandedOver(&self) -> &Option<DateTime<FixedOffset>> { &self.whenHandedOver }
  fn statusReason(&self) -> &Option<UnionCodeableConceptOrReference> { &self.statusReason }
  fn dosageInstruction(&self) -> &Vector<Box<dyn Dosage>> { &self.dosageInstruction }
  fn supportingInformation(&self) -> &Vector<Box<dyn Reference>> { &self.supportingInformation }
  fn authorizingPrescription(&self) -> &Vector<Box<dyn Reference>> { &self.authorizingPrescription }
  fn performer(&self) -> &Vector<MedicationDispense_Performer> { &self.performer }
  fn substitution(&self) -> &Option<MedicationDispense_Substitution> { &self.substitution }
}

