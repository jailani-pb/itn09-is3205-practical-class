package week2;

public class Student {

	String id;
	String name;
	
	public Student(String sId, String sName) {
		id = sId;
		name = sName;
	}
	
	public String attending(boolean attend) {
		if(attend) {
			return id + " " + name + " is attending class.";
		} else {
			return id + " " + name + " is absent from class.";
		}
	}
	
}





