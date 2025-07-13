package lab3;

public class Students {
	String firstName;
	String midName;
	String lastName;
	int rollNo;
	int joiningYear;
	int Semester;
	String Address;
//	public String getFullName() {
//		return firstName +" "+ midName +" "+ lastName;
//	}
	public String getFullName() {
		return firstName +" "+ lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName (String firstName){
			this.firstName = firstName;			
	}
//	public String getmidName() {
//		return midName;
//	}
//	public void setMidName(String midName){
//		this.midName = midName;
//	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getJoiningYear() {
		return joiningYear;
	}
	public void setJoiningYear(int joiningYear) {
		this.joiningYear = joiningYear;
	}
	public int getSemester() {
		return Semester;
	}
	public void setSemester(int Semester) {
		this.Semester = Semester;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
}
