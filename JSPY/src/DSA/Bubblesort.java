package DSA;

class bubble{
	void sort(int arr[]) {
		 for(int i =0; i < arr.length -1 ; i ++) {
	        	for(int j =0; j < arr.length -1-i; j++) {
	        		if (arr[j] > arr[j+1]) {
	        			int temp = arr[j];
	        			arr[j] = arr[j+1];
	        			arr[j+1] = temp;
	        		}
	        	}
	        }
		
	}
}

public class Bubblesort {

	public static void main(String[] args) {
		int[] arr = {5, 3, 8, 4, 2};
		bubble s = new bubble();
		s.sort(arr);
       

        // Print sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
	}
	}
}



