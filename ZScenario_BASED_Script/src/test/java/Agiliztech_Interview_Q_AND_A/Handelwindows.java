package Agiliztech_Interview_Q_AND_A;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Handelwindows {
	@Test
	public void test1() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		driver.get("https://the-internet.herokuapp.com/windows");

		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		String parentwindows=driver.getWindowHandle();
		
		Set<String> allchildwindows=driver.getWindowHandles();
		for(String window:allchildwindows) {
			
			driver.switchTo().window(window);
			
			String childwindowtitel=driver.getTitle();
			System.out.println(childwindowtitel);
			

			
		}
		
		driver.switchTo().window(parentwindows);
		driver.close();
		
}
}