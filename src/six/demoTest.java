package six;

import static org.junit.Assert.*;

import org.junit.Test;

public class demoTest {
	demo A=new demo();
	@Test
	public  void testgetName()
	{
		A.setName("laidoudou");
		assertEquals("laidoudou",A.getName());
			
	}
	@Test
	public  void testgetFriend()
	{
		A.setFriend("pengyuyan");
		assertEquals("pengyuyan",A.getFriend());
	}

}
