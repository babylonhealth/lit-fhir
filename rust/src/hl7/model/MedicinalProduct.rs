use bigdecimal::BigDecimal;
use bytes::Bytes;
use chrono::{DateTime, FixedOffset};
use datetime::{LocalDate, LocalTime};
use im::vector::Vector;
use uuid::Uuid;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Coding::Coding;
use crate::core::model::Extension::Extension;
use crate::core::model::Identifier::Identifier;
use crate::core::model::Meta::Meta;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::core::model::UnionAliases::UnionCodeableConceptOrReference;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct MedicinalProduct_SpecialDesignation {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) date: Option<DateTime<FixedOffset>>,
  pub(crate) status: Option<Box<dyn CodeableConcept>>,
  pub(crate) species: Option<Box<dyn CodeableConcept>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) intendedUse: Option<Box<dyn CodeableConcept>>,
  pub(crate) indication: Option<UnionCodeableConceptOrReference>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct MedicinalProduct_Name_NamePart {
  pub(crate) id: Option<String>,
  pub(crate) part: String,
  pub(crate) _type: Box<dyn Coding>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct MedicinalProduct_Name_CountryLanguage {
  pub(crate) id: Option<String>,
  pub(crate) country: Box<dyn CodeableConcept>,
  pub(crate) language: Box<dyn CodeableConcept>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) jurisdiction: Option<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct MedicinalProduct_Name {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) productName: String,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) namePart: Vector<Box<MedicinalProduct_Name_NamePart>>,
  pub(crate) countryLanguage: Vector<Box<MedicinalProduct_Name_CountryLanguage>>,
}


#[derive(Clone, Debug)]
pub struct MedicinalProduct_ManufacturingBusinessOperation {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) regulator: Option<Box<dyn Reference>>,
  pub(crate) manufacturer: Vector<Box<dyn Reference>>,
  pub(crate) operationType: Option<Box<dyn CodeableConcept>>,
  pub(crate) effectiveDate: Option<DateTime<FixedOffset>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) confidentialityIndicator: Option<Box<dyn CodeableConcept>>,
  pub(crate) authorisationReferenceNumber: Option<Box<dyn Identifier>>,
}

#[derive(Clone, Debug)]
pub struct MedicinalProductRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) domain: Option<Box<dyn Coding>>,
  pub(crate) contact: Vector<Box<dyn Reference>>,
  pub(crate) language: Option<String>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) identifier: Vector<Box<dyn Identifier>>,
  pub(crate) masterFile: Vector<Box<dyn Reference>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) clinicalTrial: Vector<Box<dyn Reference>>,
  pub(crate) crossReference: Vector<Box<dyn Identifier>>,
  pub(crate) specialMeasures: Vector<String>,
  pub(crate) marketingStatus: Vector<String>,
  pub(crate) attachedDocument: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) legalStatusOfSupply: Option<Box<dyn CodeableConcept>>,
  pub(crate) productClassification: Vector<Box<dyn CodeableConcept>>,
  pub(crate) pharmaceuticalProduct: Vector<Box<dyn Reference>>,
  pub(crate) paediatricUseIndicator: Option<Box<dyn CodeableConcept>>,
  pub(crate) packagedMedicinalProduct: Vector<Box<dyn Reference>>,
  pub(crate) additionalMonitoringIndicator: Option<Box<dyn CodeableConcept>>,
  pub(crate) combinedPharmaceuticalDoseForm: Option<Box<dyn CodeableConcept>>,
  pub(crate) specialDesignation: Vector<Box<MedicinalProduct_SpecialDesignation>>,
  pub(crate) name: Vector<Box<MedicinalProduct_Name>>,
  pub(crate) manufacturingBusinessOperation: Vector<Box<MedicinalProduct_ManufacturingBusinessOperation>>,
}

