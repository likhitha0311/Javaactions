package Practice;

public class MainClass {

	public static void main(String[] args)
	
	{
		ImplementationClass i1= new ImplementationClass();
		
		InterfaceImplemnetaion i2 = new InterfaceImplemnetaion();
		
		i1.display();
		//System.out.println(a);
		System.out.println(i1.b);
		System.out.println(i1.c);
		System.out.println(AbstractClass.a);
		System.out.println(AbstractClass.d);
		AbstractClass.s_method();
		i1.nonstatic();
		
		Interface1.display1();;
		InterfaceImplemnetaion.display1();
		
		

	}

}
