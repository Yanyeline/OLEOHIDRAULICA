package com.aplicacionescsge.oleohidraulica.certification.stepdefinitions;

import com.aplicacionescsge.oleohidraulica.certification.pages.ProfilePage;
import com.aplicacionescsge.oleohidraulica.certification.questions.Message;
import com.aplicacionescsge.oleohidraulica.certification.tasks.profile.ChangeProfileName;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class ConfigureProfile {


    @When("^user changes profile name (.*)$")
    public void user_changes_profile_name(String nameProfile) {
        theActorInTheSpotlight().attemptsTo(ChangeProfileName.fillFields(nameProfile));

    }


    @Then("^the system should show the message (.*)$")
    public void the_system_should_show_the_message(String message) {
        theActorInTheSpotlight().should(seeThat(Message.is(ProfilePage.MESSAGE_CHANGE_NAME), equalTo(message)));
    }

}