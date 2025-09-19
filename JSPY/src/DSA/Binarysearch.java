package DSA;

class binary{
	int search(int arr[], int x) {
		int low = 0;
		int high = arr.length - 1;
		
		while(low <= high) {
			int mid = low+(high-low)/2;
			
		
		if (arr[mid] == x)
			return mid;
		if (arr[mid] < x)
			low = mid +1;
		else 
			high = mid - 1;
	}
	return -1;
}
}


class Binarysearch{
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10,12,14,16,18,20};
		int x = 14;
		binary b = new binary();
		int result = b.search(arr, x);
		if(result == -1) {
			System.out.println("not found");
		}
		else 
			System.out.println("found in index"+ result);
	}
}