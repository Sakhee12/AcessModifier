package accessModifier;

public class DefaultE 
{
	public static void main(String[] args) 
	{
		DefaultC c1 = new DefaultC();
		c1.test();
		DefaultC.test();
		System.out.println(c1.a);
	}
}
