public class SwappingTwoNumbers
{  
	public static void main(String args[])
	{  
		int a = 25;
                int b = 39;
		System.out.println("Before swapping: a = "+ a + " b = " + b );
		a = a + b;
		b = a-b;
		a = a-b;
		System.out.println("After  swapping: a = "+ a + " b = " + b );
   	}  
}