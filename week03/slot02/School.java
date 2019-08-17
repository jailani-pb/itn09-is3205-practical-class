package week03.slot02;

public class School {

	private String shortform;
	String name;
	
	public School(String sShortForm, String sName) {
//		shortform = sShortForm;
		setShortform(sShortForm);
		name = sName;
	}

	public String getShortform() {
		return shortform;
	}

	public void setShortform(String shortform) {
		if(shortform.length() > 4) {
			this.shortform = shortform.substring(0,4);
		} else {
			this.shortform = shortform;
		}
	}



	@Override
	public String toString() {
		return "School [shortform=" + shortform + ", name=" + name + "]";
	}
	
}
