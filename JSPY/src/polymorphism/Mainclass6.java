package polymorphism;

class bookmyshow{
	void movie(){
		System.out.println("Movie booked successfull");
	}
}

class bollywood extends bookmyshow{
	void movie() {
		System.out.println("Bollywood Movie booked successfull");
	}
}

class sandlewood extends bookmyshow{
	void movie() {
		System.out.println("Sandlewood movie booked successfull");
	}
}

class hollywood extends bookmyshow{
	void movie() {
		System.out.println("Hollywood movie booked successfull");
	}
}

class stimulator5{
	static void movies(bookmyshow B2){
		B2.movie();
	}
}


public class Mainclass6 {

	public static void main(String[] args) {
		bollywood B1 = new bollywood();
		sandlewood S1 = new sandlewood();
		hollywood H1 = new hollywood();
		stimulator5.movies(B1);
		stimulator5.movies(S1);
		stimulator5.movies(H1);

	}

}
