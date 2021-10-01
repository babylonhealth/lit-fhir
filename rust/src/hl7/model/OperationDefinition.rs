use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct OperationDefinition_Overload {
  pub(crate) id?: String,
  pub(crate) comment?: String,
  pub(crate) extension?: Extension,
  pub(crate) parameterName?: String,
  pub(crate) modifierExtension?: Extension,
}


pub struct OperationDefinition_Parameter_Binding {
  pub(crate) id?: String,
  pub(crate) strength: String,
  pub(crate) valueSet: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}



pub struct OperationDefinition_Parameter_ReferencedFrom {
  pub(crate) id?: String,
  pub(crate) source: String,
  pub(crate) sourceId?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct OperationDefinition_Parameter {
  pub(crate) id?: String,
  pub(crate) use: String,
  pub(crate) min: i32,
  pub(crate) max: String,
  pub(crate) name: String,
  pub(crate) _type?: String,
  pub(crate) part?: OperationDefinition_Parameter,
  pub(crate) extension?: Extension,
  pub(crate) searchType?: String,
  pub(crate) documentation?: String,
  pub(crate) targetProfile?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) binding?: OperationDefinition_Parameter_Binding,
  pub(crate) referencedFrom?: OperationDefinition_Parameter_ReferencedFrom,
}

pub struct OperationDefinition {
  pub(crate) url?: String,
  pub(crate) name: String,
  pub(crate) kind: String,
  pub(crate) date?: Date,
  pub(crate) code: String,
  pub(crate) base?: String,
  pub(crate) _type: Boolean,
  pub(crate) title?: String,
  pub(crate) status: String,
  pub(crate) system: Boolean,
  pub(crate) version?: String,
  pub(crate) contact?: ContactDetail,
  pub(crate) purpose?: String,
  pub(crate) comment?: String,
  pub(crate) resource?: String,
  pub(crate) instance: Boolean,
  pub(crate) publisher?: String,
  pub(crate) useContext?: UsageContext,
  pub(crate) description?: String,
  pub(crate) experimental?: Boolean,
  pub(crate) jurisdiction?: CodeableConcept,
  pub(crate) affectsState?: Boolean,
  pub(crate) inputProfile?: String,
  pub(crate) outputProfile?: String,
  pub(crate) overload?: OperationDefinition_Overload,
  pub(crate) parameter?: OperationDefinition_Parameter,
}