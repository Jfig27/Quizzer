package org.jfiguereo.quizzer;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.jfiguereo.quizzer.models.Student;
import org.jfiguereo.quizzer.repositories.StudentRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class StudentRepositoryTests {
	

	Student student = new Student();
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void saveStudentTest() {
		student.setFirstName("Joshua");
		student.setLastName("Figuereo");
		student.setUsername("test");
		student.setPassword("test");
		student.setRole("student");
		studentRepository.save(student);
		Assertions.assertThat(student.getId()).isGreaterThan(0);
		Assertions.assertThat(studentRepository.getById(student.getId())).isEqualTo(student);	
	}
	
	@Test
	public void getStudentTest() {
		Student student = studentRepository.findById(6L).get();
		Assertions.assertThat(student.getId()).isGreaterThan(0);
		Assertions.assertThat(student.getFirstName()).isEqualTo("Arun");
	}
	
	@Test
	public void updateStudentTest() {
		Student student = studentRepository.findById(6L).get();
		student.setFirstName("Aravind");
		Student updatedStudent = studentRepository.save(student);
		Assertions.assertThat(updatedStudent.getId()).isGreaterThan(0);
		Assertions.assertThat(updatedStudent.getFirstName()).isEqualTo("Aravind");
	}
	
	@Test
	public void deleteStudentTest() {
		saveStudentTest();
		studentRepository.delete(student);
	}
	
}
