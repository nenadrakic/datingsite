package pages;

import org.openqa.selenium.WebDriver;

public class ToursToUkraine extends BasePage {
    public ToursToUkraine(WebDriver driver) {
        super(driver);
    }
    String currentUrl = null;

    public String GetCurrentUrl()
    {
        return  currentUrl = driver.getCurrentUrl();
    }
}
