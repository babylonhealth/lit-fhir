use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct ConceptMap_Group_Unmapped {
  pub(crate) id?: String,
  pub(crate) url?: String,
  pub(crate) mode: String,
  pub(crate) code?: String,
  pub(crate) display?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}



pub struct ConceptMap_Group_Element_Target_DependsOn {
  pub(crate) id?: String,
  pub(crate) value: String,
  pub(crate) system?: String,
  pub(crate) display?: String,
  pub(crate) property: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct ConceptMap_Group_Element_Target {
  pub(crate) id?: String,
  pub(crate) code?: String,
  pub(crate) display?: String,
  pub(crate) comment?: String,
  pub(crate) product?: ConceptMap_Group_Element_Target_DependsOn,
  pub(crate) extension?: Extension,
  pub(crate) equivalence: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) dependsOn?: ConceptMap_Group_Element_Target_DependsOn,
}

pub struct ConceptMap_Group_Element {
  pub(crate) id?: String,
  pub(crate) code?: String,
  pub(crate) display?: String,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
  pub(crate) target?: ConceptMap_Group_Element_Target,
}

pub struct ConceptMap_Group {
  pub(crate) id?: String,
  pub(crate) source?: String,
  pub(crate) target?: String,
  pub(crate) extension?: Extension,
  pub(crate) sourceVersion?: String,
  pub(crate) targetVersion?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) unmapped?: ConceptMap_Group_Unmapped,
  pub(crate) element: FHIRElement,
}

pub struct ConceptMap {
  pub(crate) url?: String,
  pub(crate) name?: String,
  pub(crate) date?: Date,
  pub(crate) title?: String,
  pub(crate) status: String,
  pub(crate) version?: String,
  pub(crate) contact?: ContactDetail,
  pub(crate) purpose?: String,
  pub(crate) publisher?: String,
  pub(crate) copyright?: String,
  pub(crate) source?: String | String,
  pub(crate) target?: String | String,
  pub(crate) identifier?: Identifier,
  pub(crate) useContext?: UsageContext,
  pub(crate) description?: String,
  pub(crate) experimental?: Boolean,
  pub(crate) jurisdiction?: CodeableConcept,
  pub(crate) group?: ConceptMap_Group,
}