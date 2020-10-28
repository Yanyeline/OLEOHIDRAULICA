package com.aplicacionescsge.oleohidraulica.certification.tasks.schedule;

import com.aplicacionescsge.oleohidraulica.certification.pages.MenuOption;
import com.aplicacionescsge.oleohidraulica.certification.pages.ShedulePage;
import com.aplicacionescsge.oleohidraulica.certification.pages.UserPage;
import com.aplicacionescsge.oleohidraulica.certification.tasks.common.Wait;
import com.aplicacionescsge.oleohidraulica.certification.tasks.users.EnterRegistrationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterScheduleRegistrationData implements Task {

    private List<Map<String, String>> datos;

    public EnterScheduleRegistrationData(List<Map<String, String>> datos) {
        this.datos = datos;
    }

    @Step("{0} enter schedule registration data")
    @Override
    public <T extends Actor> void performAs(T actor) {
        for (Map<String, String> registryData : datos) {

            actor.attemptsTo(
                    Click.on(MenuOption.OPTION_SHEDULE),
                    Wait.Element(ShedulePage.BTN_ADD_SCHEDULE),
                    Click.on(ShedulePage.BTN_ADD_SCHEDULE),
                    Click.on(ShedulePage.DDL_PLANT),
                    Click.on(ShedulePage.DDL_PLANT_OPTION.of(registryData.get("planta"))),
                    Enter.theValue(registryData.get("ejecutor")).into(ShedulePage.TXT_EXECUTANT),
                    Click.on(ShedulePage.DDL_LOCATION),
                    Click.on(ShedulePage.DDL_LOCATION_OPTION.of(registryData.get("ubicacion"))),
                    Enter.theValue(registryData.get("fechaInicial")).into(ShedulePage.TXT_START_DATE),
                    Enter.theValue(registryData.get("equipo")).into(ShedulePage.TXT_TEAM),
                    Enter.theValue(registryData.get("fechaFin")).into(ShedulePage.TXT_START_END_DATE),
                    Enter.theValue(registryData.get("denominacion")).into(ShedulePage.TXT_DENOMINATION),
                    Enter.theValue(registryData.get("horaInicio")).into(ShedulePage.TXT_START_TIME),
                    Enter.theValue(registryData.get("orden")).into(ShedulePage.TXT_ORDER),
                    Enter.theValue(registryData.get("horaFin")).into(ShedulePage.TXT_START_END_TIME),
                    Enter.theValue(registryData.get("operacion")).into(ShedulePage.TXT_OPERATION)


            );

        }


    }


    public static EnterScheduleRegistrationData fillFields(List<Map<String, String>> datos) {
        return instrumented(EnterScheduleRegistrationData.class, datos);
    }
}
