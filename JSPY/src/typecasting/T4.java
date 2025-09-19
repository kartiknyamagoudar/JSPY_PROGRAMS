package typecasting;

class cool{
	void add() {
		System.out.println("addes and upcasted sucessfull");
	}
}

class goolta extends cool{
	void dispu() {
		System.out.println("Downcasting successfull");
	}
}

public class T4 {

	public static void main(String[] args) {
		cool C1 = new goolta();
		C1.add();
		
		goolta G1 = (goolta)C1;
		G1.dispu();
		
		
	}

}
