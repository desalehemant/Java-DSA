import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search
{

    public int BinarySearch(int[] a,int no,int len)
    {
        int s=0;
        int e=len-1;
        while (s<=e)
        {
            int mid=(s+e)/2;
            //Go Right
            if(a[mid] < no)
            {
                s=mid+1;
            } else if (a[mid] > no)
            {
                e=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
       int[] arr={2,7,12,16,23,28,34,38,43,48,67,73,87,92} ;
               // 0 1  2  3  4  5  6  7  8  indexes

        int len = arr.length;
        Binary_Search bs=new Binary_Search();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Element if you want to Find :");
        int no=sc.nextInt();
        int index = bs.BinarySearch(arr,no,len);
        System.out.println("The "+no+" Element is Present at The Index "+index);
    }
}
