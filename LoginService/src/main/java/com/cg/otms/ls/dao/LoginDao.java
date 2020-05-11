package com.cg.otms.ls.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.otms.ls.dto.Login;


public interface LoginDao extends JpaRepository<Login,String>{

}