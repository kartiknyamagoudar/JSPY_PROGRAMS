package toequals;

public class Mainclass8 {
	int cost;
	String name;
	String color;
	
	Mainclass8(int a, String b, String c){
		cost = a;
		name = b;
		color = c;
	}

	public boolean equals(Object obj) {
		Mainclass8 x = (Mainclass8)obj;
		
		return this.cost==x.cost;
		
	}

	public static void main(String[] args) {
		Mainclass8 M1 = new Mainclass8(3500000, "Himalayan", "Black");
		Mainclass8 M2 = new Mainclass8(4500000, "Himalayan", "Black");
		System.out.println(M1.equals(M2));
		
	}

}
