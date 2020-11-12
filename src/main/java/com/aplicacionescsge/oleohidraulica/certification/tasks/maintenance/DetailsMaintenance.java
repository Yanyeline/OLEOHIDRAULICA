package com.aplicacionescsge.oleohidraulica.certification.tasks.maintenance;

import com.aplicacionescsge.oleohidraulica.certification.pages.MaintenancePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DetailsMaintenance implements Task {

    String Search;

    public DetailsMaintenance(String search) {
        Search = search;
    }

    @Step("{0} details customer")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MaintenancePage.BTN_VIEW.of(Search))
        );
    }

    public static DetailsMaintenance selectItem(String search) {
        return  instrumented(DetailsMaintenance.class, search);
    }

    public static DetailsMaintenance fillFields(String search) {
        return instrumented(DetailsMaintenance.class, search);
    }
}
