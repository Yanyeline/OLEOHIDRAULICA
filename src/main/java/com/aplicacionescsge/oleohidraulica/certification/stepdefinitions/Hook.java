package com.aplicacionescsge.oleohidraulica.certification.stepdefinitions;

import com.aplicacionescsge.oleohidraulica.certification.driver.Driver;
import com.aplicacionescsge.oleohidraulica.certification.tasks.common.OpenTheAplication;
import com.aplicacionescsge.oleohidraulica.certification.tasks.login.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Hook {


    @Before
    public static void before(){
        setTheStage(new OnlineCast());
        theActor("user");

    }

    @Steps
    OpenTheAplication openTheAplication;

    @Given("^user is loged on page with email \"(.*)\" and Password \"(.*)\"$")
    public void user_is_loged_on_page_with_email_and_Password(String email, String password) {
        theActorInTheSpotlight().can(BrowseTheWeb.with(Driver.chromeDriver()));
        theActorInTheSpotlight().wasAbleTo(openTheAplication);
        theActorInTheSpotlight().attemptsTo(Login.fillFields(email, password));
    }
}