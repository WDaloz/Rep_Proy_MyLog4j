package com.test;

import org.junit.BeforeClass;
import org.junit.Test;

import static com.daloz.Proy_MyLog4j.util.Log4jU.*;


public class MyTest
{
	
	@BeforeClass
	public static void setUpClass()
	{
		setLogger(MyTest.class);
	}
	
	@Test
	public void test()
	{
		logger.info("Holi Boli");
	}
}
