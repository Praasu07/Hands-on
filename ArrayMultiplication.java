package CoreJava;

import java.util.Scanner;

class ArrayMultiplication {

	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the number of rows:");
		a= sc.nextInt();
		System.out.println("Enter the column:");
		b= sc.nextInt();
		int arr[][]=new int[a][b];
		int crr[][]=new int[a][b];
		int aaa[][]=new int[a][b];
		System.out.println("Enter the elements of 1st matrix:");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				arr[i][j]=sc.nextInt();
				System.out.println();
				
			}
		}
			System.out.println("Enter the element of 2nd matrix");
			for(int i=0;i<a;i++)
			{
				for(int j=0;j<b;j++)
				{
					crr[i][j]=sc.nextInt();
					System.out.println();
				}
			}
			System.out.println("Multiplication of the two matrix:");
			for(int i=0;i<a;i++)
			{
				for(int j=0;j<b;j++)
				{
					aaa[i][j]=arr[i][j]* crr[i][j];
					
				}
			}
			for(int i=0;i<a;i++)
			{
				for(int j=0;j<b;j++)
				{
					System.out.print(aaa[i][j]+" ");
				}
				System.out.println();
				}
				
			}
	



	}


