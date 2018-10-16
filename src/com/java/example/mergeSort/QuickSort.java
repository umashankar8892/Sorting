package com.java.example.mergeSort;

public class QuickSort {

	public static void main(String args[]) {
		int a[] = {7,2,1,6,8,5,3,4};
		quicksort(a,0,a.length-1);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+ " ");
		System.out.println();
	}
	
	public static void quicksort(int a[],int low, int high) {
		if(low>=high) {
			return;
		}
		int x = partition(a,low,high);
		quicksort(a,low,x-1);
		quicksort(a,x+1,high);
	}
	
	public static int partition(int a[],int low,int high) {
		int pivot = a[high];
		int curr=0,i=0;
		int temp=0;
		while(curr < a.length) {
			if(a[curr] < pivot) {
				temp = a[curr];
				a[curr] = a[i];
				a[i] = temp;
				++i;
			}
			curr++;
		}
		
		temp = a[i];
		a[i]=pivot;
		a[high] = temp;
		return i;
	}
}
