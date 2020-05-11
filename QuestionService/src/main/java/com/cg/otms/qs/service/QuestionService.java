package com.cg.otms.qs.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.otms.qs.dao.QuestionDao;
import com.cg.otms.qs.dto.Question;

@Service
public class QuestionService
{
	@Autowired
    QuestionDao qdao;
    public void setqdao(QuestionDao qdao) { this.qdao=qdao;}
    
    @Transactional
    public Optional<Question> getQuestion(int questionId)
    {
    	return qdao.findById(questionId);
    }
    
    @Transactional(readOnly=true)
    public List<Question> getQuestions()
    {
    	return qdao.findAll();
    }
    
    @Transactional
    public Question insertQuestion(Question question)
    {
        return qdao.save(question);
    }
    
    @Transactional
    public String deleteQuestion(int questionId)
    {
    	qdao.deleteById(questionId);
    	return "Question Details Deleted";
    }

}
