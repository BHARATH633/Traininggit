package com.abc.magento;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCode {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\AKHIL\\eclipse-workspace1\\DataDrivenFramework\\src\\com\\abc\\utilities\\data.properties");
Properties p=new Properties();
p.load(fis);
String url=p.getProperty("urldata");
String email=p.getProperty("emaildata");
String password=p.getProperty("passdata");
ChromeDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get(url);
driver.findElement(By.linkText("My Account")).click();
driver.findElement(By.id("email")).sendKeys(email);
driver.findElement(By.id("pass")).sendKeys(password);
driver.findElement(By.id("send2")).click();
driver.findElement(By.linkText("Log Out")).click();
driver.quit();
	}

}
