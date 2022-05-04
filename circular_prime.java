import java.util.Scanner;
class main
{
    static int revs(int m)
    {
        int rev=0;
        while(m>0)
        {
            int r=m%10;
            rev=(rev*10)+r;
            m=m/10;
        }
        return rev;
    }
    static boolean prime(int p)
    {  
        int cnt=1;
        for(int i=2;i*i<=p;i++)
        {
            if(p%i==0)
            {
                cnt=0;
                break;
            }
        }
        if(cnt==1)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=revs(n);
        if(prime(n)==false)
        {
            System.out.println("not prime");
        }
        else if(prime(n)==prime(k))
        {
            System.out.println("circular prime");
        }
        else
        System.out.println("prime but not a circular prime");
    }
}