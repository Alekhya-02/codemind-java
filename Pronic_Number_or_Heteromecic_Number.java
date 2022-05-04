import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        for(int i=0;i<Math.sqrt(n)+1;i++)
        {
            int res=i*(i+1);
            if(n==res)
            {
                c=c+1;
                break; 
            }
            
        }
        if(c==1)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}