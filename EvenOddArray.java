public class EvenOddArray {
    public static void main(String args[])
    {
        int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        int b[]=new int[8];
        int c[]=new int[9];

        int j=0,k=0;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                b[j]=a[i];
                j++;
            }
            else
            {
                c[k] = a[i];
                k++;
            }
        }
        System.out.print("Array B is Even no's=");
        for (int i=0;i<b.length;i++)
        {

            System.out.print(b[i]+" ");
        }
        System.out.print("\n\nArray C is odd no's=");
        for (int i=0;i<c.length;i++)
        {

            System.out.print(c[i]+" ");
        }

    }
}
