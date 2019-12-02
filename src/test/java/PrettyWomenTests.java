import org.testng.Assert;
import org.testng.annotations.Test;

public class PrettyWomenTests extends BaseTest  {

    @Test
    public void PrettyWomenLinkTest(){

        String expectedUrlSearch = mainUrl + "/users/search";
        String currentUrl = homePage.NavigateToPrettyWomenPage().GetCurrentUrl();
        Assert.assertEquals(currentUrl,expectedUrlSearch);
        System.out.println("Our current Url is same as expected. Current Url is: "+ currentUrl);
    }
}
