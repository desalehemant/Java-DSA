public class MaxArrElement {
    public static void main(String args[]) {
        int[] arr = {3, 65, 8, 24, 96, 5, 43, 6};
        int max=0;

        for (int i = 0; i < arr.length; i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }

        }
        System.out.println("The Maximum Array Element is = "+max);
    }
}
