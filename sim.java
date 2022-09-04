package accenture;
import java.lang.*;
import java.util.*;
public class sim {
	public static void main(String args[])
	{
		long num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextLong();
		int odd=0,even=0;
		long temp=num,rem=0;
		while(temp>0)
		{
			rem=temp%10;
			if(rem%2==0)
			{
				even=(int) (even+rem);  //casting of element..
			}
			else
			{
				odd+=rem;
			}
			temp/=10;
		}
		if(odd>even)
		{
			System.out.println("Sum of odd is greater than even"+odd);
		}
		else
		{
			System.out.println("Sum of even is greater than even"+even);
		}
	}

}

