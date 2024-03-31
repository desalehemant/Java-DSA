import java.util.*;
public class Lenear_Search
{
    public  int LenearSearch(int[] a,int no,int len)
    {
        for(int i=0;i<len;i++)
        {
            if(a[i]==no)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int[] arr={3,6,23,86,4,2,9,33};
        Lenear_Search ln=new Lenear_Search();
        int len = arr.length;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Element if you want to Find :");
        int no=sc.nextInt();
        int index = ln.LenearSearch(arr,no,len);

        System.out.println("The "+no+" Element is Present at Index "+index);
    }
}
