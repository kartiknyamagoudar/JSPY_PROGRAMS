package oops;

//parent class//
class Math{
	int X = 10;
}

//sub class//
class Add1 extends Math{
	void Addd() {
		System.out.println("added");
	}
}




public class Sinheritance {
public static void main(String[] args) {
	Add1 A1 = new Add1(); //object created//
	A1.Addd();
	System.out.println(A1.X);
}
}
