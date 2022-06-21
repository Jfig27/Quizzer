package org.jfiguereo.quizzer.repositories;

import org.jfiguereo.quizzer.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
	Admin findByusername(String username);
	Admin getById(Long Id);
	void deleteById(Long Id);
}
