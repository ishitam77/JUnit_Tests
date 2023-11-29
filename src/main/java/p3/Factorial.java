package p3;

public class Factorial {
	
	public int fact(int n) {
		
		if(n<0) {
			throw new ArithmeticException("Input Should Not be Zero!!");
		}
		
		int f=1;
		
		for(int i=2;i<=n;i++) {
			f*=i;
		}
		return f;
		
	}

}
