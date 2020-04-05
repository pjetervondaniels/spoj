package challenge3;

import java.util.Scanner;

class Main{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String b = sc.nextLine();
		
		int count=0;
		int j=0;
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==b.charAt(j)) {
				count=count+1;
				j= j+1;
				if(count==b.length()) {
					break;
				}
			}else{
				if(a.charAt(i) != b.charAt(j)) {
					count=0;
					j=0;
				}
			}
		}
		
		if(count == b.length()) {
			System.out.println("1");
		}
		if(count != b.length()) {
			System.out.println("0");
		}
		
		sc.close();
	}
}
