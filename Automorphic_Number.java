import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int len=(int)(Math.log10(n)+1);
        int sq=n*n;
        int res=sq%(int)(Math.pow(10,len));
        
        if(res==n)
        System.out.println("Automorphic Number");
        else
        System.out.println("Not an Automorphic Number");
    }
}