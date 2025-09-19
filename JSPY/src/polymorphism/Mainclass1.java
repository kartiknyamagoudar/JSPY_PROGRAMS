package polymorphism;

class bike{
	void sound() {
		System.out.println("Wroom Wroom");
	}
}

class royalenfield extends bike{
	void sound() {
		System.out.println("pat pat pat");
	}
}

class bmw extends bike{
	void sound() {
		System.out.println("wroom droom");
	}
}

class pulsar extends bike{
	void sound() {
		System.out.println("bushhhhh");
	}
}

class stimulator{
	static void veh_sound(bike B1) {
		B1.sound();
	}
}
public class Mainclass1 {

	public static void main(String[] args) {
		bmw B = new bmw();
		royalenfield RE = new royalenfield();
		pulsar P = new pulsar();
		stimulator.veh_sound(B);
		stimulator.veh_sound(RE);
		stimulator.veh_sound(P);

	}

}
