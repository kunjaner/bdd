package friday.step_def;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import friday.pages.BasketPage;
import friday.pages.ProductDescriptionPage;
import friday.pages.ResultPage;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class Basketsteps {

private ResultPage resultPage=new ResultPage ();
private ProductDescriptionPage productDescriptionPage=new ProductDescriptionPage ();
private BasketPage basketPage= new BasketPage();

    @When("^i  select any product$")
    public void i_select_any_product()   {
resultPage.selectAnyProduct ();
    }

    @When("^i  add product  in the basket$")
    public void i_add_product_in_the_basket() {
        productDescriptionPage.addToBasket ();
        productDescriptionPage.GoToTrolley ();

    }

    @Then("^i can see the product in to the basket$")
    public void i_can_see_the_product_in_to_the_basket()   {
       List<String> productList =basketPage.getProductsInBasket ();
       assertThat(productList,hasItem(ResultPage.selectedProduct));

    }




}
