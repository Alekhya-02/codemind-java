import java.util.*;
class sample
{
    public static void main(String args[])
    {
        int hf,sf,speed_f;
        Scanner sc=new Scanner(System.in);
        hf=sc.nextInt();
        sf=sc.nextInt();
        speed_f=sc.nextInt();
        if(hf>50 && sf>60 && speed_f>100)
        {
            System.out.println("10");
        }
        else if(hf>50 && sf>60 && speed_f<=100)
        {
            System.out.println("9");
        }
        else if(hf<=50 && sf>60 && speed_f>100)
        {
            System.out.println("8");
        }
        else if(hf>50 && sf<=60 && speed_f>100)
        {
            System.out.println("7");
        }
        else if(hf>50 || sf>60 || speed_f>100)
        {
            System.out.println("6");
        }
        else
            System.out.println("5");
    }
}