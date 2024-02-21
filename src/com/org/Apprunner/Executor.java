package com.org.Apprunner;

import java.util.Scanner;
import com.org.test.BeginTest;
import com.org.users.EmployeeValidation;

public class Executor {

	public static void main(String[] args) {
		System.out.println("Welcome to java Assessment..");
		Scanner sc=new Scanner(System.in);
		String ch="y";
		int a = 0;
		do {
			System.out.println("Enter 1.login or 2.Register..");
			int c=Integer.parseInt(sc.nextLine());
			String userName,password,fullName;
			EmployeeValidation emp=new EmployeeValidation();
			switch(c)
			{
		    case 1:
				System.out.println("Enter your userName...");
				userName=sc.nextLine();
				System.out.println("Enter your password..");
				password=sc.nextLine();
		        if(emp.validate(userName,password))
		        {
		        	System.out.println("Enter you want to 1.Begin test or 2.logout");
		        	switch(Integer.parseInt(sc.nextLine()))
		        	{
		        	case 1:
		        		BeginTest test=new BeginTest();
		        		System.out.println("Start...");
		        		test.showQuestion();
		        		System.out.println("your percentage is"+test.percentage()+"%");
		        		
		        		break;
		        	case 2:
		        		break;
		        	default:
		        		System.out.println("Please enter correct options");
		        	}
		        }
		        else
		        {
		        	System.out.println("User doesn't exits..");
		        }
				break;
			case 2:
			System.out.println("Enter your userName...");
			userName=sc.next();
			if(emp.checkIfuserExist(userName))
			{
				System.out.println("The username alreay exits...\nplease give another name..");
				userName=sc.next();			
			}
			System.out.println("Enter your password..");
			password=sc.next();	
			System.out.println("Enter your Fullname...");
			fullName=sc.nextLine();
			
			emp.addEmployee(userName, password, fullName);
	
			break;

			
			default:
				break;
	
			}
			System.out.println("do you want to continue(y/n)");
			a = sc.nextInt();
		}while(a == 1);
	}
}

