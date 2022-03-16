package sortAlgos;

import java.util.Arrays;
import java.util.Scanner;

public class Search {

	public static void linearSearch(int[] arr, int size, int key) {
		
		int index = 0;
		for(index = 0; index < size; index++) {
			if(arr[index] == key) {
				System.out.println("Element at index:- " + index);
				break;
			}
			else {
				continue;
			}
		}
		System.out.println("Element not found");
	}
	
	public static void binarySearch(int[] arr, int size, int key) {
		
		Arrays.sort(arr);
		int start = 0;
		int end = size - 1;
		
		while(start <= end) {
			int mid = (int) Math.floor((start + end)/2);
			if(key == arr[mid]) {
				System.out.println("Element at index:- " + mid);
				return;
			}
			else if(key < arr[mid]) {
				end = mid - 1;
			}
			else{
				start = mid + 1;
			}
		}
		System.out.println("Element not found");
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array:- ");
		int size = input.nextInt();
		
		int[] input_arr = new int[size];
		System.out.print("Enter the elements for the array:- ");
		
		for(int i = 0; i < size; i++) {
			input_arr[i] = input.nextInt();
		}
		
		System.out.print("Enter the element to be searched:- ");
		int key = input.nextInt();
		input.close();
		
		System.out.println(size + " " + key);
		for(int i = 0; i < size; i++) {
			System.out.print(input_arr[i] + " ");
		}
		
		System.out.println();
		
		//Calling linear search
		//linearSearch(input_arr, size, key);
		
		//Calling Binary Search
		binarySearch(input_arr, size, key);
		//System.out.println("Element at index:- " + binary);
		
	}

}
