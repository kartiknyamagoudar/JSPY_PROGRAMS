package toequals;


public class Mainclass4 {
	int cost;
	String name;
	String type;
	
	Mainclass4(int a, String b, String c){
		cost = a;
		name = b;
		type = c;
	}
	
	public boolean equals(Object obj) {
		Mainclass4 x = (Mainclass4)obj;
		
		return this.cost==x.cost;
		
	}
	public static void main(String[] args) {
		Mainclass4 M1 = new Mainclass4(3000000, "Sony", "Black");
		Mainclass4 M2 = new Mainclass4(3000000, "Sony", "Black");
		System.out.println(M1.equals(M2));
		
	}

}
