package accenture;
import java.lang.*;
import java.util.*;
public class clgadmin {
	public static void main(String args[])
	{
	String name;
	char gender;
	int marks_hsc,marks_sslc,Tmark_hsc,Tmark_sslc;
	float mark_engg;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name:");
	name=sc.nextLine();
	System.out.println("Marks obtained in HSC");
	marks_hsc=sc.nextInt();
	System.out.println("Total possible marks in HSC");
	Tmark_hsc=sc.nextInt();
	System.out.println("Engineering cutoff mark");
	mark_engg=sc.nextFloat();
	System.out.println("Marks obtained in SSLC");
	marks_sslc=sc.nextInt();
	System.out.println("Total possible marks in SSLC");
	Tmark_sslc=sc.nextInt();
	System.out.println("Gender");
	gender=sc.next().charAt(0);
    System.out.println("Your Application has been Submitted Successfully");
	System.out.println("Your name is:"+name);
	System.out.println("Marks in hsc:"+marks_hsc);
	System.out.println("Total marks in hsc:"+Tmark_hsc);
	System.out.println("Total marks in Engineering:"+mark_engg);
	System.out.println("Marks in sscl:"+marks_sslc);
	System.out.println("Total marks in sslc:"+Tmark_sslc);
	System.out.println("Gender is :"+gender);
	System.out.println("All the Best......");
	}

}
