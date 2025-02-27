package com.oreo.mingle.domain.qna.repository;

import com.oreo.mingle.domain.galaxy.entity.Galaxy;
import com.oreo.mingle.domain.qna.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    Optional<Question> findByGalaxyAndDate(Galaxy galaxy, LocalDate date);

    List<Question> findByGalaxy(Galaxy galaxy);

    int countByGalaxy(Galaxy galaxy);
}
