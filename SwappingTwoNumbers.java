class SwappingTwoNumbers
{  
	public static void main(String args[])
	{  
		int a = 25;
                int b = 39;
		
		a = a + b;
		b = a-b;
		a = a-b;
		System.out.println("After swapping: a = "+ a + " b = " + b );
   	}  
}