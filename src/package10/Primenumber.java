package package10;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.print("Enter a number ");
		Scanner a =new Scanner(System.in);
		int X;
		X = a.nextInt();
		
		if(X==1)
		{
			System.out.print(X + " is not a Prime number");
		}
		
		
		{
			for(int j=2;j<=X;j++)
			{
				
				
				if (j==X)
					{
					System.out.print(X+" is a Prime Number ");
					break;
					}
			
				if (X%j==0)
					{
					System.out.print(X + " is not a Prime number");
			
					break;
					}
			}
				
		}
		
		
		
	}
	
}
