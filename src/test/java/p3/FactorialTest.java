package p3;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import java.util.Scanner;

@RunWith(MockitoJUnitRunner.Silent.class)
public class FactorialTest implements TestCaseConstant {
	
	
	@Mock
	private Factorial ff; //creates a mock object of Factorial 
	
	@InjectMocks
	private FactLogic lf=new FactLogic(); //creates a real object of FactLogic and Inject the mock object of Factorial 
	
	@BeforeClass
    public static void onceExecutedBeforeAll() {
        System.out.println("@BeforeClass: onceExecutedBeforeAll");  //execute only once 
    }
	
	@Before
	public void anything(){		
		System.out.println("Test Case Begins Execution......"); //executes before every test cases
		 MockitoAnnotations.openMocks(this);
		 }
	
	@Test
	public void testWhenInputIs4() {
		when(ff.fact(4)).thenReturn(24);//4!=24
		int res=lf.Logic(4); 
		assertEquals(34,res); // 24+10=34
		verify(ff,times(1)).fact(4); //fact() called Once
		verifyNoMoreInteractions(ff);
	}
	
	@Test
	public void testWhenInputIs7() {
		when(ff.fact(7)).thenReturn(5040);//7!=5040
		int res=lf.Logic(7); 
		assertEquals(12,res); // 7+5=12
		verify(ff,times(0)).fact(4); //fact() not called 
		verifyNoMoreInteractions(ff);
	}
	
	
	@Test
	public void testWhenInputIs0() {
		when(ff.fact(Zero)).thenReturn(1);//0!=1
		int res=lf.Logic(Zero); 
		assertEquals(11,res); // 1+10=11
		verify(ff,times(1)).fact(Zero); //fact() called Once
		verifyNoMoreInteractions(ff);
	}
	
	@Test
	public void testWhenInputIs1() {
		when(ff.fact(One)).thenReturn(1);//0!=1
		int res=lf.Logic(One); 
		assertEquals(11,res); // 1+10=11
		verify(ff,times(1)).fact(One); //fact() called Once
		verifyNoMoreInteractions(ff);
	}
	
	@Test(expected=RuntimeException.class)
	public void testWhenInputIs8() {
		when(ff.fact(8)).thenReturn(40320);//8!=40320
		int res=lf.Logic(8);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testWhenInputIsNegative() {
	    int res = lf.Logic(Nve);
	}
		
	
	@Test
	public void testWhenInputIsTaken() {
		System.out.print("Enter the Number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //Input:6
		when(ff.fact(n)).thenReturn(720);//6!=720
		int res=lf.Logic(n); 
		assertEquals(11,res); // 6+5=11
		verify(ff,times(0)).fact(6); //fact() not called 
		verifyNoMoreInteractions(ff);
		sc.close();
	}
	
	@After
	public void doAfter() {
		System.out.println("Test Case Completed Executing..........");
	}

}
