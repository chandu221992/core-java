package com.chandan;

public class BubbleSort {

	public static void main(String args[]) {
		int[] nums = { 9, 8, 4, 5, 6, 2 };
		for (int n : nums) {
			System.out.print(n);
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println();
			for (int j = 0; j < nums.length-i- 1; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
				for (int n : nums) {
					System.out.print(n);
				}
				System.out.println();
			}
		}
		System.out.println();
		for (int n : nums) {
			System.out.print(n);
		}

	}

}
