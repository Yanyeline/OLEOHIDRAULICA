package com.aplicacionescsge.oleohidraulica.certification.tasks.customer;

import com.aplicacionescsge.oleohidraulica.certification.pages.CustomerPage;
import com.aplicacionescsge.oleohidraulica.certification.tasks.common.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UpdateCustomer implements Task {


    private List<Map<String, String>> datos;

    public UpdateCustomer(List<Map<String, String>> datos) {
        this.datos = datos;
    }

    @Step("{0} enter data for update customer")
    @Override
    public <T extends Actor> void performAs(T actor) {
        for (Map<String, String> registryData : datos) {
            actor.attemptsTo(
                    Wait.Element(CustomerPage.TXT_NAME_UPDATE),
                    Enter.theValue(registryData.get("name")).into(CustomerPage.TXT_NAME_UPDATE),
                    Enter.theValue(registryData.get("email")).into(CustomerPage.TXT_EMAIL_UPDATE),
                    Enter.theValue(registryData.get("nit")).into(CustomerPage.TXT_NIT_UPDATE),
                    Enter.theValue(registryData.get("address")).into(CustomerPage.TXT_ADDRESS_UPDATE),
                    Enter.theValue(registryData.get("tel")).into(CustomerPage.TXT_TEL_UPDATE),
                    Enter.theValue(registryData.get("contact")).into(CustomerPage.TXT_CONTACT_UPDATE),
                    Enter.theValue(registryData.get("emailcontact")).into(CustomerPage.TXT_EMAIL_CONTACT_UPDATE),
                    Enter.theValue(registryData.get("cel")).into(CustomerPage.TXT_CEL_UPDATE),
                    Click.on(CustomerPage.BTN_UPDATE)
            );
        }


    }

    public static UpdateCustomer fillFields(List<Map<String, String>> datos) {
        return instrumented(UpdateCustomer.class, datos);
    }
}
