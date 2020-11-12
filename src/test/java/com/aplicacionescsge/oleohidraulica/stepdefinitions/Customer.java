package com.aplicacionescsge.oleohidraulica.stepdefinitions;

import com.aplicacionescsge.oleohidraulica.certification.pages.CustomerPage;
import com.aplicacionescsge.oleohidraulica.certification.questions.ResultSearch;
import com.aplicacionescsge.oleohidraulica.certification.questions.ResultSearchUpdatedCustomer;
import com.aplicacionescsge.oleohidraulica.certification.tasks.customer.*;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Customer {

    //Search
    @When("^user search an customer (.*)$")
    public void userSearchAnCustomer(String name) {
    theActorInTheSpotlight().attemptsTo(ConsultCustomer.fillFields(name));
    }

    //Register customer
    @When("^user enter data$")
    public void user_enter_data(List<Map<String, String>> data) {
        theActorInTheSpotlight().attemptsTo(EnterRegistrationDataC.fillFields(data));
    }

    @When("^user save data$")
    public void user_save_data() {
        theActorInTheSpotlight().attemptsTo(AddCustomer.selectItem());
    }

    //Consul a customer on table
    @Then("^user sees register on customer table (.*)$")
    public void user_sees_register_on_customer_table(String nit) {
        theActorInTheSpotlight().attemptsTo(ConsultCustomer.fillFields(nit));
        theActorInTheSpotlight().should(seeThat(ResultSearch.isVisible(CustomerPage.TABLE_CUSTOMER, nit)));
    }

    @Then("^user sees customer information$")
    public void userSeesCustomerInformation(List<Map<String, String>> data) {
        theActorInTheSpotlight().should(seeThat(ResultSearchUpdatedCustomer.isVisible(data)));
    }

    @When("^user select an customer (.*)$")
    public void userSelectAnCustomer(String search) {
        theActorInTheSpotlight().attemptsTo(DetailsCustomer.selectItem(search));
    }

    //Update customer
    @When("^user looks for customer (.*) to update their information$")
    public void userLooksForCustomerToUpdateTheirInformation(String search) {
        theActorInTheSpotlight().attemptsTo(EditCustomer.fillFields(search));
    }

    @When("^user enters data$")
    public void userEntersData(List<Map<String, String>> data) {
        theActorInTheSpotlight().attemptsTo(UpdateCustomer.fillFields(data));
    }

}
