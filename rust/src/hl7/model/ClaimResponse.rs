use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::Attachment::Attachment;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Money::Money;
use crate::core::model::Period::Period;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;
use crate::hl7::model::UnionAliases::UnionAddressOrCodeableConceptOrReference;
use crate::hl7::model::UnionAliases::UnionDateOrPeriod;



#[derive(Clone, Debug)]
pub struct ClaimResponse_Total {
  pub(crate) id: Option<String>,
  pub(crate) amount: Box<dyn Money>,
  pub(crate) category: Box<dyn CodeableConcept>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct ClaimResponse_Error {
  pub(crate) id: Option<String>,
  pub(crate) code: Box<dyn CodeableConcept>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) itemSequence: Option<u32>,
  pub(crate) detailSequence: Option<u32>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) subDetailSequence: Option<u32>,
}


#[derive(Clone, Debug)]
pub struct ClaimResponse_Payment {
  pub(crate) id: Option<String>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) date: Option<LocalDate>,
  pub(crate) amount: Box<dyn Money>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) adjustment: Option<Box<dyn Money>>,
  pub(crate) identifier: Option<Box<dyn Identifier>>,
  pub(crate) adjustmentReason: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct ClaimResponse_ProcessNote {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<String>,
  pub(crate) text: String,
  pub(crate) number: Option<u32>,
  pub(crate) language: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct ClaimResponse_Insurance {
  pub(crate) id: Option<String>,
  pub(crate) focal: bool,
  pub(crate) sequence: u32,
  pub(crate) coverage: Box<dyn Reference>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) claimResponse: Option<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) businessArrangement: Option<String>,
}


#[derive(Clone, Debug)]
pub struct ClaimResponse_Item_Adjudication {
  pub(crate) id: Option<String>,
  pub(crate) value: Option<BigDecimal>,
  pub(crate) reason: Option<Box<dyn CodeableConcept>>,
  pub(crate) amount: Option<Box<dyn Money>>,
  pub(crate) category: Box<dyn CodeableConcept>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct ClaimResponse_Item_Detail_SubDetail {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) noteNumber: Vector<u32>,
  pub(crate) adjudication: Vector<Box<ClaimResponse_Item_Adjudication>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) subDetailSequence: u32,
}

#[derive(Clone, Debug)]
pub struct ClaimResponse_Item_Detail {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) noteNumber: Vector<u32>,
  pub(crate) adjudication: Vector<Box<ClaimResponse_Item_Adjudication>>,
  pub(crate) detailSequence: u32,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) subDetail: Vector<Box<ClaimResponse_Item_Detail_SubDetail>>,
}

#[derive(Clone, Debug)]
pub struct ClaimResponse_Item {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) noteNumber: Vector<u32>,
  pub(crate) itemSequence: u32,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) adjudication: Vector<Box<ClaimResponse_Item_Adjudication>>,
  pub(crate) detail: Vector<Box<ClaimResponse_Item_Detail>>,
}


#[derive(Clone, Debug)]
pub struct ClaimResponse_AddItem_Detail_SubDetail {
  pub(crate) id: Option<String>,
  pub(crate) net: Option<Box<dyn Money>>,
  pub(crate) factor: Option<BigDecimal>,
  pub(crate) modifier: Vector<Box<dyn CodeableConcept>>,
  pub(crate) quantity: Option<Box<dyn Quantity>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) unitPrice: Option<Box<dyn Money>>,
  pub(crate) noteNumber: Vector<u32>,
  pub(crate) adjudication: Vector<Box<ClaimResponse_Item_Adjudication>>,
  pub(crate) productOrService: Box<dyn CodeableConcept>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct ClaimResponse_AddItem_Detail {
  pub(crate) id: Option<String>,
  pub(crate) net: Option<Box<dyn Money>>,
  pub(crate) factor: Option<BigDecimal>,
  pub(crate) modifier: Vector<Box<dyn CodeableConcept>>,
  pub(crate) quantity: Option<Box<dyn Quantity>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) unitPrice: Option<Box<dyn Money>>,
  pub(crate) noteNumber: Vector<u32>,
  pub(crate) adjudication: Vector<Box<ClaimResponse_Item_Adjudication>>,
  pub(crate) productOrService: Box<dyn CodeableConcept>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) subDetail: Vector<Box<ClaimResponse_AddItem_Detail_SubDetail>>,
}

#[derive(Clone, Debug)]
pub struct ClaimResponse_AddItem {
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
  pub(crate) adjudication: Vector<Box<ClaimResponse_Item_Adjudication>>,
  pub(crate) detailSequence: Vector<u32>,
  pub(crate) productOrService: Box<dyn CodeableConcept>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) subdetailSequence: Vector<u32>,
  pub(crate) detail: Vector<Box<ClaimResponse_AddItem_Detail>>,
}

