package activities;

import java.util.Arrays;

public class Activity4 {

	static void ascendingSort(int array[]) {

		int arraySize = array.length, i;

		for (i = 1; i < arraySize; i++) {

			int keyValue = array[i];
			int j = i - 1;

			while (j >= 0 && keyValue < array[j]) {

				array[j + 1] = array[j];
				--j;

			}
			array[j + 1] = keyValue;

		}
		// System.out.println("function : "+Arrays.toString(array));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] randomNum = { 10, 8, 4, 16 };

		/*
		 * for (int i = 0; i < randomNum.length; i++) {
		 * 
		 * //System.out.println(randomNum.length); System.out.println(randomNum[i]);
		 * 
		 * 
		 * //System.out.println("\n"); }
		 */

		System.out.println("Array values before sorted : " + Arrays.toString(randomNum));
		ascendingSort(randomNum);

		System.out.println("Sorted Array in Ascending order : " + Arrays.toString(randomNum));
	}

}
