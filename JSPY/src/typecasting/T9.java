package typecasting;


class cool2{
	void disp() {
		System.out.println("Upcasting succesfull");
	}
}

class dinga extends cool2{
	void tata() {
		System.out.println("Downcasting Successfull");
	}
	int x = 50;
}
public class T9 {

	public static void main(String[] args) {
		cool2 C2 = new dinga();
		C2.disp();
		
		dinga D1 = (dinga)C2;
		D1.tata();
		System.out.println(D1.x);
	}

}
