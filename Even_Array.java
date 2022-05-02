import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,cnt=0,sum=0;
        int avg;
        n=sc.nextInt();
        int[] a=new int[n];
        int k=n;
        for(int i=0;i<n;i++)
        {
           a[i]=sc.nextInt(); 
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                cnt+=1;
            }
        }
        if(cnt==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
    }
}