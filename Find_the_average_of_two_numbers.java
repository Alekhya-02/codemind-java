import java.util.*;
class sample
{
    public static void main(String args[])
    {
        int n,m,sum;
        float avg;
        Scanner buf = new Scanner(System.in);
        n = buf.nextInt();
        m = buf.nextInt();
        sum=n+m;
        avg=(float)sum/2;
        System.out.format("%.4f",avg);
        
    }
}