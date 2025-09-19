package tostring;

public class Mainclass9 {
	int id;
	int sal;
	char grade;
	
	Mainclass9(int a, int b, char c){
		id = a;
		sal = b;
		grade = c;
	}
	
	public String toString(){
		return id+" "+sal+" "+grade;
		
	}

	public static void main(String[] args) {
		Mainclass9 M9 = new Mainclass9(2025043, 45000, 'A');
		System.out.println(M9);
		
	}

}
