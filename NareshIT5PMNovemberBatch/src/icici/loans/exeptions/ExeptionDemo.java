package icici.loans.exeptions;

import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExeptionDemo 
{

	public static void main(String[] args) 
	{
		int nr,dr,result;
		Scanner sc= new Scanner(System.in);
		
		while(true) 
		{
			System.out.println("Enter the nr value : " );
			nr = sc.nextInt();
			System.out.println("Enter the Dr value : ");
			dr = sc.nextInt();
			try 
			{
				result = nr / dr;
				System.out.println(result);
				break;
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			} 
			finally 
			{
				System.out.println("iam final...");
			}
		}
	}

}
