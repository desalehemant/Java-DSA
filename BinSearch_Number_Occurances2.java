import java.util.Scanner;

public class BinSearch_Number_Occurances2
{
    public int FirstNumber(int[] arr,int s,int e,int no)
    {
        int res =-1;

        //System.out.print(mid);

        while(s<=e)
        {
            int mid = s+(e-s)/2;
            System.out.print(mid);
            if (arr[mid]==no)
            {
                res = mid;
                e =mid - 1;
                //System.out.print(mid);
            }
            else if(arr[mid]>no)
            {

                e = mid - 1;
            }
            else
            {
                s =mid +1;
            }
        }
        return res;
    }

    public int LastNumber(int[] arr,int len,int no)
    {
        int s=0;
        int e=len-1;
        int res =-1;

        while(s<=e)
        {
            int mid = s+(e-s)/2;
            if(arr[mid]==no)
            {
                res = mid;
                s = mid + 1;
               // System.out.print(mid);
            }
            else if (arr[mid] > no)
            {
                e= mid -1;
            }
            else
            {
                s =mid + 1;
            }
        }
        return res;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        BinSearch_Number_Occurances2 bn=new BinSearch_Number_Occurances2();
        int[] arr={1,2,3,4,5,6,6,6};

        System.out.print("Enter The Element to Find Thier Occurances :");
        int no = sc.nextInt();

        int len = arr.length;
        int First_no_occurrences = bn.FirstNumber(arr,0,len-1,no);
        int Last_no_occurrences  = bn.LastNumber(arr,len,no);

        int freq;

        if(First_no_occurrences == -1 || Last_no_occurrences == -1)
        {
            freq =0 ;
        }
        else
        {
            freq = Last_no_occurrences -First_no_occurrences + 1;
        }

        System.out.println("The "+no+" is Present "+freq+" Times....");
    }
}
