// Josiah B. Quiñones 
// BSIT - 2B
// October 20, 2026

public class CollegeStudent extends Student{
	private String scholarshipStatus;

	public CollegeStudent(String name, String studentId, String course, int yearLevel, String scholarshipStatus){
		super(name, studentId, course, yearLevel);
		this.scholarshipStatus = scholarshipStatus;
	}

	public void setScholarshipStatus(String scholarshipStatus){
		this.scholarshipStatus = scholarshipStatus;
	}

	public String getScholarshipStatus(){
		return scholarshipStatus;
	}

	@Override
	public void displayInfo(){
		super.displayInfo();
		System.out.println("Scholarship Status: " + scholarshipStatus);
	}
}
