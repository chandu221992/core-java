package com.chandan;

public class SelectionSort {

	public static void main(String[] args) {
		int nums[]= {9,8,4,5,6,2};
		for(int i=0;i<nums.length-1;i++) {
			System.out.println();
			int minIndex=i;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[minIndex]>nums[j]) {
					minIndex=j;
				}
			}
			int temp=nums[i];
			nums[i]=nums[minIndex];
			nums[minIndex]=temp;
			for (int k = 0; k < nums.length; k++) {
				System.out.print(nums[k]);
			}
		}
		System.out.println();
		System.out.println("Arrays after selection sort");
		for (int l = 0; l < nums.length; l++) {
			System.out.print(nums[l]);
		}

	}

}
