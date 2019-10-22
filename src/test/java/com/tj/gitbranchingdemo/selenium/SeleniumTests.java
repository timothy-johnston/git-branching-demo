package com.tj.gitbranchingdemo.selenium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.tj.gitbranchingdemo.config.SeleniumConfig;

public class SeleniumTests {
	
	@Test
	public void getHeaderFromHomePage() {
		
		SeleniumConfig config = new SeleniumConfig();
		WebDriver driver = config.getDriver();
		
		driver.get("http://localhost:8080/home");
		
		String expectedHeader = "Hello World";
		String actualHeader = driver.findElement(By.id("header")).getText();
		
		assertEquals("Test failed: Incorrect header.", expectedHeader, actualHeader);
		
	}

}
