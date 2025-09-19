package toequals;

public class Mainclass7 {
	int cost;
	String name;
	String brand;
	
	Mainclass7(int a, String b, String c){
		cost = a;
		name = b;
		brand = c;
	}

		public boolean equals(Object obj) {
			Mainclass7 x = (Mainclass7)obj;
			
			return this.cost==x.cost;
			
		}

		public static void main(String[] args) {
			Mainclass7 M1 = new Mainclass7(3500000, "Himalayan", "Black");
			Mainclass7 M2 = new Mainclass7(3500000, "Himalayan", "Black");
			System.out.println(M1.equals(M2));
			
		}

	}


