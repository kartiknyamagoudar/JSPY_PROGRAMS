package abstractprgm;

interface animal{
	void noise();
}

class cat implements animal{
	public void noise() {
		System.out.println("cat sound meowwwww");
	}
}

class dog implements animal{
	public void noise() {
		System.out.println("dog sound bowww bowww");
	}
}

class snake implements animal{
	public void noise() {
		System.out.println("snake sound buuusssss buuuussss");
	}
}

class stimulator{
	void noises(animal a1) {
		a1.noise();
		
	}
}

public class Mainclass1 {

	public static void main(String[] args) {
		cat c1 = new cat();
		dog d1 = new dog();
		snake s1 = new snake();
		stimulator S1 =  new stimulator();
		S1.noises(s1);
		S1.noises(d1);
		S1.noises(c1);
	}

}
