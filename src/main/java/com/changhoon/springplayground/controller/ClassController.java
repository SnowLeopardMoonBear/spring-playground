package com.changhoon.springplayground.controller;

import com.changhoon.springplayground.dto.ClassAddRequest;
import com.changhoon.springplayground.dto.ClassAddResponse;
import com.changhoon.springplayground.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/class")
@RequiredArgsConstructor
public class ClassController {

  private final ClassService classService;

  @PostMapping("")
  public ResponseEntity<ClassAddResponse> addClass( @RequestBody ClassAddRequest request ) {

    ClassAddResponse response = classService.addClass(request);
    return ResponseEntity.ok().body(response);
  }

}
