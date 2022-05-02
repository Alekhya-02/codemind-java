import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int cnt=0;
        int l=s.nextInt();
        int r=s.nextInt();
        
        int k=s.nextInt();
        for(int i=l;i<=r;i++)
        {
            if(i%k==0)
            {
                cnt+=1;
            }
        }
        System.out.println(cnt);
    }
}