package com.abc.magento;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentoTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\AKHIL\\eclipse-workspace1\\DataDrivenFramework\\src\\com\\abc\\utilities\\data.properties");
Properties p=new Properties();
p.load(fis);
String myacct=p.getProperty("myacctloc");
String email=p.getProperty("emaillocator");
String pass=p.getProperty("passlocator");
String login=p.getProperty("loginlocator");
String logout=p.getProperty("logoutlocator");
ChromeDriver cd=new ChromeDriver();
cd.manage().window().maximize();
cd.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
cd.get("https://www.magento.com");
cd.findElement(By.linkText(myacct)).click();
cd.findElement(By.xpath(email)).sendKeys("ankita17.abc@gmail.com");
cd.findElement(By.xpath(pass)).sendKeys("Welcome123");
cd.findElement(By.xpath(login)).click();
cd.findElement(By.xpath(logout)).click();
cd.quit();
	}
}


	

