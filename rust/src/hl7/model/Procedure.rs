use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Annotation::Annotation;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::Union01474038381;



#[derive(Clone, Debug)]
pub struct Procedure_Performer {
  pub(crate) id: Option<String>,
  pub(crate) actor: Box<dyn Reference>,
  pub(crate) function: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) onBehalfOf: Option<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Procedure_FocalDevice {
  pub(crate) id: Option<String>,
  pub(crate) action: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) manipulated: Box<dyn Reference>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct ProcedureRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) partOf: Vector<Box<dyn Reference>>,
  pub(crate) status: String,
  pub(crate) report: Vector<Box<dyn Reference>>,
  pub(crate) basedOn: Vector<Box<dyn Reference>>,
  pub(crate) subject: Box<dyn Reference>,
  pub(crate) outcome: Option<Box<dyn CodeableConcept>>,
  pub(crate) language: Option<String>,
  pub(crate) category: Option<Box<dyn CodeableConcept>>,
  pub(crate) recorder: Option<Box<dyn Reference>>,
  pub(crate) asserter: Option<Box<dyn Reference>>,
  pub(crate) location: Option<Box<dyn Reference>>,
  pub(crate) bodySite: Vector<Box<dyn CodeableConcept>>,
  pub(crate) followUp: Vector<Box<dyn CodeableConcept>>,
  pub(crate) usedCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) encounter: Option<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) reasonCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) statusReason: Option<Box<dyn CodeableConcept>>,
  pub(crate) performed: Option<Union01474038381>,
  pub(crate) complication: Vector<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) usedReference: Vector<Box<dyn Reference>>,
  pub(crate) instantiatesUri: Vector<String>,
  pub(crate) reasonReference: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) complicationDetail: Vector<Box<dyn Reference>>,
  pub(crate) instantiatesCanonical: Vector<String>,
  pub(crate) performer: Vector<Box<Procedure_Performer>>,
  pub(crate) focalDevice: Vector<Box<Procedure_FocalDevice>>,
}

pub trait Procedure : DomainResource {
  fn code(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn partOf(&self) -> &Vector<Box<dyn Reference>>;
  fn status(&self) -> &String;
  fn report(&self) -> &Vector<Box<dyn Reference>>;
  fn basedOn(&self) -> &Vector<Box<dyn Reference>>;
  fn subject(&self) -> &Box<dyn Reference>;
  fn outcome(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn category(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn recorder(&self) -> &Option<Box<dyn Reference>>;
  fn asserter(&self) -> &Option<Box<dyn Reference>>;
  fn location(&self) -> &Option<Box<dyn Reference>>;
  fn bodySite(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn followUp(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn usedCode(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn encounter(&self) -> &Option<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn statusReason(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn performed(&self) -> &Option<Union01474038381>;
  fn complication(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn usedReference(&self) -> &Vector<Box<dyn Reference>>;
  fn instantiatesUri(&self) -> &Vector<String>;
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>>;
  fn complicationDetail(&self) -> &Vector<Box<dyn Reference>>;
  fn instantiatesCanonical(&self) -> &Vector<String>;
  fn performer(&self) -> &Vector<Box<Procedure_Performer>>;
  fn focalDevice(&self) -> &Vector<Box<Procedure_FocalDevice>>;
}

dyn_clone::clone_trait_object!(Procedure);

impl FHIRObject for ProcedureRaw {
}

impl Resource for ProcedureRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for ProcedureRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Procedure for ProcedureRaw {
  fn code(&self) -> &Option<Box<dyn CodeableConcept>> { &self.code }
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn partOf(&self) -> &Vector<Box<dyn Reference>> { &self.partOf }
  fn status(&self) -> &String { &self.status }
  fn report(&self) -> &Vector<Box<dyn Reference>> { &self.report }
  fn basedOn(&self) -> &Vector<Box<dyn Reference>> { &self.basedOn }
  fn subject(&self) -> &Box<dyn Reference> { &self.subject }
  fn outcome(&self) -> &Option<Box<dyn CodeableConcept>> { &self.outcome }
  fn category(&self) -> &Option<Box<dyn CodeableConcept>> { &self.category }
  fn recorder(&self) -> &Option<Box<dyn Reference>> { &self.recorder }
  fn asserter(&self) -> &Option<Box<dyn Reference>> { &self.asserter }
  fn location(&self) -> &Option<Box<dyn Reference>> { &self.location }
  fn bodySite(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.bodySite }
  fn followUp(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.followUp }
  fn usedCode(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.usedCode }
  fn encounter(&self) -> &Option<Box<dyn Reference>> { &self.encounter }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.reasonCode }
  fn statusReason(&self) -> &Option<Box<dyn CodeableConcept>> { &self.statusReason }
  fn performed(&self) -> &Option<Union01474038381> { &self.performed }
  fn complication(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.complication }
  fn usedReference(&self) -> &Vector<Box<dyn Reference>> { &self.usedReference }
  fn instantiatesUri(&self) -> &Vector<String> { &self.instantiatesUri }
  fn reasonReference(&self) -> &Vector<Box<dyn Reference>> { &self.reasonReference }
  fn complicationDetail(&self) -> &Vector<Box<dyn Reference>> { &self.complicationDetail }
  fn instantiatesCanonical(&self) -> &Vector<String> { &self.instantiatesCanonical }
  fn performer(&self) -> &Vector<Box<Procedure_Performer>> { &self.performer }
  fn focalDevice(&self) -> &Vector<Box<Procedure_FocalDevice>> { &self.focalDevice }
}

