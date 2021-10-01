use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct OperationDefinition_Overload {
  pub(crate) id: Option<String>,
  pub(crate) comment: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) parameterName: Vector<String>,
  pub(crate) modifierExtension: Vector<Extension>,
}


#[derive(Clone, Debug)]
pub struct OperationDefinition_Parameter_Binding {
  pub(crate) id: Option<String>,
  pub(crate) strength: String,
  pub(crate) valueSet: String,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}



#[derive(Clone, Debug)]
pub struct OperationDefinition_Parameter_ReferencedFrom {
  pub(crate) id: Option<String>,
  pub(crate) source: String,
  pub(crate) sourceId: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct OperationDefinition_Parameter {
  pub(crate) id: Option<String>,
  pub(crate) use: String,
  pub(crate) min: i32,
  pub(crate) max: String,
  pub(crate) name: String,
  pub(crate) _type: Option<String>,
  pub(crate) part: Vector<OperationDefinition_Parameter>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) searchType: Option<String>,
  pub(crate) documentation: Option<String>,
  pub(crate) targetProfile: Vector<String>,
  pub(crate) modifierExtension: Vector<Extension>,
  pub(crate) binding: Option<OperationDefinition_Parameter_Binding>,
  pub(crate) referencedFrom: Vector<OperationDefinition_Parameter_ReferencedFrom>,
}

#[derive(Clone, Debug)]
pub struct OperationDefinition {
  pub(crate) url: Option<String>,
  pub(crate) name: String,
  pub(crate) kind: String,
  pub(crate) date: Option<Date>,
  pub(crate) code: String,
  pub(crate) base: Option<String>,
  pub(crate) _type: Boolean,
  pub(crate) title: Option<String>,
  pub(crate) status: String,
  pub(crate) system: Boolean,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) purpose: Option<String>,
  pub(crate) comment: Option<String>,
  pub(crate) resource: Vector<String>,
  pub(crate) instance: Boolean,
  pub(crate) publisher: Option<String>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) description: Option<String>,
  pub(crate) experimental: Option<Boolean>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) affectsState: Option<Boolean>,
  pub(crate) inputProfile: Option<String>,
  pub(crate) outputProfile: Option<String>,
  pub(crate) overload: Vector<OperationDefinition_Overload>,
  pub(crate) parameter: Vector<OperationDefinition_Parameter>,
}