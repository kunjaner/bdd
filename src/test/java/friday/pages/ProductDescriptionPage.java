package friday.pages;

import friday.drivers.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDescriptionPage extends DriverManager {

    @FindBy(xpath = "//div[@class='xs-8--none']/button/span/span")
    private WebElement addToTrolleyBtn;

    @FindBy(xpath = "//a[contains(text(),'Go to Trolley')]")
    private WebElement goToTrolleyBtn;

    public void addToBasket(){
        waitUntilElementClickable (addToTrolleyBtn).click ();
    }
    public void GoToTrolley(){
        waitUntilElementClickable (goToTrolleyBtn).click ();
    }

}
