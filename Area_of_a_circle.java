
import java.io.*;
class sample
{
    public static void main(String args[])throws Exception
    {
        int r;
        float area;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        r=Integer.parseInt(br.readLine());
        area=(float)3.14*r*r;
        System.out.format("%.2f",area);
        
    }
}