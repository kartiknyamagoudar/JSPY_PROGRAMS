package tostring;

public class Mainclass10 {
	int cost;
	String color;
	String size;
	
	Mainclass10(int a, String b, String c){
		cost = a;
		color = b;
		size = c;
	}
	
	public String toString(){
		return cost+" "+color+" "+size;
		
	}

	public static void main(String[] args) {
		Mainclass10 M10 = new Mainclass10(2000000, "Black", "XXL");
		System.out.println(M10);
		
	}

}
