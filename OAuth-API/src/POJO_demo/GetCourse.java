package POJO_demo;

public class GetCourse {
	
	private String url;
	 private String services;
	 private String expertise;
	 private Courses Courses;
	 private String linkedIn;
	 private String Instructor;
	 
	 public String getInstructor() {
		return Instructor;
	}
	public void setInstructor(String instructor) {
		Instructor = instructor;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getServices() {
		return services;
	}
	public void setServices(String services) {
		this.services = services;
	}
	public String getExpertise() {
		return expertise;
	}
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	public POJO_demo.Courses getCourses() {
		return Courses;
	}
	public void setCourses(POJO_demo.Courses courses) {
		Courses = courses;
	}
	public String getLinkedIn() {
		return linkedIn;
	}
	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}
	
	
	
	
	

}