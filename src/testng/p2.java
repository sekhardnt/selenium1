package testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

public class p2 extends p1{
	@BeforeClass
	public void sub()
	{
		int a=10,b=20;
		  int c = a-b;
		  System.out.println(c);
	}

}
