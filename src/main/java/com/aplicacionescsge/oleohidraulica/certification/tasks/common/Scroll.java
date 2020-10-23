package com.aplicacionescsge.oleohidraulica.certification.tasks.common;

import net.serenitybdd.screenplay.actions.ScrollToBy;
import net.serenitybdd.screenplay.actions.ScrollToTarget;
import net.serenitybdd.screenplay.actions.ScrollToWebElement;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Scroll {

    public static ScrollToTarget to(Target target) {
        return new ScrollToTarget(target);
    }

    public static ScrollToWebElement to(WebElement element) {
        return new ScrollToWebElement(element);
    }

    public static ScrollToBy to(By... locators) {
        return new ScrollToBy(locators);
    }
}
