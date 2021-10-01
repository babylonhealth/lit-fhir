use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct ImagingStudy_Series_Instance {
  pub(crate) id?: String,
  pub(crate) uid: String,
  pub(crate) title?: String,
  pub(crate) number?: u32,
  pub(crate) sopClass: Coding,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}



pub struct ImagingStudy_Series_Performer {
  pub(crate) id?: String,
  pub(crate) actor: Reference,
  pub(crate) function?: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}

pub struct ImagingStudy_Series {
  pub(crate) id?: String,
  pub(crate) uid: String,
  pub(crate) number?: u32,
  pub(crate) started?: Date,
  pub(crate) modality: Coding,
  pub(crate) endpoint?: Reference,
  pub(crate) bodySite?: Coding,
  pub(crate) specimen?: Reference,
  pub(crate) extension?: Extension,
  pub(crate) laterality?: Coding,
  pub(crate) description?: String,
  pub(crate) modifierExtension?: Extension,
  pub(crate) numberOfInstances?: u32,
  pub(crate) instance?: ImagingStudy_Series_Instance,
  pub(crate) performer?: ImagingStudy_Series_Performer,
}

pub struct ImagingStudy {
  pub(crate) note?: Annotation,
  pub(crate) status: String,
  pub(crate) subject: Reference,
  pub(crate) started?: Date,
  pub(crate) basedOn?: Reference,
  pub(crate) modality?: Coding,
  pub(crate) referrer?: Reference,
  pub(crate) endpoint?: Reference,
  pub(crate) location?: Reference,
  pub(crate) encounter?: Reference,
  pub(crate) identifier?: Identifier,
  pub(crate) reasonCode?: CodeableConcept,
  pub(crate) interpreter?: Reference,
  pub(crate) description?: String,
  pub(crate) procedureCode?: CodeableConcept,
  pub(crate) numberOfSeries?: u32,
  pub(crate) reasonReference?: Reference,
  pub(crate) numberOfInstances?: u32,
  pub(crate) procedureReference?: Reference,
  pub(crate) series?: ImagingStudy_Series,
}