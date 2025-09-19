package typecasting;

class Cool4{
	void add() {
		System.out.println("Addition");
	}
}
class Goolata2 extends Cool4{
	void disp() {
		System.out.println("hi");
	}
	int r=90;
}
public class Main11 {
	public static void main(String[] args) {
		Cool4 d = new Goolata2();//hetrogeneous type of object creation
		d.add();
		Goolata2 p=(Goolata2)d;
		System.out.println(p.r);
		p.disp();
	}

}
