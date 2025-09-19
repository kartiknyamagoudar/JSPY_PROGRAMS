package typecasting;

class Demo1{
	double e=900;
	int r = 20;
}
class Dumtaka extends Demo1{
	void disp() {
		System.out.println("hi");
	}
	int r=90;
}
public class Main12 {
	public static void main(String[] args) {
		Demo1 d = new Dumtaka();
		System.out.println(d.r);
		System.out.println(d.e);
		Dumtaka p=(Dumtaka)d;
		System.out.println(p.r);
		System.out.println(p.e);
		
		p.disp();
	}

}
