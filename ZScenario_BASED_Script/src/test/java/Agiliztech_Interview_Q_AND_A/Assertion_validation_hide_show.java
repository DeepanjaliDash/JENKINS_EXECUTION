package Agiliztech_Interview_Q_AND_A;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_validation_hide_show {
	@Test
	public void tc() throws FileNotFoundException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		WebElement hide=driver.findElement(By.id("hide-textbox"));
		WebElement show=driver.findElement(By.id("show-textbox"));
		WebElement text=driver.findElement(By.id("displayed-text"));

		hide.click();
		Assert.assertFalse(text.isDisplayed(),"error--textfiled should not be  display but its displaying");
		System.out.println("text field is not displayed ");
		
		show.click();
		Assert.assertTrue(text.isDisplayed(),"error--textfiled should  be  display but its not displaying");
		System.out.println("text field is displayed ");

		
	}

}
