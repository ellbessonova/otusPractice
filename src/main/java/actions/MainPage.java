package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(xpath = ".//p[@class='header2-menu__item-text' and text()='Курсы']")
    public
    WebElement coursesMenuItem;

    @FindBy(xpath = "//div[contains(@class, 'header2-menu__subdropdown-wrapper')]/a[contains(@href, '/categories/testing')]")
    public
    WebElement testingSubmenuItem;

    @FindBy(xpath = "//a[contains(@title, 'Тестирование')]/div[contains(@class, 'js-menu-subdropdown-trigger')]")
    public
    WebElement dropDownTrigger;

    @FindBy(xpath = "//a[contains(@href, '/lessons/avtomatizaciya-web-testirovaniya/')]")
    public
    WebElement pythonCourseMenuElement;


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage moveToElement(Actions actions, WebElement element) {
        actions.moveToElement(element).perform();
        return this;
    }

    public MainPage moveToElementAndClickOnCourse(Actions actions, WebElement element) {
        actions.moveToElement(element).click().build().perform();
        return new MainPage(driver);
    }
}
