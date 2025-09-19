package logics;

public class swalpwithoutmath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 50;
		int b = 20;
		System.out.println(a+ "before swapping "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a+ "after swapping "+b);

	}

}
