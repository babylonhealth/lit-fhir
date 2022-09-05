// use std::fmt::Debug;
// use dyn_clone::DynClone;
// use im::vector::Vector;
//
// use crate::core::Extension::Extension;
//
// #[derive(Clone, Debug)]
// pub struct FHIRObjectRaw {
//     pub(crate) id: Option<String>,
//     pub(crate) extension: Vector<dyn Extension>,
// }
//
// pub trait FHIRObject: Debug + DynClone {
//     fn id(&self) -> &Option<String> { &self.id }
//     fn extension(&self) -> &Vector<dyn Extension> { &self.extension }
// }
//
// dyn_clone::clone_trait_object!(FHIRObject);
