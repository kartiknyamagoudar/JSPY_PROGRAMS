package typecasting;


class cola1{
	int f =24;
}

class hungacha extends cola1{
	int d = 25;
}
public class T7 {

	public static void main(String[] args) {
		cola1 C1 = new hungacha();
		System.out.println(C1.f);
		
		hungacha H1 = (hungacha)C1;
		System.out.println(H1.d);

		
	}

}
