import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToursToUkraineTests extends BaseTest{

    @Test
    public void ToursToUkraineLinkTest(){

        String expectedUrlTours = mainUrl + "/store/sweets/20-tour_to_ukraine";
        String currentUrl = homePage.NavigateToToursToUkrainePage().GetCurrentUrl();
        Assert.assertEquals(currentUrl,expectedUrlTours);
        System.out.println("Our current Url is same as expected. Current Url is: "+ currentUrl);
    }
}
