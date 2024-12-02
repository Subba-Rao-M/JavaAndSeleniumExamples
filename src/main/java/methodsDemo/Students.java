package methodsDemo;

public class Students {
	
	//Class variables
	
	int sid;
	String sname;
	char sgrade;
	
	void printStudentData() {
		
		System.out.println("Student info : "+sid+" "+sname+" "+sgrade);
	}
	
	void setStudentData(int id, String name, char grade) { // Local variables and only for this method scope
		
		sid = id;
		sname = name;
		sgrade = grade;
		
	}
	
	Students(int id, String name, char grade){
		sid = id;
		sname = name;
		sgrade = grade;
	}

}
