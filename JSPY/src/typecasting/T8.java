package typecasting;

class tester1{
	int x = 50;
	void disp() {
		System.out.println("Upcasting Successfull");
	}
}

class hullya extends tester1{
	void ho(){
		System.out.println("Downcasting successfull");
	}
	
}

public class T8 {

	public static void main(String[] args) {
		tester1 T1 = new hullya();
		System.out.println(T1.x);
		T1.disp();
		
		
		hullya H1 = (hullya)T1;
		H1.ho();
	}

}
