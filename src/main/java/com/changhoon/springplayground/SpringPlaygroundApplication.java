package com.changhoon.springplayground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class SpringPlaygroundApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringPlaygroundApplication.class, args);
  }

}
