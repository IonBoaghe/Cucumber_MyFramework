package pages;

import com.codeborne.selenide.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

import static com.codeborne.selenide.Selenide.$;
import static java.lang.Thread.sleep;

public class InventoryPages {

    private final SelenideElement selectProduceOnPage = $(By.xpath("//h4/a[@href='prod.html?idp_=1']"));
    private final SelenideElement clickToAddProduce = $(By.xpath("//a[@class='btn btn-success btn-lg']"));
    private final SelenideElement navigationBtn = $(By.xpath("//a[@id='cartur']"));
    private final SelenideElement welcomeUsername = $(By.xpath("//a[text()='Welcome erverveqr3512']"));
    private final SelenideElement logInFormBtn = $(By.xpath("//button[text()='Log in']"));
    private final SelenideElement logOutFormBtn = $(By.xpath("//a[text()='Log out']"));

    public void selectProduce() {
        selectProduceOnPage.should(Condition.clickable).click();
    }

    public void addToCartProduce() {
        clickToAddProduce.should(Condition.clickable).click();
    }

    public void navigateToCart() {
        navigationBtn.should(Condition.clickable).click();
    }


    public void andAlertWindowShouldAppearWithConfirmation() throws InterruptedException {
        Thread.sleep(2000);
        Alert alert = getWebDriver().switchTo().alert();
    }

    public void confirmAlert() {
        Alert alert = getWebDriver().switchTo().alert();
        alert.accept();
    }

    public void checkWelcomeUsername(){
        welcomeUsername.should(Condition.appear);
    }

    public void clickLogInBtn() { logInFormBtn.should(Condition.clickable).click(); }

    public void clickLogOutBtn(){logOutFormBtn.should(Condition.clickable).click();}
}


