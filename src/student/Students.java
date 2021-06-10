package student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Students {
	private int setMaxNumberOfStudents = 0;
	private List<Students> studentList = new ArrayList<Students>();
	private List<Course> courseList = new ArrayList<Course>();
	
	public Students() {
		
	}
	class Student {
		private String iD;
		private LinkedList<Course> courses;
		
		public Student() {
			super();
		}
		
		public Student(String iD, LinkedList<Course>course) {
			super();
			this.iD = iD;
			this.courses = courses;
		}
		public String getiD() {
			return iD;
		}
		public void setiD(String iD) {
			this.iD = iD;
		}
		public LinkedList<Course>getCourse(){
			return courses;
		}
		public void addCourse(Course c) {
			this.courses.add(c);
		}
		public void dropCourse(String cName) {
			Course c = new Course();
			for(Course course:courses) {
				if(course.getCourseName().equalsIgnoreCase(cName)) {
					c = course;
					break;
				}
			}
			courses.remove(c);
		}
		public String toString() {
			String courseArr = "";
			for (Course course:courses) {
				courseArr = courseArr + courses + " ";
			}
			return iD + courseArr;
		}
	}
	
	public Students(int setMaxNumberOfStudents) {
		this.setMaxNumberOfStudents = setMaxNumberOfStudents;
	}
	
	public Students(Students c) {
		this.setMaxNumberOfStudents = c.setMaxNumberOfStudents;
	}
	
	public void setMaxNumberOfStudents() {
		
	}
	
	public void addStudent() {
		
	}
	
	public void addCourse() {
		
	}
	
	public void dropCourse() {
		
	}
	
	public String toString() {
		String str = "";
		return str;
	}
}
