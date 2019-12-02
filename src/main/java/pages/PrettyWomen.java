package pages;

import org.openqa.selenium.WebDriver;

public class PrettyWomen extends BasePage {
    public PrettyWomen(WebDriver driver) {
        super(driver);
    }
    String currentUrl = null;

    public String GetCurrentUrl()
    {
        return  currentUrl = driver.getCurrentUrl();
    }
}
