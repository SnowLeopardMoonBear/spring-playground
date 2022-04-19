package com.changhoon.springplayground.repository;

import com.changhoon.springplayground.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, String> {

}
