package org.testing.Testcases;

public class polymorphy 
{
	public void arith(int a, int b)
	{
	int c;
	c=a+b;
	System.out.println("Sum Result is "+c);
	}
	public int arith(int x, int y, int z)
	{
	int r;
	r=x+y+z;
	System.out.println("Sum result is "+r);
	return r;
	}
	public static void main(String[] args) 
	{
		polymorphy ob = new polymorphy();
		ob.arith(12, 10);
		ob.arith(10, 12, 5);
		
	}
}
