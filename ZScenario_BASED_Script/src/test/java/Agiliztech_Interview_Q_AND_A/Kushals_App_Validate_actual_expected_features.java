package Agiliztech_Interview_Q_AND_A;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Kushals_App_Validate_actual_expected_features {
	
	@Test
	public void test1() throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		driver.get("https://www.kushals.com/");
		
		//Header
	List<WebElement> header=driver.findElements(By.xpath("//div[contains(@id,'main-nav')]"));
        for(WebElement headerfeatures :header) {
	String features_header=headerfeatures.getText();
	System.out.println("===============Header=================");

	System.out.println(features_header);
}	
        //Body
	
        List<WebElement> Body=driver.findElements(By.xpath("//div[contains(@class,'Page-tab-link-inner')]"));
        for(WebElement Bodyfeatures :Body) {
	String features_Body=Bodyfeatures.getText();
	System.out.println("===============Body==============");
	System.out.println(features_Body);
}	
     //Footer   
        
        List<WebElement> Footer=driver.findElements(By.xpath("//div[contains(@class,'footer-first-main')]"));
        for(WebElement Footerfeatures :Footer) {
	String features_Footer=Footerfeatures.getText();
	System.out.println("===============Footer==============");
	System.out.println(features_Footer);
}	
        
}
}
