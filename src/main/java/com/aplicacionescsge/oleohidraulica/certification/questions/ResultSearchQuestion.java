package com.aplicacionescsge.oleohidraulica.certification.questions;


import com.aplicacionescsge.oleohidraulica.certification.pages.UserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;


public class ResultSearchQuestion implements Question<Boolean> {

        public Target Element;
        public String Search;

    public ResultSearchQuestion(Target element, String search) {

        Element = element;
        Search = search;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        return Element.of(Search).resolveFor(actor).isVisible();

    }

    public static ResultSearchQuestion isVisible(Target element, String search) {

        return new ResultSearchQuestion(element, search);
    }


}
