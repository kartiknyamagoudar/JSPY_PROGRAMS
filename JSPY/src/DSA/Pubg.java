package DSA;
class game{
	void gun() {
		System.out.println("gun loaded successfull");
	}
}

class AWM extends game{
	void gun() {
		System.out.println("NAME : AWM");
		
	}
}

class mp40 extends game{
	void gun() {
		System.out.println("NAME : MP40");
		System.out.println("RELOAD : MULTIPLE");
		System.out.println("AMMO : SMG AMMO");
	}
}
class thomson extends game{
	void gun() {
		System.out.println("NAME : THOMSPN");
		System.out.println("RELOAD : MULTIPLE");
		System.out.println("AMMO : SMG AMMO");
	}
}
class Simulator{
	 void guns(game G2) {
		G2.gun();
	}
}

public class Pubg {

	public static void main(String[] args) {
		System.out.println("Welcome to pubg");
		AWM A1 = new AWM();
		mp40 M1 = new mp40();
		thomson T1 = new thomson();
		Simulator S = new Simulator();
		System.out.println();
		S.guns(A1);
		System.out.println();
		S.guns(M1);
		System.out.println();
		S.guns(T1);
		
	}

}
