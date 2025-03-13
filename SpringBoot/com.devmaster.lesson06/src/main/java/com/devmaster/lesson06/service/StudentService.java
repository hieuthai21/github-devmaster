package com.devmaster.lesson06.service;

import com.devmaster.lesson06.dto.StudentDTO;
import com.devmaster.lesson06.enity.Student;
import com.devmaster.lesson06.repository.StudentRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@NoArgsConstructor
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public List<Student> findAll() {
        return studentRepository.findAll();
    }
    public Optional<StudentDTO> findById(Long id) {
        Student student = studentRepository.findById(id).orElse(null);
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(id);
        studentDTO.setName(student.getName());
        studentDTO.setEmail(student.getEmail());
        studentDTO.setAge(student.getAge());
        return Optional.of(studentDTO);
    }
    public boolean save(StudentDTO studentDTO) {
        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setEmail(studentDTO.getEmail());
        student.setAge(studentDTO.getAge());
        try {
            studentRepository.save(student);
            return true;
        }catch (Exception e) {
            return false;
        }
    }
    public Student updateStudentById(Long id, StudentDTO updatedStudent) {
        return studentRepository.findById(id).map(student ->{
            student.setName(updatedStudent.getName());
            student.setEmail(updatedStudent.getEmail());
            student.setAge(updatedStudent.getAge());
            return studentRepository.save(student);
        })
                .orElseThrow(()-> new IllegalStateException("Invalid Student ID:"+id));
    }
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
