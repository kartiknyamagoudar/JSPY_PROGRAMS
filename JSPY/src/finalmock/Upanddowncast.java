package finalmock;
class animal{
	void noise() {
		System.out.println("some noise...");
	}
}

class cat extends animal{
	void noise() {
		System.out.println("meoww meowww");
	}
}



public class Upanddowncast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(".....upcasting....");
		animal b = new cat();
		b.noise();
		
		System.out.println(".....Downcastings....");
		cat c = (cat)b;
		c.noise();
		
		
		

	}

}
