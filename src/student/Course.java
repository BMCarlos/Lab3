package student;

public class Course {
	private String courseName = "";
	private int sectionNumber = 0;
	private int numberOfCredits = 0;
	private int link = 0;
	
	
	public Course() {
		
	}
	
	public Course(String courseName, int sectionNumber, int numberOfcredits, int link) {
		this.courseName = courseName;
		this.sectionNumber = sectionNumber;
		this.numberOfCredits = numberOfCredits;
		this.link = link;
	}
	
	public Course(Course c) {
		this.courseName = c.courseName;
		this.sectionNumber = c.sectionNumber;
		this.numberOfCredits = c.numberOfCredits;
		this.link = c.link;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void setSectionNumber(int sectionNumber) {
		this.sectionNumber = sectionNumber;
	}
	
	public void setNumberOfCredit(int numberOfCredits) {
		this.numberOfCredits = numberOfCredits;
	}
	
	public void setLink(int link) {
		this.link = link;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public int getSectionNumber() {
		return sectionNumber;
	}
	
	public int getNumberOfCredits() {
		return numberOfCredits;
	}
	
	public int getLink() {
		return link;
	}
	
	public String toString() {
		String str = (courseName + sectionNumber + numberOfCredits + link);
		return str;
	}
}
