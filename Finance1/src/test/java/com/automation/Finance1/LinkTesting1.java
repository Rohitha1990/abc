package com.automation.Finance1;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class LinkTesting1 extends BasePage {
	
  
  @Test
  public void logic()
  {
	  driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[2]")).click();
	  driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[5]")).click();
  }
  @BeforeMethod
  @Parameters("browser")
  public void beforeSetup(String browser) throws Exception
  {
	  browserLaunch(browser,getData("amzonurl"));
  }
  @AfterMethod
  public void afterMethod() 
  {
	  driver.close();
  }

}
