package com.chandan;

public class InsertionSort {

	public static void main(String[] args) {
		int[] nums = { 9, 8, 4, 5, 6, 2 };
		for (int i = 1; i < nums.length; i++) {
			int temp = nums[i];
			int j = i - 1;
			while (j >= 0 && nums[j] > temp) {
				nums[j + 1] = nums[j];
				j = j - 1;
			}
			nums[j + 1] = temp;

		}
		for (int i : nums) {
			System.out.print(i);
		}
	}
}
