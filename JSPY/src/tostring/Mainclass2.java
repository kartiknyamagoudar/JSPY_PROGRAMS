package tostring;

public class Mainclass2 {
	int cost;
	String name;
	String type;
	
	Mainclass2(int a, String b, String c){
		cost = a;
		name = b;
		type = c;
	}
	
	public String toString(){
		return cost+" "+name+" "+type;
		
	}

	public static void main(String[] args) {
		Mainclass2 M2 = new Mainclass2(2000000, "Rangerover", "Black");
		System.out.println(M2);
		
	}

}
