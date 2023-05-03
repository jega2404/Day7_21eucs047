package day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ex_3 {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions co=new EdgeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver=new EdgeDriver(co);
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        WebElement cid=driver.findElement(By.name("cusid"));
        cid.sendKeys("401");        
        WebElement bttn1=driver.findElement(By.name("submit"));
        bttn1.click();
        Alert a=driver.switchTo().alert();
        a.dismiss();
        cid.clear();
        cid.sendKeys("402");
        bttn1.click();
        Alert a1=driver.switchTo().alert();
        a1.accept();
        String s=driver.switchTo().alert().getText();
        Alert a2=driver.switchTo().alert();
        a2.accept();
	}

}
	