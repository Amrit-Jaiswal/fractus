package com.db.fractus.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="Questionnaire")
public class QuestionnaireEntity implements Serializable{

    @Id
    @Column(name="ques_id")
    private int quesId;

    @Column(name="question")
    private String question;

    public int getQuesId() {
        return quesId;
    }

    public void setQuesId(int quesId) {
        this.quesId = quesId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
