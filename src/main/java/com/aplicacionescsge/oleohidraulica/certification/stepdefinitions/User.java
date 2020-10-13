package com.aplicacionescsge.oleohidraulica.certification.stepdefinitions;


import com.aplicacionescsge.oleohidraulica.certification.pages.UserPage;
import com.aplicacionescsge.oleohidraulica.certification.questions.ResultSearch;
import com.aplicacionescsge.oleohidraulica.certification.tasks.users.AddUser;
import com.aplicacionescsge.oleohidraulica.certification.tasks.users.ConsultUser;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class User {

    @When("^user searches for the user \"(.*)\"$")
    public void user_searches_for_the_user(String search) {
        theActorInTheSpotlight().attemptsTo(ConsultUser.fillFields(search));
    }


    @Then("^user sees user information \"([^\"]*)\"$")
    public void user_sees_user_information(String search) {
        theActorInTheSpotlight().should(seeThat(ResultSearch.isVisible(UserPage.TABLE_USER, search)));
    }


    @When("^user enters registration data$")
    public void user_enters_registration_data(List<Map<String, String>> data) {
        theActorInTheSpotlight().attemptsTo(AddUser.fillFields(data));
    }

    @Then("^user registers employee \"([^\"]*)\"$")
    public void user_registers_employee(String name) {
        theActorInTheSpotlight().attemptsTo(ConsultUser.fillFields(name));
        theActorInTheSpotlight().should(seeThat(ResultSearch.isVisible(UserPage.TABLE_USER, name)));


    }



}