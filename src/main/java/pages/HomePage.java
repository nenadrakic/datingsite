package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By TAB_TOURS = By.linkText("TOUR TO UKRAINE");
    By TAB_PRETTY_WOMEN = By.linkText("PRETTY WOMEN");

    public ToursToUkraine NavigateToToursToUkrainePage(){
        wait.until(ExpectedConditions.elementToBeClickable(TAB_TOURS)).click();
        return new ToursToUkraine(driver);
    }

    public PrettyWomen NavigateToPrettyWomenPage(){
        driver.findElement(TAB_PRETTY_WOMEN).click();
        return new PrettyWomen(driver);
    }

}
