package typecasting;

class demo{
int x =10;
}

class pemocha extends demo{
	void ho() {
		System.out.println("downcasted succesfull");
	}
}
public class T1 {
	

	public static void main(String[] args) {
		demo D1 = new pemocha();
		System.out.println("upcasting");

		System.out.println(D1.x);
		System.out.println("Downcasting");

		pemocha P1 = (pemocha)D1;
		System.out.println(P1.x);
		P1.ho();
		
		
	}

}
