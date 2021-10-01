
use crate::core::UnionAll;
use im::vector::Vector;

#[derive(Clone,Debug)]
pub struct Extension {
    pub(crate) id: Option<String>,
    pub(crate) url: String,
    pub(crate) value: Option<UnionAll>,
    pub(crate) extension: Vector<Extension>,
}