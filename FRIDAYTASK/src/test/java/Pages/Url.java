package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Url {
     WebDriver driver;


     public Url(WebDriver driver) {
          this.driver = driver;
     }

     public void click() throws InterruptedException {
          driver.manage().window().maximize();
          Thread.sleep(3000);
          driver.findElement(By.id("SC_Level_1_4772305_menu")).click();
           driver.findElement(By.id("//*[contains(text(),'')]")).click();
     }
}
