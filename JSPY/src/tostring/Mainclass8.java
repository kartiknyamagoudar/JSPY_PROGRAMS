package tostring;

public class Mainclass8 {
	int cost;
	String name;
	String color;
	
	Mainclass8(int a, String b, String c){
		cost = a;
		name = b;
		color = c;
	}
	
	public String toString(){
		return cost+" "+name+" "+color;
		
	}

	public static void main(String[] args) {
		Mainclass8 M8 = new Mainclass8(40000000, "Innerbliss", "Black");
		System.out.println(M8);
		
	}

}
