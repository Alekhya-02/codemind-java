import java.util.Scanner;
class find
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k,l,i,count=0;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        k=sc.nextInt();
        l=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]<k || a[i]>l)
            {
             System.out.print(a[i]+" ");
             count++;
            }
        }
        if(count==0)
        System.out.println("-1");
    }
}