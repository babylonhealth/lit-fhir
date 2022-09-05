use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::UnionCodeableConceptOrReference;
use crate::core::model::Attachment::Attachment;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Coding::Coding;
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
use crate::hl7::UnionMoneyOrStringOrUnsignedInt;
use crate::hl7::UnionMoneyOrUnsignedInt;
use crate::hl7::Union_2028408917;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_Payee {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) party: Option<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_Total {
  pub(crate) id: Option<String>,
  pub(crate) amount: Box<dyn Money>,
  pub(crate) category: Box<dyn CodeableConcept>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_Related {
  pub(crate) id: Option<String>,
  pub(crate) claim: Option<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) reference: Option<Box<dyn Identifier>>,
  pub(crate) relationship: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_Payment {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) date: Option<FHIRDate>,
  pub(crate) amount: Option<Box<dyn Money>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) adjustment: Option<Box<dyn Money>>,
  pub(crate) identifier: Option<Box<dyn Identifier>>,
  pub(crate) adjustmentReason: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_CareTeam {
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
pub struct ExplanationOfBenefit_Accident {
  pub(crate) id: Option<String>,
  pub(crate) date: Option<FHIRDate>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) location: Option<UnionAddressOrReference>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_Diagnosis {
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
pub struct ExplanationOfBenefit_Procedure {
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
pub struct ExplanationOfBenefit_Insurance {
  pub(crate) id: Option<String>,
  pub(crate) focal: bool,
  pub(crate) coverage: Box<dyn Reference>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) preAuthRef: Vector<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_ProcessNote {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<String>,
  pub(crate) text: Option<String>,
  pub(crate) number: Option<u32>,
  pub(crate) language: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_SupportingInfo {
  pub(crate) id: Option<String>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) reason: Option<Box<dyn Coding>>,
  pub(crate) sequence: u32,
  pub(crate) category: Box<dyn CodeableConcept>,
  pub(crate) value: Option<Union_2028408917>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) timing: Option<UnionDateOrPeriod>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_Item_Adjudication {
  pub(crate) id: Option<String>,
  pub(crate) value: Option<BigDecimal>,
  pub(crate) reason: Option<Box<dyn CodeableConcept>>,
  pub(crate) amount: Option<Box<dyn Money>>,
  pub(crate) category: Box<dyn CodeableConcept>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_Item_Detail_SubDetail {
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
  pub(crate) noteNumber: Vector<u32>,
  pub(crate) programCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) adjudication: Vector<Box<dyn ExplanationOfBenefit_Item_Adjudication>>,
  pub(crate) productOrService: Box<dyn CodeableConcept>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_Item_Detail {
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
  pub(crate) noteNumber: Vector<u32>,
  pub(crate) programCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) adjudication: Vector<Box<dyn ExplanationOfBenefit_Item_Adjudication>>,
  pub(crate) productOrService: Box<dyn CodeableConcept>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) subDetail: Vector<ExplanationOfBenefit_Item_Detail_SubDetail>,
}

#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_Item {
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
  pub(crate) noteNumber: Vector<u32>,
  pub(crate) programCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) serviced: Option<UnionDateOrPeriod>,
  pub(crate) location: Option<UnionAddressOrCodeableConceptOrReference>,
  pub(crate) careTeamSequence: Vector<u32>,
  pub(crate) productOrService: Box<dyn CodeableConcept>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) diagnosisSequence: Vector<u32>,
  pub(crate) procedureSequence: Vector<u32>,
  pub(crate) informationSequence: Vector<u32>,
  pub(crate) adjudication: Vector<ExplanationOfBenefit_Item_Adjudication>,
  pub(crate) detail: Vector<ExplanationOfBenefit_Item_Detail>,
}


