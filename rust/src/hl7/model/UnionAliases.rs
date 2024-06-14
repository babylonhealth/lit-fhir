use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use uuid::Uuid;

use crate::core::model::Address::Address;
use crate::core::model::Age::Age;
use crate::core::model::Attachment::Attachment;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Coding::Coding;
use crate::core::model::DataRequirement::DataRequirement;
use crate::core::model::Duration::Duration;
use crate::core::model::Expression::Expression;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Money::Money;
use crate::core::model::Period::Period;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Range::Range;
use crate::core::model::Ratio::Ratio;
use crate::core::model::Reference::Reference;
use crate::core::model::SampledData::SampledData;
use crate::core::model::Timing::Timing;
use crate::core::model::TriggerDefinition::TriggerDefinition;

#[derive(Clone, Debug)]
pub enum Union00107722725 {
   FHIRDateTime(DateTime<FixedOffset>),
   FHIRPeriod(Box<dyn Period>),
   FHIRTiming(Box<dyn Timing>),
   FHIRZonedDateTime(DateTime<FixedOffset>),
}

#[derive(Clone, Debug)]
pub enum Union00133982841 {
   FHIRQuantity(Box<dyn Quantity>),
   FHIRRange(Box<dyn Range>),
   FHIRRatio(Box<dyn Ratio>),
   FHIRString(String),
}

#[derive(Clone, Debug)]
pub enum Union00193937709 {
   FHIRCanonical(String),
   FHIRCodeableConcept(Box<dyn CodeableConcept>),
   FHIRDataRequirement(Box<dyn DataRequirement>),
   FHIRExpression(Box<dyn Expression>),
   FHIRReference(Box<dyn Reference>),
   FHIRTriggerDefinition(Box<dyn TriggerDefinition>),
}

#[derive(Clone, Debug)]
pub enum Union00551919141 {
   FHIRBigDecimal(BigDecimal),
   FHIRBoolean(bool),
   FHIRId(String),
   FHIRInt(i32),
   FHIRString(String),
}

#[derive(Clone, Debug)]
pub enum Union00659500323 {
   FHIRAge(Box<dyn Age>),
   FHIRBoolean(bool),
   FHIRDate(LocalDate),
   FHIRRange(Box<dyn Range>),
   FHIRString(String),
}

#[derive(Clone, Debug)]
pub enum Union00857130015 {
   FHIRCoding(Box<dyn Coding>),
   FHIRDate(LocalDate),
   FHIRInt(i32),
   FHIRLocalTime(LocalTime),
   FHIRReference(Box<dyn Reference>),
   FHIRString(String),
}

#[derive(Clone, Debug)]
pub enum Union01113166363 {
   FHIRAttachment(Box<dyn Attachment>),
   FHIRBigDecimal(BigDecimal),
   FHIRBoolean(bool),
   FHIRCoding(Box<dyn Coding>),
   FHIRDate(LocalDate),
   FHIRDateTime(DateTime<FixedOffset>),
   FHIRInt(i32),
   FHIRLocalTime(LocalTime),
   FHIRQuantity(Box<dyn Quantity>),
   FHIRReference(Box<dyn Reference>),
   FHIRString(String),
   FHIRUriStr(String),
}

#[derive(Clone, Debug)]
pub enum Union01405873694 {
   FHIRAge(Box<dyn Age>),
   FHIRDuration(Box<dyn Duration>),
   FHIRDateTime(DateTime<FixedOffset>),
   FHIRPeriod(Box<dyn Period>),
   FHIRRange(Box<dyn Range>),
   FHIRTiming(Box<dyn Timing>),
}

#[derive(Clone, Debug)]
pub enum Union01474038381 {
   FHIRAge(Box<dyn Age>),
   FHIRDateTime(DateTime<FixedOffset>),
   FHIRPeriod(Box<dyn Period>),
   FHIRRange(Box<dyn Range>),
   FHIRString(String),
}

