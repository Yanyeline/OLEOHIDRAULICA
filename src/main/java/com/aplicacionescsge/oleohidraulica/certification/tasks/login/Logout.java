package com.aplicacionescsge.oleohidraulica.certification.tasks.login;

import com.aplicacionescsge.oleohidraulica.certification.pages.MenuOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Logout implements Task {

    @Step("{0} Logout site")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuOption.OPTIONS_USER_ICON),
                Click.on(MenuOption.LOGOUT_ICON)
        );
    }

    public static Logout asLogout() {
        return instrumented(Logout.class);
    }
}
