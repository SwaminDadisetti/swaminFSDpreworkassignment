package main;
import java.util.Scanner;

import Employeedata.Employee;
import services.Credentialservices;


public class Driverclass {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Swamin","Dadisetti");
		Credentialservices cs = new Credentialservices();
		String generatedEmail;
		 String generatePassword;
		
		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		switch(input) {
		
		case 1: {
			generatedEmail = cs.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "tech");
			generatePassword = cs.generatePassword();
			cs.showCredentials(emp, generatedEmail, generatePassword);
			break;
		}
		case 2: {
			generatedEmail = cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "adm");
			generatePassword = cs.generatePassword();
			cs.showCredentials(emp, generatedEmail, generatePassword);
			break;
		}
		case 3:{
			generatedEmail = cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "HR");
			generatePassword = cs.generatePassword();
			cs.showCredentials(emp, generatedEmail, generatePassword);
			break;
		}
		case 4:{
			generatedEmail = cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "legal");
			generatePassword = cs.generatePassword();
			cs.showCredentials(emp, generatedEmail, generatePassword);
			break;
		}
		
		}
		
	}
	
}
