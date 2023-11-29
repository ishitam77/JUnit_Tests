package p2;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.Silent.class)
public class TestMathematics {
	
	@Mock
	private MathService m1; //creates a mock object of MathService class
	
	@InjectMocks
	private Mathematics m2=new Mathematics(); // create real object of Mathematics class and inject MathService class
	
	@BeforeClass
    public static void onceExecutedBeforeAll() {
        System.out.println("@BeforeClass: onceExecutedBeforeAll"); 
    }
	
	@Before
	public void anything(){		
		System.out.println("Test Case Begins Execution......");
		//Every time  -> before every test cases
		//it will create new instance of MochaService
		 MockitoAnnotations.openMocks(this);
		//MockitoAnnotations.initMocks(this);
		 }
	
	
	@Test
	public void testWhenInputIs4And10() {
		when(m1.logicOne(4,10)).thenReturn(120);//res=x*(y+20)=4*(10+20)=120
		int res=m2.logicTwo(4,10); // m1+10 =120+10=130
		assertEquals(130,res); 
		verify(m1,times(1)).logicOne(4,10); //logicOne() called Once
		verifyNoMoreInteractions(m1);
	}
	
	@Test
	public void testWhenInputIs3And4() {
		when(m1.logicOne(3,4)).thenReturn(72);//res=x*(y+20)=3*(4+20)=72
		int res=m2.logicTwo(3,4); // 72+10=82
		assertEquals(82,res);
		verify(m1,times(1)).logicOne(3,4); //logicOne() not called
	}
	
	@Test
	public void testWhenInputIs5And10() {
		when(m1.logicOne(5,10)).thenReturn(150);//res=x*(y+20)=5*(10+20)=150
		int res=m2.logicTwo(5,10); // 5+10
		assertEquals(15,res);
		verify(m1,times(0)).logicOne(5,10); //logicOne() not called
	}
	
	@Test(expected=RuntimeException.class)
	public void testWhenInputIs10And4() {
		when(m1.logicOne(10,4)).thenReturn(240);//res=x*(y+20)=10*(4+20)=240
		int res=m2.logicTwo(10,4); // m1+10 =240+10=250
	}
	
	@After
	public void doSomething() {
		System.out.println("Test Case Completed Execution......");
		
	}
	

}
