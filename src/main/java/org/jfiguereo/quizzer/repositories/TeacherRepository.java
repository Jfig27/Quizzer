package org.jfiguereo.quizzer.repositories;

import java.util.Optional;

import org.jfiguereo.quizzer.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long>{

	void deleteById(Long Id);
	Teacher findByusername(String username);
}
