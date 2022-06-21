package org.jfiguereo.quizzer.services;

import java.util.List;

import org.jfiguereo.quizzer.models.Question;
import org.jfiguereo.quizzer.models.Student;

public interface QuestionService {
	List<Question> getAllQuestionsBySubject(String subject);
	Question saveQuestion(Question question);
	Question findQuestionByquestionId(Long id);
	void deleteQuestionByquestionId(Long id);
}
