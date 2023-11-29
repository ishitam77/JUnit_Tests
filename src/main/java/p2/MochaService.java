package p2;

public class MochaService {	
	
	MathUtil mathUtil=new MathUtil();
	
	public int compute(int num) {
		if(num<0) {
		  throw new RuntimeException("Hey! num cannnot be negative");	
		}
	 	int rand=mathUtil.findRandNum(); // this should be random num
	    rand=rand+9+(num*num);
	    return rand;
	}

}
