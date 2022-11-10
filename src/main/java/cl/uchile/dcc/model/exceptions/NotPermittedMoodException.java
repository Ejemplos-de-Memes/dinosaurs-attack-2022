package cl.uchile.dcc.model.exceptions;

public class NotPermittedMoodException extends RuntimeException {

  public NotPermittedMoodException(String msg) {
    super(msg);
  }

  public NotPermittedMoodException() {
    super();
  }
}
