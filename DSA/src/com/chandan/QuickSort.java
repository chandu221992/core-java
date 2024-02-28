package com.chandan;

public class QuickSort {

	public static void main(String[] args) {
		int[] nums = { 9, 8, 4, 5, 6, 2 };
		int low = 0;
		int high = nums.length - 1;
		quicksort(nums, low, high);
		for (int i : nums) {
			System.out.print(i);	
		}

	}

	private static void quicksort(int[] nums, int low, int high) {
		if (low < high) {
			int k = partition(nums, low, high);
			quicksort(nums, low, k - 1);
			quicksort(nums, k + 1, high);
		}
	}

	private static int partition(int[] nums, int low, int high) {
		int pivot = nums[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (nums[j] < pivot) {
				i++;
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		}
		int temp = nums[i + 1];
		nums[i + 1] = nums[high];
		nums[high] = temp;
		return  i + 1;
	}

}
