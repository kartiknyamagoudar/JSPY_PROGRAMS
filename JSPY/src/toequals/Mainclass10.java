package toequals;

public class Mainclass10 {
	int cost;
	String color;
	String size;
	
	Mainclass10(int a, String b, String c){
		cost = a;
		color = b;
		size = c;
	}

	public boolean equals(Object obj) {
		Mainclass10 x = (Mainclass10)obj;
		
		return this.cost==x.cost;
		
	}

	public static void main(String[] args) {
		Mainclass10 M1 = new Mainclass10(3500000, "shiert", "XXl");
		Mainclass10 M2 = new Mainclass10(4500000, "shiert", "XXl");
		System.out.println(M1.equals(M2));
		
	}

}
