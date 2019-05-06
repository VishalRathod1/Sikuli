package com.sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



public class MercuryTS_Demo {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(10000);
		
		Pattern username=new Pattern("E:\\Selenium\\sikuli\\MercuryTS_Demo\\username.PNG");
		Pattern password=new Pattern("E:\\Selenium\\sikuli\\MercuryTS_Demo\\password.PNG");
		Pattern signin=new Pattern("E:\\Selenium\\sikuli\\MercuryTS_Demo\\signin.PNG");
		Pattern signoff=new Pattern("E:\\Selenium\\sikuli\\MercuryTS_Demo\\signOff.PNG");
		Pattern backward=new Pattern("E:\\Selenium\\sikuli\\MercuryTS_Demo\\backward.PNG");
		
		Screen sc=new Screen();
		sc.type(username,"Suvidyap1");
		Thread.sleep(5000);
		sc.type(password,"P@ssword1");
		Thread.sleep(5000);
		sc.click(signin);
		Thread.sleep(60000);
		sc.click(signoff);
		Thread.sleep(10000);
		sc.click(backward);

	}

}
