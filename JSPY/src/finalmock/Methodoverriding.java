package finalmock;

class instagramV1{
	void story() {
		System.out.println("story uploaded successfull...");
	}
}

class instagramV2 extends instagramV1{
	void story() {
		super.story();
		System.out.println("story updated with like button...");
	}
}
public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		instagramV2 V = new instagramV2();
		V.story();

	}

}
