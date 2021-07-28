package fa.training.assignment1;

import java.util.Scanner;

public class LogicalExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a!=b)
			System.out.println(a+" != "+b);
		else System.out.println(a+" == "+b);
		
		if(a<b)
			System.out.println(a+" < "+b);
		else System.out.println(a+" > "+b);
		
		if(a<=b)
			System.out.println(a+" <= "+b);
		else System.out.println(a+" > "+b);
			
	}

}
