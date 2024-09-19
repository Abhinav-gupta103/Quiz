package com.question.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.entities.Question;
import com.question.services.QuestionService;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/question")
public class QuestionController {
    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    // create
    @PostMapping
    public Question create(@RequestBody Question question) {
        return questionService.create(question);
    }

    @GetMapping
    public List<Question> getAll() {
        return questionService.get();
    }

    @GetMapping("/{id}")
    public Question getOne(@PathVariable Long id) {
        return questionService.getOne(id);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsOfQuiz(@PathVariable Long quizId) {
        return this.questionService.getQuestionsOfQuiz(quizId);
    }

}
