public class PairWithSum {
    public static void main(String args[])
    {
        int[] arr={1,4,5,3,2,7,1,9};
        int value=5;
        int cnt=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if((arr[i]+arr[j])==value)
                {
                    System.out.println("{"+arr[i]+","+arr[j]+"}");
                    cnt=cnt+1;
                }
            }
        }
        System.out.println("Sum of Pairs Are ="+cnt);
    }
}