package com.aplicacionescsge.oleohidraulica.certification.tasks.users;


import com.aplicacionescsge.oleohidraulica.certification.pages.UserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddUser implements Task {


    @Step("{0} add user")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(UserPage.BTN_SAVE)
        );

    }


    public static AddUser selectItem() {
        return instrumented(AddUser.class);
    }


}
