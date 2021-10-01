use bigdecimal::BigDecimal;
use im::vector::Vector;

use crate::hl7::model::*;
use crate::hl7::*;




pub struct Patient_Link {
  pub(crate) id?: String,
  pub(crate) _type: String,
  pub(crate) other: Reference,
  pub(crate) extension?: Extension,
  pub(crate) modifierExtension?: Extension,
}


pub struct Patient_Contact {
  pub(crate) id?: String,
  pub(crate) name?: HumanName,
  pub(crate) gender?: String,
  pub(crate) period?: Period,
  pub(crate) telecom?: ContactPoint,
  pub(crate) address?: Address,
  pub(crate) extension?: Extension,
  pub(crate) relationship?: CodeableConcept,
  pub(crate) organization?: Reference,
  pub(crate) modifierExtension?: Extension,
}


pub struct Patient_Communication {
  pub(crate) id?: String,
  pub(crate) language: CodeableConcept,
  pub(crate) extension?: Extension,
  pub(crate) preferred?: Boolean,
  pub(crate) modifierExtension?: Extension,
}

pub struct Patient {
  pub(crate) name?: HumanName,
  pub(crate) photo?: Attachment,
  pub(crate) active?: Boolean,
  pub(crate) gender?: String,
  pub(crate) telecom?: ContactPoint,
  pub(crate) address?: Address,
  pub(crate) birthDate?: FHIRDate,
  pub(crate) identifier?: Identifier,
  pub(crate) deceased?: Boolean | Date,
  pub(crate) maritalStatus?: CodeableConcept,
  pub(crate) multipleBirth?: Boolean | i32,
  pub(crate) generalPractitioner?: Reference,
  pub(crate) managingOrganization?: Reference,
  pub(crate) link?: Patient_Link,
  pub(crate) contact?: Patient_Contact,
  pub(crate) communication?: Patient_Communication,
}