package com.mspg.crud.dao;

import com.mspg.crud.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentDao extends JpaRepository<Student, Long> {


}
