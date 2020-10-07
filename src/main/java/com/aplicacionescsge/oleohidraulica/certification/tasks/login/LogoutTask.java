package com.aplicacionescsge.oleohidraulica.certification.tasks.login;

import com.aplicacionescsge.oleohidraulica.certification.pages.HomePage;
import com.aplicacionescsge.oleohidraulica.certification.pages.MenuOption;
import com.aplicacionescsge.oleohidraulica.certification.tasks.common.WaitTask;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogoutTask implements Task {

    @Step("{0} Logout site")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuOption.OPTIONS_USER_ICON),
                Click.on(MenuOption.LOGOUT_ICON)
        );
    }

    public static LogoutTask asLogout() {
        return instrumented(LogoutTask.class);
    }
}
