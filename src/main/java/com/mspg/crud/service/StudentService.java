package com.mspg.crud.service;

import com.mspg.crud.dao.IStudentDao;
import com.mspg.crud.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private IStudentDao iStudentDao;


    public Student saveStudent(Student student) {
            return iStudentDao.save(student);
    }

    public List<Student> getAllStudents(){
        return iStudentDao.findAll();

    }


    public void deleteStudent(@PathVariable  Long id){
        iStudentDao.deleteById(id);
    }

    public Student editStudent(Student student){


        return iStudentDao.save(student);
    }

}



