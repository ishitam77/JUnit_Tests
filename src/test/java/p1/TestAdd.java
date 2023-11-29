package p1;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestAdd {

	/*
	int addition(int a ,int b) {
		return a+b;
	}
	*/
	
	Add a1;
	
	@Before //do it before starting of every test-case
	public void init() {
	System.out.println("Test Case is Going to Started......");	
	//Add a1=new Add();  it is local
	a1=new Add(); //a1 is not local after defining outside
	}
	
	@Test
	public void testAdditionWhenInputIs2And4(){
		
		//Add a1=new Add();
		int res=a1.addition(2,4);
		assertEquals(6,res);
	}
	
	@Test
	public void testAdditionWhenInputAreNegative(){
		
		//Add a1=new Add();
		int res=a1.addition(-2,-4);
		assertEquals(-6,res);
	}
	
	@Test
	public void testAdditionWhenInputAreNegativeAndPositive(){
		
		//Add a1=new Add();
		int res=a1.addition(-2,4);
		assertEquals(2,res);
	}
	
	@After
	public void doAfter() {
		System.out.println("Test Case Execution Completed.......");
	}
	
}
