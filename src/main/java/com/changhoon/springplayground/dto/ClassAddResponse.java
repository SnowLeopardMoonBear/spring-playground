package com.changhoon.springplayground.dto;

import java.sql.Timestamp;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClassAddResponse {

  private String classUid;
  private String className;
  private Timestamp responseCreateAt;
}
