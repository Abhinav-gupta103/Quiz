package com.question.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.question.entities.Question;
import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByQuizId(Long quizId);
}
