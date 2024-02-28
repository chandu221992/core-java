package com.chandan;

public class MergeSort {

	public static void main(String[] args) {
		int[] nums = { 9, 8, 4, 5, 6, 2 };
		mergeSort(nums, 0, nums.length - 1);
		for (int i : nums) {
			System.out.print(i+" ");
			
		}

	}

	private static void mergeSort(int[] nums, int l, int r) {
		if (l < r) {
			int mid = (l + r) / 2;
			mergeSort(nums, l, mid);
			mergeSort(nums, mid + 1, r);
			merge(nums, r, mid, l);
		}

	}

	private static void merge(int[] nums, int r, int mid, int l) {
		int n1 = mid - l + 1;
		int n2 = r - mid;
		int[] larr = new int[n1];
		int[] rarr = new int[n2];
		for (int x = 0; x < n1; x++) {
			larr[x] = nums[l + x];
		}
		for (int x = 0; x < n2; x++) {
			rarr[x] = nums[mid+1+x];
		}

		int i = 0;
		int j = 0;
		int k = l;

		while (i < n1 && j < n2) {
			if (larr[i] <= rarr[j]) {
				nums[k] = larr[i];
				i++;
			} else {
				nums[k] = rarr[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			nums[k] = larr[i];
			i++;
			k++;
		}
		while (j < n2) {
			nums[k] = larr[j];
			j++;
			k++;
		}

	}

}
