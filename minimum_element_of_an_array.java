import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,cnt=0,min;
        float sum=0;
        n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
           a[i]=sc.nextInt(); 
        }
        min=a[1];
        for(int i=0;i<n;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println(min);
    }
}