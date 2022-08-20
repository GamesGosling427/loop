package loop;

import java.util.Scanner;

public class Countnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
        System.out.println("total digit is:"+count);
	}

}
