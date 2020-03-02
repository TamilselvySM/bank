package com.bank.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bank.entity.User;
import com.bank.util.DBConnection;


public class CreateAccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int i=0;
	
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User user= new User();
		String accname= request.getParameter("AccountName");
		String accemail= request.getParameter("AccountEmail");
		String accage= request.getParameter("AccountAge");
		String accphone= request.getParameter("AccountPhone");
		String accbranch= request.getParameter("AccountBranch");
		String branch=accbranch.substring(0,3);
		User x = DBConnection.getUserID(i);
		String accnumber=null;
		if(x.getId()<1){
			accnumber = branch+"00"+1;
		}
		else{
			int y = x.getId()+1;
			accnumber = branch+"00"+y;
		}

		System.out.println(accnumber);
			PrintWriter writer= response.getWriter();
			writer.println("Account Number is "+accnumber);
		user.setUserName(accname);
		user.setUserEmail(accemail);
		user.setUserAge(accage);
		user.setUserPhone(accphone);
		user.setUserBranch(accbranch);
		user.setUserAccount(accnumber);
       
		DBConnection.add(user);

	}

}
