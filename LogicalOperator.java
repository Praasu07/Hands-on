package CoreJava;
import java.util.Scanner;
class LogicalOperator {
	
	public static void main(String args[])
	{
		//creating scanner class to take input from user
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the first number...");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number...");
		int num2= sc.nextInt();
		System.out.println("Enter the third number...");
		int num3= sc.nextInt();
		
		System.out.println("Performing AND operator");
		//using logical AND to verify two constraints
		if
		((num1<num2) && (num2==num3))
		{
			int sum= num1+num2+num3;
			System.out.println("The Sum is:-" +sum);
		}
			else {
				System.out.println("False condition");
			}
		
		System.out.println("Performing OR operator");
		//using logical OR to verify two constraints
				if
				((num1<num2) || (num2==num3))
				{
					int sum= num1+num2+num3;
					System.out.println("The Sum is:-" +sum);
				}
					else {
						System.out.println("False condition");
					}
				
				System.out.println("Performing NOT operator");
		//Performing NOT operator
				System.out.println("!(num1<num2)=" +!(num1<num2));
				System.out.println("!(num2>num3)=" +!(num2>num3));
			}
		}
		
	


