package firstAPP;

import java.util.Scanner;

public class iif_else {
public static void main(String[] args) {
	
	int rollno,s1,s2,s3,total;
	String name;
	double per;
	
	Scanner sc =new Scanner(System.in);
	
	System.out.println("ROLL NO IS:  ");
	rollno = sc.nextInt();
	
	System.out.println("NAME  :  ");
	name = sc.next();
	
	System.out.println("MATHS MARKS  :  ");
	s1 = sc.nextInt();
	
	System.out.println("ENGLISH MARKS  :  ");
	s2 = sc.nextInt();
	
	System.out.println("SCIENCE MARKS  :  ");
	s3 = sc.nextInt();
	total=s1+s2+s3;
	per=(double)total/3;
	
	System.out.println("-------details-----");
	
	System.out.println("rollno " +rollno);
	System.out.println("name  " +name);
	System.out.println("total  " +total);
	System.out.println("per  " +per);
	
	if(per>=80)
	{
		System.out.println("distriction");
	}
	else if((per>=70)&&(per<=80))
			{
		System.out.println("first class");
			}
	else if((per>=60)&&(per<=70))
	{
		System.out.println("second class");
	}
	else if((per>=50)&&(per<+60))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail..!!");
	}
}

}
