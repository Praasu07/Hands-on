package CoreJava;

class Array {
	public static void main(String args[])
	{
		//Declaring and instantiating the array
		int a[] = new int[3];
		//initialization
		a[0]=12;
		a[1]=13;
		a[2]=15;
		//traversing the array
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
