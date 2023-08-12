public class Diagonal_Elements1 {
    public static void main(String args[])
    {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};

        System.out.print("The Principle Diagonal Element is = ");
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j< arr.length;j++)
            {
                if(i == j)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }

        int k=2;
        System.out.print("\nThe Second Diagonal Element is = ");
        for (int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i][k]+" ");
            k--;
        }
    }
}
