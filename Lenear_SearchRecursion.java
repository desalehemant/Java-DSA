import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Lenear_SearchRecursion
{
    public int Lenear_Search(int[] a,int i,int ele,int len)
    {

          try {
              if (a[i] == ele) {
                  return i;
              }
              if (0 < len) {
                  return Lenear_Search(a, i + 1, ele, len);
              }
          }

          catch (ArrayIndexOutOfBoundsException exc)
          {
              System.out.println("Sorry ,The Element you Want to Find is Does Not Exist ...!");
          }
       return -1;
    }
    public static void main(String args[])
    {
        Lenear_SearchRecursion ln=new Lenear_SearchRecursion();
        int[] arr={2,4,65,3,57,7,89,34,27,23};
        int len = arr.length;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Element if you Want to Find :");
        int ele=sc.nextInt();
        int start=0;
        int index = ln.Lenear_Search(arr,start,ele,len);
        System.out.print("The Element "+ele+" of The Index is = "+index);
    }
}
