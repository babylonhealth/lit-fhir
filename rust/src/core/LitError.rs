use thiserror::Error;

#[derive(Error, Debug)]
/// LitError is a generic error type that encapsulates all the know Errors that this library could return
pub enum LitError {
    #[error("just a dummy error for now")]
    DummyError,

    #[error("an error occured: {0}")]
    GenericError(String),
}
