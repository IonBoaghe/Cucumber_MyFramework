package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.InventoryPages;

public class InventoryStepsDefs {

    InventoryPages inventoryPages = new InventoryPages();

    @When("user select produce")
    public void selectProduce() {inventoryPages.selectProduce(); }

    @And("user add to card produce")
    public void addToCartProduce() {inventoryPages.addToCartProduce(); }

    @And("user check alert message")
    public void andAlertWindowShouldAppearWithConfirmation() throws InterruptedException {inventoryPages.andAlertWindowShouldAppearWithConfirmation(); }

    @And("user confirm alert message")
    public void confirmAlert() {inventoryPages.confirmAlert();}

    @And("navigate to the cart")
    public void navigateToCart(){inventoryPages.navigateToCart(); }

    @Then("app should display entered username on Welcome tab")
    public void checkWelcomeUsername(){inventoryPages.checkWelcomeUsername();}

    @And("user click Log in button")
    public void clickLogInBtn(){inventoryPages.clickLogInBtn();}

    @Then("user log out in the app")
    public void clickLogOutBtn(){inventoryPages.clickLogOutBtn();}
}
