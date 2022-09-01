package accenture;
import java.lang.*;
import java.util.*;
public class sum {
	public static void main(String args[])
	{
		int num;
		int sums=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		int i=num;
		while(i<num+10)
		{
			sums=sums+i;
			i++;
		}
		System.out.println("Total number of sum is:"+sums);
	}
	

}
