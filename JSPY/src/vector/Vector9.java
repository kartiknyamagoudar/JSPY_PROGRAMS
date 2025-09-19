package vector;



import java.util.Vector;

public class Vector9 {
    public static void main(String[] args) {
        Vector<Object> v11 = new Vector<Object>();
        v11.add(10);
        v11.add(20);
        v11.add(30);
        v11.add(40);
        v11.add(50);

        Object[] arr = v11.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}