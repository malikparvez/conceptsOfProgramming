package day1Java;
import java.util.Scanner;

public class SumOfPrimeNumbers {

	public static void main(String[] args) {
	int num;
	int sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter last number");
	num=sc.nextInt();
	
	for(int i=3;i<num;i++)
	{	
		boolean flag=false;
	
		for(int j =2;j<i;j++)
		{	
			if(i%j==0)
			{
			 flag=true;
			 break;
			}
		}
		if(flag==false) {
		System.out.println("prime Numbers are : " +i);
		sum=sum+i;
		}
		}
	System.out.println("Sum of prime numbers: "+sum);
	sc.close();
	}
}
