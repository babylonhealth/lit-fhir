use bigdecimal::BigDecimal;
use chrono::{DateTime, FixedOffset};
use im::vector::Vector;

use crate::core::model::FHIRObject::FHIRObject;

use crate::core::UnionCodeableConceptOrReference;
use crate::core::model::CodeableConcept::CodeableConcept;
use crate::core::model::Dosage::Dosage;
use crate::core::model::Duration::Duration;
use crate::core::model::Extension::Extension;
use crate::core::model::Meta::Meta;
use crate::core::model::Money::Money;
use crate::core::model::Quantity::Quantity;
use crate::core::model::Ratio::Ratio;
use crate::core::model::Reference::Reference;
use crate::core::model::Resource::Resource;
use crate::hl7::UnionCodeableConceptOrQuantity;
use crate::hl7::Union_0600299688;
use crate::hl7::model::DomainResource::DomainResource;
use crate::hl7::model::Narrative::Narrative;



#[derive(Clone, Debug)]
pub struct MedicationKnowledge_Cost {
  pub(crate) id: Option<String>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) cost: Box<dyn Money>,
  pub(crate) source: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct MedicationKnowledge_Kinetics {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) lethalDose50: Vector<Box<dyn Quantity>>,
  pub(crate) areaUnderCurve: Vector<Box<dyn Quantity>>,
  pub(crate) halfLifePeriod: Option<Box<dyn Duration>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct MedicationKnowledge_Monograph {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) source: Option<Box<dyn Reference>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct MedicationKnowledge_Packaging {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) quantity: Option<Box<dyn Quantity>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct MedicationKnowledge_Ingredient {
  pub(crate) id: Option<String>,
  pub(crate) item: UnionCodeableConceptOrReference,
  pub(crate) isActive: Option<bool>,
  pub(crate) strength: Option<Box<dyn Ratio>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct MedicationKnowledge_MonitoringProgram {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) name: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct MedicationKnowledge_DrugCharacteristic {
  pub(crate) id: Option<String>,
  pub(crate) _type: Option<Box<dyn CodeableConcept>>,
  pub(crate) value: Option<Union_0600299688>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct MedicationKnowledge_MedicineClassification {
  pub(crate) id: Option<String>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) classification: Vector<Box<dyn CodeableConcept>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct MedicationKnowledge_Regulatory_Schedule {
  pub(crate) id: Option<String>,
  pub(crate) schedule: Box<dyn CodeableConcept>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct MedicationKnowledge_Regulatory_MaxDispense {
  pub(crate) id: Option<String>,
  pub(crate) period: Option<Box<dyn Duration>>,
  pub(crate) quantity: Box<dyn Quantity>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct MedicationKnowledge_Regulatory_Substitution {
  pub(crate) id: Option<String>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) allowed: bool,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}

#[derive(Clone, Debug)]
pub struct MedicationKnowledge_Regulatory {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) regulatoryAuthority: Box<dyn Reference>,
  pub(crate) schedule: Vector<MedicationKnowledge_Regulatory_Schedule>,
  pub(crate) maxDispense: Option<MedicationKnowledge_Regulatory_MaxDispense>,
  pub(crate) substitution: Vector<MedicationKnowledge_Regulatory_Substitution>,
}


#[derive(Clone, Debug)]
pub struct MedicationKnowledge_RelatedMedicationKnowledge {
  pub(crate) id: Option<String>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) reference: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}


#[derive(Clone, Debug)]
pub struct MedicationKnowledge_AdministrationGuidelines_Dosage {
  pub(crate) id: Option<String>,
  pub(crate) _type: Box<dyn CodeableConcept>,
  pub(crate) dosage: Vector<Box<dyn Dosage>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
}



#[derive(Clone, Debug)]
pub struct MedicationKnowledge_AdministrationGuidelines_PatientCharacteristics {
  pub(crate) id: Option<String>,
  pub(crate) value: Vector<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) characteristic: UnionCodeableConceptOrQuantity,
}

