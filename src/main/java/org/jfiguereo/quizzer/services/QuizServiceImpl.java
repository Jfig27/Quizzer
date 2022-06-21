package org.jfiguereo.quizzer.services;

import org.jfiguereo.quizzer.models.Quiz;
import org.jfiguereo.quizzer.repositories.QuizRepository;
import org.springframework.stereotype.Service;

@Service
public class QuizServiceImpl implements QuizService{
	
	
	private QuizRepository quizRepository;
	
	
	public QuizServiceImpl(QuizRepository quizRepository) {
		super();
		this.quizRepository = quizRepository;
	}


	public Quiz saveQuiz(Quiz quiz) {
		return quizRepository.save(quiz);
	}
	
}
