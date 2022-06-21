package org.jfiguereo.quizzer.repositories;

import org.jfiguereo.quizzer.models.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long>{
	
}
