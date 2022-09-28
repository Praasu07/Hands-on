package CoreJava;
import java.util.Scanner;

 class AssignmentOperator {
	 
	 public static void main(String args[])
	 {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter The First Value:");
		 int num1= sc.nextInt();
		 System.out.println("Enter The Second Value:");
		 int num2= sc.nextInt();
		 
		 //Adding an Assign Value
		 num1 += num2;
		 System.out.println("num1=" +num1);
		 
		 //Subtracting an assigning value
		 num2 -= num1;
		 System.out.println("num2=" +num2);
		 
		 //Multiplying and assigning the value
		 num1 *= num2;
		 System.out.println("num1=" +num1);
		 
		 //Dividing and assigning the value
		 num1 /= num2;
		 System.out.println("num1=" +num1);
		 
		 //Modular and assigning the value
		 num1 %= num2;
		 System.out.println("num1=" +num1);
	 }

}
