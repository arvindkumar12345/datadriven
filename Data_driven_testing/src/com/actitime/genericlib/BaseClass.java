package com.actitime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public abstract class BaseClass {
	public static WebDriver driver;
	@BeforeSuite
	public void configBs() {
		System.out.println("Connect to Db");
	}
	@BeforeClass
	public void configBC() {
		System.out.println("Launch the browser");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
	}
	@BeforeMethod
	public void configBm() {
		System.out.println("login");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}
	@AfterMethod
	public void configAm() {
		System.out.println("logout");
		driver.findElement(By.linkText("Logout")).click();
		}
	@AfterClass
	public void configAc() {
		System.out.println("---------close the browser---------");
		driver.close();
	}
	@AfterSuite
	public void configAS() {
		System.out.println("disconnect to db");
	}
	}


