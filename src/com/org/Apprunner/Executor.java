package com.org.Apprunner;
import java.util.*;
import java.com.org.users;
public class Executor {

	public static void main(String[] args) {
		
		System.out.println("Welcome to java Assessment..");
		System.out.println("Enter 1.login or 2.Register..");
		Scanner sc=new Scanner(System.in);
		String userName,password,fullName;
		
		switch(sc.nextInt())
		{
	    case 1:
		System.out.println("Enter your userName...");
		userName=sc.next();
		System.out.println("Enter your password..");
		password=sc.next();

		break;
		case 2:
		System.out.println("Enter your userName...");
		userName=sc.next();
		System.out.println("Enter your password..");
		password=sc.next();	
		System.out.println("Enter your Fullname...");
		fullName=sc.nextline();
		break;


	}

}
