package com.zensar.controllers;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zensar.daos.UserDao;
import com.zensar.daos.UserDaoImpl;
import com.zensar.entities.User;
import com.zensar.exceptions.ServiceException;

import com.zensar.services.UserService;
import com.zensar.services.UserServiceImpl;

/**
 * Servlet implementation class LoginController
 * /**
 * @author ram_kalyani
 * @version 2.0
 * @creation_date 21st September 2019 5:29PM
 * @modification_date 28st september 2019 11:19aM
 * @copyright Zensar Technologies. All rights reserved.
 * @description It is Data Access Object Interface.
 *				It is used in persistance layer of application.
 */

@WebServlet("/checkuser")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		init(config);
		
		UserDao userdao=new UserDaoImpl();
		UserService u=new UserServiceImpl();
		((UserServiceImpl) userService).setUserDao(userdao);
		setUserService(userService);
		// TODO Auto-generated method stub
		
		
	
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("passwd");
		User clientUser = new User();
		clientUser.setUsername(username);
		clientUser.setPassword(password);
		PrintWriter out = response.getWriter();
		//invoking business logic of business layer in presentation layer
		try {
			if(userService.validateUser(clientUser))
			{
				//out.println("<p>Dear "+username+" Welcome to online shopping</p>");
				RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
				rd.forward(request, response);
			}
			else
			{
				out.println("<p>Sorry! Invalid username or password</p>");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.include(request, response);
			}
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	