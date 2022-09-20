package services;

import java.util.Random;

import Employeedata.Employee;

public class Credentialservices {

	public  String generatePassword(){
		String caps ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		String number = "0123456789";
		String specialChars = "<>?~!@#$%^&*()_+*/";
		String combination = caps+lowerCase+number+specialChars;
		int len=8;
		 char[] password = new char[len];
		Random r = new Random();
		for(int i=0;i<len;i++) {
			password[i] = combination.charAt(r.nextInt(combination.length()));
		}
		return new String(password);
	}
	public String generateEmailAddress(String firstName, String lastName, String department) {
		return firstName+lastName+"@"+department+".Google.com";
	}
	public void showCredentials(Employee emp, String email, String generatePassword) {
		System.out.println("Dear"+emp.getFirstName()+", your generated credentials are as follows:- ");
		System.out.println("Email: "+email);
		System.out.println("Password: "+generatePassword);
	}



}
