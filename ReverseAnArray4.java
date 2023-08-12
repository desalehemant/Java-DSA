//Reverse An Array Elements Without Using any Extra Space
// Variables = 4;
public class ReverseAnArray4 {
    public static void main(String args[])
    {
        int[] arr={1,2,3,4,5,6,7,8};

        int l=0;
        int r=arr.length-1;
        int temp=0;

        while (r>l)
        {
            temp = arr[r];
            arr[r]=arr[l];
            arr[l]=temp;
            r--;
            l++;
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
