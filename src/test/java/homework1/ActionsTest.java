package homework1;

import pages.CoursePage;
import pages.MainPage;
import org.junit.jupiter.api.Test;


public class ActionsTest extends BaseTest {

    private final String URL = "https://otus.ru/categories/programming/";

    @Test
    public void TestTwo() {
        driver.get(URL);

        var mainPage = new MainPage(driver);
        var coursePage = new CoursePage(driver);

        mainPage
                .moveToElement(actions, mainPage.coursesMenuItem)
                .moveToElement(actions, mainPage.coursesMenuItem)
                .moveToElement(actions, mainPage.testingSubmenuItem)
                .moveToElement(actions, mainPage.dropDownTrigger)
                .moveToElementAndClickOnCourse(actions, mainPage.pythonCourseMenuElement);

        coursePage
                .checkUrl(wait, "avtomatizaciya-web-testirovaniya/")
                .checkTitleEquals("Python QA Engineer");
    }
    }