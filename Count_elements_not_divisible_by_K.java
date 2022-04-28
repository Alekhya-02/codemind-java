import java.io.*;
class sample
{
	public static void main(String args[])throws Exception
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
        int n,k;
        int cnt=0;
        String input1=br.readLine();
        String arr[]=input1.split(" ");
        n=Integer.parseInt(arr[0]);
        k=Integer.parseInt(arr[1]);
        int num[]=new int[100];
		input1=br.readLine();
		arr=input1.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
		    num[i]=Integer.parseInt(arr[i]);
		    if(num[i]%k!=0)
		    {
		        cnt+=1;
		    }
		}
		System.out.println(cnt);
    }
}