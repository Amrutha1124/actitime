package com.nihossoft.testscript;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.nihossoft.generic.BaseClass;

@Listeners(com.nihossoft.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
	@Test
public void createCustomer() throws InterruptedException {
	driver.findElement(By.linkText("TASKS")).click();Thread.sleep(2000);
	Reporter.log("createCustomer",true);
}
}
