package com.iit.university.service;

import com.iit.university.exception.StudentNotFoundException;
import com.iit.university.model.Student;
import com.iit.university.model.StudentDTO;
import com.iit.university.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Long studentId, StudentDTO studentDetails) {
        Student  student = studentRepository.findById(studentId)
                .orElseThrow(() -> new StudentNotFoundException(studentId));

        student.setFirstName(studentDetails.getFirstName());
        student.setLastName(studentDetails.getLastName());
        student.setEmail(studentDetails.getEmail());

        Optional.ofNullable(studentDetails.getAddress())
                .ifPresent(student::setAddress);

        return studentRepository.save(student);
    }

    // Delete student
    public void deleteStudent(Long studentId) {
        if (studentRepository.existsById(studentId)) {
            studentRepository.deleteById(studentId);
        } else {
            throw new RuntimeException("Student not found with id: " + studentId);
        }
    }


}
