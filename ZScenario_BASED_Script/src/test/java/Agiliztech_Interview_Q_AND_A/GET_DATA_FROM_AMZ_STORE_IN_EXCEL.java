package Agiliztech_Interview_Q_AND_A;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GET_DATA_FROM_AMZ_STORE_IN_EXCEL {

	
	@Test
	public void getPhoneDataAndStore() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");
        driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
        WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("phones",Keys.ENTER);
        
        
        
        
        
		
		
		
		
		
	}
}
