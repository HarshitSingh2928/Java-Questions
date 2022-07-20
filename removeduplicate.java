package bharath;

import java.util.Scanner;

public class removeduplicate {
	public static int remove(int arr1[],int n) {
		if(n==0 || n==1) {
			return n;
			
		}
		for (int i=0;i<arr1.length;i++) {
			if (arr1[i]!=arr1[i+1]) {
				
				
			}
		}
			
	return n;
	}
	

	public static void main(String[] args) {
		int arr[]=new int[10];
		System.out.println("Enter the elements");
		Scanner scan = new Scanner(System.in);
		
		for (int i=0; i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Before swap");
        for(int i=0;i<arr.length;i++)
        	System.out.println(arr[i]);
        remove(arr,arr.length);
	}

}
