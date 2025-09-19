package toequals;

public class Mainclass6 {
	
	int cost;
	String cname;
	String uname;
	
	Mainclass6(int a, String b, String c){
		cost = a;
		cname = b;
		uname = c;
	}
	public boolean equals(Object obj) {
		Mainclass6 x = (Mainclass6)obj;
		
		return this.cost==x.cost;
		
	}
		

		public static void main(String[] args) {
			Mainclass6 M1 = new Mainclass6(3500000, "Himalayan", "Black");
			Mainclass6 M2 = new Mainclass6(3500000, "Himalayan", "Black");
			System.out.println(M1.equals(M2));
			
		}
	}