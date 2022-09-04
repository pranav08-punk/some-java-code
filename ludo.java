package accenture;
import java.lang.*;
import java.util.*;
public class ludo {
	public static void main(String args[])
	{
		int a,s,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter alex point");
		a=sc.nextInt();
		if(a<0 ||a>50)
		{
			System.out.println("Alex number is invalid");
			System.exit(1);
		}
		System.out.println("Enter sam point");
		s=sc.nextInt();
		if(s<0 ||s>50)
		{
			System.out.println("sam number is invalid");
			System.exit(1);
		}
		System.out.println("Enter nikhil point");
		n=sc.nextInt();
		if(n<0 ||n>50)
		{
			System.out.println("nikhil number is invalid");
			System.exit(1);
		}
		if(a>s && a>n)
		{
		 System.out.println("Alex score"+a+"number won the game");
		}
		else if(s>a && s>n)
		{
			System.out.println("Sam score"+s+"number won the game");	
		}
		else
		{
			System.out.println("Nikhil score"+n+" number won the game");
		}
	}
	

}

