package typecasting;

class tester3{
	int r = 45;
	void disp() {
		System.out.println("Upcasting Successfull");
	}
	
}

class tista1 extends tester3{
	void ullya() {
		System.out.println("Downcasting Successfull");
	}
}

public class T10 {

	public static void main(String[] args) {
		tester3 T3 = new tista1();
		T3.disp();
		
		tista1 T4 = (tista1)T3;
		T4.ullya();
		
	}

}
