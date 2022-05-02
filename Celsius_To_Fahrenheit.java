import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c;
        float fe;
        c=sc.nextInt();
        fe=(float)((c*1.8)+32);
        
        System.out.printf("%.2f",fe);
    }
}