public class Left_DiagonalElement {
    public static void main(String args[])
    {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("The Left Diagonal Element is =");
        for(int i = 0;i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                 if(i>=j)
                 {
                  System.out.print(arr[i][j]+" ");
                 }
                 else
                 {
                  System.out.print(" ");
                 }
            }
             System.out.println();
        }
    }
}
