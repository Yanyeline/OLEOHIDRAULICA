package com.aplicacionescsge.oleohidraulica.certification.tasks.login;

import com.aplicacionescsge.oleohidraulica.certification.pages.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RecoverPasswordTask implements Task {

    String Email;


    public RecoverPasswordTask(String email) {
        Email = email;
    }

    @Step("{0} Recover password")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginPage.LINK_RECOVER_PASSWORD),
                Enter.theValue(Email).into(LoginPage.TXT_EMAIL),
                Click.on(LoginPage.BTN_RECOVER_PASSWORD)
        );
    }

    public static RecoverPasswordTask fillFields(String email) {
        return instrumented(RecoverPasswordTask.class, email);
    }
}
