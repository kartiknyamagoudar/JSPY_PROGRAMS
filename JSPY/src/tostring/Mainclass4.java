package tostring;

public class Mainclass4 {
	int cost;
	String name;
	String type;
	
	Mainclass4(int a, String b, String c){
		cost = a;
		name = b;
		type = c;
	}
	
	public String toString(){
		return cost+" "+name+" "+type;
		
	}

	public static void main(String[] args) {
		Mainclass4 M4 = new Mainclass4(3000000, "Sony", "Black");
		System.out.println(M4);
		
	}

}
