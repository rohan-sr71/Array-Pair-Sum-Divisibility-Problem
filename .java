import java.util.*;

class Rohan
{
	public static void main (String[] args)throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		while(n>0)
		{
		    n--;
		    int size=Integer.parseInt(br.readLine());
		    String str4[]=br.readLine().trim().split("\\s+");
		    int ar[]=new int[size];
		    int flag=0;
		    for(int i=0;i<ar.length;i++)
		    {
		        ar[i]=Integer.parseInt(str4[i]);
		    }
		    int div=Integer.parseInt(br.readLine());
		    ArrayList<Integer> al=new ArrayList<Integer>();
		    for(int i=1;i<=div;i++)
		    {
		        if(div%i==0)
		        {
		            al.add(i);
		        }
		    }
		    if(ar.length%2==0)
		    {
		     int sum=0;
		     for(int i=0;i<ar.length;i++)
		     {
		         sum=sum+ar[i];
		     }
		     for(int i=0;i<al.size();i++)
		     {
		       if(sum%al.get(i)!=0)
		       {
		         flag=1;;
		       } 
		     }
		     if(flag==1)
		     {
		         System.out.println("False");
		     }
		     else
		     {
		         System.out.println("True");
		     }
		    }
		    else
		    {
		        System.out.println("False");
		    }
		}
	}
}
