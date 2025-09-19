package abstractprgm;


interface tea{
	void taste();
}


class lemon_tea implements tea{
	public void taste() {
		System.out.println("leamon tea ordered successfull");
	}
}

class green_tea implements tea{
	public void taste() {
		System.out.println("green tea ordered successfull");
	}
}

class black_tea implements tea{
	public void taste() {
		System.out.println("Black tea ordered successfull");
	}
}

class stimulator2{
	static void taste_tea(tea T1) {
		T1.taste();
	}
}
public class Mainclass3 {

	public static void main(String[] args) {
		lemon_tea L1 = new lemon_tea();
		green_tea G1 = new green_tea();
		black_tea B1 = new black_tea();
		stimulator2.taste_tea(L1);
		stimulator2.taste_tea(G1);
		stimulator2.taste_tea(B1);

	}

}

