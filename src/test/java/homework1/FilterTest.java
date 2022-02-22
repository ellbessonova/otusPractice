package homework1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class FilterTest extends BaseTest{

    private final String URL = "https://otus.ru/";

    @Test
    public void TestThree(){
        driver.get(URL);
   //     List<WebElement> elementsList = new ArrayList<WebElement>();
        List<WebElement> elementsList = driver.findElements(By.xpath("//div[contains(@class, 'lessons__new-item-title lessons__new-item-title_with-bg js-ellipse')]"));
        elementsList
                .stream()
                .filter(e -> "Java".equals(e.getTagName()))
                .findAny()
                .orElse(null);

    }

}
