package Agiliztech_Interview_Q_AND_A;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Fetch_data_from_amazon_To_Excel {

	
	@Test
	public void test1() throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		
	WebElement searchbttn=	driver.findElement(By.xpath("//input[@type='text']"));
	searchbttn.sendKeys("iphones");
	searchbttn.click();
	
 List<WebElement>	alliphones=driver.findElements(By.xpath("//div[contains(text(),'iphones')]"));
 
 
 FileInputStream fis=new FileInputStream("./data1.xlsx");
	
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("Sheet1");
	int rc=0;
	
	for (WebElement phone : alliphones) {
	    String text = phone.getText();
	    
	    sh.createRow(rc).createCell(0).setCellValue(text);
	    rc++;
	}

	FileOutputStream fos = new FileOutputStream("./data1.xlsx");
    wb.write(fos);
	

}
}