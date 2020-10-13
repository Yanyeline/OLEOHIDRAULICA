package com.aplicacionescsge.oleohidraulica.certification.tasks.users;

import com.aplicacionescsge.oleohidraulica.certification.pages.MenuOption;
import com.aplicacionescsge.oleohidraulica.certification.pages.UserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddUser implements Task {

    private List<Map<String, String>> datos;

    public AddUser(List<Map<String, String>> datos) {
        this.datos = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (Map<String, String> registryData : datos) {

            actor.attemptsTo(
                    Click.on(MenuOption.OPTION_USER),
                    Click.on(UserPage.BTN_ADD_USER),
                    Enter.theValue(registryData.get("name")).into(UserPage.TXT_NAME),
                    Enter.theValue(registryData.get("email")).into(UserPage.TXT_EMAIL),
                    Enter.theValue(registryData.get("id")).into(UserPage.TXT_ID),
                    Click.on(UserPage.DDL_ROLE),
                    Click.on(UserPage.DDL_ROLE_OPTION.of(registryData.get("role"))),
                    Click.on(UserPage.BTN_SAVE)

            );

        }


    }


    public static AddUser fillFields(List<Map<String, String>> datos) {
        return instrumented(AddUser.class, datos);
    }


}
