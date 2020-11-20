package com.aplicacionescsge.oleohidraulica.certification.questions;

import com.aplicacionescsge.oleohidraulica.certification.pages.MaintenancePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;
import java.util.Map;

public class ResultSearchUpdateMaintenance implements Question<Boolean> {

        public Boolean result;

        String cotizacion;
        String cliente;


        public List<Map<String, String>> Dates;

    public ResultSearchUpdateMaintenance(List<Map<String, String>> dates) {

        Dates = dates;
    }

        @Override
        public Boolean answeredBy(Actor actor) {

            cotizacion = MaintenancePage.TXT_N_COT.resolveFor(actor).getTextValue();
            //f_cotizacion = MaintenancePage.TXT_F_COTIZACION_UPDATE.resolveFor(actor).getTextValue();
            cliente = MaintenancePage.DDL_CONTACTO_CLIENTE.resolveFor(actor).getSelectedVisibleTextValue();

          for (Map<String, String> dataMaintenance : Dates) {
            if ((cotizacion.equals(dataMaintenance.get("cotizacion")))
                    && (cliente.equals(dataMaintenance.get("cliente")))) {
                result = true;
                } else {
                result = false;
                }
        }
        return result;
    }

        public static ResultSearchUpdateMaintenance isVisible(List<Map<String, String>> dates) {
        return new ResultSearchUpdateMaintenance(dates);
    }
}
