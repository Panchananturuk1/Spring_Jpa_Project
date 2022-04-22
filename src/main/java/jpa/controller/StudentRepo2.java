package jpa.controller;

import org.springframework.data.repository.CrudRepository;

import jpa.studentdata.StudentData;

public interface StudentRepo2 extends CrudRepository<StudentData, Integer> {

}
