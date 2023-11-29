package p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

public class FactorialTest implements TestCaseConstant {
	
	Factorial ff;
	
	@Before
	public void init() {
		System.out.println("Test Case Started Executing..........");
		ff=new Factorial();
	}
	
	@Test
	public void testWhenInputIsZero() {
		int res=ff.fact(Zero);
		assertEquals(1,res);
	}
	
	@Test
	public void testWhenInputIsOne() {
		int res=ff.fact(One);
		assertEquals(1,res);
	}
	
	@Test
	public void testWhenInputIsFive() {
		int res=ff.fact(Five);
		assertEquals(120,res);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testWhenInputIsNegative() {
		int res=ff.fact(Nve);
	}
	
	@Test
	public void testWhenInputIsTaken() {
		System.out.println("Enter the Number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //Input:7
		System.out.print("Scanner Input : "+n);
		int res=ff.fact(n);
		System.out.println("\nCalculated Factorial: "+res);
		assertEquals(5040,res);
		sc.close();
	}
	
	@After
	public void doAfter() {
		System.out.println("Test Case Completed Executing..........");
	}

}
