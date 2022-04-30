import java.util.Scanner;
class unique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,sum=0,cnt=0,count=0;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            cnt=1;
            for(j=0;j<n;j++)
            {
                if(i!=j)
                {
                if(a[i]==a[j] && a[j]!=0)
                {
                a[j]=0;
                cnt++;
                }
                }
            }
            if(a[i]!=0)
            System.out.print(a[i]+" "+cnt+" ");
                
        }
        
    }
}