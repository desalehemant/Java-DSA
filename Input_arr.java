import java.util.*;

class Input_arr
{
	public static void main(String args[])
	{
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter The Size of an Array :");
	 int n=sc.nextInt();

	 int arr[]=new int[n];

	 System.out.print("\nEnter The Array Elements :");
	 for(int i=0;i<arr.length;i++)
	 {
	  arr[i]=sc.nextInt();
	 }

	 System.out.print("The Array Elements Are:");
	 for(int i=0;i<arr.length;i++)
	 {

	 System.out.print(arr[i]+" ");
	 }
	}
}