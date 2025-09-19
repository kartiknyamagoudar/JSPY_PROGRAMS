package tostring;

public class Mainclass5 {
	int cost;
	String name;
	String type;
	
	Mainclass5(int a, String b, String c){
		cost = a;
		name = b;
		type = c;
	}
	
	public String toString(){
		return cost+" "+name+" "+type;
		
	}

	public static void main(String[] args) {
		Mainclass5 M5 = new Mainclass5(3500000, "Himalayan", "Black");
		System.out.println(M5);
		
	}

}
