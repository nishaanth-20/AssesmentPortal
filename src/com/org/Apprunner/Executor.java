package com.org.Apprunner;

import java.util.Scanner;
import com.org.test.BeginTest;
import com.org.users.EmployeeValidation;

public class Executor {

	public static void main(String[] args) {
		System.out.println("Welcome to java Assessment");
		Scanner sc=new Scanner(System.in);
		String ch="y";
		int a = 0;
		do {
			System.out.println("1.Login");
			System.out.println("2.Register");
			//int c=Integer.parseInt(sc.nextLine());
			int c=sc.nextInt();
			String userName,password,fullName;
			EmployeeValidation emp=new EmployeeValidation();
			switch(c)
			{
		    case 1:
				System.out.println("Enter your UserName:");
				userName=sc.next();
				System.out.println("Enter your Password");
				password=sc.next();
		        if(emp.validate(userName,password))
		        {
		        	System.out.println("Enter the option");
		        	System.out.println("1.Begin Test");
		        	System.out.println("2.Logout");
		        	switch(sc.nextInt())
		        	{
		        	case 1:
		        		BeginTest test=new BeginTest();
		        		
		        		test.showQuestion();
		        		System.out.println("Your percentage is"+test.percentage()+"%");
		        		
		        		break;
		        	case 2:
		        		break;
		        	default:
		        		System.out.println("Please enter correct options");
		        	}
		        }
		        else
		        {
		        	System.out.println("User doesn't exists");
		        }
				break;
			case 2:
			System.out.println("Enter your UserName:");
			userName=sc.next();
			while(emp.checkIfuserExist(userName))
			{
				System.out.println("The username alreay exists \nplease give another name..");
				userName=sc.next();			
			}
			System.out.println("Enter your Password");
			password=sc.next();	
			System.out.println("Enter your Fullname:");
			fullName=sc.next();
			
			emp.addEmployee(userName, password, fullName);
	
			break;

			
			default:
				break;
	
			}
			System.out.println("do you want to continue(y/n)");
//			/*
//			 * String temp=sc.nextLine(); a = sc.nextInt();
//			 */
		}while(sc.next().charAt(0)=='y');
	}
}

