package firstAPP;

import java.util.Scanner;

public class JAVA {
public static void main(String[] args) {
	
	
	
	
//	System.out.println("welcome to the java");
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("PRINT A:");
	int a=sc.nextInt();
	
	System.out.println("print b:");
	int b=sc.nextInt();
	
	//int a=20,b=5;
	
	
	System.out.println("addition is"+(a+b));
	System.out.println("substraction is"+(a-b));
	System.out.println("multiplication is"+(a*b));
	System.out.println("division is"+(float)(a/b));
}
}
