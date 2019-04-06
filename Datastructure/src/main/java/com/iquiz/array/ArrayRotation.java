package com.iquiz.array;

public class ArrayRotation {

	public static void main(String[] args) {
		int[] inputArray = { 1, 2, 3, 4, 5 };
		int d = 5;

		int length = inputArray.length;
		int rotation = (d % length == 0) ? 0 : (d % length);
		
		int[] outputArray = rotate(inputArray , rotation);

		System.out.println("After rotation");
		for (int val : outputArray) {
			System.out.print(val + "\t");
		}
	}

	public static int[] rotate(int[] inputArray, int rotation) {
		if(rotation == 0) {
			return inputArray;
		}
		int length = inputArray.length;
		int[] outputArray = new int[length];
		long milliSeconds = System.nanoTime();

		for (int index = 0; index < length; index++) {
			outputArray[index] = inputArray[(index + rotation) < length ? (index + rotation)
					: (index + rotation) - length];
		}
		System.out.println("Total completion\t" + (System.nanoTime() - milliSeconds));
		return outputArray;
	}

}
