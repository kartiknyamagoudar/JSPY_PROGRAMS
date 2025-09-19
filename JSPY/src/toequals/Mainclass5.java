package toequals;


public class Mainclass5 {
	int cost;
	String name;
	String type;
	
	Mainclass5(int a, String b, String c){
		cost = a;
		name = b;
		type = c;
	}
	
	public boolean equals(Object obj) {
		Mainclass5 x = (Mainclass5)obj;
		
		return this.cost==x.cost;
		
	}

	public static void main(String[] args) {
		Mainclass5 M1 = new Mainclass5(3500000, "Himalayan", "Black");
		Mainclass5 M2 = new Mainclass5(3500000, "Himalayan", "Black");
		System.out.println(M1.equals(M2));
		
	}
}
