import java.util.Scanner;

class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int r,ev_cnt=0,od_cnt=0,len;
        len=(int)(Math.log10(n))+1;
        for(int i=0;i<n;i++)
        {
            r=n%10;
            if(r%2==0)
            {
                n=n/10;
                ev_cnt+=1;
            }
            else
            {
                n=n/10;
                od_cnt+=1;
            }
        }
        if(len==ev_cnt)
        {
            System.out.println("Even");
            
        }
        else if(len==od_cnt)
        {
            System.out.println("Odd");
            
        }
        else
        {
            System.out.println("Mixed");
        }
    }
}