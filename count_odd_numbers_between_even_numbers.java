import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,cnt=0;
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-2;i++)
        {
            if(arr[i]%2==0 && arr[i+2]%2==0)
            {
                if(arr[i+1]%2!=0)
                {
                    cnt+=1;
                }
            }
            
        }
        System.out.println(cnt);
    }
    
}