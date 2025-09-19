package typecasting;

class tester{
	int r =30;
}


class tista extends tester{
	void ullya() {
		System.out.println("downcasting successfull");
	}
}
public class T3 {

	public static void main(String[] args) {
		tester T1 = new tista();
		System.out.println(T1.r);
		
		tista T2 = (tista)T1;
		T2.ullya();
		
		
	}

}
