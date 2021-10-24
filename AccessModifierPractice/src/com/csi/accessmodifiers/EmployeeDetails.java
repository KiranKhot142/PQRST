package com.csi.accessmodifiers;
class Employee
{
	int empId=121;
	String empName="Binu";
	
}
public class EmployeeDetails {
public static void main(String[] args) {
	Employee e1 = new Employee();
	System.out.println("\n Employee Id: "+e1.empId+"\n Employee Name: "+e1.empName);
}
}
