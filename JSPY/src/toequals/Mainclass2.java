package toequals;

public class Mainclass2 {
	int cost;
	String name;
	String type;
	
	Mainclass2(int a, String b, String c){
		cost = a;
		name = b;
		type = c;
	}
	
	public boolean equals(Object obj) {
		Mainclass2 x = (Mainclass2)obj;
		
		return this.cost==x.cost;
		
	}

	public static void main(String[] args) {
		
		Mainclass2 M1 = new Mainclass2(20000,"rangerover","white");
		Mainclass2 M2 = new Mainclass2(30000,"i20", "black");
		System.out.println(M1.equals(M2));
		
		
	}

}
