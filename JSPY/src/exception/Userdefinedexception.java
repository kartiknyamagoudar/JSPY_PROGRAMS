package exception;

class insufficientbalance2 extends Exception{
	String Message;
	
	insufficientbalance2(String Message){
		this.Message=Message;
	}
	public String Message() {
		return Message;
	}
	
}

class ATM2{
	static int balance = 1000;
	public static void withdraw1(int amount) throws insufficientbalance2{
		if(amount < balance) {
			System.out.println("winthdraw successfull...");
			
		} else {
			throw new insufficientbalance2("insufficient Bavalance...");
		}
		
	}
}

public class Userdefinedexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ATM2.withdraw1(1200);
		}
		catch(insufficientbalance2 e){
			System.out.println(e.Message());
		}

	}

	}


