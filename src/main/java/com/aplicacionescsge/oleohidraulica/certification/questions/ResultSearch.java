package com.aplicacionescsge.oleohidraulica.certification.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;


public class ResultSearch implements Question<Boolean> {

        public Target Element;
        public String Search;

    public ResultSearch(Target element, String search) {

        Element = element;
        Search = search;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        return Element.of(Search).resolveFor(actor).isVisible();

    }

    public static ResultSearch isVisible(Target element, String search) {

        return new ResultSearch(element, search);
    }


}
