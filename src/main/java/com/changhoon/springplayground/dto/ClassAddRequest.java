package com.changhoon.springplayground.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ClassAddRequest {

  private String className;
}
