import java.io.*;
class sample
{
    public static void main(String args[])throws Exception
    {
        float c;
        float fa;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        c=Float.parseFloat(br.readLine());
        fa=(32+((c*9)/5));
        System.out.format("%.2f",fa);
        
    }
}