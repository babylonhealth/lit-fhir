use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use uuid::Uuid;

use crate::core::model::Address::Address;
use crate::core::model::Age::Age;
use crate::core::model::Annotation::Annotation;
use crate::core::model::Attachment::Attachment;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Coding::Coding;
use crate::core::model::ContactDetail::ContactDetail;
use crate::core::model::ContactPoint::ContactPoint;
use crate::core::model::Contributor::Contributor;
use crate::core::model::Count::Count;
use crate::core::model::DataRequirement::DataRequirement;
use crate::core::model::Distance::Distance;
use crate::core::model::Dosage::Dosage;
use crate::core::model::Duration::Duration;
use crate::core::model::Expression::Expression;
use crate::core::model::HumanName::HumanName;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Money::Money;
use crate::core::model::ParameterDefinition::ParameterDefinition;
use crate::core::model::Period::Period;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Range::Range;
use crate::core::model::Ratio::Ratio;
use crate::core::model::Reference::Reference;
use crate::core::model::RelatedArtifact::RelatedArtifact;
use crate::core::model::SampledData::SampledData;
use crate::core::model::Signature::Signature;
use crate::core::model::Timing::Timing;
use crate::core::model::TriggerDefinition::TriggerDefinition;
use crate::core::model::UsageContext::UsageContext;

#[derive(Clone, Debug)]
pub enum Union01658422381 {
   FHIRDate(LocalDate),
   FHIRDateTime(DateTime<FixedOffset>),
   FHIRReference(Box<dyn Reference>),
   FHIRTiming(Box<dyn Timing>),
}

#[derive(Clone, Debug)]
pub enum UnionAll {
   FHIRAddress(Box<dyn Address>),
   FHIRAge(Box<dyn Age>),
   FHIRAnnotation(Box<dyn Annotation>),
   FHIRAttachment(Box<dyn Attachment>),
   FHIRBase64Binary(Bytes),
   FHIRBigDecimal(BigDecimal),
   FHIRBoolean(bool),
   FHIRCanonical(String),
   FHIRCode(String),
   FHIRCodeableConcept(Box<dyn CodeableConcept>),
   FHIRCoding(Box<dyn Coding>),
   FHIRContactDetail(Box<dyn ContactDetail>),
   FHIRContactPoint(Box<dyn ContactPoint>),
   FHIRContributor(Box<dyn Contributor>),
   FHIRCount(Box<dyn Count>),
   FHIRDataRequirement(Box<dyn DataRequirement>),
   FHIRDistance(Box<dyn Distance>),
   FHIRDosage(Box<dyn Dosage>),
   FHIRDuration(Box<dyn Duration>),
   FHIRExpression(Box<dyn Expression>),
   FHIRDate(LocalDate),
   FHIRDateTime(DateTime<FixedOffset>),
   FHIRHumanName(Box<dyn HumanName>),
   FHIRId(String),
   FHIRIdentifier(Box<dyn Identifier>),
   FHIRInt(i32),
   FHIRLocalTime(LocalTime),
   FHIRMarkdown(String),
   FHIRMeta(Box<dyn Meta>),
   FHIRMoney(Box<dyn Money>),
   FHIROID(String),
   FHIRParameterDefinition(Box<dyn ParameterDefinition>),
   FHIRPeriod(Box<dyn Period>),
   FHIRPositiveInt(u32),
   FHIRQuantity(Box<dyn Quantity>),
   FHIRRange(Box<dyn Range>),
   FHIRRatio(Box<dyn Ratio>),
   FHIRReference(Box<dyn Reference>),
   FHIRRelatedArtifact(Box<dyn RelatedArtifact>),
   FHIRSampledData(Box<dyn SampledData>),
   FHIRSignature(Box<dyn Signature>),
   FHIRString(String),
   FHIRTiming(Box<dyn Timing>),
   FHIRTriggerDefinition(Box<dyn TriggerDefinition>),
   FHIRUUID(Uuid),
   FHIRUnsignedInt(u32),
   FHIRUriStr(String),
   FHIRUrlStr(String),
   FHIRUsageContext(Box<dyn UsageContext>),
   FHIRZonedDateTime(DateTime<FixedOffset>),
}

#[derive(Clone, Debug)]
pub enum UnionBooleanOrCodeableConcept {
   FHIRBoolean(bool),
   FHIRCodeableConcept(Box<dyn CodeableConcept>),
}

#[derive(Clone, Debug)]
pub enum UnionCodeableConceptOrReference {
   FHIRCodeableConcept(Box<dyn CodeableConcept>),
   FHIRReference(Box<dyn Reference>),
}

#[derive(Clone, Debug)]
pub enum UnionDurationOrDateTimeOrPeriod {
   FHIRDuration(Box<dyn Duration>),
   FHIRDateTime(DateTime<FixedOffset>),
   FHIRPeriod(Box<dyn Period>),
}

#[derive(Clone, Debug)]
pub enum UnionDurationOrPeriodOrRange {
   FHIRDuration(Box<dyn Duration>),
   FHIRPeriod(Box<dyn Period>),
   FHIRRange(Box<dyn Range>),
}

#[derive(Clone, Debug)]
pub enum UnionQuantityOrRange {
   FHIRQuantity(Box<dyn Quantity>),
   FHIRRange(Box<dyn Range>),
}

#[derive(Clone, Debug)]
pub enum UnionQuantityOrRangeOrRatio {
   FHIRQuantity(Box<dyn Quantity>),
   FHIRRange(Box<dyn Range>),
   FHIRRatio(Box<dyn Ratio>),
}

#[derive(Clone, Debug)]
pub enum UnionReferenceOrString {
   FHIRReference(Box<dyn Reference>),
   FHIRString(String),
}

#[derive(Clone, Debug)]
pub enum Union_1548929031 {
   FHIRCodeableConcept(Box<dyn CodeableConcept>),
   FHIRQuantity(Box<dyn Quantity>),
   FHIRRange(Box<dyn Range>),
   FHIRReference(Box<dyn Reference>),
}