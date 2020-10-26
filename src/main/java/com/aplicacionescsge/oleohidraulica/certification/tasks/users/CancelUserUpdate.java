package com.aplicacionescsge.oleohidraulica.certification.tasks.users;

import com.aplicacionescsge.oleohidraulica.certification.pages.UserPage;
import com.aplicacionescsge.oleohidraulica.certification.tasks.common.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CancelUserUpdate  implements Task {


    private List<Map<String, String>> datos;

    public CancelUserUpdate (List<Map<String, String>> datos) {
        this.datos = datos;
    }

    @Step("{0} update user")
    @Override
    public <T extends Actor> void performAs(T actor) {
        for (Map<String, String> registryData : datos) {

            actor.attemptsTo(
                    Wait.Element(UserPage.TXT_NAME_UPDATE),
                    Enter.theValue(registryData.get("name")).into(UserPage.TXT_NAME_UPDATE),
                    Enter.theValue(registryData.get("email")).into(UserPage.TXT_EMAIL_UPDATE),
                    Enter.theValue(registryData.get("id")).into(UserPage.TXT_ID_UPDATE),
                    Click.on(UserPage.DDL_ROLE_UPDATE),
                    Click.on(UserPage.DDL_ROLE_OPTION_UPDATE.of(registryData.get("role"))),
                    Scroll.to(UserPage.BTN_CLOSE_UPDATE),
                    Click.on(UserPage.BTN_CLOSE_UPDATE),
                    Click.on(UserPage.BTN_VIEW.of(registryData.get("name")))
            );
        }
    }

    public static CancelUserUpdate  fillFields(List<Map<String, String>> datos) {
        return instrumented(CancelUserUpdate.class, datos);
    }
}

