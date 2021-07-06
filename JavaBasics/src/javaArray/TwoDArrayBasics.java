package javaArray;

public class TwoDArrayBasics {

	public static void main(String[] args) {
		int arr1[][] = {
				{3, 5, 9},
				{7, 6, 2},
				{4, 3, 5},
			};
		int[] arr2[] = {
				{1,0,0},
				{0,1,0},
				{0,0,1},
			};
		
		int result[][] = new int[arr1.length][arr1[0].length];
		
		/* Matrix Multiplication */
		for(int row = 0; row < arr1.length; row++) {
			for(int col = 0; col < arr1[row].length; col++) {
				for(int iter = 0; iter < arr1[row].length; iter++) {
					result[row][col] += arr1[row][iter] * arr2[iter][col];
				}
			}
		}
		
		for(int arrRef[] : result) {
			System.out.print("|");
			System.out.print("\t");
			for(int value : arrRef) {
				System.out.print(value + "\t");
			}
			System.out.print("|");
			System.out.println("");
		}
		
	}

}