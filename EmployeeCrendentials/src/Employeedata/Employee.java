package Employeedata;

public class Employee {
private String FirstName;
private String LastName;
public Employee() {
	this.FirstName="Swamin";
	this.LastName="Dadisetti";
	
}
public Employee(String firstName, String lastName) {
	super();
	FirstName = firstName;
	LastName = lastName;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}

}


