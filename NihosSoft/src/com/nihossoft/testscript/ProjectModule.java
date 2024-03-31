package com.nihossoft.testscript;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nihossoft.generic.BaseClass;

public class ProjectModule extends BaseClass {

	@Test
	public void createProject() throws InterruptedException {
		driver.findElement(By.linkText("TASKS")).click();Thread.sleep(2000);
		Reporter.log("createProject",true);
	}

}
