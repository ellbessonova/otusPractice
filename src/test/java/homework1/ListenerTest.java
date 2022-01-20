package homework1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ListenerTest {

    @Test
    public void TestOne(){
    WebDriverManager.chromedriver().setup();
    EventFiringWebDriver driver = new EventFiringWebDriver(new ChromeDriver());
    driver.register(new ListenerMarkElementBeforeClick());
    driver.manage().window().maximize();

    driver.get("https://otus.ru/");
    driver.findElement(By.className("header2-menu__item-text")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
}

}
