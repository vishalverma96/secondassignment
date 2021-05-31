package info;

import java.util.Arrays;
import java.util.Scanner;

public class Infostride {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the length of array");
		int size= s.nextInt();
		
		
		int [] arr = new int[size+1];
		for (int i=1; i<arr.length; i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Elements are:");
		for (int i=1; i<arr.length; i++) {
			System.out.println("Element in " +i+" Index: "+arr[i]);
		}
			

	}

}
