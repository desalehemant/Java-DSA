//Reverse an Array Elements Usins Some Extra Space
// Variables = 5

public class ReverseAnArray1 {
    public static void main(String args[])
    {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int arr1[]=new int[10];
        int n=arr.length,temp;
        int cnti=0,cntj=0;

        for(int i=0;i<arr.length;i++)
        {
            cnti++;
           for(int j=n-1;j>=0;j--)
           {
               cntj++;
               if(cnti==cntj)
               {
                   arr1[i]=arr[j];
               }

           }
           cntj=0;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}
