package tostring;

public class Mainclass6 {
	int cost;
	String cname;
	String uname;
	
	Mainclass6(int a, String b, String c){
		cost = a;
		cname = b;
		uname = c;
	}
	
	public String toString(){
		return cost+" "+cname+" "+uname;
		
	}

	public static void main(String[] args) {
		Mainclass6 M6 = new Mainclass6(2000000, "FULLSTACK JAVA", "VTU");
		System.out.println(M6);
		
	}

}
