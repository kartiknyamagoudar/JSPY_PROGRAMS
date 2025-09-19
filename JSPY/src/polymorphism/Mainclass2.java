package polymorphism;

class ola{
	void ride() {
		System.out.println("ride booked sucessfull");
	}
}

class auto extends ola{
	void ride() {
		System.out.println("Auto booked successfull");
	}
}

class Bike extends ola{
	void ride() {
		System.out.println("Bike booked successfull");
	}
}

class car extends ola{
	void ride() {
		System.out.println("Car booked succesfull");
	}
}

class stimulator1{
	static void veh_ride(ola O1) {
		O1.ride();
	}
}

public class Mainclass2 {

	public static void main(String[] args) {
		Bike B1 = new Bike();
		auto A1 = new auto();
		car C1 = new car();
		stimulator1.veh_ride(B1);
		stimulator1.veh_ride(A1);
		stimulator1.veh_ride(C1);

	}

}
