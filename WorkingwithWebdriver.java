package com.webserver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithWebdriver {

	public static void main(String[] args) throws InterruptedException {
		
		String path="C:\\Users\\Danda\\Desktop\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.navigate().to("https://www.gmail.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.quit();

	}

}
