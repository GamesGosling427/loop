package loop;
import java.util.Scanner;
public class Primenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int i=1;
		int count=0;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				count++;
			}
			i++;
		
		}
		if(count==1)
		{
			System.out.println("prime number ");	
		}
		else {
			System.out.println("not prime number");
		}
	}
	

}
