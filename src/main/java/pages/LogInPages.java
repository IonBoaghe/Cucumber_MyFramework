package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;


public class LogInPages {

    private final SelenideElement logInBtn = $(By.xpath("//a[@id='login2']"));
    private final SelenideElement username = $(By.xpath("//input[@id='loginusername']"));
    private final SelenideElement password = $(By.xpath("//input[@id='loginpassword']"));


    public void processedToLogIn(){
        logInBtn.should(Condition.clickable).click();
    }
    public void insertUsername(){
        username.should(Condition.clickable).sendKeys("erverveqr3512");
    }
    public void insertPassword(){
        password.should(Condition.clickable).sendKeys("erverveqr3512");
    }

}
