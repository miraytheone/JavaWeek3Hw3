package nLayeredProject.entities;

public class Course {
	private String courseName;
	private String courseEducator;
	private String courseTime;
	private double coursePrice;
	
	public Course(String courseName, String courseEducator, String courseTime, double coursePrice) {
		this.courseName = courseName;
		this.courseEducator = courseEducator;
		this.courseTime = courseTime;
		this.coursePrice = coursePrice;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseEducator() {
		return courseEducator;
	}

	public void setCourseEducator(String courseEducator) {
		this.courseEducator = courseEducator;
	}

	public String getCourseTime() {
		return courseTime;
	}

	public void setCourseTime(String courseTime) {
		this.courseTime = courseTime;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}
	
	
}
