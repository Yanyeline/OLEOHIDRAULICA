package com.aplicacionescsge.oleohidraulica.certification.stepdefinitions;

import com.aplicacionescsge.oleohidraulica.certification.driver.Driver;
import com.aplicacionescsge.oleohidraulica.certification.pages.LoginPage;
import com.aplicacionescsge.oleohidraulica.certification.questions.*;
import com.aplicacionescsge.oleohidraulica.certification.tasks.common.*;

import com.aplicacionescsge.oleohidraulica.certification.tasks.login.Logout;
import com.aplicacionescsge.oleohidraulica.certification.tasks.login.RecoverPassword;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class Login {


    public Actor user = Actor.named("User");

    @Steps
    OpenTheAplication openTheAplication;


    @Given("^user is on the login page$")
    public void user_is_on_the_login_page() {
        user.can(BrowseTheWeb.with(Driver.chromeDriver()));
        user.wasAbleTo(openTheAplication);
    }

    @When("^user enter email \"([^\"]*)\" and Password \"([^\"]*)\" and click the log In button$")
    public void user_enter_email_and_Password_and_click_the_log_In_button(String email, String password) {
        user.attemptsTo(com.aplicacionescsge.oleohidraulica.certification.tasks.login.Login.fillFields(email, password));
    }

    @Then("^user go to the (.*) page$")
    public void user_go_to_the_page(String namePage) {
        user.should(seeThat(PageTitle.is(), equalTo(namePage)));
    }

    @Then("^user sees the message (.*)$")
    public void user_sees_the_message(String message) {
        user.should(seeThat(Message.is(LoginPage.MESSAGE_INVALID), equalTo(message)));

    }


    @Then("^User closes session$")
    public void user_closes_session() {
        user.attemptsTo(Logout.asLogout());
    }

    @When("^user selects recover password and enter email \"([^\"]*)\"$")
    public void user_selects_recover_password_and_enter_email(String email) {
        user.attemptsTo(RecoverPassword.fillFields(email));
    }

    @Then("^user recover password$")
    public void user_recover_password() {
        //validar que el usuario recupere la contraseña
    }

}