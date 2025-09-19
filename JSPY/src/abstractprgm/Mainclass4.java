package abstractprgm;


interface zomato{
	void order();
}

class hotel1 implements zomato{
	public void order() {
		System.out.println("hotel 1 order successfull");
	}
}
class hotel2 implements zomato{
	public void order() {
		System.out.println("hotel 2 order successfull");
	}
}

class hotel3 implements zomato{
	public void order() {
		System.out.println("hotel 3 order successfull");
	}
}

class stimulator3{
	static void ordered(zomato Z2) {
		Z2.order();
	}
}
public class Mainclass4 {

	public static void main(String[] args) {
		hotel1 H1 = new hotel1();
		hotel2 H2 = new hotel2();
		hotel3 H3 = new hotel3();
		stimulator3.ordered(H1);
		stimulator3.ordered(H2);
		stimulator3.ordered(H3);

	}

}
