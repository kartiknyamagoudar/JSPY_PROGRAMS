package finalmock;

class Marriage extends Exception {
	
}

public class Checkedexception  {
	static int age = 18;
	public static void Checkedexception(int userage) throws Marriage{
		if(userage > age) {
			System.out.println("happy marriage...");
		} else {
			throw new Marriage();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Checkedexception(17);
		} 
		catch(Exception e) {
			System.out.println("age under 18...");
		}
		

	}
}