#[derive(Clone, Debug)]
pub enum Union01475253842 {
   FHIRBigDecimal(BigDecimal),
   FHIRBoolean(bool),
   FHIRCode(String),
   FHIRDateTime(DateTime<FixedOffset>),
   FHIRInt(i32),
   FHIRString(String),
   FHIRUriStr(String),
}

#[derive(Clone, Debug)]
pub enum Union01480857620 {
   FHIRBigDecimal(BigDecimal),
   FHIRDate(LocalDate),
   FHIRDateTime(DateTime<FixedOffset>),
   FHIRInt(i32),
   FHIRLocalTime(LocalTime),
   FHIRPositiveInt(u32),
   FHIRQuantity(Box<dyn Quantity>),
   FHIRUnsignedInt(u32),
   FHIRZonedDateTime(DateTime<FixedOffset>),
}

#[derive(Clone, Debug)]
pub enum Union01763000476 {
   FHIRDuration(Box<dyn Duration>),
   FHIRDateTime(DateTime<FixedOffset>),
   FHIRPeriod(Box<dyn Period>),
   FHIRTiming(Box<dyn Timing>),
}

#[derive(Clone, Debug)]
pub enum Union01850316684 {
   FHIRBoolean(bool),
   FHIRCodeableConcept(Box<dyn CodeableConcept>),
   FHIRQuantity(Box<dyn Quantity>),
   FHIRRange(Box<dyn Range>),
}

#[derive(Clone, Debug)]
pub enum Union02118820890 {
   FHIRBoolean(bool),
   FHIRCodeableConcept(Box<dyn CodeableConcept>),
   FHIRDateTime(DateTime<FixedOffset>),
   FHIRInt(i32),
   FHIRLocalTime(LocalTime),
   FHIRPeriod(Box<dyn Period>),
   FHIRQuantity(Box<dyn Quantity>),
   FHIRRange(Box<dyn Range>),
   FHIRRatio(Box<dyn Ratio>),
   FHIRSampledData(Box<dyn SampledData>),
   FHIRString(String),
}

#[derive(Clone, Debug)]
pub enum UnionAddressOrCodeableConceptOrReference {
   FHIRAddress(Box<dyn Address>),
   FHIRCodeableConcept(Box<dyn CodeableConcept>),
   FHIRReference(Box<dyn Reference>),
}

#[derive(Clone, Debug)]
pub enum UnionAddressOrReference {
   FHIRAddress(Box<dyn Address>),
   FHIRReference(Box<dyn Reference>),
}

#[derive(Clone, Debug)]
pub enum UnionAgeOrRangeOrString {
   FHIRAge(Box<dyn Age>),
   FHIRRange(Box<dyn Range>),
   FHIRString(String),
}

#[derive(Clone, Debug)]
pub enum UnionAttachmentOrReference {
   FHIRAttachment(Box<dyn Attachment>),
   FHIRReference(Box<dyn Reference>),
}

#[derive(Clone, Debug)]
pub enum UnionAttachmentOrReferenceOrString {
   FHIRAttachment(Box<dyn Attachment>),
   FHIRReference(Box<dyn Reference>),
   FHIRString(String),
}

#[derive(Clone, Debug)]
pub enum UnionBase64BinaryOrString {
   FHIRBase64Binary(Bytes),
   FHIRString(String),
}

#[derive(Clone, Debug)]
pub enum UnionBooleanOrCanonical {
   FHIRBoolean(bool),
   FHIRCanonical(String),
}

#[derive(Clone, Debug)]
pub enum UnionBooleanOrDateTime {
   FHIRBoolean(bool),
   FHIRDateTime(DateTime<FixedOffset>),
}

#[derive(Clone, Debug)]
pub enum UnionBooleanOrInteger {
   FHIRBoolean(bool),
   FHIRInt(i32),
}

#[derive(Clone, Debug)]
pub enum UnionBooleanOrReference {
   FHIRBoolean(bool),
   FHIRReference(Box<dyn Reference>),
}

