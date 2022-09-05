use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::UnionCodeableConceptOrReference;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Money::Money;
use crate::core::model::Period::Period;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::UnionAddressOrCodeableConceptOrReference;
use crate::hl7::UnionAddressOrReference;
use crate::hl7::UnionDateOrPeriod;
use crate::hl7::Union_2028408917;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



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
  pub(crate) date: FHIRDate,
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
  pub(crate) value: Option<Union_2028408917>,
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
  pub(crate) subDetail: Vector<Claim_Item_Detail_SubDetail>,
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
  pub(crate) detail: Vector<Claim_Item_Detail>,
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
  pub(crate) payee: Option<Claim_Payee>,
  pub(crate) related: Vector<Claim_Related>,
  pub(crate) careTeam: Vector<Claim_CareTeam>,
  pub(crate) accident: Option<Claim_Accident>,
  pub(crate) diagnosis: Vector<Claim_Diagnosis>,
  pub(crate) procedure: Vector<Claim_Procedure>,
  pub(crate) insurance: Vector<Claim_Insurance>,
  pub(crate) supportingInfo: Vector<Claim_SupportingInfo>,
  pub(crate) item: Vector<Claim_Item>,
}

pub trait Claim : DomainResource {
  fn _use(&self) -> &String;
  fn _type(&self) -> &Box<dyn CodeableConcept>;
  fn total(&self) -> &Option<Box<dyn Money>>;
  fn status(&self) -> &String;
  fn subType(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn patient(&self) -> &Box<dyn Reference>;
  fn created(&self) -> &DateTime<FixedOffset>;
  fn enterer(&self) -> &Option<Box<dyn Reference>>;
  fn insurer(&self) -> &Option<Box<dyn Reference>>;
  fn provider(&self) -> &Box<dyn Reference>;
  fn priority(&self) -> &Box<dyn CodeableConcept>;
  fn referral(&self) -> &Option<Box<dyn Reference>>;
  fn facility(&self) -> &Option<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn fundsReserve(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn prescription(&self) -> &Option<Box<dyn Reference>>;
  fn billablePeriod(&self) -> &Option<Box<dyn Period>>;
  fn originalPrescription(&self) -> &Option<Box<dyn Reference>>;
  fn payee(&self) -> &Option<Claim_Payee>;
  fn related(&self) -> &Vector<Claim_Related>;
  fn careTeam(&self) -> &Vector<Claim_CareTeam>;
  fn accident(&self) -> &Option<Claim_Accident>;
  fn diagnosis(&self) -> &Vector<Claim_Diagnosis>;
  fn procedure(&self) -> &Vector<Claim_Procedure>;
  fn insurance(&self) -> &Vector<Claim_Insurance>;
  fn supportingInfo(&self) -> &Vector<Claim_SupportingInfo>;
  fn item(&self) -> &Vector<Claim_Item>;
}

dyn_clone::clone_trait_object!(Claim);

impl FHIRObject for ClaimRaw {
}

impl Resource for ClaimRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for ClaimRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl Claim for ClaimRaw {
  fn _use(&self) -> &String { &self._use }
  fn _type(&self) -> &Box<dyn CodeableConcept> { &self._type }
  fn total(&self) -> &Option<Box<dyn Money>> { &self.total }
  fn status(&self) -> &String { &self.status }
  fn subType(&self) -> &Option<Box<dyn CodeableConcept>> { &self.subType }
  fn patient(&self) -> &Box<dyn Reference> { &self.patient }
  fn created(&self) -> &DateTime<FixedOffset> { &self.created }
  fn enterer(&self) -> &Option<Box<dyn Reference>> { &self.enterer }
  fn insurer(&self) -> &Option<Box<dyn Reference>> { &self.insurer }
  fn provider(&self) -> &Box<dyn Reference> { &self.provider }
  fn priority(&self) -> &Box<dyn CodeableConcept> { &self.priority }
  fn referral(&self) -> &Option<Box<dyn Reference>> { &self.referral }
  fn facility(&self) -> &Option<Box<dyn Reference>> { &self.facility }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn fundsReserve(&self) -> &Option<Box<dyn CodeableConcept>> { &self.fundsReserve }
  fn prescription(&self) -> &Option<Box<dyn Reference>> { &self.prescription }
  fn billablePeriod(&self) -> &Option<Box<dyn Period>> { &self.billablePeriod }
  fn originalPrescription(&self) -> &Option<Box<dyn Reference>> { &self.originalPrescription }
  fn payee(&self) -> &Option<Claim_Payee> { &self.payee }
  fn related(&self) -> &Vector<Claim_Related> { &self.related }
  fn careTeam(&self) -> &Vector<Claim_CareTeam> { &self.careTeam }
  fn accident(&self) -> &Option<Claim_Accident> { &self.accident }
  fn diagnosis(&self) -> &Vector<Claim_Diagnosis> { &self.diagnosis }
  fn procedure(&self) -> &Vector<Claim_Procedure> { &self.procedure }
  fn insurance(&self) -> &Vector<Claim_Insurance> { &self.insurance }
  fn supportingInfo(&self) -> &Vector<Claim_SupportingInfo> { &self.supportingInfo }
  fn item(&self) -> &Vector<Claim_Item> { &self.item }
}

