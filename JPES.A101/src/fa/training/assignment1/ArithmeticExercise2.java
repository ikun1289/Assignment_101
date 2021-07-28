package fa.training.assignment1;

import java.util.Scanner;

public class ArithmeticExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt();
		System.out.println(x + " + " + y + " = " + (x+y));
		System.out.println(x + " - " + y + " = " + (x-y));
		System.out.println(x + " x " + y + " = " + (x*y));
		System.out.println(x + " / " + y + " = " + (x/y));
		System.out.println(x + " % " + y + " = " + (x%y));
	}

}
