use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct StructureMap_Structure {
  pub(crate) id?: String,
  pub(crate) url: String,
  pub(crate) mode: String,
  pub(crate) alias?: String,
  pub(crate) extension?: Extension,
  pub(crate) documentation?: String,
  pub(crate) modifierExtension?: Extension,
}


pub struct StructureMap_Group_Input {
  pub(crate) id?: String,
  pub(crate) name: String,
  pub(crate) _type?: String,
  pub(crate) mode: String,
  pub(crate) extension?: Extension,
  pub(crate) documentation?: String,
  pub(crate) modifierExtension?: Extension,
}



pub struct StructureMap_Group_Rule_Source {
  pub(crate) id?: String,
  pub(crate) min?: i32,
  pub(crate) max?: String,
  pub(crate) _type?: String,
  pub(crate) check?: String,
  pub(crate) context: String,
  pub(crate) element?: String,
  pub(crate) listMode?: String,
  pub(crate) variable?: String,
  pub(crate) extension?: Extension,
  pub(crate) condition?: String,
  pub(crate) logMessage?: String,
  pub(crate) defaultValue?: Address | Age | Annotation | Attachment | String | BigDecimal | Boolean | String | String | CodeableConcept | Coding | ContactDetail | ContactPoint | Contributor | Count | DataRequirement | Distance | Dosage | Duration | Expression | FHIRDate | Date | HumanName | String | Identifier | i32 | Date | String | Meta | Money | String | ParameterDefinition | Period | u32 | Quantity | Range | Ratio | Reference | RelatedArtifact | SampledData | Signature | String | Timing | TriggerDefinition | String | u32 | String | String | UsageContext | Date,
  pub(crate) modifierExtension?: Extension,
}



pub struct StructureMap_Group_Rule_Dependent {
  pub(crate) id?: String,
  pub(crate) name: String,
  pub(crate) variable: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}



pub struct StructureMap_Group_Rule_Target_Parameter {
  pub(crate) id?: String,
  pub(crate) value: BigDecimal | Boolean | String | i32 | String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct StructureMap_Group_Rule_Target {
  pub(crate) id?: String,
  pub(crate) context?: String,
  pub(crate) element?: String,
  pub(crate) variable?: String,
  pub(crate) listMode?: String,
  pub(crate) extension?: Extension,
  pub(crate) transform?: String,
  pub(crate) listRuleId?: String,
  pub(crate) contextType?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) parameter?: StructureMap_Group_Rule_Target_Parameter,
}

pub struct StructureMap_Group_Rule {
  pub(crate) id?: String,
  pub(crate) name: String,
  pub(crate) rule?: StructureMap_Group_Rule,
  pub(crate) extension?: Extension,
  pub(crate) documentation?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) source: StructureMap_Group_Rule_Source,
  pub(crate) dependent?: StructureMap_Group_Rule_Dependent,
  pub(crate) target?: StructureMap_Group_Rule_Target,
}

pub struct StructureMap_Group {
  pub(crate) id?: String,
  pub(crate) name: String,
  pub(crate) extends?: String,
  pub(crate) typeMode: String,
  pub(crate) extension?: Extension,
  pub(crate) documentation?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) input: StructureMap_Group_Input,
  pub(crate) rule: StructureMap_Group_Rule,
}

pub struct StructureMap {
  pub(crate) url: String,
  pub(crate) name: String,
  pub(crate) date?: Date,
  pub(crate) title?: String,
  pub(crate) status: String,
  pub(crate) import?: String,
  pub(crate) version?: String,
  pub(crate) contact?: ContactDetail,
  pub(crate) purpose?: String,
  pub(crate) publisher?: String,
  pub(crate) copyright?: String,
  pub(crate) identifier?: Identifier,
  pub(crate) useContext?: UsageContext,
  pub(crate) description?: String,
  pub(crate) experimental?: Boolean,
  pub(crate) jurisdiction?: CodeableConcept,
  pub(crate) structure?: StructureMap_Structure,
  pub(crate) group: StructureMap_Group,
}