import java.util.*;
class sample
{
    public static void main(String args[])
    {
        int a,b,c;
        float s,res;
        Scanner sc= new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        s=(float)(a+b+c)/2;
        res=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",res);
    }
    
}