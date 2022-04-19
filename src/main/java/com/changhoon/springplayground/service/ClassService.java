package com.changhoon.springplayground.service;

import com.changhoon.springplayground.dto.ClassAddRequest;
import com.changhoon.springplayground.dto.ClassAddResponse;
import com.changhoon.springplayground.entity.ClassEntity;
import com.changhoon.springplayground.repository.ClassRepository;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class ClassService {

  private ClassRepository classRepository;

  public ClassAddResponse addClass(ClassAddRequest request) {
    ClassEntity classEntity = ClassEntity.builder()
        .classUid(UUID.randomUUID().toString())
        .className(request.getClassName())
        .build();

    classRepository.save(classEntity);

    return ClassAddResponse.builder()
        .classUid(classEntity.getClassUid())
        .className(classEntity.getClassName())
        .responseCreateAt(Timestamp.valueOf(LocalDateTime.now()))
        .build();
  }

}
