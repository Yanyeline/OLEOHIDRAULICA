package com.aplicacionescsge.oleohidraulica.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class MessageQuestion implements Question<String> {

    public Target message;

    public MessageQuestion(Target element) {

        message = element;
    }

    @Override
    public String answeredBy(Actor actor) {

        return Text.of(message).viewedBy(actor).asString().replace("\n×", "");
    }

    public static MessageQuestion is(Target element) {

        return new MessageQuestion(element);
    }


}
