package javaArray;

public class ArrayBasics {
	public static int secondLargest(int arr[]) {
		int max = arr[0], secondMax = arr[0];
		
		for(int value : arr) {
			if(value > max) {
				secondMax = max;
				max = value;
			}
			else if(value > secondMax) {
				secondMax = value;
			}
		}
		
		return secondMax;
	}
	
	public static void lRotation(int arr[]) {
		int firstElement = arr[0];
		for(int i = 1; i < arr.length; i++) {
			
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = firstElement;
	}
	
	public static void rRotation(int arr[]) {
		int lastElement = arr[arr.length - 1];
		for(int i = arr.length - 2; i >= 0; i--) {
			arr[i + 1] = arr[i];
		}
		
		arr[0] = lastElement;
	}
	
	public static void copyArray(int arr1[], int arr2[]) {
		
		for(int i = 0; i < arr1.length; i++) 
			arr2[i] = arr1[i];
 		
	}
	
	public static int[] reverseArray(int arr[]) {
		int arr2[] = new int[arr.length];
		for(int i = arr.length - 1, j = 0; i >= 0; i--, j++) 
			arr2[j] = arr[i];
		
		return arr2;
	}
	
	public static int[] extendArray(int arr[], int size) {
		int[] newArray = new int[size];
		ArrayBasics.copyArray(arr, newArray);
		/*
		 * Here We have to return the new Array Because java do not support pass by reference of the variable 
		 * array is created in heap and its object is created in either stack or heap
		 * Meaning when we have given arr as parameter it does not pass the reference of arr which exist in either stack or heap rather it has passed the array allocation reference of heap
		 * so when we changed the object reference in this function then it will not reflect in the arr variable of MAIN method because now this arr object became local to this method only
		 */
		return newArray;
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 8, 9, 7, 6, 12, 6, 15, 5, 4, 10};
		System.out.println("The Second Largest Element in array is: "+ ArrayBasics.secondLargest(arr));
		
		System.out.println("Array before the Rotation");
		for(int value : arr) 
			System.out.print(value + ",\t");
		
		System.out.println("");
		
		/* comment the left rotation part to see the actual effect of right rotation*/
		
		/* Left rotation of the arr */
		System.out.println("Array After the left Rotation");
		ArrayBasics.lRotation(arr);
		
		for(int value : arr) 
			System.out.print(value + ",\t");
		
		System.out.println("");
		
		/* Right rotation of the arr */
		System.out.println("Array After the Right Rotation");
		ArrayBasics.rRotation(arr);
		
		for(int value : arr) 
			System.out.print(value + ",\t");
		
		System.out.println("");
		
		/* Copy Array Elements*/
		int[] arrCpy = new int[arr.length];
		System.out.println("Copying Array....");
		ArrayBasics.copyArray(arr, arrCpy);
		
		System.out.println("Original Array");
		for(int value : arr) 
			System.out.print(value + ",\t");
		
		System.out.println("");
		
		System.out.println("Copy Array");
		for(int value : arr) 
			System.out.print(value + ",\t");
		
		System.out.println("");
		
		/* Reverse Array Elements*/
		
		arrCpy = ArrayBasics.reverseArray(arr);
		
		System.out.println("Reversed Array:");
		for(int value : arrCpy) 
			System.out.print(value + ",\t");
		
		System.out.println("");
		
		/* Extend array size */
		System.out.println("Array Length Before Extension");
		System.out.println(arr.length);
		
		System.out.println("Array Length After Extension");
		arr = ArrayBasics.extendArray(arr, 22);
		System.out.println(arr.length);
		
		System.out.println("Array Elements");
		for(int value : arr) 
			System.out.print(value + ",\t");
		
		System.out.println("");
		
	}
}