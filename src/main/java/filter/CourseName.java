package filter;

import actions.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CourseName extends BasePage{

    @FindBy(xpath = "//div[contains(@class, 'lessons__new-item-title lessons__new-item-title_with-bg js-ellipse')]")
    public
    WebElement flutterMobileDeveloper;

    public CourseName(WebDriver driver) {
        super(driver);
    }

    public CourseName() {
        super();
    }
}
