
public class HeapSort {

	public static void heapSort(int []arr) {
		for (int i = arr.length -1; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				if(arr[j] > arr[(j-1)/2]) {
					int temp = arr[j];
					arr[j] = arr[(j-1)/2];
					arr[(j-1)/2] = temp;
				}
			}
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
		}
	}
}
