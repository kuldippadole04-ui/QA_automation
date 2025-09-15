package utilities;

import org.openqa.selenium.By;

public class Locators {
	
	public static By signlink = By.linkText("Sign In");
	public static By email    = By.id("login_id");
	public static By nextbtn = By.xpath("//button[@id='nextbtn']");
	public static By password = By.xpath("//input[@id='password']");
	public static By login = By.xpath("//button[@id='nextbtn']");

}
