package polymorphism;

class redbus{
	void ticket() {
		System.out.println("ticket booked successfull");
	}
}

class vrl extends redbus{
	void ticket() {
		System.out.println("vrl ticket booked successfull");
	}
}

class janata extends redbus{
	void ticket() {
		System.out.println("janata ticket booked successfull");
	}
}

class royals extends redbus{
	void ticket() {
		System.out.println("royals ticket booked successfull");
	}
}

class stimulator4{
	static void booked(redbus R2) {
		R2.ticket();
	}
}
public class Mainclass5 {

	public static void main(String[] args) {
		vrl V1 = new vrl();
		janata J1 = new janata();
		royals R1 = new royals();
		stimulator4.booked(R1);
		stimulator4.booked(J1);
		stimulator4.booked(V1);
		
	}

}
