package variables;

import java.util.Scanner;

public class variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello risper");
		int a;
		int weight;
		String s ;
		Scanner in = new Scanner (System.in);
		Scanner sc = new Scanner (System.in);
		System.out.println("enter your age");
		
		a=in.nextInt();
		System.out.println("Your age is:"+a);
		System.out.println("enter your weight");
		weight=in.nextInt();
		
		System.out.println("enter your name");
		
		s=sc.nextLine();
		System.out.println("your name is:"+s);
		
		// decision making in java
		
		if (a> 18) {
			System.out.println("you are elligible to vote");
		}else {
			System.out.println("you are a minor you cannot vote");
		}
		if (weight <50) {
			System.out.println("you cannot donate blood");
		}else {
			System.out.println("you can donate blood");
		}

	}

}
