import java.util.Scanner;
class unique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,cnt=0;
        n=sc.nextInt();
        double sum=0,count=0;
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
            if(a[i]==cnt)
            {
            sum=sum+a[i];
            count++;
            }
                
        }
        if(count>0)
        {
        sum=sum/count;
        System.out.println(String.format("%.2f",sum));
        }
        else
        System.out.println("-1");
        
    }
}
