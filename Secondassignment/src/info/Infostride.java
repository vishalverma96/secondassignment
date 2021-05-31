package info;

import java.util.Arrays;
import java.util.Scanner;

public class Infostride {
	static Scanner s = new Scanner(System.in);
	static int removeDuplicates(int arr[], int n)
    {
        if (n == 0 || n == 1)
            return n;
      
        
        int j = 1;
      
        
        for (int i = 1; i < n-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];
      
        arr[j++] = arr[n-1];
      
        return j;
    }
	
	static int firstOccPositve(int arr[], int low, int high)
	{
		if(high >= low)
	    {
	        int mid = (low + high)/2; /*low + (high - low)/2;*/
	        if(mid == arr[mid]){
	            return mid;
	        }
	        
	        if(mid > arr[mid]){
	             return firstOccPositve(arr, (mid + 1), high);
	        }

	        else{
	            return firstOccPositve(arr, low, (mid -1));
	        }
	    }
	    return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the length of array");
		int size= s.nextInt();
		if(size == 0) {
			System.out.println("Not Found");
			return;
		}
		
		
		int [] arr = new int[size+1];
		for (int i=1; i<arr.length; i++) {
			arr[i]=s.nextInt();
		}
		
		Arrays.sort(arr, 1,(arr.length));
		int size2= removeDuplicates(arr, (arr.length));
		int index = firstOccPositve(arr,1, (size2-1));
		
		if (index != -1){
	        System.out.println("first positive :"+index);
	       }
	    else{
	    	System.out.println("not found");
	    }
//		System.out.println("Elements are:");
//		for (int i=1; i<size2; i++) {
//			System.out.println("Element in " +i+" Index: "+arr[i]);
//		}
			

	}

}
