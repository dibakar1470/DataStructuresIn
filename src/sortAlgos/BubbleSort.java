package sortAlgos;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr) {
		
		boolean isSorted = false;
		int lastSorted = arr.length - 1;
		
		//used an optimization technique to shrink the array from the last on every pass.
		while(!isSorted) {
			isSorted = true;
			for(int i = 0;i < lastSorted;i++) {
				if(arr[i] > arr[i + 1]) {
					swap(arr,i,i + 1);
					isSorted = false;
				}
			}
			lastSorted--;
		}
		
		//To print the sorted array
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		
		int[] arr = {12,16,11,2,1,9,7,5};
		bubbleSort(arr);
		
	}

}
