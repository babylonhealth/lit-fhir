use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct InsurancePlan_Contact {
  pub(crate) id?: String,
  pub(crate) name?: HumanName,
  pub(crate) purpose?: CodeableConcept,
  pub(crate) telecom?: ContactPoint,
  pub(crate) address?: Address,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct InsurancePlan_Coverage_Benefit_Limit {
  pub(crate) id?: String,
  pub(crate) code?: CodeableConcept,
  pub(crate) value?: Quantity,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct InsurancePlan_Coverage_Benefit {
  pub(crate) id?: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) requirement?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) limit?: InsurancePlan_Coverage_Benefit_Limit,
}

pub struct InsurancePlan_Coverage {
  pub(crate) id?: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) network?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
  pub(crate) benefit: InsurancePlan_Coverage_Benefit,
}


pub struct InsurancePlan_Plan_GeneralCost {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) cost?: Money,
  pub(crate) comment?: String,
  pub(crate) extension?: Extension,
  pub(crate) groupSize?: u32,
  pub(crate) modifierExtension?: Extension,
}



pub struct InsurancePlan_Plan_SpecificCost_Benefit_Cost {
  pub(crate) id?: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) value?: Quantity,
  pub(crate) extension?: Extension,
  pub(crate) qualifiers?: CodeableConcept,
  pub(crate) applicability?: CodeableConcept,
  pub(crate) modifierExtension?: Extension,
}

pub struct InsurancePlan_Plan_SpecificCost_Benefit {
  pub(crate) id?: String,
  pub(crate) _type: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
  pub(crate) cost?: InsurancePlan_Plan_SpecificCost_Benefit_Cost,
}

pub struct InsurancePlan_Plan_SpecificCost {
  pub(crate) id?: String,
  pub(crate) category: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
  pub(crate) benefit?: InsurancePlan_Plan_SpecificCost_Benefit,
}

pub struct InsurancePlan_Plan {
  pub(crate) id?: String,
  pub(crate) _type?: CodeableConcept,
  pub(crate) network?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) identifier?: Identifier,
  pub(crate) coverageArea?: Reference,
  pub(crate) modifierExtension?: Extension,
  pub(crate) generalCost?: InsurancePlan_Plan_GeneralCost,
  pub(crate) specificCost?: InsurancePlan_Plan_SpecificCost,
}

pub struct InsurancePlan {
  pub(crate) _type?: CodeableConcept,
  pub(crate) name?: String,
  pub(crate) alias?: String,
  pub(crate) status?: String,
  pub(crate) period?: Period,
  pub(crate) ownedBy?: Reference,
  pub(crate) network?: Reference,
  pub(crate) endpoint?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) coverageArea?: Reference,
  pub(crate) administeredBy?: Reference,
  pub(crate) contact?: InsurancePlan_Contact,
  pub(crate) coverage?: InsurancePlan_Coverage,
  pub(crate) plan?: InsurancePlan_Plan,
}