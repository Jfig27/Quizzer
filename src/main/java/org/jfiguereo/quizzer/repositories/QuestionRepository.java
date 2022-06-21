package org.jfiguereo.quizzer.repositories;

import java.util.List;

import org.jfiguereo.quizzer.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {

	List<Question> findBysubject(String subject);
	Question findByquestionId(Long id);
	void deleteByquestionId(Long id);
}
