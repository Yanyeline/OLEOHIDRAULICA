package com.aplicacionescsge.oleohidraulica.certification.stepdefinitions;


import com.aplicacionescsge.oleohidraulica.certification.pages.LoginPage;
import com.aplicacionescsge.oleohidraulica.certification.pages.UserPage;
import com.aplicacionescsge.oleohidraulica.certification.questions.*;
import com.aplicacionescsge.oleohidraulica.certification.tasks.users.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class User {

    @When("^user searches for the employee (.*)$")
    public void user_searches_for_the_employee(String search) {
        theActorInTheSpotlight().attemptsTo(ConsultUser.fillFields(search));
    }


    @Then("^user sees employee information (.*)$")
    public void user_sees_employee_information(String search) {
        theActorInTheSpotlight().should(seeThat(ResultSearch.isVisible(UserPage.TABLE_USER, search)));
    }


    @When("^user enters registration data$")
    public void user_enters_registration_data(List<Map<String, String>> data) {
        theActorInTheSpotlight().attemptsTo(EnterRegistrationData.fillFields(data));
    }

    @When("^user saves registration data$")
    public void user_saves_registration_data() {
        theActorInTheSpotlight().attemptsTo(AddUser.selectItem());
    }

    @Then("^user registers employee (.*)$")
    public void user_registers_employee(String name) {
        theActorInTheSpotlight().attemptsTo(ConsultUser.fillFields(name));
        theActorInTheSpotlight().should(seeThat(ResultSearch.isVisible(UserPage.TABLE_USER, name)));
    }

    @When("^user cancels employee registration$")
    public void user_cancels_employee_registration() {
        theActorInTheSpotlight().attemptsTo(CancelUserRegistration.selectItem());
    }


    @When("^user looks for employee (.*) to update their information$")
    public void user_looks_for_employee_to_update_their_information(String search) {
        theActorInTheSpotlight().attemptsTo(EditUser.fillFields(search));
    }

    @When("^user enters new data$")
    public void user_enters_new_data(List<Map<String, String>> data) {
        theActorInTheSpotlight().attemptsTo(UpdateUser.fillFields(data));
    }

    @When("^user sees the detailed information of the employee (.*)$")
    public void user_sees_the_detailed_information_of_the_employee(String search) {
        theActorInTheSpotlight().attemptsTo(ConsultDetailsUser.selectItem(search));
    }

    @Then("^user sees updated employee information$")
    public void user_sees_updated_employee_information(List<Map<String, String>> data) {
        theActorInTheSpotlight().should(seeThat(ResultSearchUpdatedUser.isVisible(data)));
    }

    @Then("^user sees employee information$")
    public void userSeesEmployeeInformation(List<Map<String, String>> data) {
        theActorInTheSpotlight().should(seeThat(ResultSearchUpdatedUser.isVisible(data)));
    }

    @When("^user select a employee disable (.*)$")
    public void userSelectAEmployeeDisable(String Search) {
        theActorInTheSpotlight().attemptsTo(EnableUser.fillFields(Search));
    }

    @Then("^user sees state enable in employee (.*)$")
    public void userSeesStateEnableInEmployee(String email) {
        theActorInTheSpotlight().should(seeThat(ResultSearch.isVisible(UserPage.BTN_STATE_ENABLE, email)));
    }

    @Then("^user sees same information's employee$")
    public void userSeesSameInformationSEmployee(List<Map<String, String>> data) {
        theActorInTheSpotlight().should(seeThat(ResultSearchUpdatedUser.isVisible(data)));
    }

    @When("^user enters same data$")
    public void userEntersSameData(List<Map<String, String>> data) {
        theActorInTheSpotlight().attemptsTo(CancelUserUpdate.fillFields(data));

    }


}
