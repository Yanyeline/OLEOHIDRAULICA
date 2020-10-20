package com.aplicacionescsge.oleohidraulica.certification.questions;

import com.aplicacionescsge.oleohidraulica.certification.pages.UserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class Message implements Question<String> {

    public Target message;

    public Message(Target element) {

        message = element;
    }

    @Override
    public String answeredBy(Actor actor) {

        return Text.of(message).viewedBy(actor).asString().replace("\n×", "");
    }

    public static Message is(Target element) {

        return new Message(element);
    }


}
