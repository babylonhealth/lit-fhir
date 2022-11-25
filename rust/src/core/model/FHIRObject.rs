use std::fmt::Debug;
use dyn_clone::DynClone;
use im::vector::Vector;

use crate::core::model::Extension::Extension;

#[derive(Clone, Debug)]
pub struct FHIRObjectRaw {
}

pub trait FHIRObject: Debug + DynClone {
}

impl FHIRObject for FHIRObjectRaw {
}

dyn_clone::clone_trait_object!(FHIRObject);
