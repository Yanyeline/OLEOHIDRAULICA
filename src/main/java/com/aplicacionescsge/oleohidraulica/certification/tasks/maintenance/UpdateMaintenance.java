package com.aplicacionescsge.oleohidraulica.certification.tasks.maintenance;

import com.aplicacionescsge.oleohidraulica.certification.pages.CustomerPage;
import com.aplicacionescsge.oleohidraulica.certification.pages.MaintenancePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UpdateMaintenance implements Task {

    private List<Map<String, String>> datos;

    public UpdateMaintenance(List<Map<String, String>> datos) {
        this.datos = datos;
    }

    @Step("{0} enter data for update maintenance")
    @Override
    public <T extends Actor> void performAs(T actor) {
        for (Map<String, String> registryData : datos) {
            actor.attemptsTo(
                    Enter.theValue(registryData.get("N_cot")).into(MaintenancePage.TXT_N_COT_UPD),
                    Enter.theValue(registryData.get("F_cot")).into(MaintenancePage.TXT_FECHA_COT_UPD),
                    Click.on(MaintenancePage.DDL_TIPO_COT_UPD.of(registryData.get("Tipo_cot"))),
                    Click.on(MaintenancePage.DDL_CONTACTO_CLIENTE_UPD),
                    Click.on(MaintenancePage.DDL_CONTACTO_CLIENTE_OPTION_UPD.of(registryData.get("Cliente"))),
                    Click.on(MaintenancePage.BTN_CONTINUE_UPD),

                    Enter.theValue(registryData.get("ot")).into(MaintenancePage.TXT_OT_UPD),
                    Click.on(MaintenancePage.BTN_ADS_CONTINUE_UPD),

                    Enter.theValue(registryData.get("trabajo")).into(MaintenancePage.TXT_DESCRIPCION_UPD),
                    Enter.theValue(registryData.get("equipo")).into(MaintenancePage.TXT_EQUIPO_UPD),
                    Enter.theValue(registryData.get("f_in")).into(MaintenancePage.TXT_FECHA_INGRESO_UPD),
                    Enter.theValue(registryData.get("f_sal")).into(MaintenancePage.TXT_FECHA_SALIDA_UPD),
                    Enter.theValue(registryData.get("km")).into(MaintenancePage.TXT_KILOMETRAJE_UPD),
                    Enter.theValue(registryData.get("h_in")).into(MaintenancePage.TXT_HORA_INGRESO_UPD),
                    Enter.theValue(registryData.get("h_sal")).into(MaintenancePage.TXT_HORA_SALIDA_UPD),
                    Enter.theValue(registryData.get("ubicacion")).into(MaintenancePage.TXT_UBICACION_UPD),
                    Enter.theValue(registryData.get("placa")).into(MaintenancePage.TXT_PLACA_UPD),
                    Enter.theValue(registryData.get("horometro")).into(MaintenancePage.TXT_HOROMETRO_UPD),
                    Click.on(MaintenancePage.BTN_PLACEMENT_CONTINUE_UPD),

                    Click.on(MaintenancePage.DDL_MIXER_UPD),
                    Click.on(MaintenancePage.DDL_MIXER_OPTION_UPD.of(registryData.get("mixer"))),
                    Click.on(MaintenancePage.DDL_AUTOBOMBA_UPD),
                    Click.on(MaintenancePage.DDL_AUTOBOMBA_OPTION_UPD.of(registryData.get("autobomba"))),
                    Click.on(MaintenancePage.DDL_CARGADOR_UPD),
                    Click.on(MaintenancePage.DDL_CARGADOR_OPTION_UPD.of(registryData.get("cargador"))),
                    Click.on(MaintenancePage.DDL_BOMBA_UPD),
                    Click.on(MaintenancePage.DDL_BOMBA_OPTION_UPD.of(registryData.get("b_estacionaria"))),
                    Click.on(MaintenancePage.DDL_PLANTA_UPD),
                    Click.on(MaintenancePage.DDL_PLANTA_OPTION_UPD.of(registryData.get("planta"))),
                    Click.on(MaintenancePage.BTN_SCHEDULE_CONTINUE_UPD),

                    Click.on(MaintenancePage.BTN_ADD_UPD),
                    Enter.theValue(registryData.get("personal")).into(MaintenancePage.TXT_PERSONAL_UPD),
                    Click.on(MaintenancePage.DDL_ESPECIALIDAD_UPD),
                    Click.on(MaintenancePage.DDL_ESPECIALIDAD_OPTION_UPD.of(registryData.get("especialidad_v"))),
                    Enter.theValue(registryData.get("fecha_v")).into(MaintenancePage.TXT_FECHA_UPD),
                    Enter.theValue(registryData.get("costo_hotel")).into(MaintenancePage.TXT_HOTEL_UPD),
                    Enter.theValue(registryData.get("costo_alimentacion")).into(MaintenancePage.TXT_ALIMENTACION_UPD),
                    Enter.theValue(registryData.get("costo_trans")).into(MaintenancePage.TXT_TRANSPORTE_UPD),
                    Click.on(MaintenancePage.BTN_VIATICOS_CONTINUE_UPD),


                    Enter.theValue(registryData.get("descripcion_t")).into(MaintenancePage.TXT_DESCRIPCION_T_UPD),
                    Enter.theValue(registryData.get("costo")).into(MaintenancePage.TXT_COSTO_T_UPD),
                    Enter.theValue(registryData.get("aui")).into(MaintenancePage.TXT_AUI_T_UPD),
                    Click.on(MaintenancePage.BTN_EXTERNOS_CONTINUE_UPD),


                    Click.on(MaintenancePage.BTN_ADD_MANO_O_UPD),
                    Enter.theValue(registryData.get("personal_m")).into(MaintenancePage.TXT_PERSONAL_MANO_O_UPD),
                    Click.on(MaintenancePage.DDL_ESPECIALIDAD_MANO_O_UPD),
                    Click.on(MaintenancePage.DDL_ESPECIALIDAD_MANO_O_OPTION_UPD.of(registryData.get("especialidad_m"))),
                    Enter.theValue(registryData.get("f_salida")).into(MaintenancePage.TXT_FECHA_SALIDA_MANO_O_UPD),
                    Enter.theValue(registryData.get("diurno")).into(MaintenancePage.TXT_DIURNO_M_UPD),
                    Enter.theValue(registryData.get("nocturno")).into(MaintenancePage.TXT_NOTURNO_M_UPD),
                    Enter.theValue(registryData.get("festivo")).into(MaintenancePage.TXT_FESTIVO_M_UPD),
                    Enter.theValue(registryData.get("h_trabajadas")).into(MaintenancePage.TXT_HORAS_T_UPD),
                    Click.on(MaintenancePage.BTN_MANO_CONTINUE_UPD)

            );
        }


    }

    public static UpdateMaintenance fillFields(List<Map<String, String>> datos) {
        return instrumented(UpdateMaintenance.class, datos);
    }

}
