package finalmock;

class pass{
	private String password = "kar@123456";

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
public class Encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pass p = new pass();
		System.out.println(p.getPassword());
		p.setPassword("kartik@123");
		System.out.println(p.getPassword());

	}

}