pub trait MedicinalProduct : DomainResource {
  fn _type(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn domain(&self) -> Option<&Box<dyn Coding>>;
  fn contact(&self) -> &Vector<Box<dyn Reference>>;
  fn identifier(&self) -> &Vector<Box<dyn Identifier>>;
  fn masterFile(&self) -> &Vector<Box<dyn Reference>>;
  fn clinicalTrial(&self) -> &Vector<Box<dyn Reference>>;
  fn crossReference(&self) -> &Vector<Box<dyn Identifier>>;
  fn specialMeasures(&self) -> &Vector<String>;
  fn marketingStatus(&self) -> &Vector<String>;
  fn attachedDocument(&self) -> &Vector<Box<dyn Reference>>;
  fn legalStatusOfSupply(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn productClassification(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn pharmaceuticalProduct(&self) -> &Vector<Box<dyn Reference>>;
  fn paediatricUseIndicator(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn packagedMedicinalProduct(&self) -> &Vector<Box<dyn Reference>>;
  fn additionalMonitoringIndicator(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn combinedPharmaceuticalDoseForm(&self) -> Option<&Box<dyn CodeableConcept>>;
  fn specialDesignation(&self) -> &Vector<Box<MedicinalProduct_SpecialDesignation>>;
  fn name(&self) -> &Vector<Box<MedicinalProduct_Name>>;
  fn manufacturingBusinessOperation(&self) -> &Vector<Box<MedicinalProduct_ManufacturingBusinessOperation>>;
}

dyn_clone::clone_trait_object!(MedicinalProduct);

impl FHIRObject for MedicinalProductRaw {
}

impl Resource for MedicinalProductRaw {
  fn id(&self) -> Option<&String> { self.id.as_ref() }
  fn meta(&self) -> Option<&Box<dyn Meta>> { self.meta.as_ref() }
  fn language(&self) -> Option<&String> { self.language.as_ref() }
  fn implicitRules(&self) -> Option<&String> { self.implicitRules.as_ref() }
}


impl DomainResource for MedicinalProductRaw {
  fn text(&self) -> Option<&Box<dyn Narrative>> { self.text.as_ref() }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl MedicinalProduct for MedicinalProductRaw {
  fn _type(&self) -> Option<&Box<dyn CodeableConcept>> { self._type.as_ref() }
  fn domain(&self) -> Option<&Box<dyn Coding>> { self.domain.as_ref() }
  fn contact(&self) -> &Vector<Box<dyn Reference>> { &self.contact }
  fn identifier(&self) -> &Vector<Box<dyn Identifier>> { &self.identifier }
  fn masterFile(&self) -> &Vector<Box<dyn Reference>> { &self.masterFile }
  fn clinicalTrial(&self) -> &Vector<Box<dyn Reference>> { &self.clinicalTrial }
  fn crossReference(&self) -> &Vector<Box<dyn Identifier>> { &self.crossReference }
  fn specialMeasures(&self) -> &Vector<String> { &self.specialMeasures }
  fn marketingStatus(&self) -> &Vector<String> { &self.marketingStatus }
  fn attachedDocument(&self) -> &Vector<Box<dyn Reference>> { &self.attachedDocument }
  fn legalStatusOfSupply(&self) -> Option<&Box<dyn CodeableConcept>> { self.legalStatusOfSupply.as_ref() }
  fn productClassification(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.productClassification }
  fn pharmaceuticalProduct(&self) -> &Vector<Box<dyn Reference>> { &self.pharmaceuticalProduct }
  fn paediatricUseIndicator(&self) -> Option<&Box<dyn CodeableConcept>> { self.paediatricUseIndicator.as_ref() }
  fn packagedMedicinalProduct(&self) -> &Vector<Box<dyn Reference>> { &self.packagedMedicinalProduct }
  fn additionalMonitoringIndicator(&self) -> Option<&Box<dyn CodeableConcept>> { self.additionalMonitoringIndicator.as_ref() }
  fn combinedPharmaceuticalDoseForm(&self) -> Option<&Box<dyn CodeableConcept>> { self.combinedPharmaceuticalDoseForm.as_ref() }
  fn specialDesignation(&self) -> &Vector<Box<MedicinalProduct_SpecialDesignation>> { &self.specialDesignation }
  fn name(&self) -> &Vector<Box<MedicinalProduct_Name>> { &self.name }
  fn manufacturingBusinessOperation(&self) -> &Vector<Box<MedicinalProduct_ManufacturingBusinessOperation>> { &self.manufacturingBusinessOperation }
}

