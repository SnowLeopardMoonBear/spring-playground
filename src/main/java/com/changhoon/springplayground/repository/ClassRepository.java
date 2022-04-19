package com.changhoon.springplayground.repository;

import com.changhoon.springplayground.entity.ClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClassRepository extends JpaRepository<ClassEntity, String> {

}
