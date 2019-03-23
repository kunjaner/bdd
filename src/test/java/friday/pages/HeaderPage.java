package friday.pages;

import friday.drivers.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HeaderPage extends DriverManager {

    public static String SearchItem;

    @FindBy(id="searchTerm")
    private WebElement searchTxtButton;

    @FindBy(className = "argos-header__search-button")
    private WebElement magnifireGlass;
    public void doSearch(String item){
       SearchItem=item;
        searchTxtButton.sendKeys(item);
        magnifireGlass.click();
    }
    public String getCurrentUrl(){
       return driver.getCurrentUrl();
    }

}

