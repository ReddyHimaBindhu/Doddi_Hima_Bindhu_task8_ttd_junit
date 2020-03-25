package ttd_junit;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class democlass_test {
	junit_democlass obj=new junit_democlass();
	@SuppressWarnings("static-access")
	@Test
	public void test() {
		assertEquals(obj.To_Remove_A("ABCD"),"BCD");
		assertEquals(obj.To_Remove_A("AACD"),"CD");
		assertEquals(obj.To_Remove_A("BACD"),"BCD");
		assertEquals(obj.To_Remove_A("BBAA"),"BBAA");
	    assertEquals(obj.To_Remove_A("AABAA"),"BAA");
	}

}
