package com.db.fractus.service;


import com.db.fractus.entity.QuestionnaireEntity;
import com.db.fractus.repository.IQuestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionnaireService {

    @Autowired
    private IQuestionnaireRepository questionnaireRepository;

    public List<QuestionnaireEntity> getAllQuestions(){
        return questionnaireRepository.findAll();
    }
}
