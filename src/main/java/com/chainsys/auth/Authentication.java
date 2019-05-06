package com.chainsys.auth;

import java.sql.SQLException;

import com.chainsys.auth.DAO.loginDAO;

public class Authentication {
	public boolean isLogin(String username,String password) throws ClassNotFoundException, SQLException
	{
		Boolean value=loginDAO.success(username,password);
		return value;
	}
}
