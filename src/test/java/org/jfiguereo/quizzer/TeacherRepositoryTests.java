package org.jfiguereo.quizzer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.jfiguereo.quizzer.models.Teacher;
import org.jfiguereo.quizzer.repositories.TeacherRepository;
import org.jfiguereo.quizzer.services.TeacherService;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TeacherRepositoryTests {
	

	Teacher teacher = new Teacher();
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	
	private TeacherService teacherService;
	
	long id;
	
	@Test
	@Order(1)
	public void saveTeacherTest() {
		teacher.setFirstName("Aman");
		teacher.setLastName("Shaw");
		teacher.setUsername("test");
		teacher.setPassword("test");
		teacher.setRole("teacher");
		teacherRepository.save(teacher);
		Assertions.assertThat(teacher.getId()).isGreaterThan(0);
		Assertions.assertThat(teacherRepository.getById(teacher.getId())).isEqualTo(teacher);	
	}
	
	@Test
	@Order(2)
	public void getTeacherTest() {
		Teacher teacher = teacherRepository.findById(16L).get();
		Assertions.assertThat(teacher.getId()).isGreaterThan(0);
		Assertions.assertThat(teacher.getUsername()).isEqualTo("sanya");
	}
	
	@Test
	@Order(3)
	public void updateTeacherTest() {
		Teacher teacher = teacherRepository.findById(16L).get();
		teacher.setFirstName("Collin");
		Teacher updatedTeacher = teacherRepository.save(teacher);
		Assertions.assertThat(updatedTeacher.getId()).isGreaterThan(0);
		Assertions.assertThat(updatedTeacher.getFirstName()).isEqualTo("Collin");
	}
	
	@Test
	@Order(4)
	public void deleteTeacherTest() {
		saveTeacherTest();
		teacherRepository.delete(teacher);
	}
	
	//Parameterized test - service method
	@ParameterizedTest
	@ValueSource(strings = {"teacher", "sanya" })
	public void getTeacherByUsernameTest(String arg) {
		Teacher teacher = teacherRepository.findByusername(arg);
		Assertions.assertThat(teacher.getFirstName()).isEqualTo("Teacher");
	}
	
}
