import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    String expectedUrlTours = mainUrl + "/store/sweets/20-tour_to_ukraine";
    String expectedUrlSearch = mainUrl + "/users/search";

    String currentUrl = null;
    int numberOfTourLink = 1;
    By TAB_TOURS = By.xpath("//a[@href='" + expectedUrlTours + "']");
    By TAB_SEARCH = By.xpath("//a[@href='" + expectedUrlSearch + "']");

    @Test
    public void test1() {
        driver.findElements(TAB_TOURS).get(numberOfTourLink).click();
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, expectedUrlTours);
        System.out.println("Our current Url is same as expected. Current Url is: " + currentUrl);
    }

    @Test
    public void test2() {
        driver.findElement(TAB_SEARCH).click();
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, expectedUrlSearch);
        System.out.println("Our current Url is same as expected. Current Url is: " + currentUrl);
    }
}
