package com.jarvis.speechtotext.exception;

public class TranscriptionException extends RuntimeException {
  public TranscriptionException(String message) {
    super(message);
  }

  public TranscriptionException(String message, Throwable cause) {
    super(message, cause);
  }

  public TranscriptionException() {
    super();
  }
}
