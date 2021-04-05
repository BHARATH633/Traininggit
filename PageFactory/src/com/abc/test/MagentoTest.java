package com.abc.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.magentoo.Login;
import com.abc.magentoo.Main;
import com.abc.magentoo.Welcome;
public class MagentoTest {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.magento.com");
	Welcome w=new Welcome(driver);
	w.clickOnMyAcct();
	Login l=new Login(driver);
	l.typeEmail("ankita17.abc@gmail.com");
	l.typePass("Welcome123");
	l.typeLogin();
	Main lg=new Main(driver);
	lg.typeLogOut();
	driver.quit();
	}
}

	
	
