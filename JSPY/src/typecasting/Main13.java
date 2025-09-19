package typecasting;

class Samplez1{
	void co() {
		System.out.println("hi");
	}
	int r = 20;
}
class Hahoha extends Samplez1{
	void disp() {
		System.out.println("hi");
	}
}
public class Main13 {
	public static void main(String[] args) {
		Samplez1 d = new Hahoha();//hetrogeneous type of object creation
		System.out.println(d.r);
		d.co();
		Hahoha p=(Hahoha)d;
		System.out.println(p.r);
		p.co();
		
		p.disp();
	}

}
