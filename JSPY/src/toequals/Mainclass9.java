package toequals;

public class Mainclass9 {
	int id;
	int sal;
	char grade;
	
	Mainclass9(int a, int b, char c){
		id = a;
		sal = b;
		grade = c;
	}

	public boolean equals(Object obj) {
		Mainclass9 x = (Mainclass9)obj;
		
		return this.id==x.id;
		
	}

	public static void main(String[] args) {
		Mainclass9 M1 = new Mainclass9(3500000, 45000, 'A');
		Mainclass9 M2 = new Mainclass9(4500000, 45000, 'A');
		System.out.println(M1.equals(M2));
		
	}

}