#[derive(Clone, Debug)]
pub enum UnionCanonicalOrCodeableConceptOrUri {
   FHIRCanonical(String),
   FHIRCodeableConcept(Box<dyn CodeableConcept>),
   FHIRUriStr(String),
}

#[derive(Clone, Debug)]
pub enum UnionCanonicalOrUri {
   FHIRCanonical(String),
   FHIRUriStr(String),
}

#[derive(Clone, Debug)]
pub enum UnionCodeableConceptOrDate {
   FHIRCodeableConcept(Box<dyn CodeableConcept>),
   FHIRDate(LocalDate),
}

#[derive(Clone, Debug)]
pub enum UnionCodeableConceptOrDuration {
   FHIRCodeableConcept(Box<dyn CodeableConcept>),
   FHIRDuration(Box<dyn Duration>),
}

#[derive(Clone, Debug)]
pub enum UnionCodeableConceptOrQuantity {
   FHIRCodeableConcept(Box<dyn CodeableConcept>),
   FHIRQuantity(Box<dyn Quantity>),
}

#[derive(Clone, Debug)]
pub enum UnionCodeableConceptOrQuantityOrRange {
   FHIRCodeableConcept(Box<dyn CodeableConcept>),
   FHIRQuantity(Box<dyn Quantity>),
   FHIRRange(Box<dyn Range>),
}

#[derive(Clone, Debug)]
pub enum UnionCodingOrUri {
   FHIRCoding(Box<dyn Coding>),
   FHIRUriStr(String),
}

#[derive(Clone, Debug)]
pub enum UnionDateOrPeriod {
   FHIRDate(LocalDate),
   FHIRPeriod(Box<dyn Period>),
}

#[derive(Clone, Debug)]
pub enum UnionDateOrPeriodOrString {
   FHIRDate(LocalDate),
   FHIRPeriod(Box<dyn Period>),
   FHIRString(String),
}

#[derive(Clone, Debug)]
pub enum UnionDateTimeOrPeriod {
   FHIRDateTime(DateTime<FixedOffset>),
   FHIRPeriod(Box<dyn Period>),
}

#[derive(Clone, Debug)]
pub enum UnionDateTimeOrPeriodOrTiming {
   FHIRDateTime(DateTime<FixedOffset>),
   FHIRPeriod(Box<dyn Period>),
   FHIRTiming(Box<dyn Timing>),
}

#[derive(Clone, Debug)]
pub enum UnionDateTimeOrString {
   FHIRDateTime(DateTime<FixedOffset>),
   FHIRString(String),
}

#[derive(Clone, Debug)]
pub enum UnionDecimalOrRange {
   FHIRBigDecimal(BigDecimal),
   FHIRRange(Box<dyn Range>),
}

#[derive(Clone, Debug)]
pub enum UnionDurationOrDate {
   FHIRDuration(Box<dyn Duration>),
   FHIRDate(LocalDate),
}

#[derive(Clone, Debug)]
pub enum UnionDurationOrRange {
   FHIRDuration(Box<dyn Duration>),
   FHIRRange(Box<dyn Range>),
}

#[derive(Clone, Debug)]
pub enum UnionIdentifierOrReference {
   FHIRIdentifier(Box<dyn Identifier>),
   FHIRReference(Box<dyn Reference>),
}

#[derive(Clone, Debug)]
pub enum UnionMoneyOrQuantity {
   FHIRMoney(Box<dyn Money>),
   FHIRQuantity(Box<dyn Quantity>),
}

#[derive(Clone, Debug)]
pub enum UnionMoneyOrStringOrUnsignedInt {
   FHIRMoney(Box<dyn Money>),
   FHIRString(String),
   FHIRUnsignedInt(u32),
}

#[derive(Clone, Debug)]
pub enum UnionMoneyOrUnsignedInt {
   FHIRMoney(Box<dyn Money>),
   FHIRUnsignedInt(u32),
}

#[derive(Clone, Debug)]
pub enum UnionPeriodOrRange {
   FHIRPeriod(Box<dyn Period>),
   FHIRRange(Box<dyn Range>),
}

