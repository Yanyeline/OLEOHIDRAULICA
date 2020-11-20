package com.aplicacionescsge.oleohidraulica.certification.tasks.customer;

import com.aplicacionescsge.oleohidraulica.certification.pages.CustomerPage;
import com.aplicacionescsge.oleohidraulica.certification.pages.MenuOption;
import com.aplicacionescsge.oleohidraulica.certification.pages.UserPage;
import com.aplicacionescsge.oleohidraulica.certification.tasks.common.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EditCustomer implements Task {

    String Search;

    public EditCustomer(String search) {
        Search = search;
    }

    @Step("{0} edit customer")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuOption.OPTION_CUSTOMER),
                Enter.theValue(Search).into(CustomerPage.SEARCH_CUSTOMER),
                Wait.Element(UserPage.BTN_SORTING.of(Search)),
                Click.on(CustomerPage.BTN_EDIT.of(Search))
        );
    }

    public static EditCustomer fillFields(String search) {
        return instrumented(EditCustomer.class, search);
    }


}
