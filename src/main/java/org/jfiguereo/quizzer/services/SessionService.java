package org.jfiguereo.quizzer.services;

import java.util.List;

import org.jfiguereo.quizzer.models.Question;
import org.jfiguereo.quizzer.models.Session;

public interface SessionService{
	List<Session> getAllSessions();
	Session saveSession(Session session);
	Session findSessionById(Long id);
	
}
