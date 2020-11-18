package com.aplicacionescsge.oleohidraulica.certification.tasks.schedule;

import com.aplicacionescsge.oleohidraulica.certification.pages.ShedulePage;
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

public class UpdateShedule implements Task {


    private List<Map<String, String>> datos;

    public UpdateShedule(List<Map<String, String>> datos) {
        this.datos = datos;
    }

    @Step("{0} update user")
    @Override
    public <T extends Actor> void performAs(T actor) {
        for (Map<String, String> registryData : datos) {

            actor.attemptsTo(
                    Wait.Element(ShedulePage.DDL_PLANT_UPDATE),
                    Click.on(ShedulePage.DDL_PLANT_UPDATE),
                    Click.on(ShedulePage.DDL_PLANT_OPTION_UPDATE.of(registryData.get("planta"))),
                    Enter.theValue(registryData.get("ejecutor")).into(ShedulePage.TXT_EXECUTANT_UPDATE),
                    Click.on(ShedulePage.DDL_LOCATION_UPDATE),
                    Click.on(ShedulePage.DDL_LOCATION_OPTION_UPDATE.of(registryData.get("ubicacion"))),
                    Enter.theValue(registryData.get("fechaInicial")).into(ShedulePage.TXT_START_DATE_UPDATE),
                    Enter.theValue(registryData.get("equipo")).into(ShedulePage.TXT_TEAM_UPDATE),
                    Enter.theValue(registryData.get("fechaFin")).into(ShedulePage.TXT_START_END_DATE_UPDATE),
                    Enter.theValue(registryData.get("denominacion")).into(ShedulePage.TXT_DENOMINATION_UPDATE),
                    Enter.theValue(registryData.get("horaInicio")).into(ShedulePage.TXT_START_TIME_UPDATE),
                    Enter.theValue(registryData.get("orden")).into(ShedulePage.TXT_ORDER_UPDATE),
                    Enter.theValue(registryData.get("horaFin")).into(ShedulePage.TXT_START_END_TIME_UPDATE),
                    Scroll.to(ShedulePage.TXT_OPERATION_UPDATE),
                    Enter.theValue(registryData.get("operacion")).into(ShedulePage.TXT_OPERATION_UPDATE),
                    Scroll.to(ShedulePage.BTN_UPDATE),
                    Click.on(ShedulePage.BTN_UPDATE)

            );

        }
    }

    public static UpdateShedule fillFields(List<Map<String, String>> datos) {
        return instrumented(UpdateShedule.class, datos);
    }

}
