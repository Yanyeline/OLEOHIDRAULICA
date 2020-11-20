package com.aplicacionescsge.oleohidraulica.stepdefinitions;

import com.aplicacionescsge.oleohidraulica.certification.questions.ResultSearchUpdateMaintenance;
import com.aplicacionescsge.oleohidraulica.certification.tasks.maintenance.ConsultMaintenance;
import com.aplicacionescsge.oleohidraulica.certification.tasks.maintenance.DetailsMaintenance;
import com.aplicacionescsge.oleohidraulica.certification.tasks.maintenance.UpdateMaintenance;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Maintenance {

    @When("^user searches for the maintenance's customer (.*)")
    public void user_searches_for_the_maintenance_s_customer(String placa) {
        theActorInTheSpotlight().attemptsTo(ConsultMaintenance.fillFields(placa));
    }

    @When("^user selects the maintenance details (.*)")
    public void user_selects_the_maintenance_details(String placa) {
        theActorInTheSpotlight().attemptsTo(DetailsMaintenance.selectItem(placa));
    }

    @Then("^user sees maintenance information$")
    public void userSeesMaintenanceInformation(List<Map<String, String>> data) {
        theActorInTheSpotlight().should(seeThat(ResultSearchUpdateMaintenance.isVisible(data)));
    }

    @When("^user enters imformation data$")
    public void userEntersImformationData(List<Map<String, String>> data) {
        theActorInTheSpotlight().attemptsTo(UpdateMaintenance.fillFields(data));

    }
}
