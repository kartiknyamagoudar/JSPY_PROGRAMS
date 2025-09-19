package exception;


class ATM{
	static int balance = 1000;
	public static void withdraw(int amount) {
		if(amount < balance) {
			System.out.println("winthdraw successfull...");
			
		} else {
			System.out.println("invalid balance...");
		}
		
	}
}
public class ExceptionAtm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM.withdraw(1200);
		ATM.withdraw(800);
	}

}
