package practice03;

public class P10_FluentWait  {
    /*
                                - Fluent Wait -
        Selenium’da Fluent Wait, web sürücüsünün bir koşulu beklemesi için maksimum süreyi ve “ElementNotVisibleException”
    exception’ını atmadan önce koşulu kontrol etmek istediğimiz sıklığı tanımlamak için kullanılır.
    Nesne bulunana veya zaman aşımı gerçekleşene kadar düzenli aralıklarla web elementini kontrol eder.

        Bir elemanın farklı zaman aralıklarında yüklendiği bir senaryo düşünelim.
    Öğe 10 saniye, 20 saniye veya daha uzun bir süre içinde yüklenebilir.
    Bu durumda 20 saniyelik Explicit Wait tanımlarsak bir exception atmadan önce belirtilen süreye kadar bekleyecektir.
    Bu tür senaryolarda, Fluent Wait öğeyi bulana kadar veya son zamanlayıcı bitene kadar farklı frekansta bulmaya
    çalışacağından, kullanımı ideal olacaktır.

    Syntax:
                 Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);
     */

    //https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver sayfasına gidelim
    //Click me, to open an ... butonuna basalım
    //Çıkan alert'i kapatalım


}
