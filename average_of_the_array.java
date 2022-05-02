import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,cnt=0;
        float sum=0;
        n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
           a[i]=sc.nextInt(); 
        }
        for(int i=0;i<n;i++)
        {
           sum=sum+a[i]; 
        }
        sum=(sum)/n;
        System.out.printf("%.2f",sum);
    }
}