package org.jfiguereo.quizzer.services;

import java.util.List;

import org.jfiguereo.quizzer.models.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Student saveStudent(Student student);
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	void deleteStudentById(Long Id);
	
}
