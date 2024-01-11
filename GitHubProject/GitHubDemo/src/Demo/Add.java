package Demo;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {

		int a,b,sum;
		System.out.println("Enter two numbers");
		Scanner scan = new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		sum=a+b;
		System.out.println("The sum is "+sum);

		
	}

}
