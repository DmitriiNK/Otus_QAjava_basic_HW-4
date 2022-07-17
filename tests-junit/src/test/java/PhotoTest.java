import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PhotoFlashPage;
import static org.junit.Assert.assertTrue;

public class PhotoTest {
    private final Logger logger = LogManager.getLogger(PhotoTest.class);
    protected static WebDriver driver;

    PhotoFlashPage photoFlashPage;


    @Before
    public void StartUp(){
        driver = WebDriverFactory.create(System.getProperty("browser"));
        driver.manage().window().fullscreen();
        logger.info("DriverUP");
        photoFlashPage = new PhotoFlashPage(driver);
    }

    @After
    public void End(){
        if (driver!=null)
            //driver.quit();
        logger.info("DriverDown");
    }

@Ignore
    @Test
    public void CheckPhotoItemTest() throws InterruptedException {
       photoFlashPage.openUrl("https://demo.w3layouts.com/demos_new/template_demo/03-10-2020/photoflash-liberty-demo_Free/685659620/web/index.html?_ga=2.181802926.889871791.1632394818-2083132868.1632394818");
       photoFlashPage.clickOnPhotoItem();
       assertTrue(photoFlashPage.isPhotoItemVisible());
    }
}
