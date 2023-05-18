package testng;

import org.testng.annotations.*;

public class p4 extends p3 {
@AfterClass
public void div()
{
	int a=10,b=20;
	  int c = b/a;
	  System.out.println(c);
}
}
