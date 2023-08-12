public class MinArrElement
{
    public static void main(String args[])
    {
        int[] arr={55, 65, 88, 25,121, 96, 26, 43, 66};
        int j=0,min=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[j]>=arr[i])
            {
                min = arr[i];
                arr[j]=min;
            }
        }
        System.out.println("The Minimum Array Element is = "+min);
    }
}
