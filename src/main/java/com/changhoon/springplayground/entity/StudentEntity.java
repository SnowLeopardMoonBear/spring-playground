package com.changhoon.springplayground.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class StudentEntity {

  @Id
  private String studentUid;

  @Column(name = "class_id")
  private String classId;

  @Column(name = "student_name")
  private String studentName;

  @Column(name = "student_number")
  private Integer studentNumber;
}
