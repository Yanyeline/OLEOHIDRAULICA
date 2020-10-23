package com.aplicacionescsge.oleohidraulica.certification.tasks.users;

import com.aplicacionescsge.oleohidraulica.certification.pages.MenuOption;
import com.aplicacionescsge.oleohidraulica.certification.pages.ProfilePage;
import com.aplicacionescsge.oleohidraulica.certification.pages.UserPage;
import com.aplicacionescsge.oleohidraulica.certification.tasks.profile.ChangeProfileName;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CancelUserRegistration implements Task {


    @Step("{0} cancel user registration")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UserPage.BTN_CLOSE)
        );
    }

    public static CancelUserRegistration selectItem() {
        return instrumented(CancelUserRegistration.class);
    }
}
