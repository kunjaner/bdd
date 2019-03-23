package friday.pages;

import friday.drivers.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class BasketPage extends DriverManager {
    @FindBy(xpath ="//a[@data-e2e='product-name']")
    private List<WebElement> productsInBasket;

    public List<String> getProductsInBasket(){
        List<String> productNamesInBasket=new ArrayList<> ();

        for (WebElement productInBasket:productsInBasket){
            productNamesInBasket.add (productInBasket.getText ());
        }
        return productNamesInBasket;



    }

}

//public List<String> getProductsInBaskets(){
//        List<String> productNamesInBasket= new ArrayList<String>();
//
//        for (WebElement productInBasket: productsInBasket){
//            productNamesInBasket.add(productInBasket.getText());
//        }
//        return productNamesInBasket;