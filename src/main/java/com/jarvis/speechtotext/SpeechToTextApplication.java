package com.jarvis.speechtotext;

import com.jarvis.speechtotext.controller.SpeechToTextController;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpeechToTextApplication {

  private static final Logger log = LoggerFactory.getLogger(SpeechToTextController.class);

  public static void main(String[] args) {
    log.info("Starting SpeechToTextApplication...");
    SpringApplication.run(SpeechToTextApplication.class, args);
    log.info("SpeechToTextApplication started successfully.");
  }
}
