package org.jfiguereo.quizzer.repositories;

import java.util.List;

import org.jfiguereo.quizzer.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long>{
	Session findByid(Long id);
}
