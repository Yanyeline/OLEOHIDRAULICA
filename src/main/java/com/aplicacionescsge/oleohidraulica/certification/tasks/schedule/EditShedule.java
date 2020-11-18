package com.aplicacionescsge.oleohidraulica.certification.tasks.schedule;

import com.aplicacionescsge.oleohidraulica.certification.pages.MenuOption;
import com.aplicacionescsge.oleohidraulica.certification.pages.ShedulePage;
import com.aplicacionescsge.oleohidraulica.certification.pages.UserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EditShedule implements Task {
    String Search;

    public EditShedule(String search) {

        Search = search;
    }

    @Step("{0} edit shedule")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuOption.OPTION_SHEDULE),
                Enter.theValue(Search).into(ShedulePage.TXT_SEARCH_SCHEDULE),
                Click.on(ShedulePage.BTN_SORTING.of(Search)),
                Click.on(ShedulePage.BTN_EDIT.of(Search))
        );
    }

    public static EditShedule fillFields(String search) {
        return instrumented(EditShedule.class, search);
    }


}
