package challenge2;

import java.util.Scanner;

class Main{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int numberCases = sc.nextInt();
		int i =0;
		do {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			for(int j=n1+1;j<n2;j++) {
				int count=0;
				for(int k=1;k<j;k++) {
					if(j%k==0) {
						count++;
					}
				}
				if(count<2) {
					System.out.println(j);
				}
			}
			i++;
		}while(numberCases>i);
		sc.close();
	}
}