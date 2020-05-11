package com.cg.otms.qs.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.otms.qs.dto.Question;

@Repository
public interface QuestionDao  extends JpaRepository<Question,Integer> {

}
