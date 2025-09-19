package toequals;

public class Mainclass1 {
	int cost;
	String name;
	String color;
	
	Mainclass1(int a, String b, String c){
		cost = a;
		name = b;
		color = c;
	}
	
	public boolean equals(Object obj) {
		Mainclass1 x = (Mainclass1)obj;
		
		return this.cost==x.cost;
		
	}

	public static void main(String[] args) {
		
		Mainclass1 M1 = new Mainclass1(20000,"kartik","white");
		Mainclass1 M2 = new Mainclass1(30000,"sankalp", "black");
		System.out.println(M1.equals(M2));
		
		
	}

}
