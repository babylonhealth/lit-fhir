pub mod core;
mod hl7;


#[cfg(test)]
mod tests {
    use std::convert::TryInto;
    use im::Vector;
    use crate::core::model::Extension::Extension;
    use crate::core::model::Quantity::Quantity;
    use crate::core::UnionAll::*;
    use bigdecimal::BigDecimal;
    use crate::core::model::DataRequirement::{DataRequirement, DataRequirement_Sort};
    use crate::core::model::Reference::Reference;
    use crate::core::{UnionAll, UnionCodeableConceptOrReference};

    #[test]
    fn make_an_extension() {
        println!("OK!");
        let ext = Extension {
            id: None,
            url: "asd".to_string(),
            value: Some(FHIRString("outer value".to_string())),
            extension: Vector::unit(Extension {
                id: None,
                url: "dsa".to_string(),
                value: Some(FHIRQuantity(Quantity {
                    id: None,
                    unit: Some("cn".to_string()),
                    code: Some("1234567890".to_string()),
                    value: Some(BigDecimal::from(123)),
                    system: Some("http://fake.system".to_string()),
                    extension: Vector::new(),
                })),
                extension: Vector::new(),
            }),
        };
        println!("{:?}", ext);
        println!("DOBNW!");
    }

    #[test]
    fn make_a_data_requirement() {
        println!("data_requirement!");
        let data_requirement = DataRequirement {
            id: None,
            _type: "foo".to_string(),
            limit: None,
            profile: Vector::new(),
            extension: Vector::new(),
            subject: Some(UnionCodeableConceptOrReference::FHIRReference(Reference {
                id: None,
                _type: None,
                display: None,
                extension: Vector::new(),
                reference: Some("123".to_string()),
            })),
            mustSupport: Vector::new(),
            sort: Vector::new(),
            codeFilter: Vector::new(),
            dateFilter: Vector::new(),
        };
        let data_requirement_2 = DataRequirement {
            id: None,
            _type: "foo".to_string(),
            limit: None,
            profile: Vector::new(),
            extension: Vector::new(),
            subject: Some(UnionAll::FHIRReference(Reference {
                id: None,
                _type: None,
                display: None,
                extension: Vector::new(),
                reference: Some("123".to_string()),
            }).try_into().unwrap()),
            mustSupport: Vector::new(),
            sort: Vector::new(),
            codeFilter: Vector::new(),
            dateFilter: Vector::new(),
        };
        let data_requirement_3 = DataRequirement {
            sort: Vector::unit(DataRequirement_Sort {
                id: None,
                _type: "some sort type".to_string(),
                limit: None,
                profile: Vector::new(),
                extension: Vector::new(),
                subject: None,
                mustSupport: Vector::new(),
                sort: Vector::new(),
                codeFilter: Vector::new(),
                dateFilter: Vector::new(),
            }),
            ..(&data_requirement).clone()
        };
        println!("{:?}", data_requirement);
        println!("{:?}", data_requirement_2);
        println!("{:?}", data_requirement_3);
        println!("//data_requirement!");
    }
}
