//Reverse An Array Elements Without Using any Extra Space
// Variables = 3;

public class ReverseAnArray3 {
    public static void main(String args[])
    {
        int[] arr={7,2,9,6,3,5,1,8,4};
        int temp=0,n= arr.length;

        for (int i=0;i<arr.length/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[n-1];
            arr[n-1]=temp;
            n--;
        }

        for (int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
