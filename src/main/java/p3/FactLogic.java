package p3;

public class FactLogic {
	
	Factorial ff=new Factorial();
	
public int Logic(int num) {
	
	if(num>7) {
		throw new RuntimeException("Num must be smaller than 8!!");
	}
	
	if(num <5) {
		if(num<0) {
			 throw new ArithmeticException("Num must be greater than or equal to 0!!");
		}
		int m=ff.fact(num);
		return m+10;
	}
		return num+5;
	

	}
}
