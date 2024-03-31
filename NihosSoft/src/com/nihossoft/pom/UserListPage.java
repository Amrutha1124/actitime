package com.nihossoft.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage {
@FindBy(id="createUserDiv")
private WebElement createUserBtn;
@FindBy(id="userDataLightBox_firstNameField")
private WebElement firstNameTbx;
@FindBy(id="userDataLightBox_lastNameField")
private WebElement lastNameTbx;
@FindBy(name="email")
private WebElement emailTbx;
@FindBy(name="username")
private WebElement usernameTbx;
@FindBy(xpath="//input[@placeholder='Password']")
private WebElement pwdTbx;
@FindBy(xpath="//input[contains(@class,'passwordCopyField')]")
private WebElement retypePwdTbx;
@FindBy(xpath="//*[text()='Create User']")
private WebElement submitBtn;
@FindBy(xpath = "//li[@class='firstWarning']/../../..//span[@class='userNameSpan']")
private WebElement createdUserLink;
@FindBy(id="userDataLightBox_deleteBtn")
private WebElement deleteBtn;

public UserListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getCreateUserBtn() {
	return createUserBtn;
}

public WebElement getFirstNameTbx() {
	return firstNameTbx;
}

public WebElement getLastNameTbx() {
	return lastNameTbx;
}

public WebElement getEmailTbx() {
	return emailTbx;
}

public WebElement getUsernameTbx() {
	return usernameTbx;
}

public WebElement getPwdTbx() {
	return pwdTbx;
}

public WebElement getRetypePwdTbx() {
	return retypePwdTbx;
}

public WebElement getSubmitBtn() {
	return submitBtn;
}

public WebElement getCreatedUserLink() {
	return createdUserLink;
}

public WebElement getDeleteBtn() {
	return deleteBtn;
}

}
