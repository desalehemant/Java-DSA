import java.util.*;
import java.io.*;

class B_Sort
{
	public static void main(String args[])
	{
	 int[] arr={4,6,67,9,23,56,1,2};

	 System.out.print("The Array Before Sorting =");

	 for(int i=0;i<arr.length;i++)
	 {
	  System.out.print(arr[i]+" ");
	 }

	 int temp=0;

	 for(int i=0;i<arr.length;i++)
	 {
	  int j=i+1;
	  if(arr[i]>arr[j])
	  {
	   temp = arr[i];                //
	   arr[i] = arr[j];                 
	   arr[j] = temp;                   
	  }
	 }

     
     System.out.print("\nAfter Sorting The Array =");
	 for(int i=0;i<arr.length;i++)
	 {
	  System.out.print(arr[i]+" ");
	 }
	}
}