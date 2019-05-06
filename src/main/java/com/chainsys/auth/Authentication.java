package com.chainsys.auth;

import java.sql.SQLException;

import com.chainsys.auth.DAO.loginDAO;

public class Authentication {
	public static boolean isLogin(String username,String password) throws ClassNotFoundException, SQLException
	{
		return loginDAO.success(username,password);
	}
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		if(isLogin("mahe@gmail.com", "1234")){
//			System.out.println("Success");
//		}else {
//			System.out.println("failure");
//		}
//	}
}
