package com.aplicacionescsge.oleohidraulica.certification.questions;


import com.aplicacionescsge.oleohidraulica.certification.pages.UserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import java.util.List;
import java.util.Map;

public class ResultSearchUpdatedUser implements Question<Boolean> {

    public Boolean result;
    String name;
    String email;
    String id;
    String role;

    public List<Map<String, String>> Dates;


    public ResultSearchUpdatedUser(List<Map<String, String>> dates) {

        Dates = dates;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        name = UserPage.TXT_NAME_UPDATE.resolveFor(actor).getTextValue();
        email = UserPage.TXT_EMAIL_UPDATE.resolveFor(actor).getTextValue();
        id = UserPage.TXT_ID_UPDATE.resolveFor(actor).getTextValue();
        role = UserPage.DDL_ROLE_UPDATE.resolveFor(actor).getSelectedVisibleTextValue();

        for (Map<String, String> dataUser : Dates) {
            if ((name.equals(dataUser.get("name"))) && (email.equals(dataUser.get("email"))) &&
                    (id.equals(dataUser.get("id"))) && (role.equals(dataUser.get("role")))) {
                result = true;
            } else {
                result = false;
            }

        }
        return result;

    }

    public static ResultSearchUpdatedUser isVisible(List<Map<String, String>> dates) {

        return new ResultSearchUpdatedUser(dates);
    }


}
