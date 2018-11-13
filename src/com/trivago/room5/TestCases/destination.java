package com.trivago.room5.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.trivago.room5.Destination.navigDestinations;

public class destination {

	@Test
	public void go2Destinations() throws Throwable
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Hassan\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://room5.trivago.com/");
		
		navigDestinations nd = new navigDestinations(driver);
		nd.selectDestination();
		
		Thread.sleep(4000);
		driver.quit();
	}
}
