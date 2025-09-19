package exception;

class insufficientbalance extends Exception{
	
}

class ATM1{
	static int balance = 1000;
	public static void withdraw(int amount) throws insufficientbalance{
		if(amount < balance) {
			System.out.println("winthdraw successfull...");
			
		} else {
			throw new insufficientbalance();
		}
		
	}
}

public class UserException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ATM1.withdraw(1200);
		}
		catch(insufficientbalance e){
			System.out.println("insufficient balance...");
		}

	}

}
