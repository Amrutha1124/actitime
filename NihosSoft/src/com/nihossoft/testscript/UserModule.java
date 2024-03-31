package com.nihossoft.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.nihossoft.generic.BaseClass;
@Listeners(com.nihossoft.generic.ListenerImplementation.class)
public class UserModule extends BaseClass{
	@Test
	public void addAndDeleteUser() throws InterruptedException, EncryptedDocumentException, IOException {
//		int time=500;
//		String firstName = f.readDataFromExcel("addAndDeleteUser", 1, 1);
//		String lastName = f.readDataFromExcel("addAndDeleteUser", 1, 2);
//		String email = f.readDataFromExcel("addAndDeleteUser", 1, 3);
//		String username = f.readDataFromExcel("addAndDeleteUser", 1, 4);
//		String pwd = f.readDataFromExcel("addAndDeleteUser", 1, 5);
//		String retypePwd = f.readDataFromExcel("addAndDeleteUser", 1, 6);
//		HomePage h=new HomePage(driver);Thread.sleep(2000);
//		h.clickUsers();Thread.sleep(2000);
//		UserListPage u=new UserListPage(driver);
//		u.getCreateUserBtn().click();Thread.sleep(time);
//		u.getFirstNameTbx().sendKeys(firstName);Thread.sleep(time);
//		u.getLastNameTbx().sendKeys(lastName);Thread.sleep(time);
//		u.getEmailTbx().sendKeys(email);Thread.sleep(time);
//		u.getUsernameTbx().sendKeys(username);Thread.sleep(time);
//		u.getPwdTbx().sendKeys(pwd);Thread.sleep(time);
//		u.getRetypePwdTbx().sendKeys(retypePwd);Thread.sleep(time);
//		u.getSubmitBtn().click();Thread.sleep(time);Thread.sleep(time);
//		WebElement ele = u.getCreatedUserLink();
//		Assert.assertTrue(ele.isDisplayed());
//		ele.click();Thread.sleep(time);
//		u.getDeleteBtn().click();Thread.sleep(time);
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.alertIsPresent());
//		driver.switchTo().alert().accept();Thread.sleep(time);
	}
}
