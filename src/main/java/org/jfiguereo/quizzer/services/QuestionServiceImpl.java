package org.jfiguereo.quizzer.services;

import java.util.List;

import org.jfiguereo.quizzer.models.Question;
import org.jfiguereo.quizzer.models.Student;
import org.jfiguereo.quizzer.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {
	

	private QuestionRepository questionRepository;

	public QuestionServiceImpl(QuestionRepository questionRepository) {
		super();
		this.questionRepository = questionRepository;
	}

	@Override
	public List<Question> getAllQuestionsBySubject(String subject) {
		return questionRepository.findBysubject(subject);
	}

	@Override
	public Question saveQuestion(Question question) {
		return questionRepository.save(question);
	}

	@Override
	public Question findQuestionByquestionId(Long id) {
		return questionRepository.findByquestionId(id);
	}

	@Override
	public void deleteQuestionByquestionId(Long id) {
		questionRepository.deleteById(id);
		return;
	}
	
}
