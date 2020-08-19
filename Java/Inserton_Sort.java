package CODECHEF_BEGINNERS;
public class Inserton_Sort
{
    public static void main(String args[])
    {
        int a[]= {12,10,8,6,4,2};
        int i,item;
        for (int j =1; j<a.length ; j++)
        {
            item=a[j];
            i=j-1;

            while (i>=0 && a[i]>item)
            {
                     a[i+1]=a[i];
                     i--;
            }

            a[i+1]=item;
        }

        for(int k=0;k<a.length;k++)
        {
            System.out.print(a[k]+" ");
        }
    }
}
