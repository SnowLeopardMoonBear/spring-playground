package com.changhoon.springplayground.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class StudentAddRequest {
  private String studentName;
  private String studentNumber;
}
