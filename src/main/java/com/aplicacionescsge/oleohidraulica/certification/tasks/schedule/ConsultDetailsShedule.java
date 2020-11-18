package com.aplicacionescsge.oleohidraulica.certification.tasks.schedule;

import com.aplicacionescsge.oleohidraulica.certification.pages.ShedulePage;
import com.aplicacionescsge.oleohidraulica.certification.pages.UserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultDetailsShedule implements Task {

    String Search;

    public ConsultDetailsShedule(String search) {

        Search = search;
    }

    @Step("{0} consult detail shedule")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ShedulePage.BTN_SORTING.of(Search)),
                Click.on(ShedulePage.BTN_VIEW.of(Search))

        );

    }


    public static ConsultDetailsShedule selectItem(String search) {
        return instrumented(ConsultDetailsShedule.class, search);
    }


}
