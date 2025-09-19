package abstractprgm;

interface ola{
	void ride();
}

class auto implements ola{
	public void ride() {
		System.out.println("Auto ride booked successfull");
	}
}

class bike implements ola{
	public void ride() {
		System.out.println("Bike booked successfull");
	}
}

class car implements ola{
	public void ride() {
		System.out.println("Car booked successfull");
	}
}

class Book{
	static void rides(ola O1) {
		O1.ride();
	}
}
public class Mainclass2 {

	public static void main(String[] args) {
		auto a1 = new auto();
		bike b1 = new bike();
		car c1 = new car();
		Book.rides(a1);
		Book.rides(b1);
		Book.rides(c1);

	}

}
