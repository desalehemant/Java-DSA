//Reverse an Array Elements Usins Some Extra Space
// Variables = 2

public class ReverseAnArray2 {
    public static void main(String args[])
    {
        int[] arr1={1,2,3,4,5,6,7};
        int arr2[]=new int[7];

        int j=0;
        for(int i=arr1.length-1;i>=0;i--)
        {
            arr2[j]=arr1[i];
            j++;
        }

        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
}
