package com.google.search.Google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunGoogleSearch {

	WebDriver driver;
	
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunsinghchauhan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("chrome is launched and maximize");
	}
	
	public void enterUrl()
	{
		driver.get("https://google.com");
		System.out.println("Respective URL Google Search is launched");
		
		
	}
	
	/*
	 * public void EnterTextToSearch() throws InterruptedException {
	 * 
	 * driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
	 * driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobile");
	 * System.out.println("User type text to Google Search text");
	 * 
	 * }
	 */
	
}
