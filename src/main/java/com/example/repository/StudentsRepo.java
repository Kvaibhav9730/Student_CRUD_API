package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Students;

public interface StudentsRepo extends JpaRepository<Students, Integer>{

}
