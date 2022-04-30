import java.util.Scanner;
class find
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,cnt=1,count=0,i,j;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            cnt=1;
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j] && a[i]!=0)
                {
                   a[j]=0;
                   cnt++;
                }
            }
            if(cnt==a[i])
            {
                count++;
                System.out.print(a[i]+" ");
            }
        }
        
        if(count==0)
        System.out.println(-1);
    }
}