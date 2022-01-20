package actions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CoursePage extends BasePage {

    @FindBy(css = ".course-header2__title")
    WebElement pageTitle;

    public CoursePage(WebDriver driver) {

        super(driver);
    }

    public CoursePage checkTitleEquals(String expected) {
        Assertions.assertEquals(expected, this.pageTitle.getText());
        return this;
    }

    public CoursePage waitUntilPageIsLoaded(WebDriverWait wait, String urlPath) {
        wait.until(ExpectedConditions.urlContains(urlPath));
        return this;
    }

}
