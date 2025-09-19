package finalmock;
interface animal1{
	public void noise();
}

class cat1 implements animal1{
	public void noise() {
		System.out.println("meoww meoww...");
	}
}

class dog implements animal1{
	public void noise() {
		System.out.println("boww boww...");
	}
}

class simulator{
	public void noises(animal1 a) {
		a.noise();
	}
}
public class Abstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat1 c = new cat1();
		dog d = new dog();
		simulator s = new simulator();
		s.noises(c);
		s.noises(d);

	}

}
