package toequals;


public class Mainclass3 {
	int strnth;
	String name;
	char grade;
	
	Mainclass3(int a, String b, char c){
		strnth = a;
		name = b;
		grade = c;
	}
	
	public boolean equals(Object obj) {
		Mainclass3 x = (Mainclass3)obj;
		
		return this.strnth==x.strnth;
		
	}

	public static void main(String[] args) {
		
		Mainclass3 M1 = new Mainclass3(20, "pgs elite", 'A');
		Mainclass3 M2 = new Mainclass3(20, "pgs elite", 'A');
		System.out.println(M1.equals(M2));
		
		
	}

}
