package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class code {

	public static void main(String[] args) {
		int [] arr= {12,89,45,76,93,88,52,67,23,64,81,-4,0};
		int arr1 []= {8,9,10,11,12,13,14,15};
		//selectionSort(arr);
//		insertionSort(arr);
		//mergeSort(arr);
		System.out.print(binarySearch(arr1, 14, 0, arr1.length-1));

	}
	
	public static int binarySearch(int [] arr, int num, int low, int high) {
		
		while(low<=high) {
			int mid=low+((high-low)/2);
			if(arr[mid] == num)
				return mid;
			if(arr[mid]>num)
				high=mid-1;
			if(arr[mid]<num)
				low=mid+1;
		}
		return -1;
	}
	
	public static void mergeSort(int[] a) {
		
		
		for(int i : a) {
			System.out.print(i+" ");
		}
	}
	
	public static void insertionSort(int [] a) {
		int temp,j;
		for(int i=1; i<a.length; i++) {
			temp=a[i];
			j=i;
			while(j>0 && a[j-1]>temp) {
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
		}
		for(int i : a) {
			System.out.print(i+" ");
		}
	}
	
	public static void selectionSort(int[] a) {
		int temp=0; 
		int min;
		for(int i=0;i<a.length;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j] < a[min]) {
					min=j;
				}
				temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
		for(int i : a) {
			System.out.print(i+" ");
		}
	}

}
