package com.aplicacionescsge.oleohidraulica.certification.stepdefinitions;

import com.aplicacionescsge.oleohidraulica.certification.pages.CustomerPage;
import com.aplicacionescsge.oleohidraulica.certification.questions.ResultSearch;
import com.aplicacionescsge.oleohidraulica.certification.tasks.customer.AddCustomer;
import com.aplicacionescsge.oleohidraulica.certification.tasks.customer.ConsultCustomer;
import com.aplicacionescsge.oleohidraulica.certification.tasks.customer.EnterRegistrationDataC;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Customer {

    //Register customer
    @When("^user enter data$")
    public void user_enter_data(List<Map<String, String>> data) {
        theActorInTheSpotlight().attemptsTo(EnterRegistrationDataC.fillFields(data));
    }

    @When("^user save data$")
    public void user_save_data() {
        theActorInTheSpotlight().attemptsTo(AddCustomer.selectItem());
    }

    @Then("^user sees register on customer table (.*)$")
    public void user_sees_register_on_customer_table(String nit) {
        theActorInTheSpotlight().attemptsTo(ConsultCustomer.fillFields(nit));
        theActorInTheSpotlight().should(seeThat(ResultSearch.isVisible(CustomerPage.TABLE_CUSTOMER, nit)));
    }

}
