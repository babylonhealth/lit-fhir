use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;
use std::fmt::Debug;
use dyn_clone::DynClone;

use crate::core::model::Extension::Extension;

#[derive(Clone, Debug)]
pub struct QuantityRaw {
    pub(crate) id: Option<String>,
    pub(crate) extension: Vector<Extension>,
    pub(crate) unit: Option<String>,
    pub(crate) code: Option<String>,
    pub(crate) value: Option<BigDecimal>,
    pub(crate) system: Option<String>,
    pub(crate) comparator: Option<String>,
}

pub trait Quantity: Debug + DynClone {
    fn id(&self) -> &Option<String>;
    fn extension(&self) -> &Vector<Extension>;
    fn unit(&self) -> &Option<String>;
    fn code(&self) -> &Option<String>;
    fn value(&self) -> &Option<BigDecimal>;
    fn system(&self) -> &Option<String>;
    fn comparator(&self) -> &Option<String>;
}

dyn_clone::clone_trait_object!(Quantity);

impl Quantity for QuantityRaw {
    fn id(&self) -> &Option<String> { &self.id }
    fn extension(&self) -> &Vector<Extension> { &self.extension }
    fn unit(&self) -> &Option<String> { &self.unit }
    fn code(&self) -> &Option<String> { &self.code }
    fn value(&self) -> &Option<BigDecimal> { &self.value }
    fn system(&self) -> &Option<String> { &self.system }
    fn comparator(&self) -> &Option<String> { &self.comparator }
}
