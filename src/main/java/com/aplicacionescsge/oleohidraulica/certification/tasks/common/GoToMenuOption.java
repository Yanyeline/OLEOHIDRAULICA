package com.aplicacionescsge.oleohidraulica.certification.tasks.common;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToMenuOption implements Task {

    private Target menuOption;

    public GoToMenuOption(Target menuOption){
        this.menuOption = menuOption;
    }

    @Override
    @Step("{0} go to application page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(menuOption));
    }

    public static GoToMenuOption theMenuOption(Target menuOption) {
        return instrumented(GoToMenuOption.class, menuOption);
    }
}