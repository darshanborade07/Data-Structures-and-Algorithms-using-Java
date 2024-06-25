
public class QuickSort {

	public static void quickSort(int[] arr, int left, int right) {
		if(left >= right) {
			return;
		}
		
		int pivotLocation = partition(arr,left,right);
		quickSort(arr, left, pivotLocation-1);
		quickSort(arr, pivotLocation+1, right);
		
	}

	private static int partition(int[] arr, int left, int right) {
		int pivot = arr[left];
		while(left != right) {
			while(arr[right] > pivot && left != right) {
				right--;
			}
			if(left != right) {
				arr[left] = arr[right];
				left++;
			}
			
			while(arr[left] < pivot && left != right) {
				left++;
			}
			if(left == right) {
				break;
			}
			arr[right] = arr[left];
			right--;
		}
		arr[left] =pivot;
		
		return right;
	}

}
