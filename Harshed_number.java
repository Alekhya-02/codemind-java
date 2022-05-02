import java.util.Scanner;
class harshad
{
    static int sum(int m)
    {
        int su=0;
        while(m>0)
        {
            int r=m%10;
            su=su+r;
            m=m/10;
        }
    return su;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int p=sum(m);
        if(m%p==0)
        System.out.println("True");
        else
        System.out.println("False");
    }
}