import java.util.Scanner;

public class LenSearch_Number_Occurances1
{
    public int LenearSearch(int[] arr,int len,int no)
    {
        int cnt = 0;
        for(int i=0;i<len;i++)
        {
            if(arr[i] == no)
            {
                cnt+= 1;
            }
        }

        if(cnt == 0)
        {
            System.out.println("Sorry, The Element is Not Present in Array..!");
        }

        return cnt;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        LenSearch_Number_Occurances1 ln=new LenSearch_Number_Occurances1();
        int[] arr={3,5,7,45,4,5,6,4,5,5,9};
        int len = arr.length;

        System.out.print("Enter The Element to Find thier Occurances :");
        int no = sc.nextInt();

        int pres = ln.LenearSearch(arr,len,no);
        System.out.println("The "+no+" is Present at "+pres+" Times");

    }
}
