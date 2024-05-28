package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartPages {

    private final SelenideElement produceItem =$(By.xpath("//tbody/tr/td/img[@src='imgs/galaxy_s6.jpg']"));
    public void isProducePresent() { produceItem.should(Condition.appear); }
}
