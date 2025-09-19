package finalmock;
class demo{
	int a = 10;
	void disp(demo e) {
		System.out.println(e.a);
	}
}

public class Passbyref {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d = new demo();
		d.disp(d);
	}

}
