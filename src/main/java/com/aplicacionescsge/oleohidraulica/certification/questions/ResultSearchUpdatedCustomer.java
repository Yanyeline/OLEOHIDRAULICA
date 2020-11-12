package com.aplicacionescsge.oleohidraulica.certification.questions;

import com.aplicacionescsge.oleohidraulica.certification.pages.CustomerPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;
import java.util.Map;

public class ResultSearchUpdatedCustomer implements Question<Boolean> {

    public Boolean result;

    String name;
    String email;
    String nit;
    String address;
    String tel;
    String contact;
    String emailcontact;
    String cel;

    public List<Map<String, String>> Dates;

    public ResultSearchUpdatedCustomer(List<Map<String, String>> dates) {
        Dates = dates;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        name = CustomerPage.TXT_NAME_UPDATE.resolveFor(actor).getTextValue();
        email = CustomerPage.TXT_EMAIL_UPDATE.resolveFor(actor).getTextValue();
        nit = CustomerPage.TXT_NIT_UPDATE.resolveFor(actor).getTextValue();
        address = CustomerPage.TXT_ADDRESS_UPDATE.resolveFor(actor).getTextValue();
        tel = CustomerPage.TXT_TEL_UPDATE.resolveFor(actor).getTextValue();
        contact = CustomerPage.TXT_CONTACT_UPDATE.resolveFor(actor).getTextValue();
        emailcontact = CustomerPage.TXT_EMAIL_CONTACT_UPDATE.resolveFor(actor).getTextValue();
        cel = CustomerPage.TXT_CEL_UPDATE.resolveFor(actor).getTextValue();


        for (Map<String, String> dataCustomer : Dates) {
            if ((name.equals(dataCustomer.get("name"))) && (email.equals(dataCustomer.get("email")))
                 && (nit.equals(dataCustomer.get("nit"))) && (address.equals(dataCustomer.get("address")))
                 && (tel.equals(dataCustomer.get("tel"))) && (contact.equals(dataCustomer.get("contact")))
                 && (emailcontact.equals(dataCustomer.get("emailcontact"))) && (cel.equals(dataCustomer.get("cel")))) {
                   result = true;
            } else {
                result = false;
                    }
            }

        return result;
    }

    public static ResultSearchUpdatedCustomer isVisible(List<Map<String, String>> dates) {

        return new ResultSearchUpdatedCustomer(dates);
    }

}
