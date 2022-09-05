use chrono::{DateTime, Duration, FixedOffset};
use im::Vector;
use crate::core::model::CodeableConcept::{CodeableConcept, CodeableConceptRaw};
use crate::core::model::Duration::DurationRaw;
use crate::core::model::Period::{Period, PeriodRaw};
use crate::core::model::Quantity::{Quantity, QuantityRaw};
use crate::core::model::Range::RangeRaw;
use crate::core::model::Ratio::RatioRaw;
use crate::core::model::Reference::{Reference, ReferenceRaw};
use crate::core::model::Timing::{Timing, TimingRaw};

pub mod model;
pub mod LitError;
// pub mod FHIRObject;
// pub mod UnionUtils;

// #[derive(Clone)]
// union UnionAll<'a> {
//     string: Cow<'a, String>,
//     extension: Extension<'a>,
// }
#[derive(Clone, Debug)]
pub enum UnionAll {
    FHIRCodeableConcept(CodeableConceptRaw),
    FHIRString(String),
    FHIRInteger(i32),
    FHIRQuantity(Box<dyn Quantity>),
    FHIRReference(Box<ReferenceRaw>),
}

#[derive(Clone, Debug)]
pub enum UnionBooleanOrCodeableConcept {
    FHIRBoolean(bool),
    FHIRCodeableConcept(CodeableConceptRaw),
}

#[derive(Clone, Debug)]
pub enum UnionReferenceOrString {
    FHIRReference(Box<ReferenceRaw>),
    FHIRString(String),
}

#[derive(Clone, Debug)]
pub enum UnionDurationOrPeriodOrRange {
    FHIRDuration(DurationRaw),
    FHIRPeriod(PeriodRaw),
    FHIRRange(RangeRaw),
}

#[derive(Clone, Debug)]
pub enum UnionPeriodOrStringOrTiming {
    FHIRPeriod(PeriodRaw),
    FHIRString(String),
    FHIRTiming(TimingRaw),
}

#[derive(Clone, Debug)]
pub enum UnionQuantityOrRange {
    FHIRQuantity(QuantityRaw),
    FHIRRange(RangeRaw),
}

#[derive(Clone, Debug)]
pub enum UnionQuantityOrRangeOrRatio {
    FHIRQuantity(QuantityRaw),
    FHIRRange(RangeRaw),
    FHIRRatio(RatioRaw),
}

#[derive(Clone, Debug)]
pub enum UnionDurationOrDateTimeOrPeriod {
    FHIRDuration(Duration),
    FHIRDateTime(DateTime<FixedOffset>),
    FHIRPeriod(PeriodRaw),
}

#[macro_export]
macro_rules! sub_enum {
    ($sub_enum_name:ident {
        $($variant:ident($param:ty)),* $(,)?
    }) => {
        #[derive(Clone, Debug)]
        pub enum $sub_enum_name {
            $($variant($param),)*
        }

        impl From<$sub_enum_name> for UnionAll {
            fn from(val: $sub_enum_name) -> UnionAll {
                match val {
                    $($sub_enum_name::$variant(x) => UnionAll::$variant(x),)*
                }
            }
        }

        impl std::convert::TryFrom<UnionAll> for $sub_enum_name {
            type Error = ();
            fn try_from(val: UnionAll) -> Result<Self, Self::Error> {
                match val {
                    $(UnionAll::$variant(x) => Ok(Self::$variant(x)),)*
                    _ => Err(())
                }
            }
        }
    };
}

sub_enum!(UnionCodeableConceptOrReference {
    FHIRCodeableConcept(CodeableConceptRaw),
    FHIRReference(Box<ReferenceRaw>)
});

// impl Clone for Vector<T> {
//     fn clone(&self) -> Self {
//         todo!()
//     }
// }
//
// impl Copy for Vector<T> {
//
// }

pub fn suffix(u: UnionAll) -> String {
    match u {
        UnionAll::FHIRString(_) => "String",
        UnionAll::FHIRInteger(_) => "Integer",
        UnionAll::FHIRQuantity(_) => "Quantity",
        UnionAll::FHIRCodeableConcept(_) => "CodeableConcept",
        UnionAll::FHIRReference(_) => "Reference",
    }.to_string()
}

// #[derive(Clone, Debug)]
// pub struct Choice<T: Clone> {
//     pub(crate) suffix: String,
//     pub(crate) value: T,
// }