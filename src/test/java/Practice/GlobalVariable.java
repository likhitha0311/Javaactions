package Practice;

public class GlobalVariable {
	
	static int a;
	static int m=80;

	public GlobalVariable()
	{
	}

	public static void display()
	{
		int a=10;
		int b=10;
		System.out.println("a value inside display()"+a);
	}
	
	public void method2()
	{   int g =999;
		System.out.println("g value is "+g);
	}
	
	public static void main(String[] args) 
	{
	 
		int m=9;
		while(m>0)
		{
			m=m-1;
			System.out.println("Iteration is "+m);
		}
		
		System.out.println("m value is " + m);
	 
	
	}

}
