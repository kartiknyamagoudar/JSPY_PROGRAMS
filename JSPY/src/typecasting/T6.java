package typecasting;

class sample2{
	void col() {
		System.out.println("Upcasting successfull");
	}
}

class guleylu extends sample2{
	void disp() {
		System.out.println("Downcasting successfull");
	}
}

public class T6 {

	public static void main(String[] args) {
		sample2 S1 = new guleylu();
		S1.col();
		
		guleylu G1 = (guleylu)S1;
		G1.disp();
		
	}

}
