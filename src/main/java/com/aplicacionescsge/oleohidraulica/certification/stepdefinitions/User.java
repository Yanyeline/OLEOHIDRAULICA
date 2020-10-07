package com.aplicacionescsge.oleohidraulica.certification.stepdefinitions;


import com.aplicacionescsge.oleohidraulica.certification.pages.UserPage;
import com.aplicacionescsge.oleohidraulica.certification.questions.PageTitleQuestion;
import com.aplicacionescsge.oleohidraulica.certification.questions.ResultSearchQuestion;
import com.aplicacionescsge.oleohidraulica.certification.tasks.users.ConsultUserTask;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class User {

    @When("^user searches for the user \"(.*)\"$")
    public void user_searches_for_the_user(String search) {
        theActorInTheSpotlight().attemptsTo(ConsultUserTask.fillFields(search));
    }


    @Then("^user sees user information \"([^\"]*)\"$")
    public void user_sees_user_information(String search) {
        theActorInTheSpotlight().should(seeThat(ResultSearchQuestion.isVisible(UserPage.TABLE_USER, search)));
    }

}
