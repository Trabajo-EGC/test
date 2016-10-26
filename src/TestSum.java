import static org.junit.Assert.*;

import org.junit.Test;

public class TestSum {
	
	@Test
	public void testSum2Num(){
		assertEquals(6,sum(4,2));
	}
	private int sum(int a,int b){
		return a+b;
	}

}
