//package com.abc.MagentoMain;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import com.abc.MagentoObjects.Home;
//import com.abc.MagentoObjects.Login;
//import com.abc.MagentoObjects.Welcome;

public class MagentoTest {
@Test
	public static void test()  {
	
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.get("https://www.magento.com");
Welcome w=new Welcome(driver);
w.clickonMyAccount();
Login l=new Login(driver);
l.typeEmail("ashfaqkanekal@gmail.com");
l.typePassword("As#faq13031");
l.clickonlogin();
Home h=new Home(driver);
h.clickonlogout();
driver.quit();
	}

}
