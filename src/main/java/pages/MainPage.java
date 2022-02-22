package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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

    @FindBy(xpath = "//a//div[@class='lessons__new-item-title lessons__new-item-title_with-bg js-ellipse']")
    private
    List<WebElement> popularCourseName;

    @FindBy(xpath = "//a//div[@class='lessons__new-item-start']")
    private
    List<WebElement> popularCourseDate;

    @FindBy(xpath = "//a//div[contains(@class, 'lessons__new-item-title_bundle')]")
    private
    List<WebElement> specializedCourseName;

    @FindBy(xpath = "//div[@class='container-padding-bottom']//a//div[@class='lessons__new-item-time']")
    private List<WebElement> specializedCourseDate;

    @FindBy(xpath = "//div[@class='lessons']//a//div[@class='lessons__new-item-title lessons__new-item-title_with-bg js-ellipse']")
    private
    List<WebElement> recommendedCourseName;

    @FindBy(xpath = "//div[@class='lessons']//a//div[@class='lessons__new-item-start']")
    private
    List<WebElement> recommendedCourseDate;

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
