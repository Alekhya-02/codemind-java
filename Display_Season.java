import java.io.*;
class sample
{
    public static void main(String args[])throws Exception
    {
        int n;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        n=Integer.parseInt(br.readLine());
        if(n==2 || n==3)
        {
            System.out.println("Spring");
        }
        else if(n>=4 && n<=6)
        {
            System.out.println("Summer");
        }
        else if(n>=7 && n<=11)
        {
            System.out.println("Rainy");
        }
        else if(n==1  ||n==12)
        {
            System.out.println("Winter");
            
        }
        else
        {
            System.out.println("-1");
        }
    }   
}