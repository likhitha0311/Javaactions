package Practice;

public abstract class AbstractClass
{
static int a;
final static int d=56;
int b;
final int c=89;


abstract void display();
public static void s_method()
{
System.out.println("This is static method of abstract class");	
}

public final void nonstatic()
{
	System.out.println("This is non static method of abstract class");	
}

}
