package com.chandan;

public class BinarySearch {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 4, 5, 6, 7 };
		int target = 9;
		int left = 0;
		int right = nums.length - 1;
		int matchedIndex = binarySearch(nums, target, left, right);
		if(matchedIndex!=-1) {
		System.out.println("Element " + target + " found at index " + matchedIndex);
		}else {
			System.out.println("Unable to find the element "+target);
		}
	}

	private static int binarySearch(int[] nums, int target, int left, int right) {
		if (left <= right) {
			int mid = (left + right) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				return binarySearch(nums, target, left, mid - 1);
			} else {
				return binarySearch(nums, target, mid + 1, right);
			}

		}
		return -1;
	}

}
