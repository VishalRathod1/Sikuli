package com.sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FacebookDemo {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(10000);

		Pattern forgottenAccount = new Pattern("E:\\Selenium\\sikuli\\Fb_Demo\\ForgottenAccount.PNG");
		Pattern backward = new Pattern("E:\\Selenium\\sikuli\\Fb_Demo\\Backward.PNG");
		Pattern email = new Pattern("E:\\Selenium\\sikuli\\Fb_Demo\\Emailid.PNG");
		Pattern password = new Pattern("E:\\Selenium\\sikuli\\Fb_Demo\\Password.PNG");
		Pattern login = new Pattern("E:\\Selenium\\sikuli\\Fb_Demo\\Login.PNG");

		Screen sc = new Screen();
		sc.click(forgottenAccount);
		Thread.sleep(20000);
		sc.click(backward);
		Thread.sleep(10000);
		sc.type(email, "vishurathod111@gmail.com");
		Thread.sleep(10000);
		sc.type(password, "Vishu@Rajput");
		Thread.sleep(10000);
		sc.click(login);
		
		System.out.println("added to github");

	}

}
