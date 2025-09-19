package task;


class Math{
	
	void add(int x, int y) {
		int res = x+y;
		System.out.println(res);
	}
	
	void add(int x,int y, int z) {
		int res = x+y+z;
		System.out.println(res);
		
	}
}
public class Overadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math M = new Math();
		M.add(20, 50);
		M.add(20, 40, 80);
		

	}

}
