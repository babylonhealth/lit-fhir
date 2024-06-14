use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Money::Money;
use crate::core::model::Period::Period;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::UnionAliases::UnionCodeableConceptOrReference;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::UnionAddressOrCodeableConceptOrReference;
use crate::hl7::model::UnionAliases::UnionAddressOrReference;
use crate::hl7::model::UnionAliases::UnionDateOrPeriod;
use crate::hl7::model::UnionAliases::Union_2028408917;



#[derive(Clone, Debug)]
pub struct Claim_Payee {
  pub(crate) id: Option<String>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) party: Option<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Claim_Related {
  pub(crate) id: Option<String>,
  pub(crate) claim: Option<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) reference: Option<Box<dyn Identifier>>,
  pub(crate) relationship: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Claim_CareTeam {
  pub(crate) id: Option<String>,
  pub(crate) role: Option<Box<dyn CodeableConcept>>,
  pub(crate) sequence: u32,
  pub(crate) provider: Box<dyn Reference>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) responsible: Option<bool>,
  pub(crate) qualification: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Claim_Accident {
  pub(crate) id: Option<String>,
  pub(crate) date: LocalDate,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) location: Option<UnionAddressOrReference>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Claim_Diagnosis {
  pub(crate) id: Option<String>,
  pub(crate) _type: Vector<Box<dyn CodeableConcept>>,
  pub(crate) sequence: u32,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) onAdmission: Option<Box<dyn CodeableConcept>>,
  pub(crate) packageCode: Option<Box<dyn CodeableConcept>>,
  pub(crate) diagnosis: UnionCodeableConceptOrReference,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Claim_Procedure {
  pub(crate) id: Option<String>,
  pub(crate) udi: Vector<Box<dyn Reference>>,
  pub(crate) _type: Vector<Box<dyn CodeableConcept>>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) sequence: u32,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) procedure: UnionCodeableConceptOrReference,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Claim_Insurance {
  pub(crate) id: Option<String>,
  pub(crate) focal: bool,
  pub(crate) sequence: u32,
  pub(crate) coverage: Box<dyn Reference>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Option<Box<dyn Identifier>>,
  pub(crate) preAuthRef: Vector<String>,
  pub(crate) claimResponse: Option<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) businessArrangement: Option<String>,
}


#[derive(Clone, Debug)]
pub struct Claim_SupportingInfo {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) reason: Option<Box<dyn CodeableConcept>>,
  pub(crate) sequence: u32,
  pub(crate) category: Box<dyn CodeableConcept>,
  pub(crate) value: Option<Box<Union_2028408917>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) timing: Option<UnionDateOrPeriod>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct Claim_Item_Detail_SubDetail {
  pub(crate) id: Option<String>,
  pub(crate) net: Option<Box<dyn Money>>,
  pub(crate) udi: Vector<Box<dyn Reference>>,
  pub(crate) factor: Option<BigDecimal>,
  pub(crate) revenue: Option<Box<dyn CodeableConcept>>,
  pub(crate) sequence: u32,
  pub(crate) category: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifier: Vector<Box<dyn CodeableConcept>>,
  pub(crate) quantity: Option<Box<dyn Quantity>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) unitPrice: Option<Box<dyn Money>>,
  pub(crate) programCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) productOrService: Box<dyn CodeableConcept>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct Claim_Item_Detail {
  pub(crate) id: Option<String>,
  pub(crate) net: Option<Box<dyn Money>>,
  pub(crate) udi: Vector<Box<dyn Reference>>,
  pub(crate) factor: Option<BigDecimal>,
  pub(crate) revenue: Option<Box<dyn CodeableConcept>>,
  pub(crate) sequence: u32,
  pub(crate) category: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifier: Vector<Box<dyn CodeableConcept>>,
  pub(crate) quantity: Option<Box<dyn Quantity>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) unitPrice: Option<Box<dyn Money>>,
  pub(crate) programCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) productOrService: Box<dyn CodeableConcept>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) subDetail: Vector<Box<Claim_Item_Detail_SubDetail>>,
}

#[derive(Clone, Debug)]
pub struct Claim_Item {
  pub(crate) id: Option<String>,
  pub(crate) net: Option<Box<dyn Money>>,
  pub(crate) udi: Vector<Box<dyn Reference>>,
  pub(crate) factor: Option<BigDecimal>,
  pub(crate) revenue: Option<Box<dyn CodeableConcept>>,
  pub(crate) subSite: Vector<Box<dyn CodeableConcept>>,
  pub(crate) sequence: u32,
  pub(crate) category: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifier: Vector<Box<dyn CodeableConcept>>,
  pub(crate) quantity: Option<Box<dyn Quantity>>,
  pub(crate) bodySite: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) unitPrice: Option<Box<dyn Money>>,
  pub(crate) encounter: Vector<Box<dyn Reference>>,
  pub(crate) programCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) serviced: Option<UnionDateOrPeriod>,
  pub(crate) location: Option<UnionAddressOrCodeableConceptOrReference>,
  pub(crate) careTeamSequence: Vector<u32>,
  pub(crate) productOrService: Box<dyn CodeableConcept>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) diagnosisSequence: Vector<u32>,
  pub(crate) procedureSequence: Vector<u32>,
  pub(crate) informationSequence: Vector<u32>,
  pub(crate) detail: Vector<Box<Claim_Item_Detail>>,
}

