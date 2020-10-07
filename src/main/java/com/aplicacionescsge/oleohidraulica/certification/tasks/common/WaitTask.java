package com.aplicacionescsge.oleohidraulica.certification.tasks.common;

import com.aplicacionescsge.oleohidraulica.certification.constants.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class WaitTask implements Task {

    Target Element;

    public WaitTask(Target element){
        Element = element;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(Element, isVisible()).forNoMoreThan(Constants.TIMEOUT).seconds()
        );
    }

    public static WaitTask Element(Target element){
        return instrumented(WaitTask.class, element);
    }
}