#[derive(Clone, Debug)]
pub struct ClaimResponseRaw {
  pub(crate) id: Option<String>,
  pub(crate) _use: String,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) form: Option<Box<dyn Attachment>>,
  pub(crate) status: String,
  pub(crate) subType: Option<Box<dyn CodeableConcept>>,
  pub(crate) patient: Box<dyn Reference>,
  pub(crate) created: DateTime<FixedOffset>,
  pub(crate) insurer: Box<dyn Reference>,
  pub(crate) request: Option<Box<dyn Reference>>,
  pub(crate) outcome: String,
  pub(crate) language: Option<String>,
  pub(crate) formCode: Option<Box<dyn CodeableConcept>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) requestor: Option<Box<dyn Reference>>,
  pub(crate) payeeType: Option<Box<dyn CodeableConcept>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) preAuthRef: Option<String>,
  pub(crate) disposition: Option<String>,
  pub(crate) adjudication: Vector<Box<ClaimResponse_Item_Adjudication>>,
  pub(crate) fundsReserve: Option<Box<dyn CodeableConcept>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) preAuthPeriod: Option<Box<dyn Period>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) communicationRequest: Vector<Box<dyn Reference>>,
  pub(crate) total: Vector<Box<ClaimResponse_Total>>,
  pub(crate) error: Vector<Box<ClaimResponse_Error>>,
  pub(crate) payment: Option<Box<ClaimResponse_Payment>>,
  pub(crate) processNote: Vector<Box<ClaimResponse_ProcessNote>>,
  pub(crate) insurance: Vector<Box<ClaimResponse_Insurance>>,
  pub(crate) item: Vector<Box<ClaimResponse_Item>>,
  pub(crate) addItem: Vector<Box<ClaimResponse_AddItem>>,
}

pub trait ClaimResponse : DomainResource {
  fn _use(&self) -> &String;
  fn _type(&self) -> &Box<dyn CodeableConcept>;
  fn form(&self) -> Option<&Box<dyn Attachment>>;
  fn status(&self) -> &String;
  fn subType(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn patient(&self) -> &Box<dyn Reference>;
  fn created(&self) -> &DateTime<FixedOffset>;
  fn insurer(&self) -> &Box<dyn Reference>;
  fn request(&self) -> Option<&Box<dyn Reference>>;
  fn outcome(&self) -> &String;
  fn formCode(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn requestor(&self) -> Option<&Box<dyn Reference>>;
  fn payeeType(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn preAuthRef(&self) -> Option<&String>;
  fn disposition(&self) -> Option<&String>;
  fn adjudication(&self) -> &Vector<Box<ClaimResponse_Item_Adjudication>>;
  fn fundsReserve(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn preAuthPeriod(&self) -> Option<&Box<dyn Period>>;
  fn communicationRequest(&self) -> &Vector<Box<dyn Reference>>;
  fn total(&self) -> &Vector<Box<ClaimResponse_Total>>;
  fn error(&self) -> &Vector<Box<ClaimResponse_Error>>;
  fn payment(&self) -> Option<&Box<ClaimResponse_Payment>>;
  fn processNote(&self) -> &Vector<Box<ClaimResponse_ProcessNote>>;
  fn insurance(&self) -> &Vector<Box<ClaimResponse_Insurance>>;
  fn item(&self) -> &Vector<Box<ClaimResponse_Item>>;
  fn addItem(&self) -> &Vector<Box<ClaimResponse_AddItem>>;
}

dyn_clone::clone_trait_object!(ClaimResponse);

impl FHIRObject for ClaimResponseRaw {
}

impl Resource for ClaimResponseRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for ClaimResponseRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl ClaimResponse for ClaimResponseRaw {
  fn _use(&self) -> &String { &self._use }
  fn _type(&self) -> &Box<dyn CodeableConcept> { &self._type }
  fn form(&self) -> Option<&Box<dyn Attachment>> { self.form.as_ref() }
  fn status(&self) -> &String { &self.status }
  fn subType(&self) -> Option<&Box<dyn CodeableConcept>> { self.subType.as_ref() }
  fn patient(&self) -> &Box<dyn Reference> { &self.patient }
  fn created(&self) -> &DateTime<FixedOffset> { &self.created }
  fn insurer(&self) -> &Box<dyn Reference> { &self.insurer }
  fn request(&self) -> Option<&Box<dyn Reference>> { self.request.as_ref() }
  fn outcome(&self) -> &String { &self.outcome }
  fn formCode(&self) -> Option<&Box<dyn CodeableConcept>> { self.formCode.as_ref() }
  fn requestor(&self) -> Option<&Box<dyn Reference>> { self.requestor.as_ref() }
  fn payeeType(&self) -> Option<&Box<dyn CodeableConcept>> { self.payeeType.as_ref() }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn preAuthRef(&self) -> Option<&String> { self.preAuthRef.as_ref() }
  fn disposition(&self) -> Option<&String> { self.disposition.as_ref() }
  fn adjudication(&self) -> &Vector<Box<ClaimResponse_Item_Adjudication>> { &self.adjudication }
  fn fundsReserve(&self) -> Option<&Box<dyn CodeableConcept>> { self.fundsReserve.as_ref() }
  fn preAuthPeriod(&self) -> Option<&Box<dyn Period>> { self.preAuthPeriod.as_ref() }
  fn communicationRequest(&self) -> &Vector<Box<dyn Reference>> { &self.communicationRequest }
  fn total(&self) -> &Vector<Box<ClaimResponse_Total>> { &self.total }
  fn error(&self) -> &Vector<Box<ClaimResponse_Error>> { &self.error }
  fn payment(&self) -> Option<&Box<ClaimResponse_Payment>> { self.payment.as_ref() }
  fn processNote(&self) -> &Vector<Box<ClaimResponse_ProcessNote>> { &self.processNote }
  fn insurance(&self) -> &Vector<Box<ClaimResponse_Insurance>> { &self.insurance }
  fn item(&self) -> &Vector<Box<ClaimResponse_Item>> { &self.item }
  fn addItem(&self) -> &Vector<Box<ClaimResponse_AddItem>> { &self.addItem }
}

