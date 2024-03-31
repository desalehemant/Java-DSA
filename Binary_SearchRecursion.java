import java.util.Scanner;

public class Binary_SearchRecursion
{
    public int Binary_Search(int[] a,int no,int start,int end)
    {
        if(start <= end)
        {
            int mid = (start+end)/2;

            if(no > a[mid])
            {
                return Binary_Search(a,no,mid+1,end);
            }
            else if (no < a[mid])
            {
                return Binary_Search(a,no,start,mid-1);
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
        int[] arr={2,7,12,16,23,28,34,38,43,48,67,73,87,92};
                // 0 1  2  3  4  5  6  7  8  9 10 11 12 13  indexes
        Binary_SearchRecursion bs=new Binary_SearchRecursion();
        Scanner sc=new Scanner(System.in);
        int end = arr.length-1;
        int start =0;
        System.out.print("Enter The Element if you Want to Find :");
        int no = sc.nextInt();
        int index = bs.Binary_Search(arr,no,start,end);
        System.out.print("The Element "+no+" is present at index ="+index);

    }
}
