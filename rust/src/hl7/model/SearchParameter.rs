use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




#[derive(Clone, Debug)]
pub struct SearchParameter_Component {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Extension>,
  pub(crate) definition: String,
  pub(crate) expression: String,
  pub(crate) modifierExtension: Vector<Extension>,
}

#[derive(Clone, Debug)]
pub struct SearchParameter {
  pub(crate) url: String,
  pub(crate) name: String,
  pub(crate) date: Option<Date>,
  pub(crate) code: String,
  pub(crate) base: Vector<String>,
  pub(crate) _type: String,
  pub(crate) xpath: Option<String>,
  pub(crate) chain: Vector<String>,
  pub(crate) status: String,
  pub(crate) target: Vector<String>,
  pub(crate) version: Option<String>,
  pub(crate) contact: Vector<ContactDetail>,
  pub(crate) purpose: Option<String>,
  pub(crate) modifier: Vector<String>,
  pub(crate) publisher: Option<String>,
  pub(crate) useContext: Vector<UsageContext>,
  pub(crate) expression: Option<String>,
  pub(crate) xpathUsage: Option<String>,
  pub(crate) multipleOr: Option<Boolean>,
  pub(crate) comparator: Vector<String>,
  pub(crate) derivedFrom: Option<String>,
  pub(crate) description: String,
  pub(crate) multipleAnd: Option<Boolean>,
  pub(crate) experimental: Option<Boolean>,
  pub(crate) jurisdiction: Vector<CodeableConcept>,
  pub(crate) component: Vector<SearchParameter_Component>,
}