#[derive(Clone, Debug)]
pub struct MedicationKnowledge_AdministrationGuidelines {
  pub(crate) id: Option<String>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) indication: Option<UnionCodeableConceptOrReference>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) dosage: Vector<MedicationKnowledge_AdministrationGuidelines_Dosage>,
  pub(crate) patientCharacteristics: Vector<MedicationKnowledge_AdministrationGuidelines_PatientCharacteristics>,
}

#[derive(Clone, Debug)]
pub struct MedicationKnowledgeRaw {
  pub(crate) id: Option<String>,
  pub(crate) meta: Option<Box<dyn Meta>>,
  pub(crate) text: Option<Box<dyn Narrative>>,
  pub(crate) code: Option<Box<dyn CodeableConcept>>,
  pub(crate) status: Option<String>,
  pub(crate) amount: Option<Box<dyn Quantity>>,
  pub(crate) synonym: Vector<String>,
  pub(crate) language: Option<String>,
  pub(crate) doseForm: Option<Box<dyn CodeableConcept>>,
  pub(crate) contained: Vector<Box<dyn Resource>>,
  pub(crate) extension: Vector<Box<dyn Extension>>,
  pub(crate) productType: Vector<Box<dyn CodeableConcept>>,
  pub(crate) manufacturer: Option<Box<dyn Reference>>,
  pub(crate) implicitRules: Option<String>,
  pub(crate) intendedRoute: Vector<Box<dyn CodeableConcept>>,
  pub(crate) contraindication: Vector<Box<dyn Reference>>,
  pub(crate) modifierExtension: Vector<Box<dyn Extension>>,
  pub(crate) associatedMedication: Vector<Box<dyn Reference>>,
  pub(crate) preparationInstruction: Option<String>,
  pub(crate) cost: Vector<MedicationKnowledge_Cost>,
  pub(crate) kinetics: Vector<MedicationKnowledge_Kinetics>,
  pub(crate) monograph: Vector<MedicationKnowledge_Monograph>,
  pub(crate) packaging: Option<MedicationKnowledge_Packaging>,
  pub(crate) ingredient: Vector<MedicationKnowledge_Ingredient>,
  pub(crate) monitoringProgram: Vector<MedicationKnowledge_MonitoringProgram>,
  pub(crate) drugCharacteristic: Vector<MedicationKnowledge_DrugCharacteristic>,
  pub(crate) medicineClassification: Vector<MedicationKnowledge_MedicineClassification>,
  pub(crate) regulatory: Vector<MedicationKnowledge_Regulatory>,
  pub(crate) relatedMedicationKnowledge: Vector<MedicationKnowledge_RelatedMedicationKnowledge>,
  pub(crate) administrationGuidelines: Vector<MedicationKnowledge_AdministrationGuidelines>,
}

