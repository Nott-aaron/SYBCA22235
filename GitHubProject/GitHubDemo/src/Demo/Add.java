package Demo;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {

		int x,y,sum;
		System.out.println("Enter two numbers");
		Scanner scan = new Scanner(System.in);
		x=scan.nextInt();
		y=scan.nextInt();
		sum=x+y;
		System.out.println("The sum is "+sum);

		
	}

}
