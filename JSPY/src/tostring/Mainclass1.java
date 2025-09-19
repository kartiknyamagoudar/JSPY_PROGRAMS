package tostring;

public class Mainclass1 {
	int mobile_cost;
	String model;
	String color;
	
	Mainclass1(int a, String b, String c){
		mobile_cost = a;
		model = b;
		color = c;
	}
	
	public String toString() {
		return mobile_cost +" "+model+" "+color;
	}

	public static void main(String[] args) {
		Mainclass1 M1 = new Mainclass1(50000,"Apple","Black");
		System.out.println(M1.toString());

	}

}
