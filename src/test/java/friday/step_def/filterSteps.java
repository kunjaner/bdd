package friday.step_def;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import friday.pages.ResultPage;

public class filterSteps {
   private ResultPage resultPage=new ResultPage ();

    @When("^i apply filter \"([^\"]*)\" on result page$")
    public void i_apply_filter_on_result_page(String filterChoice)  {
        resultPage.selectFilterBy (filterChoice);


    }

    @Then("^i should see all products \"([^\"]*)\" are filtered \"([^\"]*)\"$")
    public void i_should_see_all_products_are_filtered(String filter, String filterValue)  {
        if(filter.equalsIgnoreCase ("review")){
            resultPage.selectFilterBy ();
        }


    }
}