pub trait MedicationKnowledge : DomainResource {
  fn code(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn status(&self) -> &Option<String>;
  fn amount(&self) -> &Option<Box<dyn Quantity>>;
  fn synonym(&self) -> &Vector<String>;
  fn doseForm(&self) -> &Option<Box<dyn CodeableConcept>>;
  fn productType(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn manufacturer(&self) -> &Option<Box<dyn Reference>>;
  fn intendedRoute(&self) -> &Vector<Box<dyn CodeableConcept>>;
  fn contraindication(&self) -> &Vector<Box<dyn Reference>>;
  fn associatedMedication(&self) -> &Vector<Box<dyn Reference>>;
  fn preparationInstruction(&self) -> &Option<String>;
  fn cost(&self) -> &Vector<MedicationKnowledge_Cost>;
  fn kinetics(&self) -> &Vector<MedicationKnowledge_Kinetics>;
  fn monograph(&self) -> &Vector<MedicationKnowledge_Monograph>;
  fn packaging(&self) -> &Option<MedicationKnowledge_Packaging>;
  fn ingredient(&self) -> &Vector<MedicationKnowledge_Ingredient>;
  fn monitoringProgram(&self) -> &Vector<MedicationKnowledge_MonitoringProgram>;
  fn drugCharacteristic(&self) -> &Vector<MedicationKnowledge_DrugCharacteristic>;
  fn medicineClassification(&self) -> &Vector<MedicationKnowledge_MedicineClassification>;
  fn regulatory(&self) -> &Vector<MedicationKnowledge_Regulatory>;
  fn relatedMedicationKnowledge(&self) -> &Vector<MedicationKnowledge_RelatedMedicationKnowledge>;
  fn administrationGuidelines(&self) -> &Vector<MedicationKnowledge_AdministrationGuidelines>;
}

dyn_clone::clone_trait_object!(MedicationKnowledge);

impl FHIRObject for MedicationKnowledgeRaw {
}

impl Resource for MedicationKnowledgeRaw {
  fn id(&self) -> &Option<String> { &self.id }
  fn meta(&self) -> &Option<Box<dyn Meta>> { &self.meta }
  fn language(&self) -> &Option<String> { &self.language }
  fn implicitRules(&self) -> &Option<String> { &self.implicitRules }
}


impl DomainResource for MedicationKnowledgeRaw {
  fn text(&self) -> &Option<Box<dyn Narrative>> { &self.text }
  fn contained(&self) -> &Vector<Box<dyn Resource>> { &self.contained }
  fn extension(&self) -> &Vector<Box<dyn Extension>> { &self.extension }
  fn modifierExtension(&self) -> &Vector<Box<dyn Extension>> { &self.modifierExtension }
}


impl MedicationKnowledge for MedicationKnowledgeRaw {
  fn code(&self) -> &Option<Box<dyn CodeableConcept>> { &self.code }
  fn status(&self) -> &Option<String> { &self.status }
  fn amount(&self) -> &Option<Box<dyn Quantity>> { &self.amount }
  fn synonym(&self) -> &Vector<String> { &self.synonym }
  fn doseForm(&self) -> &Option<Box<dyn CodeableConcept>> { &self.doseForm }
  fn productType(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.productType }
  fn manufacturer(&self) -> &Option<Box<dyn Reference>> { &self.manufacturer }
  fn intendedRoute(&self) -> &Vector<Box<dyn CodeableConcept>> { &self.intendedRoute }
  fn contraindication(&self) -> &Vector<Box<dyn Reference>> { &self.contraindication }
  fn associatedMedication(&self) -> &Vector<Box<dyn Reference>> { &self.associatedMedication }
  fn preparationInstruction(&self) -> &Option<String> { &self.preparationInstruction }
  fn cost(&self) -> &Vector<MedicationKnowledge_Cost> { &self.cost }
  fn kinetics(&self) -> &Vector<MedicationKnowledge_Kinetics> { &self.kinetics }
  fn monograph(&self) -> &Vector<MedicationKnowledge_Monograph> { &self.monograph }
  fn packaging(&self) -> &Option<MedicationKnowledge_Packaging> { &self.packaging }
  fn ingredient(&self) -> &Vector<MedicationKnowledge_Ingredient> { &self.ingredient }
  fn monitoringProgram(&self) -> &Vector<MedicationKnowledge_MonitoringProgram> { &self.monitoringProgram }
  fn drugCharacteristic(&self) -> &Vector<MedicationKnowledge_DrugCharacteristic> { &self.drugCharacteristic }
  fn medicineClassification(&self) -> &Vector<MedicationKnowledge_MedicineClassification> { &self.medicineClassification }
  fn regulatory(&self) -> &Vector<MedicationKnowledge_Regulatory> { &self.regulatory }
  fn relatedMedicationKnowledge(&self) -> &Vector<MedicationKnowledge_RelatedMedicationKnowledge> { &self.relatedMedicationKnowledge }
  fn administrationGuidelines(&self) -> &Vector<MedicationKnowledge_AdministrationGuidelines> { &self.administrationGuidelines }
}

