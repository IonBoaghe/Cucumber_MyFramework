package stepdefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CartPages;

public class CartStepDefs {
    CartPages cartPage = new CartPages();

    @Then("produce should be in the cart")
    public void isProducePresent() {cartPage.isProducePresent();}

}
