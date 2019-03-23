package friday.pages;

import friday.drivers.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class ResultPage extends DriverManager {
    @FindBy(css = ".font-condensed.search-title__term")
    private WebElement headerText;

    @FindBy(css=".ac-product-card__name")
    List<WebElement> productNames;
    public static String selectedProduct;
    @FindBy(css="..ac-facet__label")
    List<WebElement> filterBy;

    public String getProductHeader(){
       return headerText.getText();
    }

    public void selectAnyProduct(){
        int totalProducts=productNames.size();
        if(totalProducts==0){
            throw  new RuntimeException("no product found");
        }
        Random random=new Random ();
        int randomNumber=random.nextInt (totalProducts);
        WebElement selectedWebElement=productNames.get (randomNumber);
       selectedProduct =selectedWebElement.getText ();
        selectedWebElement.click ();


    }
    public void selectFilterBy(String filterChoice){
        for (WebElement filterElement:filterBy){
            if(filterElement.getText ().equalsIgnoreCase (filterChoice)){
                waitUntilElementClickable (filterElement).click ();
                break;
            }
        }


    }





     }



