package com.jarvis.speechtotext.service.response;

import lombok.Data;

// @AllArgsConstructor
// @NoArgsConstructor
@Data
// @Getter
public class TranscriptionResponse {

  private String text;
  private String duration;
  private double confidence;
  private String language;
  private String status;

  public String getText() {
    return text;
  }

  public TranscriptionResponse(
      String text, String duration, double confidence, String language, String status) {
    super();
    this.text = text;
    this.duration = duration;
    this.confidence = confidence;
    this.language = language;
    this.status = status;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public double getConfidence() {
    return confidence;
  }

  public void setConfidence(double confidence) {
    this.confidence = confidence;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
