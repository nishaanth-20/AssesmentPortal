package com.org.users;

import java.util.ArrayList;





public class EmployeeValidation {
	
	static ArrayList<Employee> employeeList;
	static {
		employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("raj", "12345",0, "rajesh"));
		
	}
	
	public boolean checkIfuserExist(String name){
		for(Employee e:employeeList){
			if(name.equals(e.getUserName())) return true;
		}
		return false;
}
	
	public Employee findAdmin(String name){
        for(Employee e:employeeList){
            if(e.getUserName().equals(name)) return e;
        }
        return null;
    }
	
	public Employee validate(String username, String password) {
		Employee e;
		if(checkIfuserExist(username)){
			e=findAdmin(username);
			e.getPassword().equals(password);
			return e;
		}
		return null;
	}
	
	public void addEmployee(String username,String password,String fullName ) {
		employeeList.add(new Employee(username, password, 0, fullName));
	
	}
		
		
		
		
		
	
	
}
