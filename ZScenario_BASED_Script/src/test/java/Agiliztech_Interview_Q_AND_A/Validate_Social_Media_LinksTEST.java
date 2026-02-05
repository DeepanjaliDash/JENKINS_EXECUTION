package Agiliztech_Interview_Q_AND_A;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Validate_Social_Media_Links {

	@Test
	public void test1() throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		driver.get("https://www.josalukkaseasybuy.com/");
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Payments')]"))).perform();
		
		
		List<WebElement> links=driver.findElements(By.xpath("//app-footer//a"));
		
		for(WebElement link:links) {
			
			String social_media_links=link.getAttribute("href");
			System.out.println(social_media_links);

			
		}
		
}
}