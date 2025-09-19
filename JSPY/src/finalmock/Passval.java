package finalmock;

class emp{
	void sum(int a, int b) {
		System.out.println("the sum is : "+(a+b));
	}
}

public class Passval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp e = new emp();
		e.sum(20, 30);

	}

}
