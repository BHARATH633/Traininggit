package com.abc.magento;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class Magent {

	 
public static void main(String[] args) throws IOException {
FileInputStream fis=new FileInputStream("C:\\Users\\AKHIL\\eclipse-workspace1\\KeywordDataDriven\\src\\com\\abc\\utilities\\Keyword.properties");
Properties p=new Properties();
p.load(fis);
String url=p.getProperty("urldata");
String email=p.getProperty("emaildata");
String password=p.getProperty("passdata");
String myacct=p.getProperty("myacctlocator");
String email1=p.getProperty("emaillocator");
String pass=p.getProperty("passlocator");
String login=p.getProperty("loginlocator");
String logout=p.getProperty("logoutlocator");
ChromeDriver cd=new ChromeDriver();
cd.manage().window().maximize();
cd.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
cd.get(url);
cd.findElement(By.xpath(myacct)).click();
cd.findElement(By.xpath(email1)).sendKeys(email);
cd.findElement(By.xpath(pass)).sendKeys(password);
cd.findElement(By.xpath(login)).click();
cd.findElement(By.xpath(logout)).click();
cd.close();
	}

}
