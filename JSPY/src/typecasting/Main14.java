package typecasting;

class Cola13{
	void co() {
		System.out.println("hi");
	}
	int r = 20;
}
class Chungacha extends Cola13{
	void disp() {
		System.out.println("hi");
	}
}
public class Main14 {
	public static void main(String[] args) {
		Cola13 d = new Chungacha();//hetrogeneous type of object creation
		System.out.println(d.r);
		d.co();
		Chungacha p=(Chungacha)d;
		System.out.println(p.r);
		p.co();
		
		p.disp();
	}

}
