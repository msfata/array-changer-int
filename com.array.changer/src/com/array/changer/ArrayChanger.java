package com.array.changer;

/**
 * @author MSFATA
 *
 */
public class ArrayChanger {
	/**
	 * @deducting from existing single cell value of array
	 *
	 * @returns int old value - new integer you deducted
	 */
	public static int deductFromArrayElement(int findValueInArray, int amountToDeductFromExistedValue, int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == findValueInArray) {
				array[i] = array[i] - amountToDeductFromExistedValue;

			}
		}
		String result = "";
		for (int i = 0; i < array.length; i++) {
			result += array[i];
		}
		return Integer.parseInt(result);
	}

	/**
	 * @adding to existing single cell value of array
	 *
	 * @returns int old value + new integer you added
	 */
	public static int addToArrayElement(int findValueInArray, int amountToAddToExistedValue, int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == findValueInArray) {
				array[i] = array[i] + amountToAddToExistedValue;

			}
		}
		String result = "";
		for (int i = 0; i < array.length; i++) {
			result += array[i];
		}
		return Integer.parseInt(result);
	}
}
