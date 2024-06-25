
public class Main {

	public static void main(String[] args) {
		int []arr = {50,20,10,60,30,40};
		
		QuickSort.quickSort(arr, arr[0], arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
