package challenge1;

import java.util.Scanner;

class Main{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		while(number != 42) {
			System.out.println(number);
			number = sc.nextInt();
		}
		sc.close();
	}
}