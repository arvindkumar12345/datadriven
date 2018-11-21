package com.actitime.genericlib;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(SampleListener.class)

public class CC extends BaseClass {
@Test
public void cctest() {
	System.out.println("----------start-------------");
	Assert.assertEquals("A", "B");
	System.out.println("------------end-------------");
}
}
