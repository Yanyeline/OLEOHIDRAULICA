package com.aplicacionescsge.oleohidraulica.certification.tasks.common;

import com.aplicacionescsge.oleohidraulica.certification.pages.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.thucydides.core.annotations.Step;

public class OpenTheAplication implements Task {

    LoginPage login;

    @Step("{0} opens the web site")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(login)
        );
    }


}
