package tostring;

public class Mainclass7 {
	int cost;
	String name;
	String brand;
	
	Mainclass7(int a, String b, String c){
		cost = a;
		name = b;
		brand = c;
	}
	
	public String toString(){
		return cost+" "+name+" "+brand;
		
	}

	public static void main(String[] args) {
		Mainclass7 M7 = new Mainclass7(75000, "MacbookAir M2", "Appple");
		System.out.println(M7);
		
	}

}
