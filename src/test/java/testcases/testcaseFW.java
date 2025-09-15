package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.basetest;
import utilities.Locators;
import utilities.readexcel;

public class testcaseFW extends basetest {

	@Test(dataProviderClass = readexcel.class,dataProvider = "bvtdata")
	public void logintest(String username, String password) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // Explicit wait instance

		wait.until(ExpectedConditions.elementToBeClickable(Locators.signlink)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.email)).sendKeys(username);
		wait.until(ExpectedConditions.elementToBeClickable(Locators.nextbtn)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.password)).sendKeys(password);
		wait.until(ExpectedConditions.elementToBeClickable(Locators.login)).click();
	}

	}
