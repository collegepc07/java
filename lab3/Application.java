package lab3;

public class Application {
	public static void main(String [] args){
		Students Students1 = new Students();
		
		Students1.setFirstName("Suraj");
		String name = Students1.getFirstName();	
		System.out.println(name);
		
//		Students1.setMidName("");
//		String midName = Students1.getmidName();	
//		System.out.println(midName);
	
		Students1.setLastName("Paudel");
		String lastName = Students1.getLastName(); 
		System.out.println(lastName);
		
		Students1.setRollNo(26);
		int RollNo = Students1.getRollNo();	
		System.out.println(RollNo);
		
		Students1.setJoiningYear(2080);
		int JoiningYear = Students1.getJoiningYear();	
		System.out.println(JoiningYear);
		
		Students1.setSemester(4);
		int Semester = Students1.getSemester();	
		System.out.println(Semester);
		
		Students1.setAddress("Murgiya");
		String Address = Students1.getAddress();	
		System.out.println(Address);
		
		String FullName = Students1.getFullName();
		System.out.println("FullName:" + FullName);
	}

		public static void Std2(String [] args){
		Students Students2 = new Students();
		
		Students2.setFirstName("Sujan");
		String name = Students2.getFirstName();	
		System.out.println(name);
		
//		Students2.setMidName("");
//		String midName = Students2.getmidName();	
//		System.out.println(midName);
		
		Students2.setLastName("Kandel");
		String lastName = Students2.getLastName(); 
		System.out.println(lastName);
		
		Students2.setRollNo(24);
		int RollNo = Students2.getRollNo();	
		System.out.println(RollNo);
		
		Students2.setJoiningYear(2080);
		int JoiningYear = Students2.getJoiningYear();	
		System.out.println(JoiningYear);
		
		Students2.setSemester(4);
		int Semester = Students2.getSemester();	
		System.out.println(Semester);
		
		Students2.setAddress("Palpa");
		String Address = Students2.getAddress();	
		System.out.println(Address);
		
		String FullName2 = Students2.getFullName();
		System.out.println("FullName:" + FullName2);
		
	}
}
