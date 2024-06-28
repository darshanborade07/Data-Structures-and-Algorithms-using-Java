
public class BinarySearch {
	private static int count;
	public static int binarySearch(int key,int []arr) {
		int left=0;
		int right = arr.length - 1;
		
		while(left <= right) {
			count++;
		int mid = (left+right)/2;
		
		 if(arr[mid] == key) {
			 return mid;
		 }
		 if(arr[mid] > key) {
			 right = mid -1;
		 }else
			 left = mid + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50,60,70,80,90};
		
		System.out.println(binarySearch(20, arr));
		System.out.println(count);
	}

}
