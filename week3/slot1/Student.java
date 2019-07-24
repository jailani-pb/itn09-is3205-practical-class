package week3.slot1;

import java.util.Calendar;

/*
 * Changes from practical class:
 * 1) Changed yearOfBirth to instance variable (removed final)
 * 2) Added bloodType as constant instance variable
 * 3) Added parameter variables to constructor to initialise bloodType
 * 4) Removed algorithm to limit noOfStudents in constructor
 * 5) Added algorithm to limit to yearOfBirth in constructor
 * 6) Removed the if statement to check yearOfBirth from calculateAge()
 * 7) Changed printDetails method to studentDetails method that
 * 		accepts parameter variable message.
 */
public class Student {

	// 1) Instance Variables
	String id;
	String name;
	int yearOfBirth;
	// Constant Instance Variables (Cannot be changed after initialise)
	final char bloodType;
	// 2) Class Variables
	static int noOfStudents = 0;
	// Constant Class Variables  (Cannot be changed after initialise)
	final static int MAX_STUDENTS = 500;
	
	// Constructor  // 3) Parameter Variables
	public Student(String sId, String sName, int yOB, char blood) {
		id = sId;
		name = sName;
		bloodType = blood;
		noOfStudents++;
		// 4) Local Variables
		Calendar now = Calendar.getInstance();
		// Calendar.YEAR is an example of constant class variable usage.
		int currentYear = now.get(Calendar.YEAR);
		// Limit the student yearOfBirth to 18-40 years from the
		// current year.
		if(yOB <= currentYear-18 && yOB >= currentYear-40) {
			yearOfBirth = yOB;
		} else {
			yearOfBirth = currentYear-18;
		}
	}
	
	// Method 						// 3) Parameter Variables
	public String studentDetails(String message) { 
		return message + " " + id + " " + name + " " + yearOfBirth;
	}
	
	// Method
	public int calculateAge() {
		// 4) Local Variable
		Calendar now = Calendar.getInstance();
		// Calendar.YEAR is an example of constant class variable usage.
		int currentYear = now.get(Calendar.YEAR);
		return currentYear-yearOfBirth;
	}
	
}




