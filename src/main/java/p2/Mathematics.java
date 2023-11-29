package p2;

public class Mathematics {
	
	MathService ms=new MathService();
	
	public int logicTwo(int x,int y) {
		
		if(x==4 || y==4) {
			if(x>y) {
				throw new RuntimeException("X must be smaller than y!!");
			}
			int m=ms.logicOne(x, y);
			return m+10;
		}
		return x+y;	
	}
}
