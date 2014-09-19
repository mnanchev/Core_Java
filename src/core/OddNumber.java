package core;

import java.util.Scanner;

public class OddNumber {
	static boolean c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int n = sc.nextInt();
		System.out.println("The number is odd: " + isOdd(n));
		System.out.println("The number is: "+isPrime(n));
		sc.close();

	}

	public static boolean isOdd(int n) {
		if (n % 2 == 0) {
			return false;
		} else
			return true;
	}

	public static boolean isPrime(int n) {
		int b = 2;
		while (b < Math.sqrt(n) || b == 1 || b == 2) {
			if (n % b == 0 && n != 2 && n != 1) {
				c = false;
				break;
			} else if (n == 1) {
				c = false;
				break;
			} else if (n == 2) {
				c = true;
				break;
			} else {
				c = true;
			}
			b++;
		}
		return c;
	}

}
