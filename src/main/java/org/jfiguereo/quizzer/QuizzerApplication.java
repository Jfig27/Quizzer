package org.jfiguereo.quizzer;

import javax.annotation.PostConstruct;

import org.jfiguereo.quizzer.models.Question;
import org.jfiguereo.quizzer.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuizzerApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizzerApplication.class, args);
	}
}
