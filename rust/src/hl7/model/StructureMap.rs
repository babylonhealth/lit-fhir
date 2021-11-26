use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::UnionAll;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Resource::Resource;
use crate::core::model::StructureMap_Group_Rule::StructureMap_Group_Rule;
use crate::core::model::UsageContext::UsageContext;
use crate::hl7::Union00551919141;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct StructureMap_Structure {
  pub(crate) id: Option<String>,
  pub(crate) url: String,
  pub(crate) mode: String,
  pub(crate) alias: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) documentation: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct StructureMap_Group_Input {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) _type: Option<String>,
  pub(crate) mode: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) documentation: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct StructureMap_Group_Rule_Source {
  pub(crate) id: Option<String>,
  pub(crate) min: Option<i32>,
  pub(crate) max: Option<String>,
  pub(crate) _type: Option<String>,
  pub(crate) check: Option<String>,
  pub(crate) context: String,
  pub(crate) element: Option<String>,
  pub(crate) listMode: Option<String>,
  pub(crate) variable: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) condition: Option<String>,
  pub(crate) logMessage: Option<String>,
  pub(crate) defaultValue: Option<UnionAll>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct StructureMap_Group_Rule_Dependent {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) variable: Vector<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct StructureMap_Group_Rule_Target_Parameter {
  pub(crate) id: Option<String>,
  pub(crate) value: Union00551919141,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct StructureMap_Group_Rule_Target {
  pub(crate) id: Option<String>,
  pub(crate) context: Option<String>,
  pub(crate) element: Option<String>,
  pub(crate) variable: Option<String>,
  pub(crate) listMode: Vector<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) transform: Option<String>,
  pub(crate) listRuleId: Option<String>,
  pub(crate) contextType: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) parameter: Vector<StructureMap_Group_Rule_Target_Parameter>,
}

#[derive(Clone, Debug)]
pub struct StructureMap_Group_Rule {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) rule: Vector<StructureMap_Group_Rule>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) documentation: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) source: Vector<StructureMap_Group_Rule_Source>,
  pub(crate) dependent: Vector<StructureMap_Group_Rule_Dependent>,
  pub(crate) target: Vector<StructureMap_Group_Rule_Target>,
}

#[derive(Clone, Debug)]
pub struct StructureMap_Group {
  pub(crate) id: Option<String>,
  pub(crate) name: String,
  pub(crate) extends: Option<String>,
  pub(crate) typeMode: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) documentation: Option<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) input: Vector<StructureMap_Group_Input>,
  pub(crate) rule: Vector<StructureMap_Group_Rule>,
}

#[derive(Clone, Debug)]
pub struct StructureMap {
  pub(crate) url: String,
  pub(crate) name: String,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) title: Option<String>,
  pub(crate) status: String,
  pub(crate) import: Vector<String>,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) purpose: Option<String>,
  pub(crate) publisher: Option<String>,
  pub(crate) copyright: Option<String>,
  pub(crate) identifier: Vector<Identifier>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<bool>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) structure: Vector<StructureMap_Structure>,
  pub(crate) group: Vector<StructureMap_Group>,
}