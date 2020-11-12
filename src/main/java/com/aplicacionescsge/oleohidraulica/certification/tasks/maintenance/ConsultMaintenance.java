package com.aplicacionescsge.oleohidraulica.certification.tasks.maintenance;

import com.aplicacionescsge.oleohidraulica.certification.pages.MaintenancePage;
import com.aplicacionescsge.oleohidraulica.certification.pages.MenuOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultMaintenance  implements Task {

        String Search;
        public ConsultMaintenance(String search) {
            Search = search;
        }

        @Step("{0} consult maintenance information")
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(MenuOption.OPTION_MAINTENANCE),
                    Enter.theValue(Search).into(MaintenancePage.SEARCH_MAINTENANCE)
            );
        }

    public static ConsultMaintenance fillFields(String search) {
            return instrumented(ConsultMaintenance.class, search);
    }

}


