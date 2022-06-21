package org.jfiguereo.quizzer.services;

import java.util.List;

import org.jfiguereo.quizzer.models.Question;
import org.jfiguereo.quizzer.models.Session;
import org.jfiguereo.quizzer.repositories.SessionRepository;
import org.springframework.stereotype.Service;

@Service
public class SessionServiceImpl implements SessionService{
	
	
	private SessionRepository sessionRepository;

	public SessionServiceImpl(SessionRepository sessionRepository) {
		super();
		this.sessionRepository = sessionRepository;
	}

	@Override
	public List<Session> getAllSessions() {
		return sessionRepository.findAll();
	}

	@Override
	public Session saveSession(Session session) {
		return sessionRepository.save(session);
	}

	@Override
	public Session findSessionById(Long id) {
		return sessionRepository.findByid(id);
	}

	
}
