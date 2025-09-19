package abstractprgm;

interface redbus{
	void ticket();
}

class vrl implements redbus{
	public void ticket() {
		System.out.println("vrl ticket booked successfull");
	}
}

class janata implements redbus{
	public void ticket() {
		System.out.println("janata ticket booked successfull");
	}
}

class royals implements redbus{
	public void ticket() {
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
