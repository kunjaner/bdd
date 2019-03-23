package friday.step_def;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import friday.pages.HeaderPage;
import friday.pages.ResultPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SearchStep {
  private   HeaderPage headerPage=new HeaderPage();
  private   ResultPage resultPage=new ResultPage();

    @Given("^i am on homepage$")
    public void i_am_on_homepage() {
        String actual=headerPage.getCurrentUrl();
        assertThat(actual,is(endsWith(".co.uk/")));


    }

    @When("^i search for a product \"([^\"]*)\"$")
    public void i_search_for_a_product(String item) {
        headerPage.doSearch(item);

    }

    @Then("^i should be able to see the respective results$")
    public void i_should_be_able_to_see_the_respective_results()  {
        String actual=resultPage.getProductHeader();
        assertThat(actual,is(equalToIgnoringCase(HeaderPage.SearchItem)));

    }

}
