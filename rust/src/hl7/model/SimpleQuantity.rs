use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;


use crate::core::model::Extension::Extension;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Quantity::QuantityRaw;
use crate::core::LitError::LitError;

#[derive(Clone, Debug)]
pub struct SimpleQuantityRaw {
    pub(crate) id: Option<String>,
    pub(crate) extension: Vector<Extension>,
    pub(crate) unit: Option<String>,
    pub(crate) code: Option<String>,
    pub(crate) value: Option<BigDecimal>,
    pub(crate) system: Option<String>,
}

pub trait SimpleQuantity : Quantity {
    fn id(&self) -> &Option<String>;
    fn extension(&self) -> &Vector<Extension>;
    fn unit(&self) -> &Option<String>;
    fn code(&self) -> &Option<String>;
    fn value(&self) -> &Option<BigDecimal>;
    fn system(&self) -> &Option<String>;
}

impl SimpleQuantity for SimpleQuantityRaw {
    fn id(&self) -> &Option<String> { &self.id }
    fn extension(&self) -> &Vector<Extension> { &self.extension }
    fn unit(&self) -> &Option<String> { &self.unit }
    fn code(&self) -> &Option<String> { &self.code }
    fn value(&self) -> &Option<BigDecimal> { &self.value }
    fn system(&self) -> &Option<String> { &self.system }
}

impl Quantity for SimpleQuantityRaw {
    fn id(&self) -> &Option<String> { &self.id }
    fn extension(&self) -> &Vector<Extension> { &self.extension }
    fn unit(&self) -> &Option<String> { &self.unit }
    fn code(&self) -> &Option<String> { &self.code }
    fn value(&self) -> &Option<BigDecimal> { &self.value }
    fn system(&self) -> &Option<String> { &self.system }
    fn comparator(&self) -> &Option<String> { &Option::None }
}

#[test]
pub fn test_subtyping_stuff() -> Result<(), LitError> {
    println!("A!!");
    let sq = SimpleQuantityRaw {
        id: Option::Some("<id>".to_string()),
        extension: Vector::new(),
        unit: Option::None,
        code: Option::None,
        value: Option::None,
        system: Option::None,
    };
    println!("B!!");
    let q = QuantityRaw {
        id: Option::Some("<id>".to_string()),
        extension: Vector::new(),
        unit: Option::None,
        code: Option::None,
        value: Option::None,
        system: Option::None,
        comparator: Option::None,
    };
    fn printAQuantity(q: impl Quantity) {
        println!("{:?}", q);
    }
    printAQuantity(sq);
    println!("C!!");
    printAQuantity(q);
    println!("D!!");
    // Err(LitError::DummyError)
    Ok(())
}
