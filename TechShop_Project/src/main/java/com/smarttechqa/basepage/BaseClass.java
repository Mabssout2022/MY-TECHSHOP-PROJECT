package com.smarttechqa.basepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	
	static WebDriver driver ;
	
	
	public static void main(String[] args) {
		BaseClass.setUp();
	}
	
	public static void setUp() {
		
	;
		
		
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver"); //this System.setProparty is a class from java 
		//inside we have our 
		
        driver = new ChromeDriver();
		
		driver.get("https://www.smarttechqa.com/login");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("mabssoutpraticeemail@gmail.com");//1.we can use the xpath 
		//if we want instead of id or class or any other element.
		//we comment it becauseit is the same think
		//2.driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mabssoutpraticeemail@gmail.com");
		//.driver.findElement(By.id("password")).sendKeys("mypassword");
		driver.findElement(By.cssSelector("#password")).sendKeys("mypassword");//this is how to find the elemen
		//instead of spath 
		//the 32 and 33 are the same 
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		System.out.println(driver.getTitle());
		
	// 	driver.quit(); // this to quit the browser after automation and come back to the eclipse.
		
		driver.findElement(By.xpath("//a[@href='/cart']")).click();
		//driver.findElement(By.linkText("Go Back")).click(); //this will take me back to the home page from the cart page
		driver.findElement(By.partialLinkText("Go")).click();
		driver.findElement(By.name("q")).sendKeys("iphone"); //Sends keys to the searchbox
		//driver.findElement(By.cssSelector(".p-2 btn btn-outline-success")).click();
		driver.findElement(By.xpath("//*[text()='Search']")).click();
		driver.navigate().back(); //This takes to the previous page.
		driver.navigate().refresh();
		
		
		
		
		
	//we use github to control the version , that just mean we save our project in the github centtral
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
