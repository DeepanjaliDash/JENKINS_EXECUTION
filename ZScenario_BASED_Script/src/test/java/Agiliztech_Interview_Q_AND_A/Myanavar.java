package Agiliztech_Interview_Q_AND_A;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Myanavar {
	@Test
	public void test1() throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		driver.get("https://www.manyavar.com/");
		
		//header features
		
		 List<WebElement> header_features=driver.findElements(By.xpath("//div[contains(@id,'myHeader')]"));
		 for(WebElement headerfeature:header_features) {
			 
			 String header=headerfeature.getText();
			 System.out.println("=============Header================");

			 System.out.println(header);
		 }
		 

		 //content features
		 List<WebElement> Body_features=driver.findElements(By.xpath("//div[contains(@id,'maincontent')]"));
           for(WebElement Bodyfeatures:Body_features) {
			 
			 String Body=Bodyfeatures.getText();
			 System.out.println("=============Body================");

			 System.out.println(Body);
		 }
		 
		 //Fotter features
  		 List<WebElement> Footer_features=driver.findElements(By.xpath("//footer[contains(@id,'footercontent')]"));
 for(WebElement Footerfeatures:Footer_features) {
			 
			 String Footer=Footerfeatures.getText();
			 System.out.println("=============Footer================");

			 System.out.println(Footer);
		 }
		 
//click on mention collection and select any product and click on that product 
 
 driver.findElement(By.xpath("//p[contains(text(),'Men')]")).click();
 //click on any product
 Actions act=new Actions(driver);
WebElement product= driver.findElement(By.xpath("//div[contains(@id,'plpCarousel-UC145689')]"));
           act.moveToElement(product).perform();
           product.click();
           
           
           //click on that product wishlist button
           
           
           driver.findElement(By.id("socialWishlist")).click();
           
           
String parentwindow=driver.getWindowHandle();

Set<String> childwindows=driver.getWindowHandles();

for(String window: childwindows ) {
           
           driver.switchTo().window(window);
           //pop will come 
           act.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'d-flex social-container')]"))).perform();
           
           
           WebElement   facebook= driver.findElement(By.id("Facebook"));	   
    	   String fb=facebook.getAttribute("href");
    	   if(fb.contains("Facebook")) {
		 System.out.println("=============pop up social media links================");
    	   System.out.println(fb);
    	   
    	   
       }
    	   
    	   WebElement   google= driver.findElement(By.id("Google"));	   
    	   String gl=google.getAttribute("href");
    	   if(gl.contains("Google")) {
    	   System.out.println(gl);
    	   
    	   
       }
}
		
	driver.quit();	
}
}
