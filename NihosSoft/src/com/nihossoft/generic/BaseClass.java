package com.nihossoft.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.nihossoft.pom.HomePage;
import com.nihossoft.pom.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public FileLib f=new FileLib();
	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browser) throws IOException {
		if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}else if(browser.equalsIgnoreCase("chrome")){
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}else {
			driver=new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String url=f.readDataFromProperty("url");
		driver.get(url);
		Reporter.log("openBrowser", true);
	}@BeforeMethod
	public void login() throws IOException {
		LoginPage l=new LoginPage(driver);
		String un = f.readDataFromProperty("un");
		String pwd = f.readDataFromProperty("pwd");
		l.login(un,pwd);
		Reporter.log("login", true);
	}@AfterMethod
	public void logout() throws InterruptedException {
		HomePage h=new HomePage(driver);
		h.logout();
		Reporter.log("logout", true);
	}@AfterTest
	public void closeBrowser() {
		driver.quit();
		Reporter.log("closeBrowser", true);
	}
}