use im::Vector;
use crate::core::LitError::LitError;
use crate::core::model::Extension::{Extension, ExtensionRaw};
use crate::core::model::Quantity::{Quantity, QuantityRaw};
use crate::core::model::Reference::{Reference, ReferenceRaw};
use crate::hl7::model::SimpleQuantity::{SimpleQuantity, SimpleQuantityRaw};

pub mod core;
pub mod hl7;


#[cfg(test)]
mod tests {
    use std::convert::TryInto;
    use im::Vector;
    use crate::core::model::Extension::{Extension, ExtensionRaw};
    use crate::core::model::Quantity::{Quantity,QuantityRaw};
    use crate::core::UnionAll::*;
    use bigdecimal::BigDecimal;
    use crate::core::model::DataRequirement::{DataRequirement, DataRequirement_Sort, DataRequirementRaw};
    use crate::core::model::Reference::{Reference, ReferenceRaw};
    use crate::core::{UnionAll, UnionCodeableConceptOrReference};

    #[test]
    fn make_an_extension() {
        println!("OK!");
        let ext = ExtensionRaw {
            id: None,
            url: "asd".to_string(),
            value: Some(FHIRString("outer value".to_string())),
            extension: Vector::unit(Box::new(ExtensionRaw {
                id: None,
                url: "dsa".to_string(),
                value: Some(FHIRQuantity(Box::new(QuantityRaw {
                    id: None,
                    unit: Some("cn".to_string()),
                    code: Some("1234567890".to_string()),
                    value: Some(BigDecimal::from(123)),
                    system: Some("http://fake.system".to_string()),
                    extension: Vector::new(),
                    comparator: None,
                }))),
                extension: Vector::new(),
            })),
        };
        println!("{:?}", ext);
        println!("DOBNW!");
    }

    #[test]
    fn make_a_data_requirement() {
        println!("data_requirement!");
        let data_requirement = DataRequirementRaw {
            id: None,
            _type: "foo".to_string(),
            limit: None,
            profile: Vector::new(),
            extension: Vector::new(),
            subject: Some(UnionCodeableConceptOrReference::FHIRReference(Box::new(ReferenceRaw {
                id: None,
                _type: None,
                display: None,
                extension: Vector::new(),
                reference: Some("123".to_string()),
                identifier: None,
            }))),
            mustSupport: Vector::new(),
            sort: Vector::new(),
            codeFilter: Vector::new(),
            dateFilter: Vector::new(),
        };
        let data_requirement_2 = DataRequirementRaw {
            id: None,
            _type: "foo".to_string(),
            limit: None,
            profile: Vector::new(),
            extension: Vector::new(),
            subject: Some(UnionAll::FHIRReference(Box::new(ReferenceRaw {
                id: None,
                _type: None,
                display: None,
                extension: Vector::new(),
                reference: Some("123".to_string()),
                identifier: None,
            })).try_into().unwrap()),
            mustSupport: Vector::new(),
            sort: Vector::new(),
            codeFilter: Vector::new(),
            dateFilter: Vector::new(),
        };
        let data_requirement_3 = DataRequirementRaw {
            sort: Vector::unit(DataRequirement_Sort {
                id: None,
                path: "".to_string(),
                extension: Vector::new(),
                direction: "".to_string(),
            }),
            ..(&data_requirement).clone()
        };
        println!("{:?}", data_requirement);
        println!("{:?}", data_requirement_2);
        println!("{:?}", data_requirement_3);
        println!("//data_requirement!");
    }
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
    fn printAQuantity(q: &impl Quantity) {
        println!("{:?}", q.id());
        println!("{:?}", q);
    }
    fn printASimpleQuantity(q: &impl SimpleQuantity) {
        println!("{:?}", q);
        println!("{:?}", &q.id());
    }
    printAQuantity(&sq);
    println!("C!!");
    printAQuantity(&q);
    println!("D!!");
    printASimpleQuantity(&sq);
    println!("E!!");
    Err(LitError::DummyError)
    // Ok(())
}
