import java.util.*;
class sample
{
    public static void main(String args[])
    {
        int n;
        int arr[] = new int[100];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0; i<n; i++)  
        {  
            arr[i]=sc.nextInt();  
        } 
        System.out.println(sum(arr,0));
        
        
        
    }
    public static int sum(int[] arr,int index)
        {
            if(arr.length<=index)
            {
                return 0;
            }
            return arr[index] + sum(arr,index+1);
        }
}