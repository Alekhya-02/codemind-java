import java.util.Scanner;
class find
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k,l,cnt=0,i,min=0;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        k=sc.nextInt();
        l=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]>=k && a[i]<=l)
            {
             if(min<a[i])
             {
             min=a[i];
             cnt++;
             }
            }
        }
        if(cnt>0)
        System.out.println(min);
        else
        System.out.println("-1");
        
        
    }
}

