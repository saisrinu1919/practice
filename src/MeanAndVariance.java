import java.util.*;  
import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.Math.abs;
class Mean
{
	double ysigmamean, xsigmamean;
	public double xmean=0,ymean=0;
	void meanOfx(int x[],int n)
	{
		int xsum=0;
		double xsigma=0;
		for(int j=0;j<n;j++)
		{
			xsum=xsum+x[j];
			
			
		}
		xmean=xsum/n;
		for(int j=0;j<n;j++)
		{
			xsigma=xsigma+pow(x[j]-xmean,2);
		}
		xsigmamean=xsigma/(n-1);
		System.out.println("Xsum is :"+xsum+" "+"X mean is :"+xmean+" "+"xsigmamean" + xsigmamean);
	}
	void meanOfy(int y[],int n)
	{
			int ysum=0;
			double ysigma=0;
			for(int j=0;j<n;j++)
			{
				ysum=ysum+y[j];
				
			}
			ymean=ysum/n;
			for(int j=0;j<n;j++)
			{
				ysigma=ysigma+pow(y[j]-ymean,2);
			}
			double ysigmamean=ysigma/(n-1);
			System.out.printf("Y array sum is :"+ysum+" "+"Y array mean is :"+ymean+" "+"y sigmamean" + ysigmamean);	
	}
	void fainal(int n)
	{
		double diff=xmean-ymean;
		System.out.println("diiference is"+diff);
		double s=xsigmamean/n;
		System.out.println("s is"+s);
		double y=ysigmamean/n;
		System.out.println("y is :"+y);
		double z=s+y;
		System.out.println("z is"+z);
		
		double srt=sqrt(abs(z));
		System.out.println("srt"+srt);
		double fnal=diff/srt;
		System.out.println(fnal);
	}
}
class MeanAndVariance
{
	public static void main(String []args)
	{
		Mean m=new Mean();
		
		
		System.out.println("enter array size ");
		Scanner keybord= new Scanner(System.in);
		int n=keybord.nextInt();
		System.out.println(n);
		int []x=new int[n];
		int []y=new int[n];
		System.out.println("enter x and y ayyay values");
		for(int i=0;i<x.length;i++)
		{
			x[i]=keybord.nextInt();
			y[i]=keybord.nextInt();
			System.out.println("x arry "+x[i]+"  "+"y array " +y[i]);
	   }

		m.meanOfx(x,n);
		m.meanOfy(y,n);
		m.fainal(n);
		//mn.xmean(int [],int );
	}
}