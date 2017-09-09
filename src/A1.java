import java.util.Scanner;

class A1{
	//Scanner i=new Scanner(System.in);
	public static void main(String []args)
	{
		Scanner i=new Scanner(System.in);
		int c;
		int t,s=0;
		System.out.println("enter c");
		c=i.nextInt();
		t=c/2;
		System.out.println(t);
		int []a=new int[c];
		System.out.println("enter array elements");
		
		for(int k=0;k<c;k++)
		{
			a[k]=i.nextInt();
		}
		/*for(int k:a)
		{
			System.out.println(k);
		}*/
		/*System.out.println("enter x value");
		int x=i.nextInt();*/
		int k=0,count=1;
		int l=k+1;
		while(l<c)
		{
			
			if(a[k]==a[l])
			{
				count++;
				l++;
				if(count>t)
				{
					System.out.println(a[k]);
					break;
				}
			}else 
			{
				count=1;
				k=l;
				l++;
				
			}
		}
		
		
		
		
		
	}
}