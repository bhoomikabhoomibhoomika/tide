package com.mindtree.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class Tide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tide.com/en-us");
		
		driver.findElement(By.xpath("//*[@class=\"expandable-content-header\"]")).click();
		
		driver.findElement(By.xpath("//*[@class=\"header-logo d-flex\"]")).click();
		driver.findElement(By.xpath("//a[@href='en-us/contact-us']")).click();
	}
}
		

		
		
		
		
		
		