#[derive(Clone, Debug)]
pub enum UnionPeriodOrStringOrTiming {
   FHIRPeriod(Box<dyn Period>),
   FHIRString(String),
   FHIRTiming(Box<dyn Timing>),
}

#[derive(Clone, Debug)]
pub enum UnionPositiveIntOrString {
   FHIRPositiveInt(u32),
   FHIRString(String),
}

#[derive(Clone, Debug)]
pub enum UnionQuantityOrRangeOrString {
   FHIRQuantity(Box<dyn Quantity>),
   FHIRRange(Box<dyn Range>),
   FHIRString(String),
}

#[derive(Clone, Debug)]
pub enum UnionQuantityOrRatio {
   FHIRQuantity(Box<dyn Quantity>),
   FHIRRatio(Box<dyn Ratio>),
}

#[derive(Clone, Debug)]
pub enum UnionQuantityOrString {
   FHIRQuantity(Box<dyn Quantity>),
   FHIRString(String),
}

#[derive(Clone, Debug)]
pub enum UnionReferenceOrUrl {
   FHIRReference(Box<dyn Reference>),
   FHIRUrlStr(String),
}

#[derive(Clone, Debug)]
pub enum Union_0044338899 {
   FHIRCanonical(String),
   FHIRCodeableConcept(Box<dyn CodeableConcept>),
   FHIRDataRequirement(Box<dyn DataRequirement>),
   FHIRExpression(Box<dyn Expression>),
}

#[derive(Clone, Debug)]
pub enum Union_0059314669 {
   FHIRBigDecimal(BigDecimal),
   FHIRBoolean(bool),
   FHIRCode(String),
   FHIRCoding(Box<dyn Coding>),
   FHIRDateTime(DateTime<FixedOffset>),
   FHIRInt(i32),
   FHIRString(String),
}

#[derive(Clone, Debug)]
pub enum Union_0600299688 {
   FHIRBase64Binary(Bytes),
   FHIRCodeableConcept(Box<dyn CodeableConcept>),
   FHIRQuantity(Box<dyn Quantity>),
   FHIRString(String),
}

#[derive(Clone, Debug)]
pub enum Union_1061953715 {
   FHIRBoolean(bool),
   FHIRCodeableConcept(Box<dyn CodeableConcept>),
   FHIRInt(i32),
   FHIRQuantity(Box<dyn Quantity>),
   FHIRRange(Box<dyn Range>),
   FHIRRatio(Box<dyn Ratio>),
   FHIRString(String),
}

#[derive(Clone, Debug)]
pub enum Union_1204024681 {
   FHIRAge(Box<dyn Age>),
   FHIRPeriod(Box<dyn Period>),
   FHIRRange(Box<dyn Range>),
   FHIRString(String),
}

#[derive(Clone, Debug)]
pub enum Union_1280102327 {
   FHIRBigDecimal(BigDecimal),
   FHIRBoolean(bool),
   FHIRCoding(Box<dyn Coding>),
   FHIRDate(LocalDate),
   FHIRDateTime(DateTime<FixedOffset>),
   FHIRInt(i32),
   FHIRLocalTime(LocalTime),
   FHIRQuantity(Box<dyn Quantity>),
   FHIRReference(Box<dyn Reference>),
   FHIRString(String),
}

#[derive(Clone, Debug)]
pub enum Union_1690912481 {
   FHIRBoolean(bool),
   FHIRCodeableConcept(Box<dyn CodeableConcept>),
   FHIRQuantity(Box<dyn Quantity>),
   FHIRRange(Box<dyn Range>),
   FHIRReference(Box<dyn Reference>),
}

#[derive(Clone, Debug)]
pub enum Union_2028408917 {
   FHIRAttachment(Box<dyn Attachment>),
   FHIRBoolean(bool),
   FHIRQuantity(Box<dyn Quantity>),
   FHIRReference(Box<dyn Reference>),
   FHIRString(String),
}