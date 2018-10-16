package com.java.example.sorting;

public class MergeSort {

	public static void main(String args[]) {
		int arr[] = {12, 11, 13, 5, 6, 7}; 
        System.out.println("Given Array"); 
        mergeSort(arr);
        printArray(arr);
	}
	
	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
	
	public static void mergeSort(int a[]) {
		if(a.length<2)
			return;
		int mid = a.length/2;
		int left[] = new int[mid];
		int right[] = new int[a.length-mid];
		for(int i=0;i<mid;i++)
			left[i] = a[i];
		for(int j=mid;j<a.length;j++)
			right[j-mid] = a[j];
		mergeSort(left);
		mergeSort(right);
		merge(a,left,right);
	}
	
	public static void merge(int a[],int left[],int right[]) {
		int i=0;int j=0;int k=0;
		while(i<left.length && j < right.length) {
			if(left[i]<right[j]) {
				a[k] = left[i];
				i++;
				k++;
			}else {
				a[k] = right[j];
				j++;
				k++;
			}
		}
		
		while(i<left.length) {
			a[k] = left[i];
			i++;
			k++;
		}
		
		while(j<right.length) {
			a[k] = right[j];
			j++;
			k++;
		}
	}
}
