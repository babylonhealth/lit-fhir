use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Annotation::Annotation;
use crate::core::model::Attachment::Attachment;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::UnionDateTimeOrPeriod;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct MediaRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) view: Option<Box<dyn CodeableConcept>>,
  pub(crate) note: Vector<Box<dyn Annotation>>,
  pub(crate) width: Option<u32>,
  pub(crate) partOf: Vector<Box<dyn Reference>>,
  pub(crate) status: String,
  pub(crate) issued: Option<DateTime<FixedOffset>>,
  pub(crate) device: Option<Box<dyn Reference>>,
  pub(crate) height: Option<u32>,
  pub(crate) frames: Option<u32>,
  pub(crate) basedOn: Vector<Box<dyn Reference>>,
  pub(crate) subject: Option<Box<dyn Reference>>,
  pub(crate) content: Box<dyn Attachment>,
  pub(crate) language: Option<String>,
  pub(crate) modality: Option<Box<dyn CodeableConcept>>,
  pub(crate) operator: Option<Box<dyn Reference>>,
  pub(crate) bodySite: Option<Box<dyn CodeableConcept>>,
  pub(crate) duration: Option<BigDecimal>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) encounter: Option<Box<dyn Reference>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) created: Option<UnionDateTimeOrPeriod>,
  pub(crate) reasonCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) deviceName: Option<String>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

pub trait Media : DomainResource {
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn view(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn note(&self) -> &Vector<Box<dyn Annotation>>;
  fn width(&self) -> &Option<u32>;
  fn partOf(&self) -> &Vector<Box<dyn Reference>>;
  fn status(&self) -> &String;
  fn issued(&self) -> &Option<DateTime<FixedOffset>>;
  fn device(&self) -> &Option<Box<dyn Reference>>;
  fn height(&self) -> &Option<u32>;
  fn frames(&self) -> &Option<u32>;
  fn basedOn(&self) -> &Vector<Box<dyn Reference>>;
  fn subject(&self) -> &Option<Box<dyn Reference>>;
  fn content(&self) -> &Box<dyn Attachment>;
  fn modality(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn operator(&self) -> &Option<Box<dyn Reference>>;
  fn bodySite(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn duration(&self) -> &Option<BigDecimal>;
  fn encounter(&self) -> &Option<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn created(&self) -> &Option<UnionDateTimeOrPeriod>;
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn deviceName(&self) -> &Option<String>;
}

dyn_clone::clone_trait_object!(Media);

impl FHIRObject for MediaRaw {
}

impl Resource for MediaRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for MediaRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Media for MediaRaw {
  fn _type(&self) -> &Option<Box<dyn CodeableConcept>> { &self._type }
  fn view(&self) -> &Option<Box<dyn CodeableConcept>> { &self.view }
  fn note(&self) -> &Vector<Box<dyn Annotation>> { &self.note }
  fn width(&self) -> &Option<u32> { &self.width }
  fn partOf(&self) -> &Vector<Box<dyn Reference>> { &self.partOf }
  fn status(&self) -> &String { &self.status }
  fn issued(&self) -> &Option<DateTime<FixedOffset>> { &self.issued }
  fn device(&self) -> &Option<Box<dyn Reference>> { &self.device }
  fn height(&self) -> &Option<u32> { &self.height }
  fn frames(&self) -> &Option<u32> { &self.frames }
  fn basedOn(&self) -> &Vector<Box<dyn Reference>> { &self.basedOn }
  fn subject(&self) -> &Option<Box<dyn Reference>> { &self.subject }
  fn content(&self) -> &Box<dyn Attachment> { &self.content }
  fn modality(&self) -> &Option<Box<dyn CodeableConcept>> { &self.modality }
  fn operator(&self) -> &Option<Box<dyn Reference>> { &self.operator }
  fn bodySite(&self) -> &Option<Box<dyn CodeableConcept>> { &self.bodySite }
  fn duration(&self) -> &Option<BigDecimal> { &self.duration }
  fn encounter(&self) -> &Option<Box<dyn Reference>> { &self.encounter }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn created(&self) -> &Option<UnionDateTimeOrPeriod> { &self.created }
  fn reasonCode(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.reasonCode }
  fn deviceName(&self) -> &Option<String> { &self.deviceName }
}

