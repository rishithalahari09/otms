package com.cg.otms.ls.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.otms.ls.dao.LoginDao;
import com.cg.otms.ls.dto.Login;


@Service
public class LoginService 
{
	@Autowired
	LoginDao ldao;
	public void setLdao(LoginDao ldao)
	{
		this.ldao = ldao;
	}
	
	@Transactional(readOnly = true)
	public Login getLoginById(String user_id)
	{
		return ldao.findById(user_id).get();
	}
	
	
	@Transactional
	public Login register(Login login)
	{
		return ldao.save(login);
	}
	
	
}
