package py.com.personal.javautil;


import py.com.personal.javatest.util.StringUtil;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class StringUtilTest {

	
	@Test
	public void testRepeat() {
		Assert.assertEquals("holaholahola",StringUtil.repeat("hola",3));
		
		Assert.assertEquals("hola",StringUtil.repeat("hola", 1));
	}
}
