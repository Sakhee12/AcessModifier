package accessModifier;

public class DefaultC 
{
	int a = 10;
	DefaultC()
	{
		
	}
	
	static void test()
	{
		System.out.println("From default test() of C");
	}
	
	public static void main(String[] args) 
	{
		DefaultC c1 = new DefaultC();
		test();
		System.out.println(c1.a);
	}
}
