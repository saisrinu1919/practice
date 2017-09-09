import java.util.*;  
import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.Math.abs;
class Mean3
{
	double ysigmamean, xsigmamean;
	public double xmean=0,ymean=0;
	public double[] meanOfx(double x[],int n)
	{
		double[] array = new double[3];
		double mean=0,sigmamean=0;
		double sum=0;
		double sigma=0;
		for(int j=0;j<n;j++)
		{
			sum=sum+x[j];
			
			
		}
		mean=sum/n;
		for(int j=0;j<n;j++)
		{
			sigma=sigma+pow(x[j]-mean,2);
		}
		sigmamean=sigma/(n-1);
		array[0]=sum;
		array[1]=sigmamean;
		array[2]=mean;
		System.out.println("Xsum is :"+sum+" "+"X mean is :"+mean+" "+"xsigmamean" + sigmamean);
		return array;
	}
	void fainal(double[] xValue,double[] yValue,int n)
	{
		double diff=xValue[2]-yValue[2];
		System.out.println("diiference is"+diff);
		double s=xValue[1]/n;
		System.out.println("s is"+s);
		double y=yValue[1]/n;
		System.out.println("y is :"+y);
		double z=s+y;
		System.out.println("z is"+z);
		
		double srt=sqrt(abs(z));
		System.out.println("srt"+srt);
		double fnal=diff/srt;
		System.out.println(fnal);
	}
}
class MeanAndVariable2
{
	public static void main(String []args)
	{
		Mean3 m=new Mean3();
		
		
		System.out.println("enter array size ");
		Scanner keybord= new Scanner(System.in);
		int n=keybord.nextInt();
		System.out.println(n);
		double []x=new double[n];
		double []y=new double[n];
		System.out.println("enter x and y ayyay values");
		for(int i=0;i<x.length;i++)
		{
			x[i]=keybord.nextInt();
			y[i]=keybord.nextInt();
			System.out.println("x arry "+x[i]+"  "+"y array " +y[i]);
	   }

		double[] xValues = m.meanOfx(x,n);
		double[] yValues = m.meanOfx(y,n);
		m.fainal(xValues,yValues,n);
		//mn.xmean(int [],int );
	}
}