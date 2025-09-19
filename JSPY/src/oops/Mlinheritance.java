package oops;

class Bath { 
	int X = 20; 
	}


class Added extends Bath { 
	void addition() { 
		System.out.println("added"); 
		} 
	}


class Sub extends Added {
	int Y = 10; 
	}



public class Mlinheritance {
    public static void main(String[] args) {
        Sub Z1 = new Sub();
        System.out.println(Z1.X);
        System.out.println(Z1.Y);
        Z1.addition();
    }
}