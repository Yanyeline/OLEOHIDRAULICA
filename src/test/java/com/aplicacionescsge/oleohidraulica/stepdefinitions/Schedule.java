package com.aplicacionescsge.oleohidraulica.stepdefinitions;

import com.aplicacionescsge.oleohidraulica.certification.pages.ShedulePage;

import com.aplicacionescsge.oleohidraulica.certification.questions.ResultSearch;
import com.aplicacionescsge.oleohidraulica.certification.tasks.schedule.*;


import com.aplicacionescsge.oleohidraulica.certification.tasks.users.ConsultDetailsUser;
import com.aplicacionescsge.oleohidraulica.certification.tasks.users.UpdateUser;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Schedule {


    @When("^user searches for the shedule (.*)$")
    public void user_searches_for_the_shedule_Marcos(String search) {
        theActorInTheSpotlight().attemptsTo(ConsultSchedule.fillFields(search));
    }

    @Then("^user sees schedule information (.*)$")
    public void user_sees_schedule_information(String search) {
        theActorInTheSpotlight().should(seeThat(ResultSearch.isVisible(ShedulePage.TABLE_SCHEDULE, search)));

    }


    @When("^user enters schedule registration data$")
    public void user_enters_schedule_registration_data(List<Map<String, String>> data) {
        theActorInTheSpotlight().attemptsTo(EnterScheduleRegistrationData.fillFields(data));
    }

    @When("^user saves schedule registration data$")
    public void user_saves_schedule_registration_data() {
        theActorInTheSpotlight().attemptsTo(AddSchedule.selectItem());
    }

    @Then("^user registers schedule (\\d+)$")
    public void user_registers_schedule(String search) {
        theActorInTheSpotlight().attemptsTo(ConsultSchedule.fillFields(search));
        theActorInTheSpotlight().should(seeThat(ResultSearch.isVisible(ShedulePage.TABLE_SCHEDULE, search)));

    }




    @When("^user looks for schedule (.*) to update their information$")
    public void user_looks_for_schedule_to_update_their_information(String search) {
        theActorInTheSpotlight().attemptsTo(EditShedule.fillFields(search));
    }


    @When("^user enters new schedule data$")
    public void user_enters_new_schedule_data(List<Map<String, String>> data) {
        theActorInTheSpotlight().attemptsTo(UpdateShedule.fillFields(data));
    }

    @When("^user sees the detailed information of the schedule (.*)$")
    public void user_sees_the_detailed_information_of_the_schedule(String search) {
        theActorInTheSpotlight().attemptsTo(ConsultDetailsUser.selectItem(search));
    }

    @Then("^user sees updated schedule information$")
    public void user_sees_updated_schedule_information(List<Map<String, String>> data) {

    }





}
