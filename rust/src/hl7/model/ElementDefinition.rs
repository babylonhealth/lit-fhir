use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::BackboneElement::BackboneElement;
use crate::core::model::Coding::Coding;
use crate::core::model::Extension::Extension;
use crate::core::model::FHIRElement::FHIRElement;
use crate::core::model::UnionAliases::UnionAll;
use crate::hl7::model::UnionAliases::Union01480857620;



#[derive(Clone, Debug)]
pub struct ElementDefinition_Base {
  pub(crate) id: Option<String>,
  pub(crate) min: u32,
  pub(crate) max: String,
  pub(crate) path: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct ElementDefinition_Example {
  pub(crate) id: Option<String>,
  pub(crate) label: String,
  pub(crate) value: UnionAll,
  pub(crate) extension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct ElementDefinition_Mapping {
  pub(crate) id: Option<String>,
  pub(crate) map: String,
  pub(crate) comment: Option<String>,
  pub(crate) identity: String,
  pub(crate) language: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct ElementDefinition_Type {
  pub(crate) id: Option<String>,
  pub(crate) code: String,
  pub(crate) profile: Vector<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) versioning: Option<String>,
  pub(crate) aggregation: Vector<String>,
  pub(crate) targetProfile: Vector<String>,
}


#[derive(Clone, Debug)]
pub struct ElementDefinition_Binding {
  pub(crate) id: Option<String>,
  pub(crate) strength: String,
  pub(crate) valueSet: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: Option<String>,
}


#[derive(Clone, Debug)]
pub struct ElementDefinition_Constraint {
  pub(crate) id: Option<String>,
  pub(crate) key: String,
  pub(crate) human: String,
  pub(crate) xpath: Option<String>,
  pub(crate) source: Option<String>,
  pub(crate) severity: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) expression: Option<String>,
  pub(crate) requirements: Option<String>,
}


#[derive(Clone, Debug)]
pub struct ElementDefinition_Slicing_Discriminator {
  pub(crate) id: Option<String>,
  pub(crate) _type: String,
  pub(crate) path: String,
  pub(crate) extension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct ElementDefinition_Slicing {
  pub(crate) id: Option<String>,
  pub(crate) rules: String,
  pub(crate) ordered: Option<bool>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: Option<String>,
  pub(crate) discriminator: Vector<Box<ElementDefinition_Slicing_Discriminator>>,
}

#[derive(Clone, Debug)]
pub struct ElementDefinitionRaw {
  pub(crate) id: Option<String>,
  pub(crate) min: Option<u32>,
  pub(crate) max: Option<String>,
  pub(crate) path: String,
  pub(crate) code: Vector<Box<dyn Coding>>,
  pub(crate) label: Option<String>,
  pub(crate) short: Option<String>,
  pub(crate) alias: Vector<String>,
  pub(crate) comment: Option<String>,
  pub(crate) fixed: Option<UnionAll>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) sliceName: Option<String>,
  pub(crate) maxLength: Option<i32>,
  pub(crate) condition: Vector<String>,
  pub(crate) isSummary: Option<bool>,
  pub(crate) definition: Option<String>,
  pub(crate) pattern: Option<UnionAll>,
  pub(crate) isModifier: Option<bool>,
  pub(crate) minValue: Option<Union01480857620>,
  pub(crate) maxValue: Option<Union01480857620>,
  pub(crate) mustSupport: Option<bool>,
  pub(crate) requirements: Option<String>,
  pub(crate) orderMeaning: Option<String>,
  pub(crate) representation: Vector<String>,
  pub(crate) base: Option<Box<ElementDefinition_Base>>,
  pub(crate) defaultValue: Option<UnionAll>,
  pub(crate) contentReference: Option<String>,
  pub(crate) isModifierReason: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) example: Vector<Box<ElementDefinition_Example>>,
  pub(crate) mapping: Vector<Box<ElementDefinition_Mapping>>,
  pub(crate) _type: Vector<Box<ElementDefinition_Type>>,
  pub(crate) meaningWhenMissing: Option<String>,
  pub(crate) sliceIsConstraining: Option<bool>,
  pub(crate) binding: Option<Box<ElementDefinition_Binding>>,
  pub(crate) constraint: Vector<Box<ElementDefinition_Constraint>>,
  pub(crate) slicing: Option<Box<ElementDefinition_Slicing>>,
}

