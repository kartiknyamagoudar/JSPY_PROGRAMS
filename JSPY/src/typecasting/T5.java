package typecasting;


class demo1{
	double z = 33.5;
}

class dumtaka extends demo1{
	int x = 34;
	
}
public class T5 {

	public static void main(String[] args) {
		demo1 D1 = new dumtaka();
		System.out.println(D1.z);
		
		dumtaka D2 = (dumtaka)D1;
		System.out.println(D2.x);
		
	}

}
