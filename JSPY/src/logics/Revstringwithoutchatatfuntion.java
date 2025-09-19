package logics;

public class Revstringwithoutchatatfuntion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="kartik";
		char[] ch = str.toCharArray();
		int i =0;
		int j = str.length()-1;
		
//		swalp techinque and 2 side index compaarission
		while(i<j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		System.out.println(ch);

	}

}
