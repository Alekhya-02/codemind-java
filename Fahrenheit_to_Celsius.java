import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int f;
        float ce;
        f=sc.nextInt();
        ce=(float)((f-32)/1.8);
        
        System.out.printf("%.2f",ce);
    }
}