#[derive(Clone, Debug)]
pub struct ClaimRaw {
  pub(crate) id: Option<String>,
  pub(crate) _use: String,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) total: Option<Box<dyn Money>>,
  pub(crate) status: String,
  pub(crate) subType: Option<Box<dyn CodeableConcept>>,
  pub(crate) patient: Box<dyn Reference>,
  pub(crate) created: DateTime<FixedOffset>,
  pub(crate) enterer: Option<Box<dyn Reference>>,
  pub(crate) insurer: Option<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) provider: Box<dyn Reference>,
  pub(crate) priority: Box<dyn CodeableConcept>,
  pub(crate) referral: Option<Box<dyn Reference>>,
  pub(crate) facility: Option<Box<dyn Reference>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) fundsReserve: Option<Box<dyn CodeableConcept>>,
  pub(crate) prescription: Option<Box<dyn Reference>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) billablePeriod: Option<Box<dyn Period>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) originalPrescription: Option<Box<dyn Reference>>,
  pub(crate) payee: Option<Box<Claim_Payee>>,
  pub(crate) related: Vector<Box<Claim_Related>>,
  pub(crate) careTeam: Vector<Box<Claim_CareTeam>>,
  pub(crate) accident: Option<Box<Claim_Accident>>,
  pub(crate) diagnosis: Vector<Box<Claim_Diagnosis>>,
  pub(crate) procedure: Vector<Box<Claim_Procedure>>,
  pub(crate) insurance: Vector<Box<Claim_Insurance>>,
  pub(crate) supportingInfo: Vector<Box<Claim_SupportingInfo>>,
  pub(crate) item: Vector<Box<Claim_Item>>,
}

pub trait Claim : DomainResource {
  fn _use(&self) -> &String;
  fn _type(&self) -> &Box<dyn CodeableConcept>;
  fn total(&self) -> Option<&Box<dyn Money>>;
  fn status(&self) -> &String;
  fn subType(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn patient(&self) -> &Box<dyn Reference>;
  fn created(&self) -> &DateTime<FixedOffset>;
  fn enterer(&self) -> Option<&Box<dyn Reference>>;
  fn insurer(&self) -> Option<&Box<dyn Reference>>;
  fn provider(&self) -> &Box<dyn Reference>;
  fn priority(&self) -> &Box<dyn CodeableConcept>;
  fn referral(&self) -> Option<&Box<dyn Reference>>;
  fn facility(&self) -> Option<&Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn fundsReserve(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn prescription(&self) -> Option<&Box<dyn Reference>>;
  fn billablePeriod(&self) -> Option<&Box<dyn Period>>;
  fn originalPrescription(&self) -> Option<&Box<dyn Reference>>;
  fn payee(&self) -> Option<&Box<Claim_Payee>>;
  fn related(&self) -> &Vector<Box<Claim_Related>>;
  fn careTeam(&self) -> &Vector<Box<Claim_CareTeam>>;
  fn accident(&self) -> Option<&Box<Claim_Accident>>;
  fn diagnosis(&self) -> &Vector<Box<Claim_Diagnosis>>;
  fn procedure(&self) -> &Vector<Box<Claim_Procedure>>;
  fn insurance(&self) -> &Vector<Box<Claim_Insurance>>;
  fn supportingInfo(&self) -> &Vector<Box<Claim_SupportingInfo>>;
  fn item(&self) -> &Vector<Box<Claim_Item>>;
}

dyn_clone::clone_trait_object!(Claim);

impl FHIRObject for ClaimRaw {
}

impl Resource for ClaimRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for ClaimRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Claim for ClaimRaw {
  fn _use(&self) -> &String { &self._use }
  fn _type(&self) -> &Box<dyn CodeableConcept> { &self._type }
  fn total(&self) -> Option<&Box<dyn Money>> { self.total.as_ref() }
  fn status(&self) -> &String { &self.status }
  fn subType(&self) -> Option<&Box<dyn CodeableConcept>> { self.subType.as_ref() }
  fn patient(&self) -> &Box<dyn Reference> { &self.patient }
  fn created(&self) -> &DateTime<FixedOffset> { &self.created }
  fn enterer(&self) -> Option<&Box<dyn Reference>> { self.enterer.as_ref() }
  fn insurer(&self) -> Option<&Box<dyn Reference>> { self.insurer.as_ref() }
  fn provider(&self) -> &Box<dyn Reference> { &self.provider }
  fn priority(&self) -> &Box<dyn CodeableConcept> { &self.priority }
  fn referral(&self) -> Option<&Box<dyn Reference>> { self.referral.as_ref() }
  fn facility(&self) -> Option<&Box<dyn Reference>> { self.facility.as_ref() }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn fundsReserve(&self) -> Option<&Box<dyn CodeableConcept>> { self.fundsReserve.as_ref() }
  fn prescription(&self) -> Option<&Box<dyn Reference>> { self.prescription.as_ref() }
  fn billablePeriod(&self) -> Option<&Box<dyn Period>> { self.billablePeriod.as_ref() }
  fn originalPrescription(&self) -> Option<&Box<dyn Reference>> { self.originalPrescription.as_ref() }
  fn payee(&self) -> Option<&Box<Claim_Payee>> { self.payee.as_ref() }
  fn related(&self) -> &Vector<Box<Claim_Related>> { &self.related }
  fn careTeam(&self) -> &Vector<Box<Claim_CareTeam>> { &self.careTeam }
  fn accident(&self) -> Option<&Box<Claim_Accident>> { self.accident.as_ref() }
  fn diagnosis(&self) -> &Vector<Box<Claim_Diagnosis>> { &self.diagnosis }
  fn procedure(&self) -> &Vector<Box<Claim_Procedure>> { &self.procedure }
  fn insurance(&self) -> &Vector<Box<Claim_Insurance>> { &self.insurance }
  fn supportingInfo(&self) -> &Vector<Box<Claim_SupportingInfo>> { &self.supportingInfo }
  fn item(&self) -> &Vector<Box<Claim_Item>> { &self.item }
}

