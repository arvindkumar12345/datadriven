package com.actitime.genericlib;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass{
	@Test
	public void verifyHomepageTest() {
		String expdata="actiTIME - Enter Time-Track";
		String actdata=driver.getTitle();
		Assert.assertEquals(actdata, expdata);
	}
    @Test
    public void verifylogoimageinhomepagetest() {
    	boolean imgstatus=driver.findElement(By.xpath("//td[@class='logoCell']/div/div[3]/img")).isDisplayed();
    	Assert.assertTrue(imgstatus);
    }
}
