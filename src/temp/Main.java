package temp;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class Main {
	public String triangle(int a,int b,int c)
	{
		if(a==b&&b==c)
			return "equilateral";
		else if(a==b||b==c||c==a)
			return "isosceles";
		else {
			return "scalene";
		}
	}
	@Before
	public void setup()
	{
		System.out.println("This is before test");
	}
	@Test
	public void testtriangle()
	{
		//assertEquals("equilateral",triangle(3,3,3));
		//assertEquals("isosceles",triangle(2,3,3));
		//assertEquals("isosceles",triangle(3,1,3));
		assertEquals("isosceles",triangle(3,3,5));
		//assertEquals("scalene",triangle(3,4,5));
		//assertEquals("scalene",triangle(3,7,6));
	}
	@After
	public void After()
	{
		System.out.println("This is after test");
	}
	
}
