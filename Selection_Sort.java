public class Selection_Sort
{
    public static void main(String args[])
    {
        int[] arr={5,3,6,8,53,87,34,97,56,2,1,9,45,12,21,4,7};
        int temp =0;

        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted Array is =");
        for (int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