#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_AddItem_Detail_SubDetail {
  pub(crate) id: Option<String>,
  pub(crate) net: Option<Box<dyn Money>>,
  pub(crate) factor: Option<BigDecimal>,
  pub(crate) modifier: Vector<Box<dyn CodeableConcept>>,
  pub(crate) quantity: Option<Box<dyn Quantity>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) unitPrice: Option<Box<dyn Money>>,
  pub(crate) noteNumber: Vector<u32>,
  pub(crate) adjudication: Vector<Box<dyn ExplanationOfBenefit_Item_Adjudication>>,
  pub(crate) productOrService: Box<dyn CodeableConcept>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_AddItem_Detail {
  pub(crate) id: Option<String>,
  pub(crate) net: Option<Box<dyn Money>>,
  pub(crate) factor: Option<BigDecimal>,
  pub(crate) modifier: Vector<Box<dyn CodeableConcept>>,
  pub(crate) quantity: Option<Box<dyn Quantity>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) unitPrice: Option<Box<dyn Money>>,
  pub(crate) noteNumber: Vector<u32>,
  pub(crate) adjudication: Vector<Box<dyn ExplanationOfBenefit_Item_Adjudication>>,
  pub(crate) productOrService: Box<dyn CodeableConcept>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) subDetail: Vector<ExplanationOfBenefit_AddItem_Detail_SubDetail>,
}

#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_AddItem {
  pub(crate) id: Option<String>,
  pub(crate) net: Option<Box<dyn Money>>,
  pub(crate) factor: Option<BigDecimal>,
  pub(crate) subSite: Vector<Box<dyn CodeableConcept>>,
  pub(crate) provider: Vector<Box<dyn Reference>>,
  pub(crate) modifier: Vector<Box<dyn CodeableConcept>>,
  pub(crate) quantity: Option<Box<dyn Quantity>>,
  pub(crate) bodySite: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) unitPrice: Option<Box<dyn Money>>,
  pub(crate) noteNumber: Vector<u32>,
  pub(crate) programCode: Vector<Box<dyn CodeableConcept>>,
  pub(crate) serviced: Option<UnionDateOrPeriod>,
  pub(crate) location: Option<UnionAddressOrCodeableConceptOrReference>,
  pub(crate) itemSequence: Vector<u32>,
  pub(crate) adjudication: Vector<Box<dyn ExplanationOfBenefit_Item_Adjudication>>,
  pub(crate) detailSequence: Vector<u32>,
  pub(crate) productOrService: Box<dyn CodeableConcept>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) subDetailSequence: Vector<u32>,
  pub(crate) detail: Vector<ExplanationOfBenefit_AddItem_Detail>,
}


#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_BenefitBalance_Financial {
  pub(crate) id: Option<String>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) used: Option<UnionMoneyOrUnsignedInt>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) allowed: Option<UnionMoneyOrStringOrUnsignedInt>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct ExplanationOfBenefit_BenefitBalance {
  pub(crate) id: Option<String>,
  pub(crate) name: Option<String>,
  pub(crate) unit: Option<Box<dyn CodeableConcept>>,
  pub(crate) term: Option<Box<dyn CodeableConcept>>,
  pub(crate) network: Option<Box<dyn CodeableConcept>>,
  pub(crate) category: Box<dyn CodeableConcept>,
  pub(crate) excluded: Option<bool>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) description: Option<String>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) financial: Vector<ExplanationOfBenefit_BenefitBalance_Financial>,
}

#[derive(Clone, Debug)]
pub struct ExplanationOfBenefitRaw {
  pub(crate) id: Option<String>,
  pub(crate) _use: String,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) form: Option<Box<dyn Attachment>>,
  pub(crate) claim: Option<Box<dyn Reference>>,
  pub(crate) status: String,
  pub(crate) subType: Option<Box<dyn CodeableConcept>>,
  pub(crate) patient: Box<dyn Reference>,
  pub(crate) created: DateTime<FixedOffset>,
  pub(crate) enterer: Option<Box<dyn Reference>>,
  pub(crate) insurer: Box<dyn Reference>,
  pub(crate) outcome: String,
  pub(crate) language: Option<String>,
  pub(crate) provider: Box<dyn Reference>,
  pub(crate) priority: Option<Box<dyn CodeableConcept>>,
  pub(crate) referral: Option<Box<dyn Reference>>,
  pub(crate) facility: Option<Box<dyn Reference>>,
  pub(crate) formCode: Option<Box<dyn CodeableConcept>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) preAuthRef: Vector<String>,
  pub(crate) precedence: Option<u32>,
  pub(crate) disposition: Option<String>,
  pub(crate) fundsReserve: Option<Box<dyn CodeableConcept>>,
  pub(crate) prescription: Option<Box<dyn Reference>>,
  pub(crate) adjudication: Vector<Box<dyn ExplanationOfBenefit_Item_Adjudication>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) claimResponse: Option<Box<dyn Reference>>,
  pub(crate) benefitPeriod: Option<Box<dyn Period>>,
  pub(crate) billablePeriod: Option<Box<dyn Period>>,
  pub(crate) preAuthRefPeriod: Vector<Box<dyn Period>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) originalPrescription: Option<Box<dyn Reference>>,
  pub(crate) fundsReserveRequested: Option<Box<dyn CodeableConcept>>,
  pub(crate) payee: Option<ExplanationOfBenefit_Payee>,
  pub(crate) total: Vector<ExplanationOfBenefit_Total>,
  pub(crate) related: Vector<ExplanationOfBenefit_Related>,
  pub(crate) payment: Option<ExplanationOfBenefit_Payment>,
  pub(crate) careTeam: Vector<ExplanationOfBenefit_CareTeam>,
  pub(crate) accident: Option<ExplanationOfBenefit_Accident>,
  pub(crate) diagnosis: Vector<ExplanationOfBenefit_Diagnosis>,
  pub(crate) procedure: Vector<ExplanationOfBenefit_Procedure>,
  pub(crate) insurance: Vector<ExplanationOfBenefit_Insurance>,
  pub(crate) processNote: Vector<ExplanationOfBenefit_ProcessNote>,
  pub(crate) supportingInfo: Vector<ExplanationOfBenefit_SupportingInfo>,
  pub(crate) item: Vector<ExplanationOfBenefit_Item>,
  pub(crate) addItem: Vector<ExplanationOfBenefit_AddItem>,
  pub(crate) benefitBalance: Vector<ExplanationOfBenefit_BenefitBalance>,
}

