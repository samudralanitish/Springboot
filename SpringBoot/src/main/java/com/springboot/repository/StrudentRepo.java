package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.model.Student;

public interface StrudentRepo extends JpaRepository<Student, Integer>{

}
