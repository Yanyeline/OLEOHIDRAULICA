package com.aplicacionescsge.oleohidraulica.certification.tasks.customer;

import com.aplicacionescsge.oleohidraulica.certification.pages.CustomerPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddCustomer implements Task {

    @Step("{0} add user")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CustomerPage.BTN_SAVE)
        );
    }

    public static AddCustomer selectItem() {
        return (AddCustomer) instrumented(AddCustomer.class);
    }
}
