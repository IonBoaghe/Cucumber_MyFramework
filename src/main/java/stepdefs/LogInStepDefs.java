package stepdefs;

import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import pages.LogInPages;

public class LogInStepDefs {

    LogInPages logInPages = new LogInPages();

    @When("user open log in form")
    public void processedToLogIn(){logInPages.processedToLogIn();}

    @And("user complete username")
    public void insertUsername(){logInPages.insertUsername();}

    @And("user complete password")
    public void insertPassword(){logInPages.insertPassword();}







    }

