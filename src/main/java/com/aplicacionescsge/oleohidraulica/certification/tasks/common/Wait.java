package com.aplicacionescsge.oleohidraulica.certification.tasks.common;

import com.aplicacionescsge.oleohidraulica.certification.utils.constants.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Wait implements Task {

    Target Element;

    public Wait(Target element){
        Element = element;
    }

    @Step("{0} waiting for items")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(Element, isVisible()).forNoMoreThan(Constants.TIMEOUT).seconds()
        );
    }

    public static Wait Element(Target element){
        return instrumented(Wait.class, element);
    }
}
