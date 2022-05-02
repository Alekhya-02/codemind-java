import java.util.Scanner;
class main
{
    static int fact(int x)
    {
        int ans=1;
        while(x>0)
        {
            ans=ans*x;
            x-=1;
        }
        return ans;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int cnt=0,x,res;
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            x=s.nextInt();
            res=fact(x);
            System.out.println(res);
        
        }
    
    }
}