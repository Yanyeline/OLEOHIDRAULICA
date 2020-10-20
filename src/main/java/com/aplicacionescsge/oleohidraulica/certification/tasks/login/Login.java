package com.aplicacionescsge.oleohidraulica.certification.tasks.login;

import com.aplicacionescsge.oleohidraulica.certification.pages.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {
    String Email;
    String Password;

    public Login(String email, String password) {
        Email = email;
        Password = password;
    }

    @Step("{0} login site")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Enter.theValue(Email).into(LoginPage.TXT_EMAIL));
        actor.attemptsTo(
                Enter.theValue(Password).into(LoginPage.TXT_PASSWORD));
        actor.attemptsTo(
                Click.on(LoginPage.BTN_LOGIN)


        );
    }

    public static Login fillFields(String email, String password) {
        return instrumented(Login.class, email, password);
    }
}