pub trait ExplanationOfBenefit : DomainResource {
  fn _use(&self) -> &String;
  fn _type(&self) -> &Box<dyn CodeableConcept>;
  fn form(&self) -> &Option<Box<dyn Attachment>>;
  fn claim(&self) -> &Option<Box<dyn Reference>>;
  fn status(&self) -> &String;
  fn subType(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn patient(&self) -> &Box<dyn Reference>;
  fn created(&self) -> &DateTime<FixedOffset>;
  fn enterer(&self) -> &Option<Box<dyn Reference>>;
  fn insurer(&self) -> &Box<dyn Reference>;
  fn outcome(&self) -> &String;
  fn provider(&self) -> &Box<dyn Reference>;
  fn priority(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn referral(&self) -> &Option<Box<dyn Reference>>;
  fn facility(&self) -> &Option<Box<dyn Reference>>;
  fn formCode(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn preAuthRef(&self) -> &Vector<String>;
  fn precedence(&self) -> &Option<u32>;
  fn disposition(&self) -> &Option<String>;
  fn fundsReserve(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn prescription(&self) -> &Option<Box<dyn Reference>>;
  fn adjudication(&self) -> &Vector<Box<dyn ExplanationOfBenefit_Item_Adjudication>>;
  fn claimResponse(&self) -> &Option<Box<dyn Reference>>;
  fn benefitPeriod(&self) -> &Option<Box<dyn Period>>;
  fn billablePeriod(&self) -> &Option<Box<dyn Period>>;
  fn preAuthRefPeriod(&self) -> &Vector<Box<dyn Period>>;
  fn originalPrescription(&self) -> &Option<Box<dyn Reference>>;
  fn fundsReserveRequested(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn payee(&self) -> &Option<ExplanationOfBenefit_Payee>;
  fn total(&self) -> &Vector<ExplanationOfBenefit_Total>;
  fn related(&self) -> &Vector<ExplanationOfBenefit_Related>;
  fn payment(&self) -> &Option<ExplanationOfBenefit_Payment>;
  fn careTeam(&self) -> &Vector<ExplanationOfBenefit_CareTeam>;
  fn accident(&self) -> &Option<ExplanationOfBenefit_Accident>;
  fn diagnosis(&self) -> &Vector<ExplanationOfBenefit_Diagnosis>;
  fn procedure(&self) -> &Vector<ExplanationOfBenefit_Procedure>;
  fn insurance(&self) -> &Vector<ExplanationOfBenefit_Insurance>;
  fn processNote(&self) -> &Vector<ExplanationOfBenefit_ProcessNote>;
  fn supportingInfo(&self) -> &Vector<ExplanationOfBenefit_SupportingInfo>;
  fn item(&self) -> &Vector<ExplanationOfBenefit_Item>;
  fn addItem(&self) -> &Vector<ExplanationOfBenefit_AddItem>;
  fn benefitBalance(&self) -> &Vector<ExplanationOfBenefit_BenefitBalance>;
}

dyn_clone::clone_trait_object!(ExplanationOfBenefit);

impl FHIRObject for ExplanationOfBenefitRaw {
}

impl Resource for ExplanationOfBenefitRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for ExplanationOfBenefitRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl ExplanationOfBenefit for ExplanationOfBenefitRaw {
  fn _use(&self) -> &String { &self._use }
  fn _type(&self) -> &Box<dyn CodeableConcept> { &self._type }
  fn form(&self) -> &Option<Box<dyn Attachment>> { &self.form }
  fn claim(&self) -> &Option<Box<dyn Reference>> { &self.claim }
  fn status(&self) -> &String { &self.status }
  fn subType(&self) -> &Option<Box<dyn CodeableConcept>> { &self.subType }
  fn patient(&self) -> &Box<dyn Reference> { &self.patient }
  fn created(&self) -> &DateTime<FixedOffset> { &self.created }
  fn enterer(&self) -> &Option<Box<dyn Reference>> { &self.enterer }
  fn insurer(&self) -> &Box<dyn Reference> { &self.insurer }
  fn outcome(&self) -> &String { &self.outcome }
  fn provider(&self) -> &Box<dyn Reference> { &self.provider }
  fn priority(&self) -> &Option<Box<dyn CodeableConcept>> { &self.priority }
  fn referral(&self) -> &Option<Box<dyn Reference>> { &self.referral }
  fn facility(&self) -> &Option<Box<dyn Reference>> { &self.facility }
  fn formCode(&self) -> &Option<Box<dyn CodeableConcept>> { &self.formCode }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn preAuthRef(&self) -> &Vector<String> { &self.preAuthRef }
  fn precedence(&self) -> &Option<u32> { &self.precedence }
  fn disposition(&self) -> &Option<String> { &self.disposition }
  fn fundsReserve(&self) -> &Option<Box<dyn CodeableConcept>> { &self.fundsReserve }
  fn prescription(&self) -> &Option<Box<dyn Reference>> { &self.prescription }
  fn adjudication(&self) -> &Vector<Box<dyn ExplanationOfBenefit_Item_Adjudication>> { &self.adjudication }
  fn claimResponse(&self) -> &Option<Box<dyn Reference>> { &self.claimResponse }
  fn benefitPeriod(&self) -> &Option<Box<dyn Period>> { &self.benefitPeriod }
  fn billablePeriod(&self) -> &Option<Box<dyn Period>> { &self.billablePeriod }
  fn preAuthRefPeriod(&self) -> &Vector<Box<dyn Period>> { &self.preAuthRefPeriod }
  fn originalPrescription(&self) -> &Option<Box<dyn Reference>> { &self.originalPrescription }
  fn fundsReserveRequested(&self) -> &Option<Box<dyn CodeableConcept>> { &self.fundsReserveRequested }
  fn payee(&self) -> &Option<ExplanationOfBenefit_Payee> { &self.payee }
  fn total(&self) -> &Vector<ExplanationOfBenefit_Total> { &self.total }
  fn related(&self) -> &Vector<ExplanationOfBenefit_Related> { &self.related }
  fn payment(&self) -> &Option<ExplanationOfBenefit_Payment> { &self.payment }
  fn careTeam(&self) -> &Vector<ExplanationOfBenefit_CareTeam> { &self.careTeam }
  fn accident(&self) -> &Option<ExplanationOfBenefit_Accident> { &self.accident }
  fn diagnosis(&self) -> &Vector<ExplanationOfBenefit_Diagnosis> { &self.diagnosis }
  fn procedure(&self) -> &Vector<ExplanationOfBenefit_Procedure> { &self.procedure }
  fn insurance(&self) -> &Vector<ExplanationOfBenefit_Insurance> { &self.insurance }
  fn processNote(&self) -> &Vector<ExplanationOfBenefit_ProcessNote> { &self.processNote }
  fn supportingInfo(&self) -> &Vector<ExplanationOfBenefit_SupportingInfo> { &self.supportingInfo }
  fn item(&self) -> &Vector<ExplanationOfBenefit_Item> { &self.item }
  fn addItem(&self) -> &Vector<ExplanationOfBenefit_AddItem> { &self.addItem }
  fn benefitBalance(&self) -> &Vector<ExplanationOfBenefit_BenefitBalance> { &self.benefitBalance }
}

