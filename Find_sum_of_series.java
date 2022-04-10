import java.io.*;
class sample
{
    public static void main(String args[])throws Exception
    {
        int n;
        double sum=0.0;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        n=Integer.parseInt(br.readLine());
        for(double j=1;j<=n;j++)
        {
            sum=sum+(1/j);
        }
        System.out.format("%.2f",sum);   
    }
}