import java.util.*;
public class Finding_Element {
    public static void main(String args[])
    {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        Scanner sc=new Scanner(System.in);

        int flag=0;
        System.out.print("Enter The Element if You Want to Find :");
        int no=sc.nextInt();

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j< arr.length;j++)
            {
                if(arr[i][j]==no)
                {
                    flag=1;
                  System.out.println("The Element "+no+" is Present in The Array");
                  System.out.println("The Row No is ="+i);
                  System.out.println("The Column No is ="+j);

                }
            }
        }
        if(flag==0)
        {
            System.out.println("The Element is Does Not Exist.....");
        }
    }
}
