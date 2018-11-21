package com.actitime.genericlib;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class SampleTest {
@Test
public void testScripts_1() {
	System.out.println("step1");
	System.out.println("step2");
	SoftAssert s = new SoftAssert();
	s.assertEquals("A", "B");
	System.out.println("step3");
	System.out.println("step4");
	s.assertAll();//to collect the failed execution
}
@Test
public void testscript_2() {
	System.out.println("-------------");
	System.out.println("step1");
	System.out.println("step2");
	System.out.println("step3");
	Assert.assertEquals("x", "x");
	System.out.println("step4");
}
}
