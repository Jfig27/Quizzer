package org.jfiguereo.quizzer.repositories;

import org.jfiguereo.quizzer.models.Option;
import org.springframework.data.jpa.repository.JpaRepository;
public interface OptionRepository extends JpaRepository<Option, Long> {

}
