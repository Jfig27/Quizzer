package org.jfiguereo.quizzer.repositories;

import org.jfiguereo.quizzer.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>{

	Student findByusername(String username);
	void deleteById(Long Id);
}
