package com.aplicacionescsge.oleohidraulica.certification.tasks.profile;

import com.aplicacionescsge.oleohidraulica.certification.pages.MenuOption;
import com.aplicacionescsge.oleohidraulica.certification.pages.ProfilePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ChangeProfileName implements Task {

    String NameProfile;


    public ChangeProfileName(String nameProfile) {
        NameProfile = nameProfile;
    }

    @Step("{0} Change name profile")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuOption.OPTIONS_USER_ICON),
                Click.on(MenuOption.PROFILE_ICON),
                Click.on(ProfilePage.BTN_CHANGE_NAME),
                Enter.theValue(NameProfile).into(ProfilePage.TXT_NAME),
                Click.on(ProfilePage.BTN_SAVE_NAME)
        );
    }

    public static ChangeProfileName fillFields(String email) {
        return instrumented(ChangeProfileName.class, email);
    }
}
