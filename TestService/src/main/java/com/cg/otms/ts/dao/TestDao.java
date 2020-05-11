package com.cg.otms.ts.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.otms.ts.dto.Test;

@Repository
public interface TestDao extends JpaRepository<Test,Integer>
{

}