package typecasting;

class sample{
	void disp() {
		System.out.println("Upcasting succesfull");
	}
}

class ampluse extends sample{
	void tata() {
		System.out.println("downcasting successfull");
	}
}
public class T2 {

	public static void main(String[] args) {
		sample S1 = new ampluse();
		S1.disp();
		
		ampluse A1 = (ampluse)S1;
		A1.tata();

	}

}