pub trait ElementDefinition : BackboneElement {
  fn min(&self) -> Option<&u32>;
  fn max(&self) -> Option<&String>;
  fn path(&self) -> &String;
  fn code(&self) -> &Vector<Box<dyn Coding>>;
  fn label(&self) -> Option<&String>;
  fn short(&self) -> Option<&String>;
  fn alias(&self) -> &Vector<String>;
  fn comment(&self) -> Option<&String>;
  fn fixed(&self) -> Option<&UnionAll>;
  fn sliceName(&self) -> Option<&String>;
  fn maxLength(&self) -> Option<&i32>;
  fn condition(&self) -> &Vector<String>;
  fn isSummary(&self) -> Option<&bool>;
  fn definition(&self) -> Option<&String>;
  fn pattern(&self) -> Option<&UnionAll>;
  fn isModifier(&self) -> Option<&bool>;
  fn minValue(&self) -> Option<&Union01480857620>;
  fn maxValue(&self) -> Option<&Union01480857620>;
  fn mustSupport(&self) -> Option<&bool>;
  fn requirements(&self) -> Option<&String>;
  fn orderMeaning(&self) -> Option<&String>;
  fn representation(&self) -> &Vector<String>;
  fn base(&self) -> Option<&Box<ElementDefinition_Base>>;
  fn defaultValue(&self) -> Option<&UnionAll>;
  fn contentReference(&self) -> Option<&String>;
  fn isModifierReason(&self) -> Option<&String>;
  fn example(&self) -> &Vector<Box<ElementDefinition_Example>>;
  fn mapping(&self) -> &Vector<Box<ElementDefinition_Mapping>>;
  fn _type(&self) -> &Vector<Box<ElementDefinition_Type>>;
  fn meaningWhenMissing(&self) -> Option<&String>;
  fn sliceIsConstraining(&self) -> Option<&bool>;
  fn binding(&self) -> Option<&Box<ElementDefinition_Binding>>;
  fn constraint(&self) -> &Vector<Box<ElementDefinition_Constraint>>;
  fn slicing(&self) -> Option<&Box<ElementDefinition_Slicing>>;
}

dyn_clone::clone_trait_object!(ElementDefinition);

impl FHIRObject for ElementDefinitionRaw {
}

impl FHIRElement for ElementDefinitionRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
}


impl BackboneElement for ElementDefinitionRaw {
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl ElementDefinition for ElementDefinitionRaw {
  fn min(&self) -> Option<&u32> { self.min.as_ref() }
  fn max(&self) -> Option<&String> { self.max.as_ref() }
  fn path(&self) -> &String { &self.path }
  fn code(&self) -> &Vector<Box<dyn Coding>> { &self.code }
  fn label(&self) -> Option<&String> { self.label.as_ref() }
  fn short(&self) -> Option<&String> { self.short.as_ref() }
  fn alias(&self) -> &Vector<String> { &self.alias }
  fn comment(&self) -> Option<&String> { self.comment.as_ref() }
  fn fixed(&self) -> Option<&UnionAll> { self.fixed.as_ref() }
  fn sliceName(&self) -> Option<&String> { self.sliceName.as_ref() }
  fn maxLength(&self) -> Option<&i32> { self.maxLength.as_ref() }
  fn condition(&self) -> &Vector<String> { &self.condition }
  fn isSummary(&self) -> Option<&bool> { self.isSummary.as_ref() }
  fn definition(&self) -> Option<&String> { self.definition.as_ref() }
  fn pattern(&self) -> Option<&UnionAll> { self.pattern.as_ref() }
  fn isModifier(&self) -> Option<&bool> { self.isModifier.as_ref() }
  fn minValue(&self) -> Option<&Union01480857620> { self.minValue.as_ref() }
  fn maxValue(&self) -> Option<&Union01480857620> { self.maxValue.as_ref() }
  fn mustSupport(&self) -> Option<&bool> { self.mustSupport.as_ref() }
  fn requirements(&self) -> Option<&String> { self.requirements.as_ref() }
  fn orderMeaning(&self) -> Option<&String> { self.orderMeaning.as_ref() }
  fn representation(&self) -> &Vector<String> { &self.representation }
  fn base(&self) -> Option<&Box<ElementDefinition_Base>> { self.base.as_ref() }
  fn defaultValue(&self) -> Option<&UnionAll> { self.defaultValue.as_ref() }
  fn contentReference(&self) -> Option<&String> { self.contentReference.as_ref() }
  fn isModifierReason(&self) -> Option<&String> { self.isModifierReason.as_ref() }
  fn example(&self) -> &Vector<Box<ElementDefinition_Example>> { &self.example }
  fn mapping(&self) -> &Vector<Box<ElementDefinition_Mapping>> { &self.mapping }
  fn _type(&self) -> &Vector<Box<ElementDefinition_Type>> { &self._type }
  fn meaningWhenMissing(&self) -> Option<&String> { self.meaningWhenMissing.as_ref() }
  fn sliceIsConstraining(&self) -> Option<&bool> { self.sliceIsConstraining.as_ref() }
  fn binding(&self) -> Option<&Box<ElementDefinition_Binding>> { self.binding.as_ref() }
  fn constraint(&self) -> &Vector<Box<ElementDefinition_Constraint>> { &self.constraint }
  fn slicing(&self) -> Option<&Box<ElementDefinition_Slicing>> { self.slicing.as_ref() }
}

