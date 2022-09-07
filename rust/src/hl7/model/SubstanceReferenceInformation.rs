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
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::UnionQuantityOrRangeOrString;



#[derive(Clone, Debug)]
pub struct SubstanceReferenceInformation_Gene {
  pub(crate) id: Option<String>,
  pub(crate) gene: Option<Box<dyn CodeableConcept>>,
  pub(crate) source: Vector<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) geneSequenceOrigin: Option<Box<dyn CodeableConcept>>,
}


#[derive(Clone, Debug)]
pub struct SubstanceReferenceInformation_Target {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) target: Option<Box<dyn Identifier>>,
  pub(crate) source: Vector<Box<dyn Reference>>,
  pub(crate) organism: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) amount: Option<UnionQuantityOrRangeOrString>,
  pub(crate) amountType: Option<Box<dyn CodeableConcept>>,
  pub(crate) interaction: Option<Box<dyn CodeableConcept>>,
  pub(crate) organismType: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct SubstanceReferenceInformation_GeneElement {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) source: Vector<Box<dyn Reference>>,
  pub(crate) element: Option<Box<dyn Identifier>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct SubstanceReferenceInformation_Classification {
  pub(crate) id: Option<String>,
  pub(crate) domain: Option<Box<dyn CodeableConcept>>,
  pub(crate) source: Vector<Box<dyn Reference>>,
  pub(crate) subtype: Vector<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) classification: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct SubstanceReferenceInformationRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) comment: Option<String>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) gene: Vector<Box<SubstanceReferenceInformation_Gene>>,
  pub(crate) target: Vector<Box<SubstanceReferenceInformation_Target>>,
  pub(crate) geneElement: Vector<Box<SubstanceReferenceInformation_GeneElement>>,
  pub(crate) classification: Vector<Box<SubstanceReferenceInformation_Classification>>,
}

pub trait SubstanceReferenceInformation : DomainResource {
  fn comment(&self) -> Option<&String>;
  fn gene(&self) -> &Vector<Box<SubstanceReferenceInformation_Gene>>;
  fn target(&self) -> &Vector<Box<SubstanceReferenceInformation_Target>>;
  fn geneElement(&self) -> &Vector<Box<SubstanceReferenceInformation_GeneElement>>;
  fn classification(&self) -> &Vector<Box<SubstanceReferenceInformation_Classification>>;
}

dyn_clone::clone_trait_object!(SubstanceReferenceInformation);

impl FHIRObject for SubstanceReferenceInformationRaw {
}

impl Resource for SubstanceReferenceInformationRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for SubstanceReferenceInformationRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl SubstanceReferenceInformation for SubstanceReferenceInformationRaw {
  fn comment(&self) -> Option<&String> { self.comment.as_ref() }
  fn gene(&self) -> &Vector<Box<SubstanceReferenceInformation_Gene>> { &self.gene }
  fn target(&self) -> &Vector<Box<SubstanceReferenceInformation_Target>> { &self.target }
  fn geneElement(&self) -> &Vector<Box<SubstanceReferenceInformation_GeneElement>> { &self.geneElement }
  fn classification(&self) -> &Vector<Box<SubstanceReferenceInformation_Classification>> { &self.classification }
}

