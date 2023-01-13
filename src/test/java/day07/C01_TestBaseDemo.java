package day07;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

public class C01_TestBaseDemo extends TestBase {
    /*
    Utilities tekrar tekrar kullanacagimiz classlari koydugumuz paketin adidir
    -TestBaase
    -Drivers
    -ExcelUtil
    -Configiration
    -Utilities paketinde Test caseler yazilmaz
    -Sadece tekrar kullanacagim destek siniflar (support class) olusturulur.
    -Bu classlar test caselerin yazilmasini hizlandirir
     */

    @Test
    public void test1() {
        driver.get("https://www.techproeducation.com/");

        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Bootcamps"));
    }
}