import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.SearchPage;

import static org.junit.Assert.assertEquals;


public class CheckFirstItemTest {
    private final Logger logger = LogManager.getLogger(CheckFirstItemTest.class);
    protected static WebDriver driver;
    SearchPage searchPage;

    @Before
    public void StartUp(){
        driver = WebDriverFactory.create(System.getProperty("browser"), System.getProperty("options"));
        //driver = WebDriverFactory.create(System.getProperty("browser"));
        logger.info("DriverUP");
        searchPage = new SearchPage(driver);
    }

    @After
    public void End(){
        if (driver!=null)
            driver.quit();
            logger.info("DriverDown");
    }

@Ignore
    @Test
    public void CheckFirstItemTest(){
        searchPage.openUrl("https://duckduckgo.com/");
        searchPage.clickTextField();
        searchPage.fillTextField("ОТУС");
        searchPage.clickOnSearchButton();
        assertEquals("Онлайн‑курсы для профессионалов, дистанционное обучение современным ...", searchPage.checkFirstItem());
    }
}
