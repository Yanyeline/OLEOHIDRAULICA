package com.aplicacionescsge.oleohidraulica.certification.tasks.customer;

import com.aplicacionescsge.oleohidraulica.certification.pages.CustomerPage;
import com.aplicacionescsge.oleohidraulica.certification.pages.MenuOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultCustomer implements Task {

    String Search;

    public ConsultCustomer(String search) {

        Search = search;
    }

    @Step("{0} consult customer information")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuOption.OPTION_CUSTOMER),
                Enter.theValue(Search).into(CustomerPage.SEARCH_CUSTOMER)
        );
    }

    public static ConsultCustomer fillFields(String search) {
        return instrumented(ConsultCustomer.class, search);
    }
}
