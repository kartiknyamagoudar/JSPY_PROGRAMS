package tostring;

public class Mainclass3 {
	int strnth;
	String name;
	char grade;
	
	Mainclass3(int a, String b, char c){
		strnth = a;
		name = b;
		grade = c;
	}
	
	public String toString(){
		return strnth+" "+name+" "+grade;
		
	}

	public static void main(String[] args) {
		Mainclass3 M3 = new Mainclass3(20, "pgs elite", 'A');
		System.out.println(M3);
		
	}

}
