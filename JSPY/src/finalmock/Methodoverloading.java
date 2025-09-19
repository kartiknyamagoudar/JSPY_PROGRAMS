package finalmock;

class user{
	void add(int a, int b) {
		System.out.println(a+b);
	}
	
	void add(int a,int b, int c) {
		System.out.println(a+b+c);
	}
	
	void add(String name, int age) {
		System.out.println(name+ " "+age);
	}
}
public class Methodoverloading {
	public static void main(String[] args) {
	user U = new user();
	U.add(30, 20);
	U.add("kartik", 22);
	U.add(45, 55, 85);
	
}
}
