package com.actitime.genericlib;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class CreateCustomer {
	
   public static void main(String args[]) throws Throwable {
	   WebDriver driver = new FirefoxDriver();
	   driver.get("https://gmail.com");
	   EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
	   File srcfile =edriver.getScreenshotAs(OutputType.FILE);
	   File destinationfile = new File("./screenshot/test.png");
	   FileUtils.copyFile(srcfile, destinationfile);
	
}
}
