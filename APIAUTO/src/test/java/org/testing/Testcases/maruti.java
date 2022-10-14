package org.testing.Testcases;

public class maruti extends car
{
	public void model ()
	{
		System.out.println("car mode is swift dezire");
	}
	public static void main(String[] args) 
	{
		maruti ob = new maruti();
		ob.model();
		ob.price();
	}

}
