package student.dao;

import org.springframework.data.repository.CrudRepository;

import jpa.studentdata.StudentData;

public interface StudentRepo extends CrudRepository<StudentData, Integer> {

}
