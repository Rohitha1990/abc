package com.automation.Ecommerce;

import org.testng.annotations.Test;


import com.automation.PageUI.CustomerRegistration;
import com.automation.basepage.BasePage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterClass;

public class TC001_Login extends BasePage
{
  CustomerRegistration register;
  @BeforeClass
  @Parameters("browser")
  public void startprocess(String browser) throws Exception 
  {
	browserLaunch(browser,getData("ecommerceurl"));  
  }
  
  @Test
  public void login()
  {
	register = new CustomerRegistration(driver);  
	register.customerRegistration();
  }

  @AfterClass
  public void endprocess()
  {
	  
  }

}
