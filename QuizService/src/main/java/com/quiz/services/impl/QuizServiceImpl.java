package com.quiz.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quiz.entities.Quiz;
import com.quiz.repositories.QuizRepository;
import com.quiz.services.QuizService;

@Service
public class QuizServiceImpl implements QuizService {

    private QuizRepository quizRepository;

    public QuizServiceImpl(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    @Override
    public Quiz add(Quiz quiz) {
        return this.quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> get() {
        return this.quizRepository.findAll();
    }

    @Override
    public Quiz get(Long id) {
        return this.quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz Not Found"));
    }

}
