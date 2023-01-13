package day11;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C01_Actions05 extends TestBase {

    @Test
    public void keyboarActionTest(){
        driver.get("https://www.google.com");
        WebElement aramaKutusu = driver.findElement(By.name("q"));
        //aramaKutusu.sendKeys("IPHONE X FIYATLARI"+ Keys.ENTER);
        Actions actions = new Actions(driver);
        actions.keyDown(aramaKutusu , Keys.SHIFT)
                .sendKeys("Iphone X FIYATLARI")
                .keyUp(aramaKutusu , Keys.SHIFT)
                .sendKeys("cok pahali")
                .build()
                .perform();
    }
}
