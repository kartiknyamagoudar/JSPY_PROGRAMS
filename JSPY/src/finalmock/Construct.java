package finalmock;
class employee{
	int empid;
	String name;
	int age;
	
	employee(int empid, String name, int age){
		this.empid = empid;
		this.name = name;
		this.age = age;
		
		System.out.println("name : "+name+" empid "+empid+" age "+age);
	}
	
}
public class Construct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new employee(043, "kartik", 22);
		

	}

}
