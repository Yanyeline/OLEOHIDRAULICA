package com.aplicacionescsge.oleohidraulica.certification.tasks.customer;

import com.aplicacionescsge.oleohidraulica.certification.pages.CustomerPage;
import com.aplicacionescsge.oleohidraulica.certification.tasks.users.ConsultDetailsUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DetailsCustomer implements Task {

    String Search;

    public DetailsCustomer(String search) {
        Search = search;
    }

    @Step("{0} details customer")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CustomerPage.BTN_VIEW.of(Search))
        );
    }

    public static DetailsCustomer selectItem(String search) {
        return  instrumented(DetailsCustomer.class, search);
    }

    public static DetailsCustomer fillFields(String search) {
        return instrumented(DetailsCustomer.class, search);
    }
}
